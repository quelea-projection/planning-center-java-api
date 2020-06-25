package org.quelea.planningcenter.auth;

import lombok.AllArgsConstructor;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@AllArgsConstructor
public class LocalCodeServer {

    private static final String OUTPUT = "<html><head><script>window.close();</script></head><body>You may close this window now.</body></html>";
    private static final String OUTPUT_HEADERS = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html\r\n" +
            "Content-Length: ";
    private static final String OUTPUT_END_OF_HEADERS = "\r\n\r\n";

    private final int portNumber;

    public Optional<String> getCode(Duration timeout, Runnable afterServerStarted) {
        try (AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open()) {
            serverChannel.bind(new InetSocketAddress("127.0.0.1", portNumber));

            if (afterServerStarted != null) {
                afterServerStarted.run();
            }

            try (AsynchronousSocketChannel clientChannel = serverChannel.accept().get(timeout.toNanos(), TimeUnit.NANOSECONDS)) {

                StringBuilder headers = new StringBuilder();
                while (clientChannel.isOpen() && (headers.indexOf("\r\n\r\n") < 0 && headers.indexOf("\n\n") < 0)) {
                    ByteBuffer buffer = ByteBuffer.allocate(32);
                    Future<Integer> readResult = clientChannel.read(buffer);
                    readResult.get(timeout.toNanos(), TimeUnit.NANOSECONDS);
                    headers.append(new String(buffer.array()));
                }

                String firstLine = headers.toString().split("\n")[0].trim();

                byte[] toWrite = (OUTPUT_HEADERS + OUTPUT.length() + OUTPUT_END_OF_HEADERS + OUTPUT).getBytes();
                ByteBuffer toWriteBuffer = ByteBuffer.wrap(toWrite);
                clientChannel.write(toWriteBuffer).get();

                if (firstLine.contains("?code=")) {
                    return Optional.of(firstLine.substring(firstLine.indexOf("?code=") + 6, firstLine.lastIndexOf(' ')));
                } else {
                    return Optional.empty();
                }
            }
        } catch (TimeoutException | InterruptedException | ExecutionException ex) {
            return Optional.empty();
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }


    }

}

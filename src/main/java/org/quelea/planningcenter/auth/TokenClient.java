package org.quelea.planningcenter.auth;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Objects;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class TokenClient {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper()
            .configure(FAIL_ON_UNKNOWN_PROPERTIES, false)
            .enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);

    public RefreshToken getNewRefreshToken(ClientDetails clientDetails, String redirectUri, String code) {
        RequestBody formBody = new FormBody.Builder()
                .add("grant_type", "authorization_code")
                .add("code", code)
                .add("client_id", clientDetails.getClientId())
                .add("client_secret", clientDetails.getClientSecret())
                .add("redirect_uri", redirectUri)
                .build();

        return makeRequest(formBody);
    }

    public RefreshToken getNewRefreshToken(ClientDetails clientDetails, RefreshToken refreshToken) {
        RequestBody formBody = new FormBody.Builder()
                .add("grant_type", "refresh_token")
                .add("refresh_token", refreshToken.getRefreshToken())
                .add("client_id", clientDetails.getClientId())
                .add("client_secret", clientDetails.getClientSecret())
                .build();

        return makeRequest(formBody);
    }

    private RefreshToken makeRequest(RequestBody formBody) {
        Request request = new Request.Builder()
                .url("https://api.planningcenteronline.com/oauth/token")
                .post(formBody)
                .build();

        Call call = new OkHttpClient().newCall(request);

        try {
            return OBJECT_MAPPER.readValue(Objects.requireNonNull(call.execute().body()).charStream(), RefreshToken.class);
        } catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}

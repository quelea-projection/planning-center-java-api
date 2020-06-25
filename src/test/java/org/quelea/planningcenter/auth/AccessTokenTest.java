package org.quelea.planningcenter.auth;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.*;

public class AccessTokenTest {

    @Test
    void isValid_lessThan30Seconds() {
        AccessToken token = new AccessToken();
        token.setCreatedAt(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
        token.setExpiresInSeconds(20);
        assertFalse(token.isTokenValid());
    }

    @Test
    void isValid_inFuture() {
        AccessToken token = new AccessToken();
        token.setCreatedAt(LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
        token.setExpiresInSeconds(7200);
        assertTrue(token.isTokenValid());
    }


    @Test
    void isValid_inPast() {
        AccessToken token = new AccessToken();
        token.setCreatedAt(LocalDateTime.now().minusDays(1).toEpochSecond(ZoneOffset.UTC));
        token.setExpiresInSeconds(7200);
        assertFalse(token.isTokenValid());
    }
}
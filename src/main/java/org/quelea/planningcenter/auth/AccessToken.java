package org.quelea.planningcenter.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Data
public class AccessToken {

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private long expiresInSeconds;
    @JsonProperty("created_at")
    private long createdAt;

    public boolean isTokenValid() {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(createdAt), ZoneOffset.UTC)
                .plusSeconds(getExpiresInSeconds()-30)
                .isAfter(LocalDateTime.now());
    }
}

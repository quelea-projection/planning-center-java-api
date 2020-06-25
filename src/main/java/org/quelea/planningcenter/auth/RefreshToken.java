package org.quelea.planningcenter.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RefreshToken {

    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private long expiresInSeconds;
    @JsonProperty("created_at")
    private long createdAt;

    public RefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public AccessToken toAccessToken() {
        AccessToken token = new AccessToken();
        token.setAccessToken(accessToken);
        token.setExpiresInSeconds(expiresInSeconds);
        token.setCreatedAt(createdAt);
        return token;
    }
}

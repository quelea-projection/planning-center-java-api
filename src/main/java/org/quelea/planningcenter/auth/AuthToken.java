package org.quelea.planningcenter.auth;

import lombok.AllArgsConstructor;
import lombok.With;
import java.util.Optional;

@AllArgsConstructor
public class AuthToken {

    private static final TokenClient TOKEN_CLIENT = new TokenClient();
    private final ClientDetails clientDetails;
    private RefreshToken token;
    @With
    private RefreshTokenUpdater refreshTokenUpdater;

    public AuthToken(ClientDetails clientDetails, RefreshToken token) {
        this.clientDetails = clientDetails;
        this.token = token;
    }

    public AuthToken(ClientDetails clientDetails, String refreshToken) {
        this.clientDetails = clientDetails;
        this.token = new RefreshToken(refreshToken);
    }

    public Optional<String> getCurrentAccessToken() {
        if (!token.toAccessToken().isTokenValid()) {
            token = TOKEN_CLIENT.getNewRefreshToken(clientDetails, token);
            if (refreshTokenUpdater != null && token.getRefreshToken()!=null) {
                refreshTokenUpdater.tokenUpdated(token.getRefreshToken());
            }
        }
        return Optional.ofNullable(token.getAccessToken());
    }

    public String getCurrentRefreshToken() {
        return token.getRefreshToken();
    }


}

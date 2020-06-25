package org.quelea.planningcenter.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import java.net.URI;
import java.time.Duration;
import java.util.Optional;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

@Builder
public class OAuthRedirectFlow {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper().configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
    private static final TokenClient TOKEN_CLIENT = new TokenClient();

    @Builder.Default
    private final String base = "https://api.planningcenteronline.com/";
    private final ClientDetails clientDetails;
    private final String redirect;

    public String getBrowserRedirectUrl() {
        return base + "oauth/authorize?client_id=" + clientDetails.getClientId() + "&redirect_uri=" + redirect + "&response_type=code&scope=services";
    }

    public Optional<AuthToken> listenLocally(Duration timeout, RedirectUrlCallback callback) {
        return new LocalCodeServer(URI.create(redirect).getPort())
                .getCode(timeout, () -> callback.browseToUrl(getBrowserRedirectUrl()))
                .map(c -> TOKEN_CLIENT.getNewRefreshToken(clientDetails, redirect, c))
                .map(t -> new AuthToken(clientDetails, t));
    }
}

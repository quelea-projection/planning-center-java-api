package org.quelea.planningcenter.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ClientDetails {

    private String clientId;
    private String clientSecret;
}

package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.SongsService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class SongsPath {

    private final Retrofit retrofit;

    public SongsService api() {
        return retrofit.create(SongsService.class);
    }

}

package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.FoldersService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class FoldersPath {

    private final Retrofit retrofit;

    public FoldersService api() {
        return retrofit.create(FoldersService.class);
    }
}

package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.ItemsService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class ItemsPath {

    private final Retrofit retrofit;

    public ItemsService api() {
        return retrofit.create(ItemsService.class);
    }
}

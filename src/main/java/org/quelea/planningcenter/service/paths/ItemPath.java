package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.ItemService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class ItemPath {

    private final Retrofit retrofit;

    public CustomSlidesPath customSlides() {
        return new CustomSlidesPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("custom_slides/")
                                        .build()
                        ).build()
        );
    }

    public MediasPath media() {
        return new MediasPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("media/")
                                        .build()
                        ).build()
        );
    }

    public MediaPath media(String id) {
        return new MediaPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("media/" + id + "/")
                                        .build()
                        ).build()
        );
    }

    public ItemService api() {
        return retrofit.create(ItemService.class);
    }
}

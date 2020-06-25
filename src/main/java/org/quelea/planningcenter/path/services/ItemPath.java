package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.ItemService;
import org.quelea.planningcenter.util.RetrofitUtil;
import retrofit2.Retrofit;

@AllArgsConstructor
public class ItemPath {

    private final Retrofit retrofit;

    public CustomSlidesPath customSlides() {
        return new CustomSlidesPath(RetrofitUtil.appendPath(retrofit, "custom_slides/"));
    }

    public MediasPath media() {
        return new MediasPath(RetrofitUtil.appendPath(retrofit, "media/"));
    }

    public MediaPath media(String id) {
        return new MediaPath(RetrofitUtil.appendPath(retrofit, "media/" + id + "/"));
    }

    public ItemService api() {
        return retrofit.create(ItemService.class);
    }
}

package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.PlanService;
import org.quelea.planningcenter.util.RetrofitUtil;
import retrofit2.Retrofit;

@AllArgsConstructor
public class PlanPath {

    private final Retrofit retrofit;

    public ItemsPath items() {
        return new ItemsPath(RetrofitUtil.appendPath(retrofit, "items/"));
    }


    public ItemPath item(String id) {
        return new ItemPath(RetrofitUtil.appendPath(retrofit, "items/" + id + "/"));
    }

    public PlanService api() {
        return retrofit.create(PlanService.class);
    }
}

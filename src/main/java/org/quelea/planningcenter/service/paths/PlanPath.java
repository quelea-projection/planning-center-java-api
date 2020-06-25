package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.PlanService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class PlanPath {

    private final Retrofit retrofit;

    public ItemsPath items() {
        return new ItemsPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("items/")
                                        .build()
                        ).build()
        );
    }


    public ItemPath item(String id) {
        return new ItemPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("items/" + id + "/")
                                        .build()
                        ).build()
        );
    }

    public PlanService api() {
        return retrofit.create(PlanService.class);
    }
}

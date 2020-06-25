package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.ServiceTypeService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class ServiceTypePath {

    private final Retrofit retrofit;

    public PlansPath plans() {
        return new PlansPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("plans/")
                                        .build()
                        ).build()
        );
    }

    public PlanPath plan(String id) {
        return new PlanPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("plans/" + id + "/")
                                        .build()
                        ).build()
        );
    }

    public ServiceTypeService api() {
        return retrofit.create(ServiceTypeService.class);
    }

}

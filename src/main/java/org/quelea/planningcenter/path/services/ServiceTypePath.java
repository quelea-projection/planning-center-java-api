package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.ServiceTypeService;
import org.quelea.planningcenter.util.RetrofitUtil;
import retrofit2.Retrofit;

@AllArgsConstructor
public class ServiceTypePath {

    private final Retrofit retrofit;

    public PlansPath plans() {
        return new PlansPath(RetrofitUtil.appendPath(retrofit, "plans/"));
    }

    public PlanPath plan(String id) {
        return new PlanPath(RetrofitUtil.appendPath(retrofit, "plans/" + id + "/"));
    }

    public ServiceTypeService api() {
        return retrofit.create(ServiceTypeService.class);
    }

}

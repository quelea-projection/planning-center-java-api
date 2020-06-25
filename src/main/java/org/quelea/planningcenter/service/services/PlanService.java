package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Plan;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PlanService {

    @GET(".")
    Call<JSONAPIDocument<Plan>> get();
}

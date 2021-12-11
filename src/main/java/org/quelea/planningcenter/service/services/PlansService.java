package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Plan;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import java.util.List;
import java.util.Map;

public interface PlansService {

    @GET("?include=contributors,my_schedules,plan_times,series")
    Call<JSONAPIDocument<List<Plan>>> get();

    @GET(".")
    Call<JSONAPIDocument<List<Plan>>> get(@QueryMap Map<String, String> paramsMap);
}

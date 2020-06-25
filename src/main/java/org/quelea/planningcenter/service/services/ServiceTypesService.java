package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.ServiceType;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ServiceTypesService {

    @GET("?include=time_preference_options")
    Call<JSONAPIDocument<List<ServiceType>>> get();
}

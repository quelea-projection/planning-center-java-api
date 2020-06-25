package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.ServiceType;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceTypeService {

    @GET(".")
    Call<JSONAPIDocument<ServiceType>> get();
}

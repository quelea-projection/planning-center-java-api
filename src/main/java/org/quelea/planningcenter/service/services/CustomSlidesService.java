package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.CustomSlide;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface CustomSlidesService {

    @GET(".")
    Call<JSONAPIDocument<List<CustomSlide>>> get();
}

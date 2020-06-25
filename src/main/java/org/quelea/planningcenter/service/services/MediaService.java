package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Media;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MediaService {

    @GET(".")
    Call<JSONAPIDocument<Media>> get();
}

package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Song;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface SongsService {

    @GET(".")
    Call<JSONAPIDocument<List<Song>>> get();
}

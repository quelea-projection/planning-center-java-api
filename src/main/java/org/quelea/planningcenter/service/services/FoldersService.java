package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Folder;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface FoldersService {

    @GET("?include=service_types")
    Call<JSONAPIDocument<List<Folder>>> get();
}

package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Attachment;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface AttachmentsService {

    @GET(".")
    Call<JSONAPIDocument<List<Attachment>>> get();
}

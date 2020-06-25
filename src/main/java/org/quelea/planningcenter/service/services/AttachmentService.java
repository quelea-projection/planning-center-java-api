package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.AttachmentActivity;
import retrofit2.Call;
import retrofit2.http.POST;

public interface AttachmentService {

    @POST("open")
    Call<JSONAPIDocument<AttachmentActivity>> open();
}

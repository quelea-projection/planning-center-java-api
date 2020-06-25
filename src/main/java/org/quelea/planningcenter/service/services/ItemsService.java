package org.quelea.planningcenter.service.services;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import org.quelea.planningcenter.model.services.Item;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface ItemsService {

    @GET("?include=arrangement,item_notes,item_times,key,media,selected_attachment,song")
    Call<JSONAPIDocument<List<Item>>> get();
}

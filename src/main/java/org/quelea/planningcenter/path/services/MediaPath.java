package org.quelea.planningcenter.path.services;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.MediaService;
import org.quelea.planningcenter.util.RetrofitUtil;
import retrofit2.Retrofit;

@AllArgsConstructor
public class MediaPath {

    private final Retrofit retrofit;

    public AttachmentsPath attachments() {
        return new AttachmentsPath(RetrofitUtil.appendPath(retrofit, "attachments/"));
    }

    public AttachmentPath attachment(String id) {
        return new AttachmentPath(RetrofitUtil.appendPath(retrofit, "attachments/" + id + "/"));
    }

    public MediaService api() {
        return retrofit.create(MediaService.class);
    }
}

package org.quelea.planningcenter.service.paths;

import lombok.AllArgsConstructor;
import org.quelea.planningcenter.service.services.MediaService;
import retrofit2.Retrofit;

@AllArgsConstructor
public class MediaPath {

    private final Retrofit retrofit;

    public AttachmentsPath attachments() {
        return new AttachmentsPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("attachments/")
                                        .build()
                        ).build()
        );
    }

    public AttachmentPath attachment(String id) {
        return new AttachmentPath(
                retrofit.newBuilder()
                        .baseUrl(
                                retrofit.baseUrl()
                                        .newBuilder("attachments/" + id + "/")
                                        .build()
                        ).build()
        );
    }

    public MediaService api() {
        return retrofit.create(MediaService.class);
    }
}

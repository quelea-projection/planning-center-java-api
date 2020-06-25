package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Attachment")
public class Attachment extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("page_order")
    private List<String> pageOrder;
    private String filename;
    @JsonProperty("file_size")
    private int fileSize;
    @JsonProperty("content_type")
    private String contentType;
    @JsonProperty("display_name")
    private String displayName;
    private String filetype;
    @JsonProperty("linked_url")
    private String linkedUrl;
    @JsonProperty("pco_type")
    private String pcoType;
    @JsonProperty("remote_link")
    private String remoteLink;
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
    private String url;
    @JsonProperty("allow_mp3_download")
    private boolean allowMp3Download;
    @JsonProperty("web_streamable")
    private boolean webStreamable;
    private boolean downloadable;
    private boolean transposable;
    private boolean streamable;
    @JsonProperty("has_preview")
    private boolean hasPreview;
    @JsonProperty("file_upload_identifier")
    private String fileUploadIdentifier;

//    @Relationship("attachable")
//    private Object attachable;
    @Relationship("attachment_types")
    private List<AttachmentType> attachmentTypes;
    @Relationship("created_by")
    private Person createdBy;
    @Relationship("updated_by")
    private Person updatedBy;

}

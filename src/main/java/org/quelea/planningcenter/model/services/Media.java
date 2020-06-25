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
@Type("Media")
public class Media extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String themes;
    private String title;
    @JsonProperty("thumbnail_file_name")
    private String thumbnailFileName;
    @JsonProperty("thumbnail_content_type")
    private String thumbnailContentType;
    @JsonProperty("thumbnail_file_size")
    private int thumbnailFileSize;
    @JsonProperty("thumbnail_updated_at")
    private LocalDateTime thumbnailUpdatedAt;
    @JsonProperty("preview_file_name")
    private String previewFileName;
    @JsonProperty("preview_content_type")
    private String previewContentType;
    @JsonProperty("preview_file_size")
    private int previewFileSize;
    @JsonProperty("preview_updated_at")
    private LocalDateTime previewUpdatedAt;
    private int length;
    @JsonProperty("media_type")
    private String mediaType;
    @JsonProperty("media_type_name")
    private String mediaTypeName;
    @JsonProperty("thumbnail_url")
    private String thumbnailUrl;
    @JsonProperty("creator_name")
    private String creatorName;
    @JsonProperty("preview_url")
    private String previewUrl;
    @JsonProperty("image_url")
    private String imageUrl;

    @Relationship("attachments")
    private List<Attachment> attachments;
}

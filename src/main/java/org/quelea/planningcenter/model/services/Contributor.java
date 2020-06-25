package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Contributor")
public class Contributor extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("contributable_action")
    private String contributableAction;
    @JsonProperty("contributable_category")
    private String contributableCategory;
    @JsonProperty("contributable_type")
    private String contributableType;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("photo_thumbnail_url")
    private String photoThumbnailUrl;

    @Relationship("plan")
    private Plan plan;
    @Relationship("person")
    private Person person;
}

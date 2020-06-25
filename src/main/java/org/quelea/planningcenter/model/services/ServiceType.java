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
@Type("ServiceType")
public class ServiceType extends BaseModel {

    @JsonProperty("archived_at")
    private LocalDateTime archivedAt;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("deleted_at")
    private LocalDateTime deletedAt;
    private String name;
    private int sequence;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("attachment_types_enabled")
    private boolean attachmentTypesEnabled;
    @JsonProperty("background_check_permissions")
    private String backgroundCheckPermissions;
    @JsonProperty("comment_permissions")
    private String commentPermissions;
    private String frequency;
    @JsonProperty("last_plan_from")
    private String lastPlanFrom;
    private String permissions;

    @Relationship("parent")
    private Folder parent;
    @Relationship("time_preference_options")
    private List<TimePreferenceOption> timePreferenceOptions;
}

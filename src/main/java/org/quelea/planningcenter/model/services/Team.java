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
@Type("Team")
public class Team extends BaseModel {

    private String name;
    private int sequence;
    @JsonProperty("schedule_to")
    private String scheduleTo;
    @JsonProperty("default_status")
    private String defaultStatus;
    @JsonProperty("default_prepare_notifications")
    private boolean defaultPrepareNotifications;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("archived_at")
    private LocalDateTime archivedAt;
    @JsonProperty("assigned_directly")
    private boolean assignedDirectly;
    @JsonProperty("last_plan_from")
    private String lastPlanFrom;

    @Relationship("default_responds_to")
    private Person defaultRespondsTo;
    @Relationship("service_type")
    private ServiceType serviceType;
}

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
@Type("PlanPerson")
public class PlanPerson extends BaseModel {

    private String status;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String notes;
    @JsonProperty("decline_reason")
    private String declineReason;
    private String name;
    @JsonProperty("notification_changed_by_name")
    private String notificationChangedByName;
    @JsonProperty("notification_sender_name")
    private String notificationSenderName;
    @JsonProperty("team_position_name")
    private String teamPositionName;
    @JsonProperty("photo_thumbnail")
    private String photoThumbnail;
    @JsonProperty("status_updated_at")
    private LocalDateTime statusUpdatedAt;
    @JsonProperty("notification_changed_at")
    private LocalDateTime notificationChangedAt;
    @JsonProperty("notification_prepared_at")
    private LocalDateTime notificationPreparedAt;
    @JsonProperty("notification_read_at")
    private LocalDateTime notificationReadAt;
    @JsonProperty("notification_sent_at")
    private LocalDateTime notificationSentAt;
    @JsonProperty("prepare_notification")
    private boolean prepareNotification;
    @JsonProperty("can_accept_partial")
    private boolean canAcceptPartial;

    @Relationship("person")
    private Person person;
    @Relationship("plan")
    private Plan plan;
    @Relationship("schedule_by")
    private Person scheduledBy;
    @Relationship("service_type")
    private ServiceType serviceType;
    @Relationship("team")
    private Team team;
    @Relationship("responds_to")
    private Person respondsTo;
    @Relationship("times")
    private List<PlanTime> times;
    @Relationship("service_times")
    private List<PlanTime> serviceTimes;
    @Relationship("time_preference_options")
    private List<TimePreferenceOption> timePreferenceOptions;


}

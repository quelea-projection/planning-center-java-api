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
@Type("PlanTime")
public class PlanTime extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String name;
    @JsonProperty("time_type")
    private String timeType;
    private boolean recorded;
    @JsonProperty("team_reminders")
    private List<Reminder> teamReminders;
    @JsonProperty("starts_at")
    private LocalDateTime startsAt;
    @JsonProperty("ends_at")
    private LocalDateTime endsAt;
    @JsonProperty("live_starts_at")
    private LocalDateTime liveStartsAt;
    @JsonProperty("live_ends_at")
    private LocalDateTime liveEndsAt;

    @Relationship("assigned_teams")
    private List<Team> assignedTeams;
}

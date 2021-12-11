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
@Type("Schedule")
public class Schedule extends BaseModel {

    @JsonProperty("sort_date")
    private LocalDateTime sortDate;
    private String dates;
    @JsonProperty("decline_reason")
    private String declineReason;
    @JsonProperty("organization_name")
    private String organizationName;
    @JsonProperty("organization_time_zone")
    private String organizationTimeZone;
    @JsonProperty("organization_twenty_four_hour_time")
    private String organization24HourTime;
    @JsonProperty("person_name")
    private String personName;
    @JsonProperty("position_display_times")
    private String positionDisplayTimes;
    @JsonProperty("responds_to_name")
    private String respondsToName;
    @JsonProperty("service_type_name")
    private String serviceTypeName;
    @JsonProperty("short_dates")
    private String shortDates;
    @JsonProperty("status")
    private String status;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_position_name")
    private String teamPositionName;
    @JsonProperty("can_accept_partial")
    private boolean canAcceptPartial;
    @JsonProperty("can_accept_partial_one_time")
    private boolean canAcceptPartialOneTime;
    @JsonProperty("plan_visible")
    private boolean planVisible;
    @JsonProperty("plan_visible_to_me")
    private boolean planVisibleToMe;

    @Relationship("person")
    private Person person;
    @Relationship("service_type")
    private ServiceType serviceType;
    @Relationship("organization")
    private Organization organization;
    @Relationship("plan_person")
    private PlanPerson planPerson;
    @Relationship("plan")
    private Plan plan;
    @Relationship("team")
    private Team team;
    @Relationship("responds_to_person")
    private Person respondsToPerson;
    @Relationship("times")
    private List<PlanTime> times;

}

package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Plan")
public class Plan extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    private String title;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("public")
    @Getter(value = AccessLevel.NONE)
    @Setter(value = AccessLevel.NONE)
    private boolean public_;

    public boolean isPublic() {
        return public_;
    }

    public void setPublic(boolean p) {
        this.public_ = p;
    }

    @JsonProperty("series_title")
    private String seriesTitle;
    @JsonProperty("plan_notes_count")
    private int planNotesCount;
    @JsonProperty("other_time_count")
    private int otherTimeCount;
    @JsonProperty("rehearsal_time_count")
    private int rehearsalTimeCount;
    @JsonProperty("service_time_count")
    private int serviceTimeCount;
    @JsonProperty("plan_people_count")
    private int planPeopleCount;
    @JsonProperty("needed_positions_count")
    private int neededPositionsCount;
    @JsonProperty("items_count")
    private int itemsCount;
    @JsonProperty("total_length")
    private int totalLength;
    @JsonProperty("multi_day")
    private boolean multiDay;
    @JsonProperty("files_expire_at")
    private LocalDateTime filesExpireAt;
    @JsonProperty("sort_date")
    private LocalDateTime sortDate;
    @JsonProperty("last_time_at")
    private LocalDateTime lastTimeAt;
    private String permissions;
    private String dates;
    @JsonProperty("short_dates")
    private String shortDates;
    @JsonProperty("reminders_disabled")
    private boolean remindersDisabled;


    @Relationship("service_type")
    private ServiceType serviceType;
    @Relationship("next_plan")
    private Plan nextPlan;
    @Relationship("previous_plan")
    private Plan previousPlan;
    @Relationship("attachment_types")
    private List<AttachmentType> attachmentTypes;
    @Relationship("series")
    private Series series;
    @Relationship("created_by")
    private Person createdBy;
    @Relationship("updated_by")
    private Person updatedBy;
}

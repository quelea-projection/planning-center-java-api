package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("TimePreferenceOption")
public class TimePreferenceOption extends BaseModel {

    @JsonProperty("day_of_week")
    private String dayOfWeek;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String description;
    @JsonProperty("sort_index")
    private String sortIndex;
    @JsonProperty("time_type")
    private String timeType;
    @JsonProperty("minute_of_day")
    private int minuteOfDay;
    @JsonProperty("starts_at")
    private LocalDateTime startsAt;


}

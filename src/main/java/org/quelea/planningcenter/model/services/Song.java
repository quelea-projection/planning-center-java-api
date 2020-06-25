package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Song")
public class Song extends BaseModel {

    private String title;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String admin;
    private String author;
    private String copyright;
    private boolean hidden;
    private String notes;
    private String themes;
    @JsonProperty("last_scheduled_short_dates")
    private String lastScheduledShortDates;
    @JsonProperty("last_scheduled_at")
    private LocalDateTime lastScheduledAt;
    @JsonProperty("ccli_number")
    private int ccliNumber;

}

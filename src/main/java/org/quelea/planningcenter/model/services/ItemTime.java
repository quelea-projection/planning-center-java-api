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
@Type("ItemTime")
public class ItemTime extends BaseModel {

    @JsonProperty("live_start_at")
    private LocalDateTime liveStartAt;
    @JsonProperty("live_end_at")
    private LocalDateTime liveEndAt;
    private boolean exclude;
    private int length;
    @JsonProperty("length_offset")
    private int lengthOffset;

    @Relationship("item")
    private Item item;
    @Relationship("plan_time")
    private PlanTime planTime;
    @Relationship("plan")
    private Plan plan;
}

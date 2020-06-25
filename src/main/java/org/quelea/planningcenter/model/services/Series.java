package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Series")
public class Series extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("artwork_file_name")
    private String artworkFileName;
    @JsonProperty("artwork_content_type")
    private String artworkContentType;
    @JsonProperty("artwork_file_size")
    private int artworkFileSize;
    private String title;
    @JsonProperty("artwork_for_dashboard")
    private String artworkForDashboard;
    @JsonProperty("artwork_for_mobile")
    private String artworkForMobile;
    @JsonProperty("artwork_for_plan")
    private String artworkForPlan;
}

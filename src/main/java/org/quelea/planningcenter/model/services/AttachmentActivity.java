package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("AttachmentActivity")
public class AttachmentActivity extends BaseModel {

    private LocalDate date;
    @JsonProperty("attachment_url")
    private String attachmentUrl;
    @JsonProperty("activity_type")
    private String activityType;

    @Relationship("attachment")
    private Attachment attachment;
}

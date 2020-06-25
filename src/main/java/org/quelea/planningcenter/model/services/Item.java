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
@Type("Item")
public class Item extends BaseModel {

    private String title;
    private int sequence;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private int length;
    @JsonProperty("item_type")
    private String itemType;
    @JsonProperty("html_details")
    private String htmlDetails;
    @JsonProperty("service_position")
    private String servicePosition;
    private String description;
    @JsonProperty("key_name")
    private String keyName;
    @JsonProperty("custom_arrangement_sequence")
    private List<String> customArrangementSequence;
    @JsonProperty("custom_arrangement_sequence_short")
    private List<String> customArrangementSequenceShort;
    @JsonProperty("custom_arrangement_sequence_full")
    private List<String> customArrangementSequenceFull;

    @Relationship("plan")
    private Plan plan;
    @Relationship("song")
    private Song song;
    @Relationship("arrangement")
    private Arrangement arrangement;
    @Relationship("key")
    private Key key;
    @Relationship("selected_layout")
    private Layout selectedLayout;
    @Relationship("selected_background")
    private Attachment selectedBackground;
}

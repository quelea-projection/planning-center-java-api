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
@Type("Key")
public class Key extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String name;
    @JsonProperty("alternate_keys")
    private List<String> alternateKeys;
    @JsonProperty("ending_key")
    private String endingKey;
    @JsonProperty("starting_key")
    private String startingKey;
    @JsonProperty("starting_minor")
    private boolean startingMinor;
    @JsonProperty("ending_minor")
    private boolean endingMinor;

    @Relationship("arrangement")
    private Arrangement arrangement;
}

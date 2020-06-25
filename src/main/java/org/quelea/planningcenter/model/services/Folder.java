package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.RelType;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Folder")
public class Folder extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    private String name;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private String container;

    @Relationship("ancestors")
    private List<Folder> ancestors;
    @Relationship("parent")
    private Folder parent;
    @Relationship(value="service_types", relType= RelType.RELATED)
    private List<ServiceType> serviceTypes;

    public Optional<Folder> getParent() {
        return Optional.ofNullable(parent);
    }
}

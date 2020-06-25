package org.quelea.planningcenter.model.services;

import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("CustomSlide")
public class CustomSlide extends BaseModel {

    private String body;
    private String label;
    private int order;
    private boolean enabled;

    @Relationship("item")
    private Item item;
    @Relationship("attachment")
    private Attachment attachment;
}

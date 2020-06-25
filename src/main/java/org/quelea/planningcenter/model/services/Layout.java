package org.quelea.planningcenter.model.services;

import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Layout")
public class Layout extends BaseModel {
}

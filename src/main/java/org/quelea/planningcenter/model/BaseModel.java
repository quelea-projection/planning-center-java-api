package org.quelea.planningcenter.model;

import com.github.jasminb.jsonapi.annotations.Id;
import lombok.Data;

@Data
public class BaseModel {

    @Id
    private String id;

}

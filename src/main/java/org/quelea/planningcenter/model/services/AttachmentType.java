package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("AttachmentType")
public class AttachmentType extends BaseModel {

    private String name;
    @JsonProperty("chord_charts")
    private boolean chordCharts;
    @JsonProperty("capoed_chord_charts")
    private boolean capoedChordCharts;
    private boolean lyrics;
    private String alises;
    @JsonProperty("number_charts")
    private boolean numberCharts;
    @JsonProperty("numeral_charts")
    private boolean numeralCharts;

}

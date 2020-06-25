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
@Type("Arrangement")
public class Arrangement extends BaseModel {

    private double bpm;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    private String isrc;
    @JsonProperty("has_chords")
    private boolean hasChords;
    private int length;
    private String meter;
    private String name;
    private String notes;
    @JsonProperty("print_margin")
    private String printMargin;
    @JsonProperty("print_orientation")
    private String printOrientation;
    @JsonProperty("print_page_size")
    private String printPageSize;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("chord_chart")
    private String chordChart;
    @JsonProperty("chord_chart_font")
    private String chordChartFont;
    @JsonProperty("chord_chart_key")
    private String chordChartKey;
    @JsonProperty("chord_chart_columns")
    private int chordChartColumns;
    @JsonProperty("chord_chart_font_size")
    private int chordChartFontSize;
    @JsonProperty("has_chord_chart")
    private boolean hasChordChart;
    @JsonProperty("lyrics_enabled")
    private boolean lyricsEnabled;
    @JsonProperty("number_chart_enabled")
    private boolean numberChartEnabled;
    @JsonProperty("numeral_chart_enabled")
    private boolean numeralChartEnabled;
    private List<String> sequence;
    @JsonProperty("sequence_short")
    private List<String> sequenceShort;
    @JsonProperty("sequence_full")
    private List<Section> sequenceFull;
    @JsonProperty("chord_chart_chord_color")
    private int chordChartChordColor;
    @JsonProperty("archived_at")
    private LocalDateTime archivedAt;
    private String lyrics;

    @Relationship("updated_by")
    private Person updatedBy;
    @Relationship("created_by")
    private Person createdBy;
    @Relationship("song")
    private Song song;


}

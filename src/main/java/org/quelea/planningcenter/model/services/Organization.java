package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Organization")
public class Organization extends BaseModel {

    private String ccli;
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("date_format")
    private String dateFormat;
    @JsonProperty("music_stand_enabled")
    private boolean musicStandEnabled;
    private String name;
    @JsonProperty("projector_enabled")
    private boolean projectorEnabled;
    @JsonProperty("time_zone")
    private String timeZone;
    @JsonProperty("twenty_four_hour_time")
    private boolean twentyFourHourTime;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("owner_name")
    private String ownerName;
    private String secret;
    @JsonProperty("ccli_connected")
    private boolean ccliConnected;
    @JsonProperty("ccli_reporting_enabled")
    private boolean ccliReportingEnabled;
    @JsonProperty("file_storage_exceeded")
    private boolean fileStorageExceeded;
    @JsonProperty("file_storage_size")
    private boolean fileStorageSize;
    @JsonProperty("file_storage_size_used")
    private boolean fileStorageSizeUsed;
    @JsonProperty("file_storage_extra_enabled")
    private boolean fileStorageExtraEnabled;
    @JsonProperty("rehearsal_mix_enabled")
    private boolean rehearsalMixEnabled;
    @JsonProperty("legacy_id")
    private String legacyId;
    @JsonProperty("people_allowed")
    private int peopleAllowed;
    @JsonProperty("people_remaining")
    private int peopleRemaining;
    private boolean beta;
}

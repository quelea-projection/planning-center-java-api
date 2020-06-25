package org.quelea.planningcenter.model.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.jasminb.jsonapi.annotations.Relationship;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.quelea.planningcenter.model.BaseModel;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Type("Person")
public class Person extends BaseModel {

    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("name_prefix")
    private String namePrefix;
    @JsonProperty("name_suffix")
    private String nameSuffix;
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    private LocalDateTime anniversary;
    private LocalDateTime birthdate;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("middle_name")
    private String middleName;
    private String nickname;
    @JsonProperty("photo_url")
    private String photoUrl;
    @JsonProperty("photo_thumbnail_url")
    private String photoThumbnailUrl;
    @JsonProperty("full_name")
    private String fullName;
    private String permissions;
    private String status;
    @JsonProperty("ical_code")
    private String icalCode;
    @JsonProperty("logged_in_at")
    private LocalDateTime loggedInAt;
    private String notes;
    @JsonProperty("passed_background_check")
    private boolean passedBackgroundCheck;
    @JsonProperty("site_administrator")
    private boolean siteAdministrator;
    @JsonProperty("praise_charts_enabled")
    private boolean praiseChartsEnabled;
    @JsonProperty("max_permissions")
    private String maxPermissions;
    @JsonProperty("me_tab")
    private String meTab;
    @JsonProperty("plans_tab")
    private String plansTab;
    @JsonProperty("songs_tab")
    private String songsTab;
    @JsonProperty("media_tab")
    private String mediaTab;
    @JsonProperty("people_tab")
    private String peopleTab;

    @Relationship("created_by")
    private Person createdBy;
    @Relationship("updated_by")
    private Person updatedBy;
    @Relationship("current_folder")
    private Folder currentFolder;

}

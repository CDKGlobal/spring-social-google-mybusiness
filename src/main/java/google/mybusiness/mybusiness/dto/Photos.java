package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jayesh on 9/14/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Photos {

    private String profilePhotoUrl;
    private String coverPhotoUrl;
    private String logoPhotoUrl;

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getLogoPhotoUrl() {
        return logoPhotoUrl;
    }

    public void setLogoPhotoUrl(String logoPhotoUrl) {
        this.logoPhotoUrl = logoPhotoUrl;
    }
}

package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jayesh on 9/14/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Locations {

    private String error;
    private Location[] locations;

    public Locations() {
    }

    public Locations(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }
}

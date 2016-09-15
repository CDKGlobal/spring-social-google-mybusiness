package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jayesh on 9/13/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountState {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

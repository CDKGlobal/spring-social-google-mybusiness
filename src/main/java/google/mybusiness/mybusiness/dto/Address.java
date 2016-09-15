package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jayesh on 9/14/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    private String[] addressLines;
    private String locality;
    private String administrativeArea;
    private String country;
    private Long postalCode;

    public String[] getAddressLines() {
        return addressLines;
    }

    public void setAddressLines(String[] addressLines) {
        this.addressLines = addressLines;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAdministrativeArea() {
        return administrativeArea;
    }

    public void setAdministrativeArea(String administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Long postalCode) {
        this.postalCode = postalCode;
    }
}

package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Jayesh on 9/15/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Reviews {

    public Reviews(String error) {
        this.error = error;
    }

    public Reviews() {

    }

    private String error;
    private Review[] reviews;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }
}

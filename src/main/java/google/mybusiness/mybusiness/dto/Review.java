package main.java.google.mybusiness.mybusiness.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Created by Jayesh on 9/14/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Review {

    private String reviewId;
    private Reviewer reviewer;
    private String startRating;
    private String comment;
    private Date createTime;
    private Date updateTime;
    private ReviewReply reviewReply;

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public Reviewer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Reviewer reviewer) {
        this.reviewer = reviewer;
    }

    public String getStartRating() {
        return startRating;
    }

    public void setStartRating(String startRating) {
        this.startRating = startRating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public ReviewReply getReviewReply() {
        return reviewReply;
    }

    public void setReviewReply(ReviewReply reviewReply) {
        this.reviewReply = reviewReply;
    }

}

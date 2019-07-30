package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.ScheduledContentInsertionStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ScheduledContentInsertion
 */

public class ScheduledContentInsertion extends BitmovinResource {
  @JsonProperty("contentId")
  private String contentId;

  @JsonProperty("runAt")
  private Date runAt;

  @JsonProperty("durationInSeconds")
  private Double durationInSeconds;

  @JsonProperty("status")
  private ScheduledContentInsertionStatus status;


  /**
   * Id of the insertable content to play instead of the live stream (required)
   * @return contentId
   */
  public String getContentId() {
    return contentId;
  }

  /**
   * Id of the insertable content to play instead of the live stream (required)
   *
   * @param contentId
   *        Id of the insertable content to play instead of the live stream (required)
   */
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  /**
   * Time to to play the content in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return runAt
   */
  public Date getRunAt() {
    return runAt;
  }

  /**
   * Time to to play the content in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param runAt
   *        Time to to play the content in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setRunAt(Date runAt) {
    this.runAt = runAt;
  }


  /**
   * Duration for how long to play the content. Cut off if shorter, loop if longer than actual duration.
   * @return durationInSeconds
   */
  public Double getDurationInSeconds() {
    return durationInSeconds;
  }

  /**
   * Duration for how long to play the content. Cut off if shorter, loop if longer than actual duration.
   *
   * @param durationInSeconds
   *        Duration for how long to play the content. Cut off if shorter, loop if longer than actual duration.
   */
  public void setDurationInSeconds(Double durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }

  /**
   * Status of the scheduled content insertion.
   * @return status
   */
  public ScheduledContentInsertionStatus getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledContentInsertion scheduledContentInsertion = (ScheduledContentInsertion) o;
    return Objects.equals(this.contentId, scheduledContentInsertion.contentId) &&
        Objects.equals(this.runAt, scheduledContentInsertion.runAt) &&
        Objects.equals(this.durationInSeconds, scheduledContentInsertion.durationInSeconds) &&
        Objects.equals(this.status, scheduledContentInsertion.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, runAt, durationInSeconds, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledContentInsertion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    runAt: ").append(toIndentedString(runAt)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


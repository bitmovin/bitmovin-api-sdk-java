package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.ScheduledInsertableContentStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ScheduledInsertableContent
 */

public class ScheduledInsertableContent extends BitmovinResource {
  @JsonProperty("contentId")
  private String contentId;

  @JsonProperty("runAt")
  private Date runAt;

  @JsonProperty("durationInSeconds")
  private Double durationInSeconds;

  @JsonProperty("status")
  private ScheduledInsertableContentStatus status;


  /**
   * Id of the insertable content to play instead of the live stream
   * @return contentId
   */
  public String getContentId() {
    return contentId;
  }

  /**
   * Id of the insertable content to play instead of the live stream
   *
   * @param contentId
   *        Id of the insertable content to play instead of the live stream
   */
  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  /**
   * Time to to play the content in UTC: YYYY-MM-DDThh:mm:ssZ, if this property is not set the content will be played as soon as possible.
   * @return runAt
   */
  public Date getRunAt() {
    return runAt;
  }

  /**
   * Time to to play the content in UTC: YYYY-MM-DDThh:mm:ssZ, if this property is not set the content will be played as soon as possible.
   *
   * @param runAt
   *        Time to to play the content in UTC: YYYY-MM-DDThh:mm:ssZ, if this property is not set the content will be played as soon as possible.
   */
  public void setRunAt(Date runAt) {
    this.runAt = runAt;
  }


  /**
   * Duration for how long to play the content. Cut off if shorter, loop if longer than actual duration. This property is required if the insertable content is an image.
   * @return durationInSeconds
   */
  public Double getDurationInSeconds() {
    return durationInSeconds;
  }

  /**
   * Duration for how long to play the content. Cut off if shorter, loop if longer than actual duration. This property is required if the insertable content is an image.
   *
   * @param durationInSeconds
   *        Duration for how long to play the content. Cut off if shorter, loop if longer than actual duration. This property is required if the insertable content is an image.
   */
  public void setDurationInSeconds(Double durationInSeconds) {
    this.durationInSeconds = durationInSeconds;
  }

  /**
   * Status of the scheduled insertable content.
   * @return status
   */
  public ScheduledInsertableContentStatus getStatus() {
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
    ScheduledInsertableContent scheduledInsertableContent = (ScheduledInsertableContent) o;
    return Objects.equals(this.contentId, scheduledInsertableContent.contentId) &&
        Objects.equals(this.runAt, scheduledInsertableContent.runAt) &&
        Objects.equals(this.durationInSeconds, scheduledInsertableContent.durationInSeconds) &&
        Objects.equals(this.status, scheduledInsertableContent.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, runAt, durationInSeconds, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledInsertableContent {\n");
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


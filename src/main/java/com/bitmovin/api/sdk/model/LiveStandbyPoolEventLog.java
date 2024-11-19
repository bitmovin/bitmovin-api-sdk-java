package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveStandbyPoolEventLogType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolEventLog
 */

public class LiveStandbyPoolEventLog {
  @JsonProperty("id")
  private String id;

  @JsonProperty("standbyPoolId")
  private String standbyPoolId;

  @JsonProperty("standbyPoolEncodingId")
  private String standbyPoolEncodingId;

  @JsonProperty("createdAt")
  private String createdAt;

  @JsonProperty("message")
  private String message;

  @JsonProperty("details")
  private String details;

  @JsonProperty("eventType")
  private LiveStandbyPoolEventLogType eventType;

  /**
   * UUID of the entry
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Id of the standby_pool associated with the event log
   * @return standbyPoolId
   */
  public String getStandbyPoolId() {
    return standbyPoolId;
  }

  /**
   * (Optional) Id of the standby pool encoding associated with the event
   * @return standbyPoolEncodingId
   */
  public String getStandbyPoolEncodingId() {
    return standbyPoolEncodingId;
  }

  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Short description of the event
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Detailed description, payloads, hints on how to resolve errors, etc
   * @return details
   */
  public String getDetails() {
    return details;
  }


  /**
   * Get eventType
   * @return eventType
   */
  public LiveStandbyPoolEventLogType getEventType() {
    return eventType;
  }

  /**
   * Set eventType
   *
   * @param eventType
   */
  public void setEventType(LiveStandbyPoolEventLogType eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolEventLog liveStandbyPoolEventLog = (LiveStandbyPoolEventLog) o;
    return Objects.equals(this.id, liveStandbyPoolEventLog.id) &&
        Objects.equals(this.standbyPoolId, liveStandbyPoolEventLog.standbyPoolId) &&
        Objects.equals(this.standbyPoolEncodingId, liveStandbyPoolEventLog.standbyPoolEncodingId) &&
        Objects.equals(this.createdAt, liveStandbyPoolEventLog.createdAt) &&
        Objects.equals(this.message, liveStandbyPoolEventLog.message) &&
        Objects.equals(this.details, liveStandbyPoolEventLog.details) &&
        Objects.equals(this.eventType, liveStandbyPoolEventLog.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, standbyPoolId, standbyPoolEncodingId, createdAt, message, details, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolEventLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    standbyPoolId: ").append(toIndentedString(standbyPoolId)).append("\n");
    sb.append("    standbyPoolEncodingId: ").append(toIndentedString(standbyPoolEncodingId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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


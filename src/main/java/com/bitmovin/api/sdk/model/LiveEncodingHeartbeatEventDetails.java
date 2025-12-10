package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatEventType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveEncodingHeartbeatEventDetails
 */

public class LiveEncodingHeartbeatEventDetails {
  @JsonProperty("eventType")
  private LiveEncodingHeartbeatEventType eventType;

  @JsonProperty("message")
  private String message;


  /**
   * Get eventType
   * @return eventType
   */
  public LiveEncodingHeartbeatEventType getEventType() {
    return eventType;
  }

  /**
   * Set eventType
   *
   * @param eventType
   */
  public void setEventType(LiveEncodingHeartbeatEventType eventType) {
    this.eventType = eventType;
  }


  /**
   * Short description of the event
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Short description of the event
   *
   * @param message
   *        Short description of the event
   */
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatEventDetails liveEncodingHeartbeatEventDetails = (LiveEncodingHeartbeatEventDetails) o;
    return Objects.equals(this.eventType, liveEncodingHeartbeatEventDetails.eventType) &&
        Objects.equals(this.message, liveEncodingHeartbeatEventDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatEventDetails {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingEventName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveEncodingStatsEventDetails
 */

public class LiveEncodingStatsEventDetails {
  @JsonProperty("eventType")
  private LiveEncodingEventName eventType;

  @JsonProperty("message")
  private String message;

  @JsonProperty("midRollAssetNames")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> midRollAssetNames = new ArrayList<String>();

  @JsonProperty("durationInSeconds")
  private Double durationInSeconds;


  /**
   * Get eventType
   * @return eventType
   */
  public LiveEncodingEventName getEventType() {
    return eventType;
  }

  /**
   * Set eventType
   *
   * @param eventType
   */
  public void setEventType(LiveEncodingEventName eventType) {
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
   * Name of the mid roll asset name
   * @return midRollAssetNames
   */
  public List<String> getMidRollAssetNames() {
    return midRollAssetNames;
  }

  /**
   * Duration in seconds
   * @return durationInSeconds
   */
  public Double getDurationInSeconds() {
    return durationInSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingStatsEventDetails liveEncodingStatsEventDetails = (LiveEncodingStatsEventDetails) o;
    return Objects.equals(this.eventType, liveEncodingStatsEventDetails.eventType) &&
        Objects.equals(this.message, liveEncodingStatsEventDetails.message) &&
        Objects.equals(this.midRollAssetNames, liveEncodingStatsEventDetails.midRollAssetNames) &&
        Objects.equals(this.durationInSeconds, liveEncodingStatsEventDetails.durationInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, message, midRollAssetNames, durationInSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingStatsEventDetails {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    midRollAssetNames: ").append(toIndentedString(midRollAssetNames)).append("\n");
    sb.append("    durationInSeconds: ").append(toIndentedString(durationInSeconds)).append("\n");
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


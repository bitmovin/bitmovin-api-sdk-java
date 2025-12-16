package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ClockSynchronizationMode;
import com.bitmovin.api.sdk.model.LiveEncodingEventName;
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

  @JsonProperty("source")
  private ClockSynchronizationMode source;

  @JsonProperty("year")
  private Long year;

  @JsonProperty("month")
  private Long month;

  @JsonProperty("day")
  private Long day;

  @JsonProperty("hours")
  private Long hours;

  @JsonProperty("minutes")
  private Long minutes;

  @JsonProperty("seconds")
  private Long seconds;

  @JsonProperty("microSeconds")
  private Long microSeconds;


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
   * Source used for clock-synchronization
   * @return source
   */
  public ClockSynchronizationMode getSource() {
    return source;
  }

  /**
   * Year specified in picture timing
   * @return year
   */
  public Long getYear() {
    return year;
  }

  /**
   * Month specified in picture timing
   * @return month
   */
  public Long getMonth() {
    return month;
  }

  /**
   * Day specified in picture timing
   * @return day
   */
  public Long getDay() {
    return day;
  }

  /**
   * Hours specified in picture timing
   * @return hours
   */
  public Long getHours() {
    return hours;
  }

  /**
   * Minutes specified in picture timing
   * @return minutes
   */
  public Long getMinutes() {
    return minutes;
  }

  /**
   * Seconds specified in picture timing
   * @return seconds
   */
  public Long getSeconds() {
    return seconds;
  }

  /**
   * Microseconds specified in picture timing
   * @return microSeconds
   */
  public Long getMicroSeconds() {
    return microSeconds;
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
        Objects.equals(this.source, liveEncodingStatsEventDetails.source) &&
        Objects.equals(this.year, liveEncodingStatsEventDetails.year) &&
        Objects.equals(this.month, liveEncodingStatsEventDetails.month) &&
        Objects.equals(this.day, liveEncodingStatsEventDetails.day) &&
        Objects.equals(this.hours, liveEncodingStatsEventDetails.hours) &&
        Objects.equals(this.minutes, liveEncodingStatsEventDetails.minutes) &&
        Objects.equals(this.seconds, liveEncodingStatsEventDetails.seconds) &&
        Objects.equals(this.microSeconds, liveEncodingStatsEventDetails.microSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, message, source, year, month, day, hours, minutes, seconds, microSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingStatsEventDetails {\n");
    
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    microSeconds: ").append(toIndentedString(microSeconds)).append("\n");
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


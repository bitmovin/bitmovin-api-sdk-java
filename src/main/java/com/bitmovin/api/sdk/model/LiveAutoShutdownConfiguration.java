package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveAutoShutdownConfiguration
 */

public class LiveAutoShutdownConfiguration {
  @JsonProperty("bytesReadTimeoutSeconds")
  private Long bytesReadTimeoutSeconds;

  @JsonProperty("streamTimeoutMinutes")
  private Long streamTimeoutMinutes;

  @JsonProperty("waitingForFirstConnectTimeoutMinutes")
  private Long waitingForFirstConnectTimeoutMinutes;


  /**
   * Automatically shutdown the live stream if there is no input anymore for a predefined number of seconds.
   * minimum: 30
   * @return bytesReadTimeoutSeconds
   */
  public Long getBytesReadTimeoutSeconds() {
    return bytesReadTimeoutSeconds;
  }

  /**
   * Automatically shutdown the live stream if there is no input anymore for a predefined number of seconds.
   * minimum: 30
   *
   * @param bytesReadTimeoutSeconds
   *        Automatically shutdown the live stream if there is no input anymore for a predefined number of seconds.
   *        minimum: 30
   */
  public void setBytesReadTimeoutSeconds(Long bytesReadTimeoutSeconds) {
    this.bytesReadTimeoutSeconds = bytesReadTimeoutSeconds;
  }


  /**
   * Automatically shutdown the live stream after a predefined runtime in minutes.
   * minimum: 5
   * @return streamTimeoutMinutes
   */
  public Long getStreamTimeoutMinutes() {
    return streamTimeoutMinutes;
  }

  /**
   * Automatically shutdown the live stream after a predefined runtime in minutes.
   * minimum: 5
   *
   * @param streamTimeoutMinutes
   *        Automatically shutdown the live stream after a predefined runtime in minutes.
   *        minimum: 5
   */
  public void setStreamTimeoutMinutes(Long streamTimeoutMinutes) {
    this.streamTimeoutMinutes = streamTimeoutMinutes;
  }


  /**
   * Automatically shutdown the live stream if input is never connected for a predefined number of minutes.
   * minimum: 5
   * @return waitingForFirstConnectTimeoutMinutes
   */
  public Long getWaitingForFirstConnectTimeoutMinutes() {
    return waitingForFirstConnectTimeoutMinutes;
  }

  /**
   * Automatically shutdown the live stream if input is never connected for a predefined number of minutes.
   * minimum: 5
   *
   * @param waitingForFirstConnectTimeoutMinutes
   *        Automatically shutdown the live stream if input is never connected for a predefined number of minutes.
   *        minimum: 5
   */
  public void setWaitingForFirstConnectTimeoutMinutes(Long waitingForFirstConnectTimeoutMinutes) {
    this.waitingForFirstConnectTimeoutMinutes = waitingForFirstConnectTimeoutMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveAutoShutdownConfiguration liveAutoShutdownConfiguration = (LiveAutoShutdownConfiguration) o;
    return Objects.equals(this.bytesReadTimeoutSeconds, liveAutoShutdownConfiguration.bytesReadTimeoutSeconds) &&
        Objects.equals(this.streamTimeoutMinutes, liveAutoShutdownConfiguration.streamTimeoutMinutes) &&
        Objects.equals(this.waitingForFirstConnectTimeoutMinutes, liveAutoShutdownConfiguration.waitingForFirstConnectTimeoutMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesReadTimeoutSeconds, streamTimeoutMinutes, waitingForFirstConnectTimeoutMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveAutoShutdownConfiguration {\n");
    
    sb.append("    bytesReadTimeoutSeconds: ").append(toIndentedString(bytesReadTimeoutSeconds)).append("\n");
    sb.append("    streamTimeoutMinutes: ").append(toIndentedString(streamTimeoutMinutes)).append("\n");
    sb.append("    waitingForFirstConnectTimeoutMinutes: ").append(toIndentedString(waitingForFirstConnectTimeoutMinutes)).append("\n");
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


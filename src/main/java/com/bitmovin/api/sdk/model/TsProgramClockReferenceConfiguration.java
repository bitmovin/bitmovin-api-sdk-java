package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TsProgramClockReferenceConfiguration
 */

public class TsProgramClockReferenceConfiguration {
  @JsonProperty("pid")
  private Integer pid;

  @JsonProperty("interval")
  private Integer interval;


  /**
   * An integer value. Packet Identifier (PID) for the MPEG Transport Stream PCR. This should generally point to the video stream PID. If it is not explicitly set it will point to the video stream PID if exists, otherwise to the audio stream PID.
   * minimum: 16
   * maximum: 8190
   * @return pid
   */
  public Integer getPid() {
    return pid;
  }

  /**
   * An integer value. Packet Identifier (PID) for the MPEG Transport Stream PCR. This should generally point to the video stream PID. If it is not explicitly set it will point to the video stream PID if exists, otherwise to the audio stream PID.
   * minimum: 16
   * maximum: 8190
   *
   * @param pid
   *        An integer value. Packet Identifier (PID) for the MPEG Transport Stream PCR. This should generally point to the video stream PID. If it is not explicitly set it will point to the video stream PID if exists, otherwise to the audio stream PID.
   * minimum: 16
   * maximum: 8190
   */
  public void setPid(Integer pid) {
    this.pid = pid;
  }


  /**
   * An integer value. Nominal time between MPEG Transport Stream PCRs in milliseconds.
   * minimum: 1
   * maximum: 65535
   * @return interval
   */
  public Integer getInterval() {
    return interval;
  }

  /**
   * An integer value. Nominal time between MPEG Transport Stream PCRs in milliseconds.
   * minimum: 1
   * maximum: 65535
   *
   * @param interval
   *        An integer value. Nominal time between MPEG Transport Stream PCRs in milliseconds.
   * minimum: 1
   * maximum: 65535
   */
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsProgramClockReferenceConfiguration tsProgramClockReferenceConfiguration = (TsProgramClockReferenceConfiguration) o;
    return Objects.equals(this.pid, tsProgramClockReferenceConfiguration.pid) &&
        Objects.equals(this.interval, tsProgramClockReferenceConfiguration.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsProgramClockReferenceConfiguration {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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


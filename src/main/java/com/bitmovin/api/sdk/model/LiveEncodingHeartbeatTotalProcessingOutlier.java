package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A single segment whose total processing duration exceeded twice the rolling median.
 */

public class LiveEncodingHeartbeatTotalProcessingOutlier {
  @JsonProperty("segmentNumber")
  private Long segmentNumber;

  @JsonProperty("durationMs")
  private Long durationMs;


  /**
   * Output segment number this measurement belongs to.
   * @return segmentNumber
   */
  public Long getSegmentNumber() {
    return segmentNumber;
  }

  /**
   * Output segment number this measurement belongs to.
   *
   * @param segmentNumber
   *        Output segment number this measurement belongs to.
   */
  public void setSegmentNumber(Long segmentNumber) {
    this.segmentNumber = segmentNumber;
  }


  /**
   * Total processing duration in milliseconds.
   * @return durationMs
   */
  public Long getDurationMs() {
    return durationMs;
  }

  /**
   * Total processing duration in milliseconds.
   *
   * @param durationMs
   *        Total processing duration in milliseconds.
   */
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatTotalProcessingOutlier liveEncodingHeartbeatTotalProcessingOutlier = (LiveEncodingHeartbeatTotalProcessingOutlier) o;
    return Objects.equals(this.segmentNumber, liveEncodingHeartbeatTotalProcessingOutlier.segmentNumber) &&
        Objects.equals(this.durationMs, liveEncodingHeartbeatTotalProcessingOutlier.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentNumber, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatTotalProcessingOutlier {\n");
    
    sb.append("    segmentNumber: ").append(toIndentedString(segmentNumber)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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


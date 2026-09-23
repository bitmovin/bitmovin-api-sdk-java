package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveSourceGapReason;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisLiveSourceGap
 */

public class AiSceneAnalysisLiveSourceGap {
  @JsonProperty("startTimeSeconds")
  private Double startTimeSeconds;

  @JsonProperty("endTimeSeconds")
  private Double endTimeSeconds;

  @JsonProperty("reason")
  private AiSceneAnalysisLiveSourceGapReason reason;


  /**
   * Gap start on the monotonic analysis timeline (required)
   * minimum: 0
   * @return startTimeSeconds
   */
  public Double getStartTimeSeconds() {
    return startTimeSeconds;
  }

  /**
   * Gap start on the monotonic analysis timeline (required)
   * minimum: 0
   *
   * @param startTimeSeconds
   *        Gap start on the monotonic analysis timeline (required)
   *        minimum: 0
   */
  public void setStartTimeSeconds(Double startTimeSeconds) {
    this.startTimeSeconds = startTimeSeconds;
  }


  /**
   * Gap end on the monotonic analysis timeline (required)
   * minimum: 0
   * @return endTimeSeconds
   */
  public Double getEndTimeSeconds() {
    return endTimeSeconds;
  }

  /**
   * Gap end on the monotonic analysis timeline (required)
   * minimum: 0
   *
   * @param endTimeSeconds
   *        Gap end on the monotonic analysis timeline (required)
   *        minimum: 0
   */
  public void setEndTimeSeconds(Double endTimeSeconds) {
    this.endTimeSeconds = endTimeSeconds;
  }


  /**
   * Reason for the source gap (required)
   * @return reason
   */
  public AiSceneAnalysisLiveSourceGapReason getReason() {
    return reason;
  }

  /**
   * Reason for the source gap (required)
   *
   * @param reason
   *        Reason for the source gap (required)
   */
  public void setReason(AiSceneAnalysisLiveSourceGapReason reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveSourceGap aiSceneAnalysisLiveSourceGap = (AiSceneAnalysisLiveSourceGap) o;
    return Objects.equals(this.startTimeSeconds, aiSceneAnalysisLiveSourceGap.startTimeSeconds) &&
        Objects.equals(this.endTimeSeconds, aiSceneAnalysisLiveSourceGap.endTimeSeconds) &&
        Objects.equals(this.reason, aiSceneAnalysisLiveSourceGap.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTimeSeconds, endTimeSeconds, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveSourceGap {\n");
    
    sb.append("    startTimeSeconds: ").append(toIndentedString(startTimeSeconds)).append("\n");
    sb.append("    endTimeSeconds: ").append(toIndentedString(endTimeSeconds)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Aggregate statistics of per-segment total processing duration over a rolling window of completed segments.
 */

public class LiveEncodingHeartbeatTotalProcessingStatsMs {
  @JsonProperty("min")
  private Long min;

  @JsonProperty("max")
  private Long max;

  @JsonProperty("mean")
  private Long mean;

  @JsonProperty("median")
  private Long median;


  /**
   * Minimum total processing duration in milliseconds.
   * @return min
   */
  public Long getMin() {
    return min;
  }

  /**
   * Minimum total processing duration in milliseconds.
   *
   * @param min
   *        Minimum total processing duration in milliseconds.
   */
  public void setMin(Long min) {
    this.min = min;
  }


  /**
   * Maximum total processing duration in milliseconds.
   * @return max
   */
  public Long getMax() {
    return max;
  }

  /**
   * Maximum total processing duration in milliseconds.
   *
   * @param max
   *        Maximum total processing duration in milliseconds.
   */
  public void setMax(Long max) {
    this.max = max;
  }


  /**
   * Mean total processing duration in milliseconds.
   * @return mean
   */
  public Long getMean() {
    return mean;
  }

  /**
   * Mean total processing duration in milliseconds.
   *
   * @param mean
   *        Mean total processing duration in milliseconds.
   */
  public void setMean(Long mean) {
    this.mean = mean;
  }


  /**
   * Median total processing duration in milliseconds.
   * @return median
   */
  public Long getMedian() {
    return median;
  }

  /**
   * Median total processing duration in milliseconds.
   *
   * @param median
   *        Median total processing duration in milliseconds.
   */
  public void setMedian(Long median) {
    this.median = median;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatTotalProcessingStatsMs liveEncodingHeartbeatTotalProcessingStatsMs = (LiveEncodingHeartbeatTotalProcessingStatsMs) o;
    return Objects.equals(this.min, liveEncodingHeartbeatTotalProcessingStatsMs.min) &&
        Objects.equals(this.max, liveEncodingHeartbeatTotalProcessingStatsMs.max) &&
        Objects.equals(this.mean, liveEncodingHeartbeatTotalProcessingStatsMs.mean) &&
        Objects.equals(this.median, liveEncodingHeartbeatTotalProcessingStatsMs.median);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, mean, median);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatTotalProcessingStatsMs {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
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


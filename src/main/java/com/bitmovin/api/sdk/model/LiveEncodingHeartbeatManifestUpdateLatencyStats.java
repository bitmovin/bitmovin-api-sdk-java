package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Aggregate statistics of HLS manifest update latencies.
 */

public class LiveEncodingHeartbeatManifestUpdateLatencyStats {
  @JsonProperty("mean")
  private Long mean;

  @JsonProperty("median")
  private Long median;

  @JsonProperty("min")
  private Long min;

  @JsonProperty("max")
  private Long max;


  /**
   * Mean manifest update latency in milliseconds.
   * @return mean
   */
  public Long getMean() {
    return mean;
  }

  /**
   * Mean manifest update latency in milliseconds.
   *
   * @param mean
   *        Mean manifest update latency in milliseconds.
   */
  public void setMean(Long mean) {
    this.mean = mean;
  }


  /**
   * Median manifest update latency in milliseconds.
   * @return median
   */
  public Long getMedian() {
    return median;
  }

  /**
   * Median manifest update latency in milliseconds.
   *
   * @param median
   *        Median manifest update latency in milliseconds.
   */
  public void setMedian(Long median) {
    this.median = median;
  }


  /**
   * Minimum manifest update latency in milliseconds.
   * @return min
   */
  public Long getMin() {
    return min;
  }

  /**
   * Minimum manifest update latency in milliseconds.
   *
   * @param min
   *        Minimum manifest update latency in milliseconds.
   */
  public void setMin(Long min) {
    this.min = min;
  }


  /**
   * Maximum manifest update latency in milliseconds.
   * @return max
   */
  public Long getMax() {
    return max;
  }

  /**
   * Maximum manifest update latency in milliseconds.
   *
   * @param max
   *        Maximum manifest update latency in milliseconds.
   */
  public void setMax(Long max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatManifestUpdateLatencyStats liveEncodingHeartbeatManifestUpdateLatencyStats = (LiveEncodingHeartbeatManifestUpdateLatencyStats) o;
    return Objects.equals(this.mean, liveEncodingHeartbeatManifestUpdateLatencyStats.mean) &&
        Objects.equals(this.median, liveEncodingHeartbeatManifestUpdateLatencyStats.median) &&
        Objects.equals(this.min, liveEncodingHeartbeatManifestUpdateLatencyStats.min) &&
        Objects.equals(this.max, liveEncodingHeartbeatManifestUpdateLatencyStats.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mean, median, min, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatManifestUpdateLatencyStats {\n");
    
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
    sb.append("    median: ").append(toIndentedString(median)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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


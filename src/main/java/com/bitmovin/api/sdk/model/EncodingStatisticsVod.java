package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BillableEncodingFeatureMinutes;
import com.bitmovin.api.sdk.model.BillableEncodingMinutes;
import com.bitmovin.api.sdk.model.EgressInformation;
import com.bitmovin.api.sdk.model.EncodingStatistics;
import com.bitmovin.api.sdk.model.StatisticsPerMuxing;
import com.bitmovin.api.sdk.model.StatisticsPerStream;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingStatisticsVod
 */

public class EncodingStatisticsVod extends EncodingStatistics {
  @JsonProperty("timeEnqueued")
  private Long timeEnqueued;

  @JsonProperty("realTimeFactor")
  private Double realTimeFactor;


  /**
   * Time in seconds encoded for this encoding. (required)
   * @return timeEnqueued
   */
  public Long getTimeEnqueued() {
    return timeEnqueued;
  }

  /**
   * Time in seconds encoded for this encoding. (required)
   *
   * @param timeEnqueued
   *        Time in seconds encoded for this encoding. (required)
   */
  public void setTimeEnqueued(Long timeEnqueued) {
    this.timeEnqueued = timeEnqueued;
  }


  /**
   * The realtime factor. (required)
   * @return realTimeFactor
   */
  public Double getRealTimeFactor() {
    return realTimeFactor;
  }

  /**
   * The realtime factor. (required)
   *
   * @param realTimeFactor
   *        The realtime factor. (required)
   */
  public void setRealTimeFactor(Double realTimeFactor) {
    this.realTimeFactor = realTimeFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingStatisticsVod encodingStatisticsVod = (EncodingStatisticsVod) o;
    return Objects.equals(this.timeEnqueued, encodingStatisticsVod.timeEnqueued) &&
        Objects.equals(this.realTimeFactor, encodingStatisticsVod.realTimeFactor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeEnqueued, realTimeFactor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingStatisticsVod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timeEnqueued: ").append(toIndentedString(timeEnqueued)).append("\n");
    sb.append("    realTimeFactor: ").append(toIndentedString(realTimeFactor)).append("\n");
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


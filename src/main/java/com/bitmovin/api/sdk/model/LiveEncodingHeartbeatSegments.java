package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatTotalProcessingOutlier;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatTotalProcessingStatsMs;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatUploadOutlier;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Segment processing statistics for a live encoding heartbeat.
 */

public class LiveEncodingHeartbeatSegments {
  @JsonProperty("totalProcessingStatsMs")
  private LiveEncodingHeartbeatTotalProcessingStatsMs totalProcessingStatsMs;

  @JsonProperty("uploadOutliers")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatUploadOutlier> uploadOutliers = new ArrayList<LiveEncodingHeartbeatUploadOutlier>();

  @JsonProperty("totalProcessingOutliers")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatTotalProcessingOutlier> totalProcessingOutliers = new ArrayList<LiveEncodingHeartbeatTotalProcessingOutlier>();


  /**
   * Aggregate statistics of per-segment total processing duration.
   * @return totalProcessingStatsMs
   */
  public LiveEncodingHeartbeatTotalProcessingStatsMs getTotalProcessingStatsMs() {
    return totalProcessingStatsMs;
  }

  /**
   * Aggregate statistics of per-segment total processing duration.
   *
   * @param totalProcessingStatsMs
   *        Aggregate statistics of per-segment total processing duration.
   */
  public void setTotalProcessingStatsMs(LiveEncodingHeartbeatTotalProcessingStatsMs totalProcessingStatsMs) {
    this.totalProcessingStatsMs = totalProcessingStatsMs;
  }


  public LiveEncodingHeartbeatSegments addUploadOutliersItem(LiveEncodingHeartbeatUploadOutlier uploadOutliersItem) {
    this.uploadOutliers.add(uploadOutliersItem);
    return this;
  }

  /**
   * Last 20 per-muxing uploads whose duration exceeded the upload-outlier threshold.
   * @return uploadOutliers
   */
  public List<LiveEncodingHeartbeatUploadOutlier> getUploadOutliers() {
    return uploadOutliers;
  }

  /**
   * Last 20 per-muxing uploads whose duration exceeded the upload-outlier threshold.
   *
   * @param uploadOutliers
   *        Last 20 per-muxing uploads whose duration exceeded the upload-outlier threshold.
   */
  public void setUploadOutliers(List<LiveEncodingHeartbeatUploadOutlier> uploadOutliers) {
    this.uploadOutliers = uploadOutliers;
  }


  public LiveEncodingHeartbeatSegments addTotalProcessingOutliersItem(LiveEncodingHeartbeatTotalProcessingOutlier totalProcessingOutliersItem) {
    this.totalProcessingOutliers.add(totalProcessingOutliersItem);
    return this;
  }

  /**
   * Last 20 segments whose total processing duration exceeded twice the rolling median.
   * @return totalProcessingOutliers
   */
  public List<LiveEncodingHeartbeatTotalProcessingOutlier> getTotalProcessingOutliers() {
    return totalProcessingOutliers;
  }

  /**
   * Last 20 segments whose total processing duration exceeded twice the rolling median.
   *
   * @param totalProcessingOutliers
   *        Last 20 segments whose total processing duration exceeded twice the rolling median.
   */
  public void setTotalProcessingOutliers(List<LiveEncodingHeartbeatTotalProcessingOutlier> totalProcessingOutliers) {
    this.totalProcessingOutliers = totalProcessingOutliers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatSegments liveEncodingHeartbeatSegments = (LiveEncodingHeartbeatSegments) o;
    return Objects.equals(this.totalProcessingStatsMs, liveEncodingHeartbeatSegments.totalProcessingStatsMs) &&
        Objects.equals(this.uploadOutliers, liveEncodingHeartbeatSegments.uploadOutliers) &&
        Objects.equals(this.totalProcessingOutliers, liveEncodingHeartbeatSegments.totalProcessingOutliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalProcessingStatsMs, uploadOutliers, totalProcessingOutliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatSegments {\n");
    
    sb.append("    totalProcessingStatsMs: ").append(toIndentedString(totalProcessingStatsMs)).append("\n");
    sb.append("    uploadOutliers: ").append(toIndentedString(uploadOutliers)).append("\n");
    sb.append("    totalProcessingOutliers: ").append(toIndentedString(totalProcessingOutliers)).append("\n");
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


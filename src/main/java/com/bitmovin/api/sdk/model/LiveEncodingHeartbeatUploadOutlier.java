package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A single per-muxing segment upload whose duration exceeded the upload-outlier threshold.
 */

public class LiveEncodingHeartbeatUploadOutlier {
  @JsonProperty("segmentNumber")
  private Long segmentNumber;

  @JsonProperty("encodingReferenceMuxingId")
  private String encodingReferenceMuxingId;

  @JsonProperty("durationMs")
  private Long durationMs;


  /**
   * Output segment number this upload belongs to.
   * @return segmentNumber
   */
  public Long getSegmentNumber() {
    return segmentNumber;
  }

  /**
   * Output segment number this upload belongs to.
   *
   * @param segmentNumber
   *        Output segment number this upload belongs to.
   */
  public void setSegmentNumber(Long segmentNumber) {
    this.segmentNumber = segmentNumber;
  }


  /**
   * Identifier of the muxing whose upload was flagged.
   * @return encodingReferenceMuxingId
   */
  public String getEncodingReferenceMuxingId() {
    return encodingReferenceMuxingId;
  }

  /**
   * Identifier of the muxing whose upload was flagged.
   *
   * @param encodingReferenceMuxingId
   *        Identifier of the muxing whose upload was flagged.
   */
  public void setEncodingReferenceMuxingId(String encodingReferenceMuxingId) {
    this.encodingReferenceMuxingId = encodingReferenceMuxingId;
  }


  /**
   * Upload duration in milliseconds.
   * @return durationMs
   */
  public Long getDurationMs() {
    return durationMs;
  }

  /**
   * Upload duration in milliseconds.
   *
   * @param durationMs
   *        Upload duration in milliseconds.
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
    LiveEncodingHeartbeatUploadOutlier liveEncodingHeartbeatUploadOutlier = (LiveEncodingHeartbeatUploadOutlier) o;
    return Objects.equals(this.segmentNumber, liveEncodingHeartbeatUploadOutlier.segmentNumber) &&
        Objects.equals(this.encodingReferenceMuxingId, liveEncodingHeartbeatUploadOutlier.encodingReferenceMuxingId) &&
        Objects.equals(this.durationMs, liveEncodingHeartbeatUploadOutlier.durationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentNumber, encodingReferenceMuxingId, durationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatUploadOutlier {\n");
    
    sb.append("    segmentNumber: ").append(toIndentedString(segmentNumber)).append("\n");
    sb.append("    encodingReferenceMuxingId: ").append(toIndentedString(encodingReferenceMuxingId)).append("\n");
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


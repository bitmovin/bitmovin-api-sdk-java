package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BasicMediaInfo;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SegmentsMediaInfo
 */

public class SegmentsMediaInfo extends BasicMediaInfo {
  @JsonProperty("segmentPath")
  private String segmentPath;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("muxingId")
  private String muxingId;

  @JsonProperty("drmId")
  private String drmId;

  @JsonProperty("startSegmentNumber")
  private Long startSegmentNumber;

  @JsonProperty("endSegmentNumber")
  private Long endSegmentNumber;


  /**
   * Path to segments. (required)
   * @return segmentPath
   */
  public String getSegmentPath() {
    return segmentPath;
  }

  /**
   * Path to segments. (required)
   *
   * @param segmentPath
   *        Path to segments. (required)
   */
  public void setSegmentPath(String segmentPath) {
    this.segmentPath = segmentPath;
  }


  /**
   * Id of the encoding. (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * Id of the encoding. (required)
   *
   * @param encodingId
   *        Id of the encoding. (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * Id of the stream. (required)
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * Id of the stream. (required)
   *
   * @param streamId
   *        Id of the stream. (required)
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * Id of the muxing. (required)
   * @return muxingId
   */
  public String getMuxingId() {
    return muxingId;
  }

  /**
   * Id of the muxing. (required)
   *
   * @param muxingId
   *        Id of the muxing. (required)
   */
  public void setMuxingId(String muxingId) {
    this.muxingId = muxingId;
  }


  /**
   * Id of the DRM.
   * @return drmId
   */
  public String getDrmId() {
    return drmId;
  }

  /**
   * Id of the DRM.
   *
   * @param drmId
   *        Id of the DRM.
   */
  public void setDrmId(String drmId) {
    this.drmId = drmId;
  }


  /**
   * Number of the first segment. Default is 0.
   * @return startSegmentNumber
   */
  public Long getStartSegmentNumber() {
    return startSegmentNumber;
  }

  /**
   * Number of the first segment. Default is 0.
   *
   * @param startSegmentNumber
   *        Number of the first segment. Default is 0.
   */
  public void setStartSegmentNumber(Long startSegmentNumber) {
    this.startSegmentNumber = startSegmentNumber;
  }


  /**
   * Number of the last segment. Default is the last one that was encoded.
   * @return endSegmentNumber
   */
  public Long getEndSegmentNumber() {
    return endSegmentNumber;
  }

  /**
   * Number of the last segment. Default is the last one that was encoded.
   *
   * @param endSegmentNumber
   *        Number of the last segment. Default is the last one that was encoded.
   */
  public void setEndSegmentNumber(Long endSegmentNumber) {
    this.endSegmentNumber = endSegmentNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentsMediaInfo segmentsMediaInfo = (SegmentsMediaInfo) o;
    return Objects.equals(this.segmentPath, segmentsMediaInfo.segmentPath) &&
        Objects.equals(this.encodingId, segmentsMediaInfo.encodingId) &&
        Objects.equals(this.streamId, segmentsMediaInfo.streamId) &&
        Objects.equals(this.muxingId, segmentsMediaInfo.muxingId) &&
        Objects.equals(this.drmId, segmentsMediaInfo.drmId) &&
        Objects.equals(this.startSegmentNumber, segmentsMediaInfo.startSegmentNumber) &&
        Objects.equals(this.endSegmentNumber, segmentsMediaInfo.endSegmentNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentPath, encodingId, streamId, muxingId, drmId, startSegmentNumber, endSegmentNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentsMediaInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    segmentPath: ").append(toIndentedString(segmentPath)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    muxingId: ").append(toIndentedString(muxingId)).append("\n");
    sb.append("    drmId: ").append(toIndentedString(drmId)).append("\n");
    sb.append("    startSegmentNumber: ").append(toIndentedString(startSegmentNumber)).append("\n");
    sb.append("    endSegmentNumber: ").append(toIndentedString(endSegmentNumber)).append("\n");
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


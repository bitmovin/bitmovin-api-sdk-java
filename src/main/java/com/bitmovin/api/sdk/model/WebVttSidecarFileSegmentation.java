package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The segmenting configuration for this WebVTT sidecar file. If this is set, the given vtt file will be chunked.
 */

public class WebVttSidecarFileSegmentation {
  @JsonProperty("segmentLength")
  private Double segmentLength;


  /**
   * The length of the WebVTT fragments in seconds
   * @return segmentLength
   */
  public Double getSegmentLength() {
    return segmentLength;
  }

  /**
   * The length of the WebVTT fragments in seconds
   *
   * @param segmentLength
   * The length of the WebVTT fragments in seconds
   */
  public void setSegmentLength(Double segmentLength) {
    this.segmentLength = segmentLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebVttSidecarFileSegmentation webVttSidecarFileSegmentation = (WebVttSidecarFileSegmentation) o;
    return Objects.equals(this.segmentLength, webVttSidecarFileSegmentation.segmentLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentLength);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebVttSidecarFileSegmentation {\n");
    
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
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


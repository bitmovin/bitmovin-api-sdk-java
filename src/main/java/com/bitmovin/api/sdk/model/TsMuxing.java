package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TsMuxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class TsMuxing extends Muxing {
  @JsonProperty("segmentLength")
  private Double segmentLength;

  @JsonProperty("segmentNaming")
  private String segmentNaming;

  @JsonProperty("segmentNamingTemplate")
  private String segmentNamingTemplate;

  @JsonProperty("startOffset")
  private Integer startOffset;

  @JsonProperty("segmentsMuxed")
  private Integer segmentsMuxed;


  /**
   * Length of the fragments in seconds
   * @return segmentLength
   */
  public Double getSegmentLength() {
    return segmentLength;
  }

  public void setSegmentLength(Double segmentLength) {
    this.segmentLength = segmentLength;
  }


  /**
   * Segment naming policy
   * @return segmentNaming
   */
  public String getSegmentNaming() {
    return segmentNaming;
  }

  public void setSegmentNaming(String segmentNaming) {
    this.segmentNaming = segmentNaming;
  }


  /**
   * Segment naming policy with placeholders which will be replaced during the encoding. The result will be saved in segmentNaming. {rand:4} gets replaced with an alphanumeric string of length specified after the colon. Defaults to 32. If this field is set, segmentNaming must not be specified.
   * @return segmentNamingTemplate
   */
  public String getSegmentNamingTemplate() {
    return segmentNamingTemplate;
  }

  public void setSegmentNamingTemplate(String segmentNamingTemplate) {
    this.segmentNamingTemplate = segmentNamingTemplate;
  }


  /**
   * Offset of MPEG-TS timestamps in seconds. E.g., first packet will start with PTS 900,000 for a 10 seconds offset (90,000 MPEG-TS timescale).
   * @return startOffset
   */
  public Integer getStartOffset() {
    return startOffset;
  }

  public void setStartOffset(Integer startOffset) {
    this.startOffset = startOffset;
  }

  /**
   * Number of segments which have been encoded
   * @return segmentsMuxed
   */
  public Integer getSegmentsMuxed() {
    return segmentsMuxed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsMuxing tsMuxing = (TsMuxing) o;
    return Objects.equals(this.segmentLength, tsMuxing.segmentLength) &&
        Objects.equals(this.segmentNaming, tsMuxing.segmentNaming) &&
        Objects.equals(this.segmentNamingTemplate, tsMuxing.segmentNamingTemplate) &&
        Objects.equals(this.startOffset, tsMuxing.startOffset) &&
        Objects.equals(this.segmentsMuxed, tsMuxing.segmentsMuxed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentLength, segmentNaming, segmentNamingTemplate, startOffset, segmentsMuxed, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsMuxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
    sb.append("    segmentNaming: ").append(toIndentedString(segmentNaming)).append("\n");
    sb.append("    segmentNamingTemplate: ").append(toIndentedString(segmentNamingTemplate)).append("\n");
    sb.append("    startOffset: ").append(toIndentedString(startOffset)).append("\n");
    sb.append("    segmentsMuxed: ").append(toIndentedString(segmentsMuxed)).append("\n");
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


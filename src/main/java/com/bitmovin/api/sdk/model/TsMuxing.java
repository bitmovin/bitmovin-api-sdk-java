package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import com.bitmovin.api.sdk.model.TsMuxingConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
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

  @JsonProperty("configuration")
  private TsMuxingConfiguration _configuration;


  /**
   * Length of the fragments in seconds (required)
   * @return segmentLength
   */
  public Double getSegmentLength() {
    return segmentLength;
  }

  /**
   * Length of the fragments in seconds (required)
   *
   * @param segmentLength
   *        Length of the fragments in seconds (required)
   */
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

  /**
   * Segment naming policy
   *
   * @param segmentNaming
   *        Segment naming policy
   */
  public void setSegmentNaming(String segmentNaming) {
    this.segmentNaming = segmentNaming;
  }


  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property. Intended to avoid re-use of segment names after restarting a live encoding. If segmentNamingTemplate is set, segmentNaming must not be set.
   * @return segmentNamingTemplate
   */
  public String getSegmentNamingTemplate() {
    return segmentNamingTemplate;
  }

  /**
   * Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property. Intended to avoid re-use of segment names after restarting a live encoding. If segmentNamingTemplate is set, segmentNaming must not be set.
   *
   * @param segmentNamingTemplate
   *        Segment naming policy containing a placeholder of the format &#39;{rand_chars:x}&#39;, which will be replaced by a random alphanumeric string of length x (default 32) on each (re)start of the encoding. The resulting string will be copied to the segmentNaming property. Intended to avoid re-use of segment names after restarting a live encoding. If segmentNamingTemplate is set, segmentNaming must not be set.
   */
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

  /**
   * Offset of MPEG-TS timestamps in seconds. E.g., first packet will start with PTS 900,000 for a 10 seconds offset (90,000 MPEG-TS timescale).
   *
   * @param startOffset
   *        Offset of MPEG-TS timestamps in seconds. E.g., first packet will start with PTS 900,000 for a 10 seconds offset (90,000 MPEG-TS timescale).
   */
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


  /**
   * Advanced Configuration of the MPEG Transport Stream Parameters
   * @return _configuration
   */
  public TsMuxingConfiguration getConfiguration() {
    return _configuration;
  }

  /**
   * Advanced Configuration of the MPEG Transport Stream Parameters
   *
   * @param _configuration
   *        Advanced Configuration of the MPEG Transport Stream Parameters
   */
  public void setConfiguration(TsMuxingConfiguration _configuration) {
    this._configuration = _configuration;
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
        Objects.equals(this._configuration, tsMuxing._configuration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentLength, segmentNaming, segmentNamingTemplate, startOffset, segmentsMuxed, _configuration, super.hashCode());
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
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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


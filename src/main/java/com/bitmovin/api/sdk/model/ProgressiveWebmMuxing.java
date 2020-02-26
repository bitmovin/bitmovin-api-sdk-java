package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.ProgressiveWebmMuxingManifestType;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ProgressiveWebmMuxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = ProgressiveWebmMuxing.class)
public class ProgressiveWebmMuxing extends Muxing {
  @JsonProperty("filename")
  private String filename;

  @JsonProperty("manifestType")
  private ProgressiveWebmMuxingManifestType manifestType;

  @JsonProperty("segmentLength")
  private Double segmentLength;


  /**
   * Name of the new Video
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Name of the new Video
   *
   * @param filename
   *        Name of the new Video
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Get manifestType
   * @return manifestType
   */
  public ProgressiveWebmMuxingManifestType getManifestType() {
    return manifestType;
  }

  /**
   * Set manifestType
   *
   * @param manifestType
   */
  public void setManifestType(ProgressiveWebmMuxingManifestType manifestType) {
    this.manifestType = manifestType;
  }


  /**
   * Determines the length of segments in seconds if manifestType is set to DASH_ON_DEMAND. Defaults to 4 seconds
   * @return segmentLength
   */
  public Double getSegmentLength() {
    return segmentLength;
  }

  /**
   * Determines the length of segments in seconds if manifestType is set to DASH_ON_DEMAND. Defaults to 4 seconds
   *
   * @param segmentLength
   *        Determines the length of segments in seconds if manifestType is set to DASH_ON_DEMAND. Defaults to 4 seconds
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
    ProgressiveWebmMuxing progressiveWebmMuxing = (ProgressiveWebmMuxing) o;
    return Objects.equals(this.filename, progressiveWebmMuxing.filename) &&
        Objects.equals(this.manifestType, progressiveWebmMuxing.manifestType) &&
        Objects.equals(this.segmentLength, progressiveWebmMuxing.segmentLength) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, manifestType, segmentLength, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgressiveWebmMuxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    manifestType: ").append(toIndentedString(manifestType)).append("\n");
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


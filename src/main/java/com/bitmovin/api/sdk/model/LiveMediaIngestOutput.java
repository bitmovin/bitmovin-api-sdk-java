package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.Output;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Live Media and Metadata Ingest Protocol. See https://tools.ietf.org/html/draft-mekuria-mmediaingest-01.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = LiveMediaIngestOutput.class)
public class LiveMediaIngestOutput extends Output {
  @JsonProperty("publishingPoint")
  private String publishingPoint;

  @JsonProperty("scte35Passthrough")
  private Boolean scte35Passthrough;


  /**
   * URL specifying the publishing point for the output. Can use either http or https. (required)
   * @return publishingPoint
   */
  public String getPublishingPoint() {
    return publishingPoint;
  }

  /**
   * URL specifying the publishing point for the output. Can use either http or https. (required)
   *
   * @param publishingPoint
   *        URL specifying the publishing point for the output. Can use either http or https. (required)
   */
  public void setPublishingPoint(String publishingPoint) {
    this.publishingPoint = publishingPoint;
  }


  /**
   * Enable passthrough of SCTE-35 messages from input to output. Default is false.
   * @return scte35Passthrough
   */
  public Boolean getScte35Passthrough() {
    return scte35Passthrough;
  }

  /**
   * Enable passthrough of SCTE-35 messages from input to output. Default is false.
   *
   * @param scte35Passthrough
   *        Enable passthrough of SCTE-35 messages from input to output. Default is false.
   */
  public void setScte35Passthrough(Boolean scte35Passthrough) {
    this.scte35Passthrough = scte35Passthrough;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveMediaIngestOutput liveMediaIngestOutput = (LiveMediaIngestOutput) o;
    return Objects.equals(this.publishingPoint, liveMediaIngestOutput.publishingPoint) &&
        Objects.equals(this.scte35Passthrough, liveMediaIngestOutput.scte35Passthrough) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publishingPoint, scte35Passthrough, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveMediaIngestOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    publishingPoint: ").append(toIndentedString(publishingPoint)).append("\n");
    sb.append("    scte35Passthrough: ").append(toIndentedString(scte35Passthrough)).append("\n");
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


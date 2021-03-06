package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Input;
import com.bitmovin.api.sdk.model.RtmpIngestPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * RedundantRtmpInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = RedundantRtmpInput.class)
public class RedundantRtmpInput extends Input {
  @JsonProperty("delayThreshold")
  private Integer delayThreshold;

  @JsonProperty("ingestPoints")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<RtmpIngestPoint> ingestPoints = new ArrayList<RtmpIngestPoint>();


  /**
   * When there is no input signal present and this threshold in seconds is reached it will switch to another ingest point
   * @return delayThreshold
   */
  public Integer getDelayThreshold() {
    return delayThreshold;
  }

  /**
   * When there is no input signal present and this threshold in seconds is reached it will switch to another ingest point
   *
   * @param delayThreshold
   *        When there is no input signal present and this threshold in seconds is reached it will switch to another ingest point
   */
  public void setDelayThreshold(Integer delayThreshold) {
    this.delayThreshold = delayThreshold;
  }


  public RedundantRtmpInput addIngestPointsItem(RtmpIngestPoint ingestPointsItem) {
    this.ingestPoints.add(ingestPointsItem);
    return this;
  }

  /**
   * Get ingestPoints
   * @return ingestPoints
   */
  public List<RtmpIngestPoint> getIngestPoints() {
    return ingestPoints;
  }

  /**
   * Set ingestPoints
   *
   * @param ingestPoints
   */
  public void setIngestPoints(List<RtmpIngestPoint> ingestPoints) {
    this.ingestPoints = ingestPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RedundantRtmpInput redundantRtmpInput = (RedundantRtmpInput) o;
    return Objects.equals(this.delayThreshold, redundantRtmpInput.delayThreshold) &&
        Objects.equals(this.ingestPoints, redundantRtmpInput.ingestPoints) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delayThreshold, ingestPoints, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedundantRtmpInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    delayThreshold: ").append(toIndentedString(delayThreshold)).append("\n");
    sb.append("    ingestPoints: ").append(toIndentedString(ingestPoints)).append("\n");
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


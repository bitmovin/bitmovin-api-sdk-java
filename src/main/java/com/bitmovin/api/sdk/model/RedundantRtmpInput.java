package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Input;
import com.bitmovin.api.sdk.model.RtmpIngestPoint;
import com.bitmovin.api.sdk.model.StaticRtmpIngestPoint;
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

  @JsonProperty("staticIngestPoints")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StaticRtmpIngestPoint> staticIngestPoints = new ArrayList<StaticRtmpIngestPoint>();


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
   * Configuration for ingest points that use a dynamic IP based endpoint to stream to e.g.: rtmp://41.167.11.21/live Either ingestPoints **or** staticIngestPoints can be set 
   * @return ingestPoints
   */
  public List<RtmpIngestPoint> getIngestPoints() {
    return ingestPoints;
  }

  /**
   * Configuration for ingest points that use a dynamic IP based endpoint to stream to e.g.: rtmp://41.167.11.21/live Either ingestPoints **or** staticIngestPoints can be set 
   *
   * @param ingestPoints
   *        Configuration for ingest points that use a dynamic IP based endpoint to stream to e.g.: rtmp://41.167.11.21/live Either ingestPoints **or** staticIngestPoints can be set 
   */
  public void setIngestPoints(List<RtmpIngestPoint> ingestPoints) {
    this.ingestPoints = ingestPoints;
  }


  public RedundantRtmpInput addStaticIngestPointsItem(StaticRtmpIngestPoint staticIngestPointsItem) {
    this.staticIngestPoints.add(staticIngestPointsItem);
    return this;
  }

  /**
   * Configuration for static ingest points. These ingest points use a consistent endpoint to stream to e.g.: rtmps://live-ingest.bitmovin.com/live Either ingestPoints **or** staticIngestPoints can be set 
   * @return staticIngestPoints
   */
  public List<StaticRtmpIngestPoint> getStaticIngestPoints() {
    return staticIngestPoints;
  }

  /**
   * Configuration for static ingest points. These ingest points use a consistent endpoint to stream to e.g.: rtmps://live-ingest.bitmovin.com/live Either ingestPoints **or** staticIngestPoints can be set 
   *
   * @param staticIngestPoints
   *        Configuration for static ingest points. These ingest points use a consistent endpoint to stream to e.g.: rtmps://live-ingest.bitmovin.com/live Either ingestPoints **or** staticIngestPoints can be set 
   */
  public void setStaticIngestPoints(List<StaticRtmpIngestPoint> staticIngestPoints) {
    this.staticIngestPoints = staticIngestPoints;
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
        Objects.equals(this.staticIngestPoints, redundantRtmpInput.staticIngestPoints) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delayThreshold, ingestPoints, staticIngestPoints, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RedundantRtmpInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    delayThreshold: ").append(toIndentedString(delayThreshold)).append("\n");
    sb.append("    ingestPoints: ").append(toIndentedString(ingestPoints)).append("\n");
    sb.append("    staticIngestPoints: ").append(toIndentedString(staticIngestPoints)).append("\n");
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


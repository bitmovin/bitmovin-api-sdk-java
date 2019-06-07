package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.PositionMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CustomTag
 */

public class CustomTag extends BitmovinResource {
  @JsonProperty("positionMode")
  private PositionMode positionMode;

  @JsonProperty("keyframeId")
  private String keyframeId;

  @JsonProperty("time")
  private Double time;

  @JsonProperty("segment")
  private Long segment;

  @JsonProperty("data")
  private String data;


  /**
   * The positioning mode that should be used when inserting the placement opportunity
   * @return positionMode
   */
  public PositionMode getPositionMode() {
    return positionMode;
  }

  /**
   * The positioning mode that should be used when inserting the placement opportunity
   *
   * @param positionMode
   * The positioning mode that should be used when inserting the placement opportunity
   */
  public void setPositionMode(PositionMode positionMode) {
    this.positionMode = positionMode;
  }


  /**
   * Id of keyframe where the custom tag should be inserted. Required, when KEYFRAME is selected as position mode.
   * @return keyframeId
   */
  public String getKeyframeId() {
    return keyframeId;
  }

  /**
   * Id of keyframe where the custom tag should be inserted. Required, when KEYFRAME is selected as position mode.
   *
   * @param keyframeId
   * Id of keyframe where the custom tag should be inserted. Required, when KEYFRAME is selected as position mode.
   */
  public void setKeyframeId(String keyframeId) {
    this.keyframeId = keyframeId;
  }


  /**
   * Time in seconds where the custom tag should be inserted. Required, when TIME is selected as position mode.
   * @return time
   */
  public Double getTime() {
    return time;
  }

  /**
   * Time in seconds where the custom tag should be inserted. Required, when TIME is selected as position mode.
   *
   * @param time
   * Time in seconds where the custom tag should be inserted. Required, when TIME is selected as position mode.
   */
  public void setTime(Double time) {
    this.time = time;
  }


  /**
   * The custom tag will be inserted before the specified segment. Required, when SEGMENT is selected as position mode.
   * @return segment
   */
  public Long getSegment() {
    return segment;
  }

  /**
   * The custom tag will be inserted before the specified segment. Required, when SEGMENT is selected as position mode.
   *
   * @param segment
   * The custom tag will be inserted before the specified segment. Required, when SEGMENT is selected as position mode.
   */
  public void setSegment(Long segment) {
    this.segment = segment;
  }


  /**
   * The data to be contained in the custom tag.
   * @return data
   */
  public String getData() {
    return data;
  }

  /**
   * The data to be contained in the custom tag.
   *
   * @param data
   * The data to be contained in the custom tag.
   */
  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTag customTag = (CustomTag) o;
    return Objects.equals(this.positionMode, customTag.positionMode) &&
        Objects.equals(this.keyframeId, customTag.keyframeId) &&
        Objects.equals(this.time, customTag.time) &&
        Objects.equals(this.segment, customTag.segment) &&
        Objects.equals(this.data, customTag.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionMode, keyframeId, time, segment, data, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTag {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    positionMode: ").append(toIndentedString(positionMode)).append("\n");
    sb.append("    keyframeId: ").append(toIndentedString(keyframeId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


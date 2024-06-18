package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashMuxingRepresentation;
import com.bitmovin.api.sdk.model.DashRepresentationType;
import com.bitmovin.api.sdk.model.DashRepresentationTypeMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashSegmentedRepresentation
 */

public class DashSegmentedRepresentation extends DashMuxingRepresentation {
  @JsonProperty("type")
  private DashRepresentationType type;

  @JsonProperty("mode")
  private DashRepresentationTypeMode mode;

  @JsonProperty("segmentPath")
  private String segmentPath;

  @JsonProperty("startSegmentNumber")
  private Long startSegmentNumber;

  @JsonProperty("endSegmentNumber")
  private Long endSegmentNumber;

  @JsonProperty("startKeyframeId")
  private String startKeyframeId;

  @JsonProperty("endKeyframeId")
  private String endKeyframeId;


  /**
   * Get type
   * @return type
   */
  public DashRepresentationType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(DashRepresentationType type) {
    this.type = type;
  }


  /**
   * Get mode
   * @return mode
   */
  public DashRepresentationTypeMode getMode() {
    return mode;
  }

  /**
   * Set mode
   *
   * @param mode
   */
  public void setMode(DashRepresentationTypeMode mode) {
    this.mode = mode;
  }


  /**
   * Path to segments. Will be used as the representation id if the type is set to TEMPLATE_ADAPTATION_SET (required)
   * @return segmentPath
   */
  public String getSegmentPath() {
    return segmentPath;
  }

  /**
   * Path to segments. Will be used as the representation id if the type is set to TEMPLATE_ADAPTATION_SET (required)
   *
   * @param segmentPath
   *        Path to segments. Will be used as the representation id if the type is set to TEMPLATE_ADAPTATION_SET (required)
   */
  public void setSegmentPath(String segmentPath) {
    this.segmentPath = segmentPath;
  }


  /**
   * Number of the first segment
   * @return startSegmentNumber
   */
  public Long getStartSegmentNumber() {
    return startSegmentNumber;
  }

  /**
   * Number of the first segment
   *
   * @param startSegmentNumber
   *        Number of the first segment
   */
  public void setStartSegmentNumber(Long startSegmentNumber) {
    this.startSegmentNumber = startSegmentNumber;
  }


  /**
   * Number of the last segment. Default is the last one that was encoded
   * @return endSegmentNumber
   */
  public Long getEndSegmentNumber() {
    return endSegmentNumber;
  }

  /**
   * Number of the last segment. Default is the last one that was encoded
   *
   * @param endSegmentNumber
   *        Number of the last segment. Default is the last one that was encoded
   */
  public void setEndSegmentNumber(Long endSegmentNumber) {
    this.endSegmentNumber = endSegmentNumber;
  }


  /**
   * Id of the keyframe to start with. It takes precedence over startSegmentNumber
   * @return startKeyframeId
   */
  public String getStartKeyframeId() {
    return startKeyframeId;
  }

  /**
   * Id of the keyframe to start with. It takes precedence over startSegmentNumber
   *
   * @param startKeyframeId
   *        Id of the keyframe to start with. It takes precedence over startSegmentNumber
   */
  public void setStartKeyframeId(String startKeyframeId) {
    this.startKeyframeId = startKeyframeId;
  }


  /**
   * Id of the keyframe to end with. It takes precedence over endSegmentNumber. The segment containing the end keyframe is not included in the representation.
   * @return endKeyframeId
   */
  public String getEndKeyframeId() {
    return endKeyframeId;
  }

  /**
   * Id of the keyframe to end with. It takes precedence over endSegmentNumber. The segment containing the end keyframe is not included in the representation.
   *
   * @param endKeyframeId
   *        Id of the keyframe to end with. It takes precedence over endSegmentNumber. The segment containing the end keyframe is not included in the representation.
   */
  public void setEndKeyframeId(String endKeyframeId) {
    this.endKeyframeId = endKeyframeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashSegmentedRepresentation dashSegmentedRepresentation = (DashSegmentedRepresentation) o;
    return Objects.equals(this.type, dashSegmentedRepresentation.type) &&
        Objects.equals(this.mode, dashSegmentedRepresentation.mode) &&
        Objects.equals(this.segmentPath, dashSegmentedRepresentation.segmentPath) &&
        Objects.equals(this.startSegmentNumber, dashSegmentedRepresentation.startSegmentNumber) &&
        Objects.equals(this.endSegmentNumber, dashSegmentedRepresentation.endSegmentNumber) &&
        Objects.equals(this.startKeyframeId, dashSegmentedRepresentation.startKeyframeId) &&
        Objects.equals(this.endKeyframeId, dashSegmentedRepresentation.endKeyframeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, mode, segmentPath, startSegmentNumber, endSegmentNumber, startKeyframeId, endKeyframeId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashSegmentedRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    segmentPath: ").append(toIndentedString(segmentPath)).append("\n");
    sb.append("    startSegmentNumber: ").append(toIndentedString(startSegmentNumber)).append("\n");
    sb.append("    endSegmentNumber: ").append(toIndentedString(endSegmentNumber)).append("\n");
    sb.append("    startKeyframeId: ").append(toIndentedString(startKeyframeId)).append("\n");
    sb.append("    endKeyframeId: ").append(toIndentedString(endKeyframeId)).append("\n");
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


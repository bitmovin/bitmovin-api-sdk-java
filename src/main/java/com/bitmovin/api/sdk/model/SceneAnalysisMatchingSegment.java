package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SceneType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The scene segment that best matches a semantic-search query
 */

public class SceneAnalysisMatchingSegment {
  @JsonProperty("sceneId")
  private String sceneId;

  @JsonProperty("sceneType")
  private SceneType sceneType;

  @JsonProperty("sceneTitle")
  private String sceneTitle;

  @JsonProperty("sceneDescription")
  private String sceneDescription;

  @JsonProperty("startInSeconds")
  private Double startInSeconds;

  @JsonProperty("endInSeconds")
  private Double endInSeconds;


  /**
   * ID of the matching scene (required)
   * @return sceneId
   */
  public String getSceneId() {
    return sceneId;
  }

  /**
   * ID of the matching scene (required)
   *
   * @param sceneId
   *        ID of the matching scene (required)
   */
  public void setSceneId(String sceneId) {
    this.sceneId = sceneId;
  }


  /**
   * The detected type of the matching scene
   * @return sceneType
   */
  public SceneType getSceneType() {
    return sceneType;
  }

  /**
   * The detected type of the matching scene
   *
   * @param sceneType
   *        The detected type of the matching scene
   */
  public void setSceneType(SceneType sceneType) {
    this.sceneType = sceneType;
  }


  /**
   * The title of the matching scene
   * @return sceneTitle
   */
  public String getSceneTitle() {
    return sceneTitle;
  }

  /**
   * The title of the matching scene
   *
   * @param sceneTitle
   *        The title of the matching scene
   */
  public void setSceneTitle(String sceneTitle) {
    this.sceneTitle = sceneTitle;
  }


  /**
   * A description of the matching scene
   * @return sceneDescription
   */
  public String getSceneDescription() {
    return sceneDescription;
  }

  /**
   * A description of the matching scene
   *
   * @param sceneDescription
   *        A description of the matching scene
   */
  public void setSceneDescription(String sceneDescription) {
    this.sceneDescription = sceneDescription;
  }


  /**
   * The start time of the matching segment in seconds from the beginning of the video (required)
   * @return startInSeconds
   */
  public Double getStartInSeconds() {
    return startInSeconds;
  }

  /**
   * The start time of the matching segment in seconds from the beginning of the video (required)
   *
   * @param startInSeconds
   *        The start time of the matching segment in seconds from the beginning of the video (required)
   */
  public void setStartInSeconds(Double startInSeconds) {
    this.startInSeconds = startInSeconds;
  }


  /**
   * The end time of the matching segment in seconds from the beginning of the video (required)
   * @return endInSeconds
   */
  public Double getEndInSeconds() {
    return endInSeconds;
  }

  /**
   * The end time of the matching segment in seconds from the beginning of the video (required)
   *
   * @param endInSeconds
   *        The end time of the matching segment in seconds from the beginning of the video (required)
   */
  public void setEndInSeconds(Double endInSeconds) {
    this.endInSeconds = endInSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneAnalysisMatchingSegment sceneAnalysisMatchingSegment = (SceneAnalysisMatchingSegment) o;
    return Objects.equals(this.sceneId, sceneAnalysisMatchingSegment.sceneId) &&
        Objects.equals(this.sceneType, sceneAnalysisMatchingSegment.sceneType) &&
        Objects.equals(this.sceneTitle, sceneAnalysisMatchingSegment.sceneTitle) &&
        Objects.equals(this.sceneDescription, sceneAnalysisMatchingSegment.sceneDescription) &&
        Objects.equals(this.startInSeconds, sceneAnalysisMatchingSegment.startInSeconds) &&
        Objects.equals(this.endInSeconds, sceneAnalysisMatchingSegment.endInSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sceneId, sceneType, sceneTitle, sceneDescription, startInSeconds, endInSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneAnalysisMatchingSegment {\n");
    
    sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
    sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
    sb.append("    sceneTitle: ").append(toIndentedString(sceneTitle)).append("\n");
    sb.append("    sceneDescription: ").append(toIndentedString(sceneDescription)).append("\n");
    sb.append("    startInSeconds: ").append(toIndentedString(startInSeconds)).append("\n");
    sb.append("    endInSeconds: ").append(toIndentedString(endInSeconds)).append("\n");
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


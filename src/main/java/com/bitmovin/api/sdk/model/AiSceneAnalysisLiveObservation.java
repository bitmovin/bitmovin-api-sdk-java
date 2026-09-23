package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Immutable consumer-visible observation produced from an analyzed media window
 */

public class AiSceneAnalysisLiveObservation {
  @JsonProperty("id")
  private String id;

  @JsonProperty("text")
  private String text;

  @JsonProperty("startTimeSeconds")
  private Double startTimeSeconds;

  @JsonProperty("endTimeSeconds")
  private Double endTimeSeconds;


  /**
   * Stable opaque observation ID that remains unchanged across cumulative result generations (required)
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Stable opaque observation ID that remains unchanged across cumulative result generations (required)
   *
   * @param id
   *        Stable opaque observation ID that remains unchanged across cumulative result generations (required)
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Consumer-visible description of a development in the analyzed media (required)
   * @return text
   */
  public String getText() {
    return text;
  }

  /**
   * Consumer-visible description of a development in the analyzed media (required)
   *
   * @param text
   *        Consumer-visible description of a development in the analyzed media (required)
   */
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Start of the analyzed media window that produced the observation (required)
   * minimum: 0
   * @return startTimeSeconds
   */
  public Double getStartTimeSeconds() {
    return startTimeSeconds;
  }

  /**
   * Start of the analyzed media window that produced the observation (required)
   * minimum: 0
   *
   * @param startTimeSeconds
   *        Start of the analyzed media window that produced the observation (required)
   *        minimum: 0
   */
  public void setStartTimeSeconds(Double startTimeSeconds) {
    this.startTimeSeconds = startTimeSeconds;
  }


  /**
   * End of the analyzed media window that produced the observation (required)
   * minimum: 0
   * @return endTimeSeconds
   */
  public Double getEndTimeSeconds() {
    return endTimeSeconds;
  }

  /**
   * End of the analyzed media window that produced the observation (required)
   * minimum: 0
   *
   * @param endTimeSeconds
   *        End of the analyzed media window that produced the observation (required)
   *        minimum: 0
   */
  public void setEndTimeSeconds(Double endTimeSeconds) {
    this.endTimeSeconds = endTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveObservation aiSceneAnalysisLiveObservation = (AiSceneAnalysisLiveObservation) o;
    return Objects.equals(this.id, aiSceneAnalysisLiveObservation.id) &&
        Objects.equals(this.text, aiSceneAnalysisLiveObservation.text) &&
        Objects.equals(this.startTimeSeconds, aiSceneAnalysisLiveObservation.startTimeSeconds) &&
        Objects.equals(this.endTimeSeconds, aiSceneAnalysisLiveObservation.endTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, startTimeSeconds, endTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveObservation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    startTimeSeconds: ").append(toIndentedString(startTimeSeconds)).append("\n");
    sb.append("    endTimeSeconds: ").append(toIndentedString(endTimeSeconds)).append("\n");
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


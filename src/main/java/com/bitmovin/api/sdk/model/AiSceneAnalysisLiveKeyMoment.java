package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A key event in the analyzed media, supported by one or more active observations
 */

public class AiSceneAnalysisLiveKeyMoment {
  @JsonProperty("id")
  private String id;

  @JsonProperty("lastUpdatedSequence")
  private Long lastUpdatedSequence;

  @JsonProperty("importanceLevel")
  private Integer importanceLevel;

  @JsonProperty("startInSeconds")
  private Double startInSeconds;

  @JsonProperty("endInSeconds")
  private Double endInSeconds;

  @JsonProperty("anchorInSeconds")
  private Double anchorInSeconds;

  @JsonProperty("observations")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> observations = new ArrayList<String>();


  /**
   * Opaque key moment ID unique within the Live Analysis. Stable through refinements and never reused after withdrawal. (required)
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Opaque key moment ID unique within the Live Analysis. Stable through refinements and never reused after withdrawal. (required)
   *
   * @param id
   *        Opaque key moment ID unique within the Live Analysis. Stable through refinements and never reused after withdrawal. (required)
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Result sequence that introduced or last changed this moment&#39;s importance level, times or observation references. Unchanged moments retain this value. (required)
   * minimum: 1
   * @return lastUpdatedSequence
   */
  public Long getLastUpdatedSequence() {
    return lastUpdatedSequence;
  }

  /**
   * Result sequence that introduced or last changed this moment&#39;s importance level, times or observation references. Unchanged moments retain this value. (required)
   * minimum: 1
   *
   * @param lastUpdatedSequence
   *        Result sequence that introduced or last changed this moment&#39;s importance level, times or observation references. Unchanged moments retain this value. (required)
   *        minimum: 1
   */
  public void setLastUpdatedSequence(Long lastUpdatedSequence) {
    this.lastUpdatedSequence = lastUpdatedSequence;
  }


  /**
   * Importance level, not a position within the result snapshot: 1 is highest and larger values indicate lower importance. Ties are allowed. Adding another moment does not by itself renumber existing importance levels. There is no upper bound or implied limit on the number of key moments. (required)
   * minimum: 1
   * @return importanceLevel
   */
  public Integer getImportanceLevel() {
    return importanceLevel;
  }

  /**
   * Importance level, not a position within the result snapshot: 1 is highest and larger values indicate lower importance. Ties are allowed. Adding another moment does not by itself renumber existing importance levels. There is no upper bound or implied limit on the number of key moments. (required)
   * minimum: 1
   *
   * @param importanceLevel
   *        Importance level, not a position within the result snapshot: 1 is highest and larger values indicate lower importance. Ties are allowed. Adding another moment does not by itself renumber existing importance levels. There is no upper bound or implied limit on the number of key moments. (required)
   *        minimum: 1
   */
  public void setImportanceLevel(Integer importanceLevel) {
    this.importanceLevel = importanceLevel;
  }


  /**
   * Start of the key moment in seconds (required)
   * minimum: 0
   * @return startInSeconds
   */
  public Double getStartInSeconds() {
    return startInSeconds;
  }

  /**
   * Start of the key moment in seconds (required)
   * minimum: 0
   *
   * @param startInSeconds
   *        Start of the key moment in seconds (required)
   *        minimum: 0
   */
  public void setStartInSeconds(Double startInSeconds) {
    this.startInSeconds = startInSeconds;
  }


  /**
   * End of the key moment in seconds (required)
   * minimum: 0
   * @return endInSeconds
   */
  public Double getEndInSeconds() {
    return endInSeconds;
  }

  /**
   * End of the key moment in seconds (required)
   * minimum: 0
   *
   * @param endInSeconds
   *        End of the key moment in seconds (required)
   *        minimum: 0
   */
  public void setEndInSeconds(Double endInSeconds) {
    this.endInSeconds = endInSeconds;
  }


  /**
   * Time of the key moment&#39;s actual high point in seconds (required)
   * minimum: 0
   * @return anchorInSeconds
   */
  public Double getAnchorInSeconds() {
    return anchorInSeconds;
  }

  /**
   * Time of the key moment&#39;s actual high point in seconds (required)
   * minimum: 0
   *
   * @param anchorInSeconds
   *        Time of the key moment&#39;s actual high point in seconds (required)
   *        minimum: 0
   */
  public void setAnchorInSeconds(Double anchorInSeconds) {
    this.anchorInSeconds = anchorInSeconds;
  }


  public AiSceneAnalysisLiveKeyMoment addObservationsItem(String observationsItem) {
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * IDs of active observations in the enclosing result that support this moment. Multiple key moments may reference the same observation. (required)
   * @return observations
   */
  public List<String> getObservations() {
    return observations;
  }

  /**
   * IDs of active observations in the enclosing result that support this moment. Multiple key moments may reference the same observation. (required)
   *
   * @param observations
   *        IDs of active observations in the enclosing result that support this moment. Multiple key moments may reference the same observation. (required)
   */
  public void setObservations(List<String> observations) {
    this.observations = observations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveKeyMoment aiSceneAnalysisLiveKeyMoment = (AiSceneAnalysisLiveKeyMoment) o;
    return Objects.equals(this.id, aiSceneAnalysisLiveKeyMoment.id) &&
        Objects.equals(this.lastUpdatedSequence, aiSceneAnalysisLiveKeyMoment.lastUpdatedSequence) &&
        Objects.equals(this.importanceLevel, aiSceneAnalysisLiveKeyMoment.importanceLevel) &&
        Objects.equals(this.startInSeconds, aiSceneAnalysisLiveKeyMoment.startInSeconds) &&
        Objects.equals(this.endInSeconds, aiSceneAnalysisLiveKeyMoment.endInSeconds) &&
        Objects.equals(this.anchorInSeconds, aiSceneAnalysisLiveKeyMoment.anchorInSeconds) &&
        Objects.equals(this.observations, aiSceneAnalysisLiveKeyMoment.observations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastUpdatedSequence, importanceLevel, startInSeconds, endInSeconds, anchorInSeconds, observations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveKeyMoment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdatedSequence: ").append(toIndentedString(lastUpdatedSequence)).append("\n");
    sb.append("    importanceLevel: ").append(toIndentedString(importanceLevel)).append("\n");
    sb.append("    startInSeconds: ").append(toIndentedString(startInSeconds)).append("\n");
    sb.append("    endInSeconds: ").append(toIndentedString(endInSeconds)).append("\n");
    sb.append("    anchorInSeconds: ").append(toIndentedString(anchorInSeconds)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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


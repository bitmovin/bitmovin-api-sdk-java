package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveObservation;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveResultMetadata;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveSourceGap;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Cumulative immutable result generation for a Live Analysis
 */

public class AiSceneAnalysisLiveResult {
  @JsonProperty("analysisId")
  private String analysisId;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("sequence")
  private Long sequence;

  @JsonProperty("producedAt")
  private Date producedAt;

  @JsonProperty("isFinal")
  private Boolean isFinal;

  @JsonProperty("analyzedStartTimeSeconds")
  private Double analyzedStartTimeSeconds;

  @JsonProperty("analyzedEndTimeSeconds")
  private Double analyzedEndTimeSeconds;

  @JsonProperty("sourceGaps")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AiSceneAnalysisLiveSourceGap> sourceGaps = new ArrayList<AiSceneAnalysisLiveSourceGap>();

  @JsonProperty("metadata")
  private AiSceneAnalysisLiveResultMetadata metadata;

  @JsonProperty("observations")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AiSceneAnalysisLiveObservation> observations = new ArrayList<AiSceneAnalysisLiveObservation>();


  /**
   * ID of the Live Analysis resource (required)
   * @return analysisId
   */
  public String getAnalysisId() {
    return analysisId;
  }

  /**
   * ID of the Live Analysis resource (required)
   *
   * @param analysisId
   *        ID of the Live Analysis resource (required)
   */
  public void setAnalysisId(String analysisId) {
    this.analysisId = analysisId;
  }


  /**
   * ID of the Encoding associated with the Analysis (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * ID of the Encoding associated with the Analysis (required)
   *
   * @param encodingId
   *        ID of the Encoding associated with the Analysis (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * Monotonically increasing generation sequence, starting at 1 (required)
   * minimum: 1
   * @return sequence
   */
  public Long getSequence() {
    return sequence;
  }

  /**
   * Monotonically increasing generation sequence, starting at 1 (required)
   * minimum: 1
   *
   * @param sequence
   *        Monotonically increasing generation sequence, starting at 1 (required)
   *        minimum: 1
   */
  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }


  /**
   * Time at which the AI analysis produced this result generation (required)
   * @return producedAt
   */
  public Date getProducedAt() {
    return producedAt;
  }

  /**
   * Time at which the AI analysis produced this result generation (required)
   *
   * @param producedAt
   *        Time at which the AI analysis produced this result generation (required)
   */
  public void setProducedAt(Date producedAt) {
    this.producedAt = producedAt;
  }


  /**
   * Whether AI analysis produced this as the final result generation. This does not by itself imply that the Analysis completed successfully. (required)
   * @return isFinal
   */
  public Boolean getIsFinal() {
    return isFinal;
  }

  /**
   * Whether AI analysis produced this as the final result generation. This does not by itself imply that the Analysis completed successfully. (required)
   *
   * @param isFinal
   *        Whether AI analysis produced this as the final result generation. This does not by itself imply that the Analysis completed successfully. (required)
   */
  public void setIsFinal(Boolean isFinal) {
    this.isFinal = isFinal;
  }


  /**
   * Start of cumulative analyzed coverage on the monotonic analysis timeline (required)
   * minimum: 0
   * @return analyzedStartTimeSeconds
   */
  public Double getAnalyzedStartTimeSeconds() {
    return analyzedStartTimeSeconds;
  }

  /**
   * Start of cumulative analyzed coverage on the monotonic analysis timeline (required)
   * minimum: 0
   *
   * @param analyzedStartTimeSeconds
   *        Start of cumulative analyzed coverage on the monotonic analysis timeline (required)
   *        minimum: 0
   */
  public void setAnalyzedStartTimeSeconds(Double analyzedStartTimeSeconds) {
    this.analyzedStartTimeSeconds = analyzedStartTimeSeconds;
  }


  /**
   * End of cumulative analyzed coverage on the monotonic analysis timeline (required)
   * minimum: 0
   * @return analyzedEndTimeSeconds
   */
  public Double getAnalyzedEndTimeSeconds() {
    return analyzedEndTimeSeconds;
  }

  /**
   * End of cumulative analyzed coverage on the monotonic analysis timeline (required)
   * minimum: 0
   *
   * @param analyzedEndTimeSeconds
   *        End of cumulative analyzed coverage on the monotonic analysis timeline (required)
   *        minimum: 0
   */
  public void setAnalyzedEndTimeSeconds(Double analyzedEndTimeSeconds) {
    this.analyzedEndTimeSeconds = analyzedEndTimeSeconds;
  }


  public AiSceneAnalysisLiveResult addSourceGapsItem(AiSceneAnalysisLiveSourceGap sourceGapsItem) {
    this.sourceGaps.add(sourceGapsItem);
    return this;
  }

  /**
   * Cumulative closed source gaps on the monotonic analysis timeline (required)
   * @return sourceGaps
   */
  public List<AiSceneAnalysisLiveSourceGap> getSourceGaps() {
    return sourceGaps;
  }

  /**
   * Cumulative closed source gaps on the monotonic analysis timeline (required)
   *
   * @param sourceGaps
   *        Cumulative closed source gaps on the monotonic analysis timeline (required)
   */
  public void setSourceGaps(List<AiSceneAnalysisLiveSourceGap> sourceGaps) {
    this.sourceGaps = sourceGaps;
  }


  /**
   * Producer metadata for this generation (required)
   * @return metadata
   */
  public AiSceneAnalysisLiveResultMetadata getMetadata() {
    return metadata;
  }

  /**
   * Producer metadata for this generation (required)
   *
   * @param metadata
   *        Producer metadata for this generation (required)
   */
  public void setMetadata(AiSceneAnalysisLiveResultMetadata metadata) {
    this.metadata = metadata;
  }


  public AiSceneAnalysisLiveResult addObservationsItem(AiSceneAnalysisLiveObservation observationsItem) {
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * Cumulative immutable observations. Existing observations retain the same ID and content across later generations. Each time range identifies the analyzed media window that produced the observation, not an exact event location. (required)
   * @return observations
   */
  public List<AiSceneAnalysisLiveObservation> getObservations() {
    return observations;
  }

  /**
   * Cumulative immutable observations. Existing observations retain the same ID and content across later generations. Each time range identifies the analyzed media window that produced the observation, not an exact event location. (required)
   *
   * @param observations
   *        Cumulative immutable observations. Existing observations retain the same ID and content across later generations. Each time range identifies the analyzed media window that produced the observation, not an exact event location. (required)
   */
  public void setObservations(List<AiSceneAnalysisLiveObservation> observations) {
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
    AiSceneAnalysisLiveResult aiSceneAnalysisLiveResult = (AiSceneAnalysisLiveResult) o;
    return Objects.equals(this.analysisId, aiSceneAnalysisLiveResult.analysisId) &&
        Objects.equals(this.encodingId, aiSceneAnalysisLiveResult.encodingId) &&
        Objects.equals(this.sequence, aiSceneAnalysisLiveResult.sequence) &&
        Objects.equals(this.producedAt, aiSceneAnalysisLiveResult.producedAt) &&
        Objects.equals(this.isFinal, aiSceneAnalysisLiveResult.isFinal) &&
        Objects.equals(this.analyzedStartTimeSeconds, aiSceneAnalysisLiveResult.analyzedStartTimeSeconds) &&
        Objects.equals(this.analyzedEndTimeSeconds, aiSceneAnalysisLiveResult.analyzedEndTimeSeconds) &&
        Objects.equals(this.sourceGaps, aiSceneAnalysisLiveResult.sourceGaps) &&
        Objects.equals(this.metadata, aiSceneAnalysisLiveResult.metadata) &&
        Objects.equals(this.observations, aiSceneAnalysisLiveResult.observations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisId, encodingId, sequence, producedAt, isFinal, analyzedStartTimeSeconds, analyzedEndTimeSeconds, sourceGaps, metadata, observations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveResult {\n");
    
    sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    producedAt: ").append(toIndentedString(producedAt)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    analyzedStartTimeSeconds: ").append(toIndentedString(analyzedStartTimeSeconds)).append("\n");
    sb.append("    analyzedEndTimeSeconds: ").append(toIndentedString(analyzedEndTimeSeconds)).append("\n");
    sb.append("    sourceGaps: ").append(toIndentedString(sourceGaps)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveKeyMoment;
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
 * Complete snapshot of a Live Analysis at a specific result sequence
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

  @JsonProperty("mediaTimeOriginUnixMs")
  private Long mediaTimeOriginUnixMs;

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

  @JsonProperty("keyMoments")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AiSceneAnalysisLiveKeyMoment> keyMoments = new ArrayList<AiSceneAnalysisLiveKeyMoment>();


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
   * Monotonically increasing result sequence, starting at 1 (required)
   * minimum: 1
   * @return sequence
   */
  public Long getSequence() {
    return sequence;
  }

  /**
   * Monotonically increasing result sequence, starting at 1 (required)
   * minimum: 1
   *
   * @param sequence
   *        Monotonically increasing result sequence, starting at 1 (required)
   *        minimum: 1
   */
  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }


  /**
   * Time at which the AI analysis produced this result snapshot (required)
   * @return producedAt
   */
  public Date getProducedAt() {
    return producedAt;
  }

  /**
   * Time at which the AI analysis produced this result snapshot (required)
   *
   * @param producedAt
   *        Time at which the AI analysis produced this result snapshot (required)
   */
  public void setProducedAt(Date producedAt) {
    this.producedAt = producedAt;
  }


  /**
   * UTC presentation-clock time in Unix milliseconds corresponding to media time zero. This origin is fixed for the Live Analysis; coverage, observation, key-moment, and source-gap times remain relative to it. It is not the source capture time or result publication time. (required)
   * minimum: 1
   * @return mediaTimeOriginUnixMs
   */
  public Long getMediaTimeOriginUnixMs() {
    return mediaTimeOriginUnixMs;
  }

  /**
   * UTC presentation-clock time in Unix milliseconds corresponding to media time zero. This origin is fixed for the Live Analysis; coverage, observation, key-moment, and source-gap times remain relative to it. It is not the source capture time or result publication time. (required)
   * minimum: 1
   *
   * @param mediaTimeOriginUnixMs
   *        UTC presentation-clock time in Unix milliseconds corresponding to media time zero. This origin is fixed for the Live Analysis; coverage, observation, key-moment, and source-gap times remain relative to it. It is not the source capture time or result publication time. (required)
   *        minimum: 1
   */
  public void setMediaTimeOriginUnixMs(Long mediaTimeOriginUnixMs) {
    this.mediaTimeOriginUnixMs = mediaTimeOriginUnixMs;
  }


  /**
   * Whether this is the final result snapshot. This does not by itself imply that the Analysis completed successfully. (required)
   * @return isFinal
   */
  public Boolean getIsFinal() {
    return isFinal;
  }

  /**
   * Whether this is the final result snapshot. This does not by itself imply that the Analysis completed successfully. (required)
   *
   * @param isFinal
   *        Whether this is the final result snapshot. This does not by itself imply that the Analysis completed successfully. (required)
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
   * Cumulative closed source gaps on the monotonic analysis timeline. An empty or omitted array means there are no closed source gaps in this snapshot, not that the previous collection is unchanged.
   * @return sourceGaps
   */
  public List<AiSceneAnalysisLiveSourceGap> getSourceGaps() {
    return sourceGaps;
  }

  /**
   * Cumulative closed source gaps on the monotonic analysis timeline. An empty or omitted array means there are no closed source gaps in this snapshot, not that the previous collection is unchanged.
   *
   * @param sourceGaps
   *        Cumulative closed source gaps on the monotonic analysis timeline. An empty or omitted array means there are no closed source gaps in this snapshot, not that the previous collection is unchanged.
   */
  public void setSourceGaps(List<AiSceneAnalysisLiveSourceGap> sourceGaps) {
    this.sourceGaps = sourceGaps;
  }


  /**
   * Metadata for this result snapshot (required)
   * @return metadata
   */
  public AiSceneAnalysisLiveResultMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata for this result snapshot (required)
   *
   * @param metadata
   *        Metadata for this result snapshot (required)
   */
  public void setMetadata(AiSceneAnalysisLiveResultMetadata metadata) {
    this.metadata = metadata;
  }


  public AiSceneAnalysisLiveResult addObservationsItem(AiSceneAnalysisLiveObservation observationsItem) {
    this.observations.add(observationsItem);
    return this;
  }

  /**
   * Complete set of active observations for this result sequence. An empty or omitted array means there are no active observations in this snapshot, not that the previous collection is unchanged. Observations may be removed in later sequences. Observation IDs identify immutable observation content and are never reused. Each time range identifies the analyzed media window that produced the observation, not an exact event location.
   * @return observations
   */
  public List<AiSceneAnalysisLiveObservation> getObservations() {
    return observations;
  }

  /**
   * Complete set of active observations for this result sequence. An empty or omitted array means there are no active observations in this snapshot, not that the previous collection is unchanged. Observations may be removed in later sequences. Observation IDs identify immutable observation content and are never reused. Each time range identifies the analyzed media window that produced the observation, not an exact event location.
   *
   * @param observations
   *        Complete set of active observations for this result sequence. An empty or omitted array means there are no active observations in this snapshot, not that the previous collection is unchanged. Observations may be removed in later sequences. Observation IDs identify immutable observation content and are never reused. Each time range identifies the analyzed media window that produced the observation, not an exact event location.
   */
  public void setObservations(List<AiSceneAnalysisLiveObservation> observations) {
    this.observations = observations;
  }


  public AiSceneAnalysisLiveResult addKeyMomentsItem(AiSceneAnalysisLiveKeyMoment keyMomentsItem) {
    this.keyMoments.add(keyMomentsItem);
    return this;
  }

  /**
   * Complete set of current key moments for this result sequence, ordered by ascending startInSeconds. Ordering of moments with equal start times is unspecified. An empty or omitted array means there are no current key moments in this snapshot, not that the previous collection is unchanged.  Moments may be refined or withdrawn in later result sequences until the final result. A refined moment retains its ID; a withdrawn moment is absent from subsequent snapshots and its ID is never reused. Consumers identify moments by ID and detect changes through lastUpdatedSequence, not array position. Changing array position alone or marking the result final does not change lastUpdatedSequence.  Every referenced observation is active in the same result snapshot. Moment references are updated or moments withdrawn when supporting observations are replaced or removed. 
   * @return keyMoments
   */
  public List<AiSceneAnalysisLiveKeyMoment> getKeyMoments() {
    return keyMoments;
  }

  /**
   * Complete set of current key moments for this result sequence, ordered by ascending startInSeconds. Ordering of moments with equal start times is unspecified. An empty or omitted array means there are no current key moments in this snapshot, not that the previous collection is unchanged.  Moments may be refined or withdrawn in later result sequences until the final result. A refined moment retains its ID; a withdrawn moment is absent from subsequent snapshots and its ID is never reused. Consumers identify moments by ID and detect changes through lastUpdatedSequence, not array position. Changing array position alone or marking the result final does not change lastUpdatedSequence.  Every referenced observation is active in the same result snapshot. Moment references are updated or moments withdrawn when supporting observations are replaced or removed. 
   *
   * @param keyMoments
   *        Complete set of current key moments for this result sequence, ordered by ascending startInSeconds. Ordering of moments with equal start times is unspecified. An empty or omitted array means there are no current key moments in this snapshot, not that the previous collection is unchanged.  Moments may be refined or withdrawn in later result sequences until the final result. A refined moment retains its ID; a withdrawn moment is absent from subsequent snapshots and its ID is never reused. Consumers identify moments by ID and detect changes through lastUpdatedSequence, not array position. Changing array position alone or marking the result final does not change lastUpdatedSequence.  Every referenced observation is active in the same result snapshot. Moment references are updated or moments withdrawn when supporting observations are replaced or removed. 
   */
  public void setKeyMoments(List<AiSceneAnalysisLiveKeyMoment> keyMoments) {
    this.keyMoments = keyMoments;
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
        Objects.equals(this.mediaTimeOriginUnixMs, aiSceneAnalysisLiveResult.mediaTimeOriginUnixMs) &&
        Objects.equals(this.isFinal, aiSceneAnalysisLiveResult.isFinal) &&
        Objects.equals(this.analyzedStartTimeSeconds, aiSceneAnalysisLiveResult.analyzedStartTimeSeconds) &&
        Objects.equals(this.analyzedEndTimeSeconds, aiSceneAnalysisLiveResult.analyzedEndTimeSeconds) &&
        Objects.equals(this.sourceGaps, aiSceneAnalysisLiveResult.sourceGaps) &&
        Objects.equals(this.metadata, aiSceneAnalysisLiveResult.metadata) &&
        Objects.equals(this.observations, aiSceneAnalysisLiveResult.observations) &&
        Objects.equals(this.keyMoments, aiSceneAnalysisLiveResult.keyMoments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisId, encodingId, sequence, producedAt, mediaTimeOriginUnixMs, isFinal, analyzedStartTimeSeconds, analyzedEndTimeSeconds, sourceGaps, metadata, observations, keyMoments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveResult {\n");
    
    sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    producedAt: ").append(toIndentedString(producedAt)).append("\n");
    sb.append("    mediaTimeOriginUnixMs: ").append(toIndentedString(mediaTimeOriginUnixMs)).append("\n");
    sb.append("    isFinal: ").append(toIndentedString(isFinal)).append("\n");
    sb.append("    analyzedStartTimeSeconds: ").append(toIndentedString(analyzedStartTimeSeconds)).append("\n");
    sb.append("    analyzedEndTimeSeconds: ").append(toIndentedString(analyzedEndTimeSeconds)).append("\n");
    sb.append("    sourceGaps: ").append(toIndentedString(sourceGaps)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
    sb.append("    keyMoments: ").append(toIndentedString(keyMoments)).append("\n");
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


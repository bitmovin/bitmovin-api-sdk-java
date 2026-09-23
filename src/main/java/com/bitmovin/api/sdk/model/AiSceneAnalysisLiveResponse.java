package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveError;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveRecording;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveStatus;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.LiveEncoding;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisLiveResponse
 */

public class AiSceneAnalysisLiveResponse {
  @JsonProperty("analysisId")
  private String analysisId;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private AiSceneAnalysisLiveStatus status;

  @JsonProperty("recording")
  private AiSceneAnalysisLiveRecording recording;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();

  @JsonProperty("ingest")
  private LiveEncoding ingest;

  @JsonProperty("error")
  private AiSceneAnalysisLiveError error;

  @JsonProperty("createdAt")
  private Date createdAt;

  /**
   * ID of the Live Analysis resource (required)
   * @return analysisId
   */
  public String getAnalysisId() {
    return analysisId;
  }

  /**
   * ID of the Encoding associated with the Analysis (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * Name of the Analysis
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Current lifecycle state of the Live Analysis (required)
   * @return status
   */
  public AiSceneAnalysisLiveStatus getStatus() {
    return status;
  }

  /**
   * Resolved output configuration for the stream recording (required)
   * @return recording
   */
  public AiSceneAnalysisLiveRecording getRecording() {
    return recording;
  }

  /**
   * Resolved Encoding Output ID references for cumulative AI analysis results (required)
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Current RTMP ingest details. Present only in the Get Live Analysis details response while the Live Analysis is &#x60;RUNNING&#x60;.
   * @return ingest
   */
  public LiveEncoding getIngest() {
    return ingest;
  }

  /**
   * Failure details. Present only when the status is &#x60;ERROR&#x60; or &#x60;TRANSFER_ERROR&#x60;.
   * @return error
   */
  public AiSceneAnalysisLiveError getError() {
    return error;
  }

  /**
   * Creation timestamp, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveResponse aiSceneAnalysisLiveResponse = (AiSceneAnalysisLiveResponse) o;
    return Objects.equals(this.analysisId, aiSceneAnalysisLiveResponse.analysisId) &&
        Objects.equals(this.encodingId, aiSceneAnalysisLiveResponse.encodingId) &&
        Objects.equals(this.name, aiSceneAnalysisLiveResponse.name) &&
        Objects.equals(this.status, aiSceneAnalysisLiveResponse.status) &&
        Objects.equals(this.recording, aiSceneAnalysisLiveResponse.recording) &&
        Objects.equals(this.outputs, aiSceneAnalysisLiveResponse.outputs) &&
        Objects.equals(this.ingest, aiSceneAnalysisLiveResponse.ingest) &&
        Objects.equals(this.error, aiSceneAnalysisLiveResponse.error) &&
        Objects.equals(this.createdAt, aiSceneAnalysisLiveResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisId, encodingId, name, status, recording, outputs, ingest, error, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveResponse {\n");
    
    sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    ingest: ").append(toIndentedString(ingest)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


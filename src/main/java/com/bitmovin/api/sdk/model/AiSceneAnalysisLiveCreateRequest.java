package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveOutput;
import com.bitmovin.api.sdk.model.AiSceneAnalysisLiveRecordingRequest;
import com.bitmovin.api.sdk.model.CloudRegion;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Configuration for a Live Analysis. Each recording and analysis destination references an existing Encoding Output or provides an inline Output definition. Inline Outputs are created synchronously. Within this request, identical complete inline Output definitions, including credentials, are created once and reused across all destinations; destination paths and ACLs do not affect that reuse.
 */

public class AiSceneAnalysisLiveCreateRequest {
  @JsonProperty("name")
  private String name;

  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("cloudRegion")
  private CloudRegion cloudRegion;

  @JsonProperty("recording")
  private AiSceneAnalysisLiveRecordingRequest recording;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AiSceneAnalysisLiveOutput> outputs = new ArrayList<AiSceneAnalysisLiveOutput>();


  /**
   * Name of the Analysis
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the Analysis
   *
   * @param name
   *        Name of the Analysis
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Key used to publish the RTMP stream. When the Live Analysis is &#x60;RUNNING&#x60;, the Get Live Analysis details response returns the current value in &#x60;ingest.streamKey&#x60;. (required)
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }

  /**
   * Key used to publish the RTMP stream. When the Live Analysis is &#x60;RUNNING&#x60;, the Get Live Analysis details response returns the current value in &#x60;ingest.streamKey&#x60;. (required)
   *
   * @param streamKey
   *        Key used to publish the RTMP stream. When the Live Analysis is &#x60;RUNNING&#x60;, the Get Live Analysis details response returns the current value in &#x60;ingest.streamKey&#x60;. (required)
   */
  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }


  /**
   * Region in which the AI analysis runs. &#x60;EXTERNAL&#x60; is not supported yet.
   * @return cloudRegion
   */
  public CloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * Region in which the AI analysis runs. &#x60;EXTERNAL&#x60; is not supported yet.
   *
   * @param cloudRegion
   *        Region in which the AI analysis runs. &#x60;EXTERNAL&#x60; is not supported yet.
   */
  public void setCloudRegion(CloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  /**
   * Destinations for the stream recording (required)
   * @return recording
   */
  public AiSceneAnalysisLiveRecordingRequest getRecording() {
    return recording;
  }

  /**
   * Destinations for the stream recording (required)
   *
   * @param recording
   *        Destinations for the stream recording (required)
   */
  public void setRecording(AiSceneAnalysisLiveRecordingRequest recording) {
    this.recording = recording;
  }


  public AiSceneAnalysisLiveCreateRequest addOutputsItem(AiSceneAnalysisLiveOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Destinations for cumulative AI analysis results (required)
   * @return outputs
   */
  public List<AiSceneAnalysisLiveOutput> getOutputs() {
    return outputs;
  }

  /**
   * Destinations for cumulative AI analysis results (required)
   *
   * @param outputs
   *        Destinations for cumulative AI analysis results (required)
   */
  public void setOutputs(List<AiSceneAnalysisLiveOutput> outputs) {
    this.outputs = outputs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveCreateRequest aiSceneAnalysisLiveCreateRequest = (AiSceneAnalysisLiveCreateRequest) o;
    return Objects.equals(this.name, aiSceneAnalysisLiveCreateRequest.name) &&
        Objects.equals(this.streamKey, aiSceneAnalysisLiveCreateRequest.streamKey) &&
        Objects.equals(this.cloudRegion, aiSceneAnalysisLiveCreateRequest.cloudRegion) &&
        Objects.equals(this.recording, aiSceneAnalysisLiveCreateRequest.recording) &&
        Objects.equals(this.outputs, aiSceneAnalysisLiveCreateRequest.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, streamKey, cloudRegion, recording, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
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


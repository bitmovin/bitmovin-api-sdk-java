package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Resolved output configuration for the stream recording
 */

public class AiSceneAnalysisLiveRecording {
  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();


  public AiSceneAnalysisLiveRecording addOutputsItem(EncodingOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Resolved Encoding Output ID references for the stream recording (required)
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Resolved Encoding Output ID references for the stream recording (required)
   *
   * @param outputs
   *        Resolved Encoding Output ID references for the stream recording (required)
   */
  public void setOutputs(List<EncodingOutput> outputs) {
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
    AiSceneAnalysisLiveRecording aiSceneAnalysisLiveRecording = (AiSceneAnalysisLiveRecording) o;
    return Objects.equals(this.outputs, aiSceneAnalysisLiveRecording.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveRecording {\n");
    
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


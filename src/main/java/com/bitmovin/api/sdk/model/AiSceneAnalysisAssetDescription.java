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
 * AiSceneAnalysisAssetDescription
 */

public class AiSceneAnalysisAssetDescription {
  @JsonProperty("filename")
  private String filename;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();


  /**
   * Name of the output json file
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Name of the output json file
   *
   * @param filename
   *        Name of the output json file
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public AiSceneAnalysisAssetDescription addOutputsItem(EncodingOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
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
    AiSceneAnalysisAssetDescription aiSceneAnalysisAssetDescription = (AiSceneAnalysisAssetDescription) o;
    return Objects.equals(this.filename, aiSceneAnalysisAssetDescription.filename) &&
        Objects.equals(this.outputs, aiSceneAnalysisAssetDescription.outputs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, outputs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisAssetDescription {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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


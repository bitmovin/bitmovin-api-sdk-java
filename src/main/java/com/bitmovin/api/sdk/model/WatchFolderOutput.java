package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WatchFolderOutput
 */

public class WatchFolderOutput {
  @JsonProperty("outputId")
  private String outputId;

  @JsonProperty("outputPath")
  private String outputPath;


  /**
   * Id of the corresponding output (required)
   * @return outputId
   */
  public String getOutputId() {
    return outputId;
  }

  /**
   * Id of the corresponding output (required)
   *
   * @param outputId
   *        Id of the corresponding output (required)
   */
  public void setOutputId(String outputId) {
    this.outputId = outputId;
  }


  /**
   * Subdirectory where to save the files to (required)
   * @return outputPath
   */
  public String getOutputPath() {
    return outputPath;
  }

  /**
   * Subdirectory where to save the files to (required)
   *
   * @param outputPath
   *        Subdirectory where to save the files to (required)
   */
  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchFolderOutput watchFolderOutput = (WatchFolderOutput) o;
    return Objects.equals(this.outputId, watchFolderOutput.outputId) &&
        Objects.equals(this.outputPath, watchFolderOutput.outputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputId, outputPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchFolderOutput {\n");
    
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
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


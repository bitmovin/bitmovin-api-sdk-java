package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutputPathsForOutput;
import com.bitmovin.api.sdk.model.Output;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingOutputPaths
 */

public class EncodingOutputPaths {
  @JsonProperty("output")
  private Output output;

  @JsonProperty("paths")
  private EncodingOutputPathsForOutput paths;


  /**
   * Get output
   * @return output
   */
  public Output getOutput() {
    return output;
  }

  /**
   * Set output
   *
   * @param output
   */
  public void setOutput(Output output) {
    this.output = output;
  }


  /**
   * Get paths
   * @return paths
   */
  public EncodingOutputPathsForOutput getPaths() {
    return paths;
  }

  /**
   * Set paths
   *
   * @param paths
   */
  public void setPaths(EncodingOutputPathsForOutput paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingOutputPaths encodingOutputPaths = (EncodingOutputPaths) o;
    return Objects.equals(this.output, encodingOutputPaths.output) &&
        Objects.equals(this.paths, encodingOutputPaths.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(output, paths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingOutputPaths {\n");
    
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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


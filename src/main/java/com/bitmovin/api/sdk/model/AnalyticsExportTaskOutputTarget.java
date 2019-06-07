package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsExportTaskOutputTarget
 */

public class AnalyticsExportTaskOutputTarget {
  @JsonProperty("outputPath")
  private String outputPath;

  @JsonProperty("outputId")
  private String outputId;


  /**
   * Path where the export should be saved
   * @return outputPath
   */
  public String getOutputPath() {
    return outputPath;
  }

  /**
   * Path where the export should be saved
   *
   * @param outputPath
   * Path where the export should be saved
   */
  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  /**
   * Id of the output that should be used
   * @return outputId
   */
  public String getOutputId() {
    return outputId;
  }

  /**
   * Id of the output that should be used
   *
   * @param outputId
   * Id of the output that should be used
   */
  public void setOutputId(String outputId) {
    this.outputId = outputId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsExportTaskOutputTarget analyticsExportTaskOutputTarget = (AnalyticsExportTaskOutputTarget) o;
    return Objects.equals(this.outputPath, analyticsExportTaskOutputTarget.outputPath) &&
        Objects.equals(this.outputId, analyticsExportTaskOutputTarget.outputId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputPath, outputId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsExportTaskOutputTarget {\n");
    
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
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


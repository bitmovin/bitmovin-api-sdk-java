package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WatchFolderInput
 */

public class WatchFolderInput {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputPath")
  private String inputPath;


  /**
   * Input id (required)
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Input id (required)
   *
   * @param inputId
   *        Input id (required)
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path of the directory to monitor (required)
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path of the directory to monitor (required)
   *
   * @param inputPath
   *        Path of the directory to monitor (required)
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchFolderInput watchFolderInput = (WatchFolderInput) o;
    return Objects.equals(this.inputId, watchFolderInput.inputId) &&
        Objects.equals(this.inputPath, watchFolderInput.inputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchFolderInput {\n");
    
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
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


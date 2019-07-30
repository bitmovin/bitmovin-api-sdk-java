package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * InsertableContentInput
 */

public class InsertableContentInput {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputPath")
  private String inputPath;

  @JsonProperty("description")
  private String description;


  /**
   * Id of the input hosting the video file (required)
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Id of the input hosting the video file (required)
   *
   * @param inputId
   *        Id of the input hosting the video file (required)
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path to the file on the input (required)
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path to the file on the input (required)
   *
   * @param inputPath
   *        Path to the file on the input (required)
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  /**
   * Description of this input
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Description of this input
   *
   * @param description
   *        Description of this input
   */
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsertableContentInput insertableContentInput = (InsertableContentInput) o;
    return Objects.equals(this.inputId, insertableContentInput.inputId) &&
        Objects.equals(this.inputPath, insertableContentInput.inputPath) &&
        Objects.equals(this.description, insertableContentInput.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputPath, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsertableContentInput {\n");
    
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


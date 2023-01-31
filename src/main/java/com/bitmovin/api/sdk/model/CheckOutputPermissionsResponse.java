package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.OutputType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CheckOutputPermissionsResponse
 */

public class CheckOutputPermissionsResponse {
  @JsonProperty("outputId")
  private String outputId;

  @JsonProperty("outputType")
  private OutputType outputType;

  @JsonProperty("path")
  private String path;

  @JsonProperty("passed")
  private Boolean passed;

  @JsonProperty("failureReason")
  private String failureReason;

  /**
   * Id of the output for which permissions were checked
   * @return outputId
   */
  public String getOutputId() {
    return outputId;
  }

  /**
   * The type of the output for which permissions were checked
   * @return outputType
   */
  public OutputType getOutputType() {
    return outputType;
  }

  /**
   * The path on the storage for which permissions were checked. In AWS S3 terminology, this corresponds to a \&quot;prefix\&quot;. An empty string corresponds to the root directory.
   * @return path
   */
  public String getPath() {
    return path;
  }

  /**
   * Indicates if permissions on the storage are configured correctly to be used as output target by the Bitmovin encoder. If \&quot;false\&quot;, *failureReason* will provide additional information.
   * @return passed
   */
  public Boolean getPassed() {
    return passed;
  }

  /**
   * Contains nothing if the check succeeded. Otherwise, contains a message explaining why it failed.
   * @return failureReason
   */
  public String getFailureReason() {
    return failureReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckOutputPermissionsResponse checkOutputPermissionsResponse = (CheckOutputPermissionsResponse) o;
    return Objects.equals(this.outputId, checkOutputPermissionsResponse.outputId) &&
        Objects.equals(this.outputType, checkOutputPermissionsResponse.outputType) &&
        Objects.equals(this.path, checkOutputPermissionsResponse.path) &&
        Objects.equals(this.passed, checkOutputPermissionsResponse.passed) &&
        Objects.equals(this.failureReason, checkOutputPermissionsResponse.failureReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputId, outputType, path, passed, failureReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckOutputPermissionsResponse {\n");
    
    sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
    sb.append("    outputType: ").append(toIndentedString(outputType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
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


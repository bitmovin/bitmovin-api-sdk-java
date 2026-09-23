package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AiSceneAnalysisLiveError
 */

public class AiSceneAnalysisLiveError {
  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("timestamp")
  private Date timestamp;


  /**
   * Stable machine-readable failure code (required)
   * @return code
   */
  public String getCode() {
    return code;
  }

  /**
   * Stable machine-readable failure code (required)
   *
   * @param code
   *        Stable machine-readable failure code (required)
   */
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Credential-free failure description safe to expose to the customer (required)
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Credential-free failure description safe to expose to the customer (required)
   *
   * @param message
   *        Credential-free failure description safe to expose to the customer (required)
   */
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Time at which the failure was recorded (required)
   * @return timestamp
   */
  public Date getTimestamp() {
    return timestamp;
  }

  /**
   * Time at which the failure was recorded (required)
   *
   * @param timestamp
   *        Time at which the failure was recorded (required)
   */
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiSceneAnalysisLiveError aiSceneAnalysisLiveError = (AiSceneAnalysisLiveError) o;
    return Objects.equals(this.code, aiSceneAnalysisLiveError.code) &&
        Objects.equals(this.message, aiSceneAnalysisLiveError.message) &&
        Objects.equals(this.timestamp, aiSceneAnalysisLiveError.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiSceneAnalysisLiveError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


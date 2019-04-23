package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ErrorRetryHint;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingErrorDefinition
 */

public class EncodingErrorDefinition {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("category")
  private String category;

  @JsonProperty("message")
  private String message;

  @JsonProperty("description")
  private String description;

  @JsonProperty("retryHint")
  private ErrorRetryHint retryHint = null;


  /**
   * The error code.
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * The error category.
   * @return category
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * The error message, optional. Can include placeholders like {1}, {2} which are replaced with the respective dependency when the error is thrown.
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * The returned error description.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Indicates if the call that caused the error should be retried.
   * @return retryHint
   */
  public ErrorRetryHint getRetryHint() {
    return retryHint;
  }

  public void setRetryHint(ErrorRetryHint retryHint) {
    this.retryHint = retryHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingErrorDefinition encodingErrorDefinition = (EncodingErrorDefinition) o;
    return Objects.equals(this.code, encodingErrorDefinition.code) &&
        Objects.equals(this.category, encodingErrorDefinition.category) &&
        Objects.equals(this.message, encodingErrorDefinition.message) &&
        Objects.equals(this.description, encodingErrorDefinition.description) &&
        Objects.equals(this.retryHint, encodingErrorDefinition.retryHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, category, message, description, retryHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingErrorDefinition {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    retryHint: ").append(toIndentedString(retryHint)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.RetryHint;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ErrorDetails
 */

public class ErrorDetails {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("category")
  private String category;

  @JsonProperty("text")
  private String text;

  @JsonProperty("retryHint")
  private RetryHint retryHint;


  /**
   * Specific error code
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Specific error code
   *
   * @param code
   * Specific error code
   */
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Error group name
   * @return category
   */
  public String getCategory() {
    return category;
  }

  /**
   * Error group name
   *
   * @param category
   * Error group name
   */
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * Detailed error message
   * @return text
   */
  public String getText() {
    return text;
  }

  /**
   * Detailed error message
   *
   * @param text
   * Detailed error message
   */
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Information if the encoding could potentially succeed when retrying.
   * @return retryHint
   */
  public RetryHint getRetryHint() {
    return retryHint;
  }

  /**
   * Information if the encoding could potentially succeed when retrying.
   *
   * @param retryHint
   * Information if the encoding could potentially succeed when retrying.
   */
  public void setRetryHint(RetryHint retryHint) {
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
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.code, errorDetails.code) &&
        Objects.equals(this.category, errorDetails.category) &&
        Objects.equals(this.text, errorDetails.text) &&
        Objects.equals(this.retryHint, errorDetails.retryHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, category, text, retryHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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


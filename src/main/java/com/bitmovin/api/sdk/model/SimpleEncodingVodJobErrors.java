package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobErrors
 */

public class SimpleEncodingVodJobErrors {
  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("message")
  private String message;

  @JsonProperty("details")
  private String details;

  /**
   * Stable code that identifies the error type.
   * @return errorCode
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * Human readable description of the error.
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Additional details of the error if available.
   * @return details
   */
  public String getDetails() {
    return details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingVodJobErrors simpleEncodingVodJobErrors = (SimpleEncodingVodJobErrors) o;
    return Objects.equals(this.errorCode, simpleEncodingVodJobErrors.errorCode) &&
        Objects.equals(this.message, simpleEncodingVodJobErrors.message) &&
        Objects.equals(this.details, simpleEncodingVodJobErrors.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobErrors {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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


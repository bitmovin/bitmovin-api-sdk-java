package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ResponseErrorData;
import com.bitmovin.api.sdk.model.ResponseStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ResponseError
 */

public class ResponseError {
  @JsonProperty("requestId")
  private String requestId;

  @JsonProperty("status")
  private ResponseStatus status;

  @JsonProperty("data")
  private ResponseErrorData data;

  /**
   * Unique correlation id
   * @return requestId
   */
  public String getRequestId() {
    return requestId;
  }

  /**
   * Response status information
   * @return status
   */
  public ResponseStatus getStatus() {
    return status;
  }

  /**
   * Response information
   * @return data
   */
  public ResponseErrorData getData() {
    return data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseError responseError = (ResponseError) o;
    return Objects.equals(this.requestId, responseError.requestId) &&
        Objects.equals(this.status, responseError.status) &&
        Objects.equals(this.data, responseError.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, status, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseError {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


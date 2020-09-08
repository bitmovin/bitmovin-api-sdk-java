package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.Status;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TransferRetry
 */

public class TransferRetry extends BitmovinResource {
  @JsonProperty("status")
  private Status status;

  @JsonProperty("startedAt")
  private Date startedAt;

  @JsonProperty("finishedAt")
  private Date finishedAt;

  @JsonProperty("errorAt")
  private Date errorAt;

  /**
   * The current status of the transfer-retry.
   * @return status
   */
  public Status getStatus() {
    return status;
  }

  /**
   * Timestamp when the transfer-retry was started, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ 
   * @return startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }

  /**
   * Timestamp when the transfer-retry status changed to &#39;FINISHED&#39;, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ 
   * @return finishedAt
   */
  public Date getFinishedAt() {
    return finishedAt;
  }

  /**
   * Timestamp when the transfer-retry status changed to &#39;ERROR&#39;, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ 
   * @return errorAt
   */
  public Date getErrorAt() {
    return errorAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRetry transferRetry = (TransferRetry) o;
    return Objects.equals(this.status, transferRetry.status) &&
        Objects.equals(this.startedAt, transferRetry.startedAt) &&
        Objects.equals(this.finishedAt, transferRetry.finishedAt) &&
        Objects.equals(this.errorAt, transferRetry.errorAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, startedAt, finishedAt, errorAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRetry {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    errorAt: ").append(toIndentedString(errorAt)).append("\n");
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


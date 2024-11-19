package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.LiveStandbyPoolStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolResponse
 */

public class LiveStandbyPoolResponse extends BitmovinResource {
  @JsonProperty("targetPoolSize")
  private Integer targetPoolSize;

  @JsonProperty("readyEncodings")
  private Integer readyEncodings;

  @JsonProperty("preparingEncodings")
  private Integer preparingEncodings;

  @JsonProperty("errorEncodings")
  private Integer errorEncodings;

  @JsonProperty("encodingTemplateName")
  private String encodingTemplateName;

  @JsonProperty("poolStatus")
  private LiveStandbyPoolStatus poolStatus;

  /**
   * Number of instances to keep ready for streaming while the pool is running (required)
   * minimum: 0
   * @return targetPoolSize
   */
  public Integer getTargetPoolSize() {
    return targetPoolSize;
  }

  /**
   * Number of instances currently in ready state in the pool
   * minimum: 0
   * @return readyEncodings
   */
  public Integer getReadyEncodings() {
    return readyEncodings;
  }

  /**
   * Number of instances currently being prepared in the pool
   * minimum: 0
   * @return preparingEncodings
   */
  public Integer getPreparingEncodings() {
    return preparingEncodings;
  }

  /**
   * Number of instances currently in error state in the pool
   * minimum: 0
   * @return errorEncodings
   */
  public Integer getErrorEncodings() {
    return errorEncodings;
  }


  /**
   * The name of the encoding template used with this Standby Pool
   * @return encodingTemplateName
   */
  public String getEncodingTemplateName() {
    return encodingTemplateName;
  }

  /**
   * The name of the encoding template used with this Standby Pool
   *
   * @param encodingTemplateName
   *        The name of the encoding template used with this Standby Pool
   */
  public void setEncodingTemplateName(String encodingTemplateName) {
    this.encodingTemplateName = encodingTemplateName;
  }


  /**
   * Get poolStatus
   * @return poolStatus
   */
  public LiveStandbyPoolStatus getPoolStatus() {
    return poolStatus;
  }

  /**
   * Set poolStatus
   *
   * @param poolStatus
   */
  public void setPoolStatus(LiveStandbyPoolStatus poolStatus) {
    this.poolStatus = poolStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolResponse liveStandbyPoolResponse = (LiveStandbyPoolResponse) o;
    return Objects.equals(this.targetPoolSize, liveStandbyPoolResponse.targetPoolSize) &&
        Objects.equals(this.readyEncodings, liveStandbyPoolResponse.readyEncodings) &&
        Objects.equals(this.preparingEncodings, liveStandbyPoolResponse.preparingEncodings) &&
        Objects.equals(this.errorEncodings, liveStandbyPoolResponse.errorEncodings) &&
        Objects.equals(this.encodingTemplateName, liveStandbyPoolResponse.encodingTemplateName) &&
        Objects.equals(this.poolStatus, liveStandbyPoolResponse.poolStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPoolSize, readyEncodings, preparingEncodings, errorEncodings, encodingTemplateName, poolStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targetPoolSize: ").append(toIndentedString(targetPoolSize)).append("\n");
    sb.append("    readyEncodings: ").append(toIndentedString(readyEncodings)).append("\n");
    sb.append("    preparingEncodings: ").append(toIndentedString(preparingEncodings)).append("\n");
    sb.append("    errorEncodings: ").append(toIndentedString(errorEncodings)).append("\n");
    sb.append("    encodingTemplateName: ").append(toIndentedString(encodingTemplateName)).append("\n");
    sb.append("    poolStatus: ").append(toIndentedString(poolStatus)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinStreamEncodingStatus;
import com.bitmovin.api.sdk.model.BitmovinStreamQuality;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BitmovinStreamEncodingTask
 */

public class BitmovinStreamEncodingTask {
  @JsonProperty("quality")
  private BitmovinStreamQuality quality;

  @JsonProperty("status")
  private BitmovinStreamEncodingStatus status;

  /**
   * Quality of the encoding
   * @return quality
   */
  public BitmovinStreamQuality getQuality() {
    return quality;
  }

  /**
   * Current state of the encoding
   * @return status
   */
  public BitmovinStreamEncodingStatus getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitmovinStreamEncodingTask bitmovinStreamEncodingTask = (BitmovinStreamEncodingTask) o;
    return Objects.equals(this.quality, bitmovinStreamEncodingTask.quality) &&
        Objects.equals(this.status, bitmovinStreamEncodingTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitmovinStreamEncodingTask {\n");
    
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


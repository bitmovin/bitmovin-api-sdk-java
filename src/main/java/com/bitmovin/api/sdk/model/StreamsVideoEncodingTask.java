package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsVideoEncodingStatus;
import com.bitmovin.api.sdk.model.StreamsVideoQuality;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsVideoEncodingTask
 */

public class StreamsVideoEncodingTask {
  @JsonProperty("quality")
  private StreamsVideoQuality quality;

  @JsonProperty("status")
  private StreamsVideoEncodingStatus status;

  /**
   * Quality of the encoding
   * @return quality
   */
  public StreamsVideoQuality getQuality() {
    return quality;
  }

  /**
   * Current state of the encoding
   * @return status
   */
  public StreamsVideoEncodingStatus getStatus() {
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
    StreamsVideoEncodingTask streamsVideoEncodingTask = (StreamsVideoEncodingTask) o;
    return Objects.equals(this.quality, streamsVideoEncodingTask.quality) &&
        Objects.equals(this.status, streamsVideoEncodingTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsVideoEncodingTask {\n");
    
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


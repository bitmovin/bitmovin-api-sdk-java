package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.StreamInput;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamDvbSubSubtitle
 */

public class StreamDvbSubSubtitle extends BitmovinResource {
  @JsonProperty("inputStream")
  private StreamInput inputStream;


  /**
   * The input stream to extract the subtitle from (required)
   * @return inputStream
   */
  public StreamInput getInputStream() {
    return inputStream;
  }

  /**
   * The input stream to extract the subtitle from (required)
   *
   * @param inputStream
   *        The input stream to extract the subtitle from (required)
   */
  public void setInputStream(StreamInput inputStream) {
    this.inputStream = inputStream;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamDvbSubSubtitle streamDvbSubSubtitle = (StreamDvbSubSubtitle) o;
    return Objects.equals(this.inputStream, streamDvbSubSubtitle.inputStream) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStream, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamDvbSubSubtitle {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputStream: ").append(toIndentedString(inputStream)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ESAM signal following the SCTE-250 standard
 */

public class EsamSignal {
  @JsonProperty("offset")
  private String offset;

  @JsonProperty("binary")
  private String binary;


  /**
   * The offset from the matched signal in ISO 8601 duration format, accurate to milliseconds
   * @return offset
   */
  public String getOffset() {
    return offset;
  }

  /**
   * The offset from the matched signal in ISO 8601 duration format, accurate to milliseconds
   *
   * @param offset
   *        The offset from the matched signal in ISO 8601 duration format, accurate to milliseconds
   */
  public void setOffset(String offset) {
    this.offset = offset;
  }


  /**
   * Base64-encoded SCTE-35 binary data to be inserted into the stream (required)
   * @return binary
   */
  public String getBinary() {
    return binary;
  }

  /**
   * Base64-encoded SCTE-35 binary data to be inserted into the stream (required)
   *
   * @param binary
   *        Base64-encoded SCTE-35 binary data to be inserted into the stream (required)
   */
  public void setBinary(String binary) {
    this.binary = binary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsamSignal esamSignal = (EsamSignal) o;
    return Objects.equals(this.offset, esamSignal.offset) &&
        Objects.equals(this.binary, esamSignal.binary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, binary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsamSignal {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
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


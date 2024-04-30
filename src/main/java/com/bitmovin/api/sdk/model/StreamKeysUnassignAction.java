package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamKeysUnassignAction
 */

public class StreamKeysUnassignAction {
  @JsonProperty("encodingId")
  private String encodingId;


  /**
   * Encoding ID for which stream keys should be unassigned
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * Encoding ID for which stream keys should be unassigned
   *
   * @param encodingId
   *        Encoding ID for which stream keys should be unassigned
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamKeysUnassignAction streamKeysUnassignAction = (StreamKeysUnassignAction) o;
    return Objects.equals(this.encodingId, streamKeysUnassignAction.encodingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamKeysUnassignAction {\n");
    
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
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


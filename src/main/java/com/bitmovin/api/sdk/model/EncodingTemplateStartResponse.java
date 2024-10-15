package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingTemplateStartResponse
 */

public class EncodingTemplateStartResponse {
  @JsonProperty("encodingId")
  private String encodingId;

  /**
   * Id of the Encoding that is created (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingTemplateStartResponse encodingTemplateStartResponse = (EncodingTemplateStartResponse) o;
    return Objects.equals(this.encodingId, encodingTemplateStartResponse.encodingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingTemplateStartResponse {\n");
    
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


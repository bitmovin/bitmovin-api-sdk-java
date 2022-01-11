package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashRepresentationTypeDiscriminator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashRepresentationTypeResponse
 */

public class DashRepresentationTypeResponse {
  @JsonProperty("type")
  private DashRepresentationTypeDiscriminator type;


  /**
   * The type of the DASH representation
   * @return type
   */
  public DashRepresentationTypeDiscriminator getType() {
    return type;
  }

  /**
   * The type of the DASH representation
   *
   * @param type
   *        The type of the DASH representation
   */
  public void setType(DashRepresentationTypeDiscriminator type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashRepresentationTypeResponse dashRepresentationTypeResponse = (DashRepresentationTypeResponse) o;
    return Objects.equals(this.type, dashRepresentationTypeResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashRepresentationTypeResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


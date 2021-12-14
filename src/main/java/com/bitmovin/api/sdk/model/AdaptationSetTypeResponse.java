package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdaptationSetType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdaptationSetTypeResponse
 */

public class AdaptationSetTypeResponse {
  @JsonProperty("type")
  private AdaptationSetType type;


  /**
   * The type of the adaptation set
   * @return type
   */
  public AdaptationSetType getType() {
    return type;
  }

  /**
   * The type of the adaptation set
   *
   * @param type
   *        The type of the adaptation set
   */
  public void setType(AdaptationSetType type) {
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
    AdaptationSetTypeResponse adaptationSetTypeResponse = (AdaptationSetTypeResponse) o;
    return Objects.equals(this.type, adaptationSetTypeResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptationSetTypeResponse {\n");
    
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


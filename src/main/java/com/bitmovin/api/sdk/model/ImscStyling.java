package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ImscStylingMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ImscStyling
 */

public class ImscStyling {
  @JsonProperty("mode")
  private ImscStylingMode mode;


  /**
   * Get mode
   * @return mode
   */
  public ImscStylingMode getMode() {
    return mode;
  }

  /**
   * Set mode
   *
   * @param mode
   */
  public void setMode(ImscStylingMode mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImscStyling imscStyling = (ImscStyling) o;
    return Objects.equals(this.mode, imscStyling.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImscStyling {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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


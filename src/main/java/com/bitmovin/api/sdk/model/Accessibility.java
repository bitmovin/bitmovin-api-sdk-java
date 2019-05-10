package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Accessibility
 */

public class Accessibility {
  @JsonProperty("value")
  private String value;

  @JsonProperty("schemeIdUri")
  private String schemeIdUri;


  /**
   * Can be either list of languages or a complete map of services (or CC channels, in CEA-608 terminology)
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  /**
   * The scheme id to use. Please refer to the DASH standard.
   * @return schemeIdUri
   */
  public String getSchemeIdUri() {
    return schemeIdUri;
  }

  public void setSchemeIdUri(String schemeIdUri) {
    this.schemeIdUri = schemeIdUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Accessibility accessibility = (Accessibility) o;
    return Objects.equals(this.value, accessibility.value) &&
        Objects.equals(this.schemeIdUri, accessibility.schemeIdUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, schemeIdUri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Accessibility {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    schemeIdUri: ").append(toIndentedString(schemeIdUri)).append("\n");
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


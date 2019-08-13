package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ResourceLimit
 */

public class ResourceLimit {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  @JsonProperty("effectiveValue")
  private String effectiveValue;


  /**
   * Get name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get value
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * Set value
   *
   * @param value
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Specifies the remaining limit value for limits divided to sub-organizations. This property is returned only for parent organizations and only for mentioned limits.
   * @return effectiveValue
   */
  public String getEffectiveValue() {
    return effectiveValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceLimit resourceLimit = (ResourceLimit) o;
    return Objects.equals(this.name, resourceLimit.name) &&
        Objects.equals(this.value, resourceLimit.value) &&
        Objects.equals(this.effectiveValue, resourceLimit.effectiveValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, effectiveValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLimit {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    effectiveValue: ").append(toIndentedString(effectiveValue)).append("\n");
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


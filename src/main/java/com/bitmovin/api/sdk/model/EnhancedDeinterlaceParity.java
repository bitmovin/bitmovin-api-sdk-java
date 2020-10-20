package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies which field of an interlaced frame is assumed to be the first one
 */
public enum EnhancedDeinterlaceParity {
  
  /**
   * Top field is first field
   */
  TOP_FIELD_FIRST("TOP_FIELD_FIRST"),
  
  /**
   * Bottom field is first field
   */
  BOTTOM_FIELD_FIRST("BOTTOM_FIELD_FIRST");

  private String value;

  EnhancedDeinterlaceParity(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EnhancedDeinterlaceParity fromValue(String text) {
    for (EnhancedDeinterlaceParity b : EnhancedDeinterlaceParity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


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
 * Specifies the method how fields are converted to frames
 */
public enum EnhancedDeinterlaceMode {
  
  /**
   * Generate one frame for each frame
   */
  FRAME("FRAME"),
  
  /**
   * Generate one frame for each field
   */
  FIELD("FIELD");

  private String value;

  EnhancedDeinterlaceMode(String value) {
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
  public static EnhancedDeinterlaceMode fromValue(String text) {
    for (EnhancedDeinterlaceMode b : EnhancedDeinterlaceMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Av1DynamicRangeFormat {
  
  /**
   * Configure the Output to be Dolby Vision Profile 10.0
   */
  DOLBY_VISION_PROFILE_10_0("DOLBY_VISION_PROFILE_10_0"),
  
  /**
   * Configure the Output to be Dolby Vision Profile 10.1 (HDR10 cross-compatibility)
   */
  DOLBY_VISION_PROFILE_10_1("DOLBY_VISION_PROFILE_10_1"),
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert between different HDR formats.
   */
  HDR10("HDR10"),
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert between different HDR formats.
   */
  SDR("SDR");

  private String value;

  Av1DynamicRangeFormat(String value) {
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
  public static Av1DynamicRangeFormat fromValue(String text) {
    for (Av1DynamicRangeFormat b : Av1DynamicRangeFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


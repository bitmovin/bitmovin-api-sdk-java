package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum H265DynamicRangeFormat {
  
  /**
   * Configure the Output to be Dolby Vision Profile 5.
   */
  DOLBY_VISION("DOLBY_VISION"),
  
  /**
   * Configure the Output to be Dolby Vision Profile 5
   */
  DOLBY_VISION_PROFILE_5("DOLBY_VISION_PROFILE_5"),
  
  /**
   * Configure the Output to be Dolby Vision Profile 8.1 (HDR10 cross-compatibility)
   */
  DOLBY_VISION_PROFILE_8_1("DOLBY_VISION_PROFILE_8_1"),
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert from SDR to HDR, from HDR to SDR or between different HDR formats
   */
  HDR10("HDR10"),
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert from SDR to HDR, from HDR to SDR or between different HDR formats
   */
  HLG("HLG"),
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert from SDR to HDR, from HDR to SDR or between different HDR formats
   */
  SDR("SDR");

  private String value;

  H265DynamicRangeFormat(String value) {
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
  public static H265DynamicRangeFormat fromValue(String text) {
    for (H265DynamicRangeFormat b : H265DynamicRangeFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


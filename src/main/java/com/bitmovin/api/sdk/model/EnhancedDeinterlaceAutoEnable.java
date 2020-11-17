package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EnhancedDeinterlaceAutoEnable {
  
  /**
   * The content will always be deinterlaced with the settings specified (mode, parity)
   */
  ALWAYS_ON("ALWAYS_ON"),
  
  /**
   * The Enhanced Deinterlace filter will only be applied when interlaced content is signaled in the meta data of the input stream.
   */
  META_DATA_BASED("META_DATA_BASED");

  private String value;

  EnhancedDeinterlaceAutoEnable(String value) {
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
  public static EnhancedDeinterlaceAutoEnable fromValue(String text) {
    for (EnhancedDeinterlaceAutoEnable b : EnhancedDeinterlaceAutoEnable.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


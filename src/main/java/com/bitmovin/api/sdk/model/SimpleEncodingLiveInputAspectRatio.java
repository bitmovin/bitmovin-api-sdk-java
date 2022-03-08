package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleEncodingLiveInputAspectRatio {
  
  /**
   * Widescreen 16:9 aspect ratio
   */
  WIDE_16_9("WIDE_16_9"),
  
  /**
   * Widescreen 16:10 aspect ratio
   */
  WIDE_16_10("WIDE_16_10"),
  
  /**
   * Vertical 9:16 aspect ratio. Also known as portrait mode
   */
  VERTICAL_9_16("VERTICAL_9_16"),
  
  /**
   * Standard 4:3 aspect ratio
   */
  STANDARD_4_3("STANDARD_4_3"),
  
  /**
   * Ultrawide 21:9 aspect ratio
   */
  ULTRA_WIDE_21_9("ULTRA_WIDE_21_9");

  private String value;

  SimpleEncodingLiveInputAspectRatio(String value) {
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
  public static SimpleEncodingLiveInputAspectRatio fromValue(String text) {
    for (SimpleEncodingLiveInputAspectRatio b : SimpleEncodingLiveInputAspectRatio.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


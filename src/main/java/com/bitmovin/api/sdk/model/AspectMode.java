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
 * Gets or Sets AspectMode
 */
public enum AspectMode {
  
  /**
   * Specifies that the Padding aspect mode is used when adapting to the main input stream&#39;s aspect ratio (Adding black boxes on the bottom/top or left/right).
   */
  PAD("PAD"),
  
  /**
   * Specifies that the Cropping aspect mode is used when adapting to the main input stream&#39;s aspect ratio (Cropping on the left/right or bottom/top).
   */
  CROP("CROP"),
  
  /**
   * Specifies that the Stretching aspect mode is used when adapting to the main input stream&#39;s aspect ratio (Stretching vertically or horizontally).
   */
  STRETCH("STRETCH");

  private String value;

  AspectMode(String value) {
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
  public static AspectMode fromValue(String text) {
    for (AspectMode b : AspectMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


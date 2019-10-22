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
 * Gets or Sets PaddingDurationUnit
 */
public enum PaddingDurationUnit {
  
  /**
   * Duration will be specified in seconds
   */
  SECONDS("SECONDS"),
  
  /**
   * Duration will be specified in number of frames
   */
  FRAMES("FRAMES");

  private String value;

  PaddingDurationUnit(String value) {
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
  public static PaddingDurationUnit fromValue(String text) {
    for (PaddingDurationUnit b : PaddingDurationUnit.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


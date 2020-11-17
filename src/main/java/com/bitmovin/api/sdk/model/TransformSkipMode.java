package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TransformSkipMode {
  
  /**
   * No transform skip enabled
   */
  NONE("NONE"),
  
  /**
   * Enable normal evaluation of transform skip
   */
  NORMAL("NORMAL"),
  
  /**
   * Only evaluate transform skip for NxN intra predictions (4x4 blocks).
   */
  FAST("FAST");

  private String value;

  TransformSkipMode(String value) {
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
  public static TransformSkipMode fromValue(String text) {
    for (TransformSkipMode b : TransformSkipMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


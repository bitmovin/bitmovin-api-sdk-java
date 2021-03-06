package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum H262InterlaceMode {
  
  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   */
  NONE("NONE"),
  
  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   */
  TOP_FIELD_FIRST("TOP_FIELD_FIRST"),
  
  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   */
  BOTTOM_FIELD_FIRST("BOTTOM_FIELD_FIRST");

  private String value;

  H262InterlaceMode(String value) {
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
  public static H262InterlaceMode fromValue(String text) {
    for (H262InterlaceMode b : H262InterlaceMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


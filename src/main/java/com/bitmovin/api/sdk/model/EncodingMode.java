package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EncodingMode {
  
  /**
   * The standard encoding mode is ONE_PASS for LIVE encodings and TWO_PASS for VOD encodings
   */
  STANDARD("STANDARD"),
  
  /**
   * Single pass encoding
   */
  SINGLE_PASS("SINGLE_PASS"),
  
  /**
   * Two pass encoding for better quality
   */
  TWO_PASS("TWO_PASS"),
  
  /**
   * Three pass encoding for best quality (this only works for VoD workflows)
   */
  THREE_PASS("THREE_PASS");

  private String value;

  EncodingMode(String value) {
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
  public static EncodingMode fromValue(String text) {
    for (EncodingMode b : EncodingMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


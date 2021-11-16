package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Vp9DynamicRangeFormat {
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert from SDR to HLG, from HLG to SDR.
   */
  HLG("HLG"),
  
  /**
   * Configures what kind of dynamic range the output should conform to. Can be used to convert from SDR to HLG, from HLG to SDR.
   */
  SDR("SDR");

  private String value;

  Vp9DynamicRangeFormat(String value) {
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
  public static Vp9DynamicRangeFormat fromValue(String text) {
    for (Vp9DynamicRangeFormat b : Vp9DynamicRangeFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


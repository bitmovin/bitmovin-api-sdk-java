package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalPlusSurroundMixLevel {
  
  /**
   * -1.5 dB
   */
  MINUS_1_5_DB("MINUS_1_5_DB"),
  
  /**
   * -3 dB
   */
  MINUS_3_DB("MINUS_3_DB"),
  
  /**
   * -4.5 dB
   */
  MINUS_4_5_DB("MINUS_4_5_DB"),
  
  /**
   * -6 dB
   */
  MINUS_6_DB("MINUS_6_DB"),
  
  
  MINUS_INFINITY_DB("MINUS_INFINITY_DB");

  private String value;

  DolbyDigitalPlusSurroundMixLevel(String value) {
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
  public static DolbyDigitalPlusSurroundMixLevel fromValue(String text) {
    for (DolbyDigitalPlusSurroundMixLevel b : DolbyDigitalPlusSurroundMixLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


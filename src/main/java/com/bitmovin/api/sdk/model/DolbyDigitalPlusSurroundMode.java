package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalPlusSurroundMode {
  
  /**
   * Enable Dolby surround mode
   */
  ENABLED("ENABLED"),
  
  /**
   * Disable Dolby surround mode. This is the default value for surroundExMode
   */
  DISABLED("DISABLED"),
  
  /**
   * Dolby surround mode is not indicated. This is the default value for surroundMode
   */
  NOT_INDICATED("NOT_INDICATED");

  private String value;

  DolbyDigitalPlusSurroundMode(String value) {
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
  public static DolbyDigitalPlusSurroundMode fromValue(String text) {
    for (DolbyDigitalPlusSurroundMode b : DolbyDigitalPlusSurroundMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


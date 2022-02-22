package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Av1PresetConfiguration {
  
  
  VOD_QUALITY("VOD_QUALITY"),
  
  
  VOD_STANDARD("VOD_STANDARD"),
  
  
  VOD_SPEED("VOD_SPEED");

  private String value;

  Av1PresetConfiguration(String value) {
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
  public static Av1PresetConfiguration fromValue(String text) {
    for (Av1PresetConfiguration b : Av1PresetConfiguration.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


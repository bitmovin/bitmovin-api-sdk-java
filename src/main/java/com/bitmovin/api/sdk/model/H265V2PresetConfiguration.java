package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum H265V2PresetConfiguration {
  
  
  VOD_QUALITY("VOD_QUALITY"),
  
  
  VOD_HIGH_QUALITY("VOD_HIGH_QUALITY");

  private String value;

  H265V2PresetConfiguration(String value) {
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
  public static H265V2PresetConfiguration fromValue(String text) {
    for (H265V2PresetConfiguration b : H265V2PresetConfiguration.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


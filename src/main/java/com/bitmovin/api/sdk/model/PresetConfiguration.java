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
 * Gets or Sets PresetConfiguration
 */
public enum PresetConfiguration {
  
  
  LIVE_HIGH_QUALITY("LIVE_HIGH_QUALITY"),
  
  
  LIVE_LOW_LATENCY("LIVE_LOW_LATENCY"),
  
  
  VOD_HIGH_QUALITY("VOD_HIGH_QUALITY"),
  
  
  VOD_HIGH_SPEED("VOD_HIGH_SPEED"),
  
  
  VOD_SPEED("VOD_SPEED"),
  
  
  VOD_STANDARD("VOD_STANDARD"),
  
  
  VOD_EXTRAHIGH_SPEED("VOD_EXTRAHIGH_SPEED"),
  
  
  VOD_VERYHIGH_SPEED("VOD_VERYHIGH_SPEED"),
  
  
  VOD_SUPERHIGH_SPEED("VOD_SUPERHIGH_SPEED"),
  
  
  VOD_ULTRAHIGH_SPEED("VOD_ULTRAHIGH_SPEED");

  private String value;

  PresetConfiguration(String value) {
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
  public static PresetConfiguration fromValue(String text) {
    for (PresetConfiguration b : PresetConfiguration.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


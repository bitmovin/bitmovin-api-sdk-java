package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ScenePacing {
  
  /**
   * Deliberate, unhurried pace with contemplative moments or establishing shots
   */
  SLOW("SLOW"),
  
  /**
   * Steady, controlled pace typical of dialogue-driven scenes or methodical storytelling
   */
  MEASURED("MEASURED"),
  
  /**
   * Quick, energetic pace found in action sequences or montages
   */
  BRISK("BRISK"),
  
  /**
   * Rapid, chaotic pace with intense action or panic-driven scenes
   */
  FRANTIC("FRANTIC"),
  
  /**
   * Unable to determine pacing
   */
  UNKNOWN("UNKNOWN");

  private String value;

  ScenePacing(String value) {
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
  public static ScenePacing fromValue(String text) {
    for (ScenePacing b : ScenePacing.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


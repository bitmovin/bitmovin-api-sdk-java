package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SceneTension {
  
  /**
   * Peak suspense or intensity, such as climactic confrontations or life-threatening situations
   */
  EXTREME("EXTREME"),
  
  /**
   * Significant tension with emotionally charged moments, such as arguments or chase scenes
   */
  HIGH("HIGH"),
  
  /**
   * Some tension present, engaging but not overwhelming, such as mild conflict or anticipation
   */
  MODERATE("MODERATE"),
  
  /**
   * Minimal tension with calm or relaxed scenes, such as exposition or casual dialogue
   */
  LOW("LOW"),
  
  /**
   * Unable to determine tension level
   */
  UNKNOWN("UNKNOWN");

  private String value;

  SceneTension(String value) {
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
  public static SceneTension fromValue(String text) {
    for (SceneTension b : SceneTension.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


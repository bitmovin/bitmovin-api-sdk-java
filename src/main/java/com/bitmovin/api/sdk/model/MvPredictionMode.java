package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MvPredictionMode {
  
  /**
   * Motion vector prediction mode
   */
  NONE("NONE"),
  
  /**
   * Motion vector prediction mode
   */
  SPATIAL("SPATIAL"),
  
  /**
   * Motion vector prediction mode
   */
  TEMPORAL("TEMPORAL"),
  
  /**
   * Motion vector prediction mode
   */
  AUTO("AUTO");

  private String value;

  MvPredictionMode(String value) {
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
  public static MvPredictionMode fromValue(String text) {
    for (MvPredictionMode b : MvPredictionMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


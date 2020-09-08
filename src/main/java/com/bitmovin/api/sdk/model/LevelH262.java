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
 * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://en.wikipedia.org/wiki/H.264/MPEG-4_AVC#Levels
 */
public enum LevelH262 {
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://en.wikipedia.org/wiki/H.264/MPEG-4_AVC#Levels
   */
  MAIN("MAIN"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://en.wikipedia.org/wiki/H.264/MPEG-4_AVC#Levels
   */
  HIGH("HIGH");

  private String value;

  LevelH262(String value) {
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
  public static LevelH262 fromValue(String text) {
    for (LevelH262 b : LevelH262.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


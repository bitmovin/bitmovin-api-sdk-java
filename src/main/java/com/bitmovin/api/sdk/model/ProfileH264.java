package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProfileH264 {
  
  /**
   * Baseline profile
   */
  BASELINE("BASELINE"),
  
  /**
   * Main profile
   */
  MAIN("MAIN"),
  
  /**
   * High profile
   */
  HIGH("HIGH"),
  
  /**
   * High profile 422
   */
  HIGH422("HIGH422");

  private String value;

  ProfileH264(String value) {
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
  public static ProfileH264 fromValue(String text) {
    for (ProfileH264 b : ProfileH264.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


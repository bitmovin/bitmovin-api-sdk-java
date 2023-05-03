package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AutoLevelSetup {
  
  /**
   * Enable automatic calculation of level, maxrate and bufsize
   */
  ENABLED("ENABLED"),
  
  /**
   * Disable automatic calculation of level, maxrate and bufsize
   */
  DISABLED("DISABLED");

  private String value;

  AutoLevelSetup(String value) {
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
  public static AutoLevelSetup fromValue(String text) {
    for (AutoLevelSetup b : AutoLevelSetup.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


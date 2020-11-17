package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RateDistortionPenaltyMode {
  
  /**
   * Rate distortion penalty disabled.
   */
  DISABLED("DISABLED"),
  
  /**
   * Transform units of size 32x32 are given a 4x bit cost penalty compared to smaller transform units, in intra coded CUs in P or B slices.
   */
  NORMAL("NORMAL"),
  
  /**
   * Transform units of size 32x32 are not even attempted, unless otherwise required by the maximum recursion depth.
   */
  MAXIMUM("MAXIMUM");

  private String value;

  RateDistortionPenaltyMode(String value) {
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
  public static RateDistortionPenaltyMode fromValue(String text) {
    for (RateDistortionPenaltyMode b : RateDistortionPenaltyMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


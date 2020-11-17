package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LimitTransformUnitDepthRecursionMode {
  
  /**
   * Disable early exit from transform unit dept recursion
   */
  DISABLED("DISABLED"),
  
  /**
   * Decides to recurse to next higher depth based on cost comparison of full size transform unit and split transform unit.
   */
  LEVEL_1("LEVEL_1"),
  
  /**
   * Based on first split sub TUs depth, limits recursion of other split sub TUs.
   */
  LEVEL_2("LEVEL_2"),
  
  /**
   * Based on the average depth of the co-located and the neighbor CUs TU depth, limits recursion of the current CU.
   */
  LEVEL_3("LEVEL_3"),
  
  /**
   * Uses the depth of the co-located CUs TU depth to limit the 1st sub TU depth. The 1st sub TU depth is taken as the limiting depth for the other sub TUs.
   */
  LEVEL_4("LEVEL_4");

  private String value;

  LimitTransformUnitDepthRecursionMode(String value) {
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
  public static LimitTransformUnitDepthRecursionMode fromValue(String text) {
    for (LimitTransformUnitDepthRecursionMode b : LimitTransformUnitDepthRecursionMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum H265V2MotionCompensatedTemporalFiltering {
  
  /**
   * -1: Automatic selection
   */
  AUTO("AUTO"),
  
  /**
   * 0: Disable motion compensated temporal filtering
   */
  OFF("OFF"),
  
  /**
   * 1: Enable motion compensated temporal filtering
   */
  ON("ON");

  private String value;

  H265V2MotionCompensatedTemporalFiltering(String value) {
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
  public static H265V2MotionCompensatedTemporalFiltering fromValue(String text) {
    for (H265V2MotionCompensatedTemporalFiltering b : H265V2MotionCompensatedTemporalFiltering.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


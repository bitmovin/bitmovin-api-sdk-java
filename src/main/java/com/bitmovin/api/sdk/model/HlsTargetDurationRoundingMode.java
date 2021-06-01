package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum HlsTargetDurationRoundingMode {
  
  /**
   * The target duration will be always rounded upwards.  For example: if the target duration is 4.2 this will be rounded to 5.
   */
  UPWARD_ROUNDING("UPWARD_ROUNDING"),
  
  /**
   * The target duration will be normally rounded.   For example: if the target duration is 4.2 this will be rounded to 4.
   */
  NORMAL_ROUNDING("NORMAL_ROUNDING");

  private String value;

  HlsTargetDurationRoundingMode(String value) {
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
  public static HlsTargetDurationRoundingMode fromValue(String text) {
    for (HlsTargetDurationRoundingMode b : HlsTargetDurationRoundingMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


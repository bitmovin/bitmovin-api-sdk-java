package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum H265V2PerceptualEncodingMode {
  
  /**
   * Perceptual encoding disabled
   */
  OFF("OFF"),
  
  /**
   * HVS-based perceptual encoding using CU delta QP
   */
  CU_DELTA_QP("CU_DELTA_QP");

  private String value;

  H265V2PerceptualEncodingMode(String value) {
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
  public static H265V2PerceptualEncodingMode fromValue(String text) {
    for (H265V2PerceptualEncodingMode b : H265V2PerceptualEncodingMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


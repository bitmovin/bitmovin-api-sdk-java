package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyVisionProfile {
  
  /**
   * dvhe.04
   */
  DVHE_04("DVHE_04"),
  
  /**
   * dvhe.05
   */
  DVHE_05("DVHE_05"),
  
  /**
   * dvhe.07
   */
  DVHE_07("DVHE_07"),
  
  /**
   * hev1.08
   */
  HEV1_08("HEV1_08"),
  
  /**
   * avc3.09
   */
  AVC3_09("AVC3_09");

  private String value;

  DolbyVisionProfile(String value) {
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
  public static DolbyVisionProfile fromValue(String text) {
    for (DolbyVisionProfile b : DolbyVisionProfile.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


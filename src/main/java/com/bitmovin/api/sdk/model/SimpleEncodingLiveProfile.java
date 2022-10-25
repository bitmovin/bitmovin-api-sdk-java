package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleEncodingLiveProfile {
  
  /**
   * It provides a higher quality output with a tradeoff in latency
   */
  INCREASED_QUALITY("INCREASED_QUALITY"),
  
  /**
   * It provides a lower latency output with a tradeoff in quality
   */
  LOWER_LATENCY("LOWER_LATENCY");

  private String value;

  SimpleEncodingLiveProfile(String value) {
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
  public static SimpleEncodingLiveProfile fromValue(String text) {
    for (SimpleEncodingLiveProfile b : SimpleEncodingLiveProfile.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


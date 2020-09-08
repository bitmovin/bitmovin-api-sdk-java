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
 * Gets or Sets AnalyticsVideoStartFailedReason
 */
public enum AnalyticsVideoStartFailedReason {
  
  
  PAGE_CLOSED("PAGE_CLOSED"),
  
  
  PLAYER_ERROR("PLAYER_ERROR"),
  
  
  TIMEOUT("TIMEOUT"),
  
  
  UNKNOWN("UNKNOWN");

  private String value;

  AnalyticsVideoStartFailedReason(String value) {
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
  public static AnalyticsVideoStartFailedReason fromValue(String text) {
    for (AnalyticsVideoStartFailedReason b : AnalyticsVideoStartFailedReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


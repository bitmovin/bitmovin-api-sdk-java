package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DashISO8601TimestampFormat {
  
  /**
   * Format for generating timestamps in PXXYXXMXXDTXXHXXMX.XXXS
   */
  LONG("LONG"),
  
  /**
   * Format for generating timestamps in PTXXHXXMX.XXXS
   */
  SHORT("SHORT");

  private String value;

  DashISO8601TimestampFormat(String value) {
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
  public static DashISO8601TimestampFormat fromValue(String text) {
    for (DashISO8601TimestampFormat b : DashISO8601TimestampFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


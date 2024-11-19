package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LiveStandbyPoolStatus {
  
  /**
   * The standby pool is in healthy state
   */
  HEALTHY("HEALTHY"),
  
  /**
   * The standby pool is in error state
   */
  ERROR("ERROR");

  private String value;

  LiveStandbyPoolStatus(String value) {
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
  public static LiveStandbyPoolStatus fromValue(String text) {
    for (LiveStandbyPoolStatus b : LiveStandbyPoolStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


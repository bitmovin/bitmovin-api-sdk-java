package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LiveStandbyPoolEventLogType {
  
  /**
   * Info log level
   */
  INFO("INFO"),
  
  /**
   * Warning log level
   */
  WARN("WARN"),
  
  /**
   * Error log level
   */
  ERROR("ERROR");

  private String value;

  LiveStandbyPoolEventLogType(String value) {
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
  public static LiveStandbyPoolEventLogType fromValue(String text) {
    for (LiveStandbyPoolEventLogType b : LiveStandbyPoolEventLogType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


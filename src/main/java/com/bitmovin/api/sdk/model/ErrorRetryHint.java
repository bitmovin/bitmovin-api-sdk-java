package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorRetryHint {
  
  
  RETRY("RETRY"),
  
  
  NO_RETRY("NO_RETRY"),
  
  
  RETRY_IN_DIFFERENT_REGION("RETRY_IN_DIFFERENT_REGION");

  private String value;

  ErrorRetryHint(String value) {
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
  public static ErrorRetryHint fromValue(String text) {
    for (ErrorRetryHint b : ErrorRetryHint.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


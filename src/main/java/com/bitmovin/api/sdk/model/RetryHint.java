package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RetryHint {
  
  /**
   * The process may succeed when retrying
   */
  RETRY("RETRY"),
  
  /**
   * The process may succeed when retrying in another region
   */
  RETRY_IN_DIFFERENT_REGION("RETRY_IN_DIFFERENT_REGION"),
  
  /**
   * The process is expected to fail on subsequent retries
   */
  NO_RETRY("NO_RETRY"),
  
  /**
   * Unable to determine if the error is retryable.
   */
  UNDEFINED("UNDEFINED");

  private String value;

  RetryHint(String value) {
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
  public static RetryHint fromValue(String text) {
    for (RetryHint b : RetryHint.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


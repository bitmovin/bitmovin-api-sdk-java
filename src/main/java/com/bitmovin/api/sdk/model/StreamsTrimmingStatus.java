package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamsTrimmingStatus {
  
  /**
   * Trimming is unavailable
   */
  UNAVAILABLE("UNAVAILABLE"),
  
  /**
   * Trimming is available
   */
  AVAILABLE("AVAILABLE"),
  
  /**
   * The trimming started
   */
  STARTED("STARTED"),
  
  /**
   * The trimming failed
   */
  ERROR("ERROR"),
  
  /**
   * The trimming succeeded
   */
  FINISHED("FINISHED");

  private String value;

  StreamsTrimmingStatus(String value) {
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
  public static StreamsTrimmingStatus fromValue(String text) {
    for (StreamsTrimmingStatus b : StreamsTrimmingStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


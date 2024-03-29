package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamsVideoEncodingStatus {
  
  /**
   * The encoding has been started and is in progress
   */
  STARTED("STARTED"),
  
  /**
   * The encoding did not succeed
   */
  ERROR("ERROR"),
  
  /**
   * The encoding finished successfully
   */
  FINISHED("FINISHED");

  private String value;

  StreamsVideoEncodingStatus(String value) {
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
  public static StreamsVideoEncodingStatus fromValue(String text) {
    for (StreamsVideoEncodingStatus b : StreamsVideoEncodingStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


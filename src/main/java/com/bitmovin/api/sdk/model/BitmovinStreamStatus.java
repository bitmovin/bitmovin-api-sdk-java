package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BitmovinStreamStatus {
  
  /**
   * The Stream is published and can be accessed
   */
  PUBLISHED("PUBLISHED"),
  
  /**
   * The Stream can&#39;t be accessed
   */
  UNPUBLISHED("UNPUBLISHED");

  private String value;

  BitmovinStreamStatus(String value) {
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
  public static BitmovinStreamStatus fromValue(String text) {
    for (BitmovinStreamStatus b : BitmovinStreamStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


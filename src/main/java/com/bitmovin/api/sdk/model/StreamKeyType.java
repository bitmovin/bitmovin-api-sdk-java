package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamKeyType {
  
  /**
   * Stream key is persistent and can be reused. It can be assigned to a live encoding when it is currently not in use
   */
  RESERVED("RESERVED"),
  
  /**
   * Stream key is automatically generated for a live encoding. They can not be reused. After the encoding is finished, the stream key will be gone also
   */
  TEMPORARY("TEMPORARY");

  private String value;

  StreamKeyType(String value) {
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
  public static StreamKeyType fromValue(String text) {
    for (StreamKeyType b : StreamKeyType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


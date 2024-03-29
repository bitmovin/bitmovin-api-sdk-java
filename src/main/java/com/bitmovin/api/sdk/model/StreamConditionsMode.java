package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamConditionsMode {
  
  /**
   * The whole muxing will be ignored if at least one of its Streams is ignored
   */
  DROP_MUXING("DROP_MUXING"),
  
  /**
   * Ignored Streams will be omitted from the muxing. The muxing will only be ignored if all of its Streams are ignored
   */
  DROP_STREAM("DROP_STREAM");

  private String value;

  StreamConditionsMode(String value) {
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
  public static StreamConditionsMode fromValue(String text) {
    for (StreamConditionsMode b : StreamConditionsMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


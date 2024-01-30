package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamKeyConfigurationType {
  
  /**
   * A temporary stream key with a random 20 characters string will be generated
   */
  GENERATE("GENERATE"),
  
  /**
   * A previously generated reserved stream key will be assigned
   */
  ASSIGN("ASSIGN");

  private String value;

  StreamKeyConfigurationType(String value) {
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
  public static StreamKeyConfigurationType fromValue(String text) {
    for (StreamKeyConfigurationType b : StreamKeyConfigurationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


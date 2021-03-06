package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Vp8ArnrType {
  
  /**
   * altref noise reduction filter type
   */
  BACKWARD("BACKWARD"),
  
  /**
   * altref noise reduction filter type
   */
  FORWARD("FORWARD"),
  
  /**
   * altref noise reduction filter type
   */
  CENTERED("CENTERED");

  private String value;

  Vp8ArnrType(String value) {
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
  public static Vp8ArnrType fromValue(String text) {
    for (Vp8ArnrType b : Vp8ArnrType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


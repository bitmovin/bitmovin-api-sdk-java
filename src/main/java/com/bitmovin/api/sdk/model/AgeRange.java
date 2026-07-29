package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AgeRange {
  
  /**
   * Character appears to be a child
   */
  CHILD("CHILD"),
  
  /**
   * Character appears to be a teen
   */
  TEEN("TEEN"),
  
  /**
   * Character appears to be in their 20s
   */
  TWENTIES("TWENTIES"),
  
  /**
   * Character appears to be in their 30s
   */
  THIRTIES("THIRTIES"),
  
  /**
   * Character appears to be in their 40s
   */
  FORTIES("FORTIES"),
  
  /**
   * Character appears to be in their 50s
   */
  FIFTIES("FIFTIES"),
  
  /**
   * Character appears to be 60 or older
   */
  SIXTIES_PLUS("SIXTIES_PLUS"),
  
  /**
   * Fallback when age range cannot be determined
   */
  UNKNOWN("UNKNOWN");

  private String value;

  AgeRange(String value) {
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
  public static AgeRange fromValue(String text) {
    for (AgeRange b : AgeRange.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


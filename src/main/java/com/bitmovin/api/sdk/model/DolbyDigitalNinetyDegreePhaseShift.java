package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalNinetyDegreePhaseShift {
  
  /**
   * Enable 90° phase shift
   */
  ENABLED("ENABLED"),
  
  /**
   * Disable 90° phase shift
   */
  DISABLED("DISABLED");

  private String value;

  DolbyDigitalNinetyDegreePhaseShift(String value) {
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
  public static DolbyDigitalNinetyDegreePhaseShift fromValue(String text) {
    for (DolbyDigitalNinetyDegreePhaseShift b : DolbyDigitalNinetyDegreePhaseShift.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


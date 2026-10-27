package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Av1DetailPreservationMode {
  
  /**
   * Detail preservation is applied to the renditions where it is most effective: those whose resolution is at least 25% (in pixels) of the highest AV1 rendition of the encoding
   */
  AUTO("AUTO"),
  
  /**
   * Detail preservation is applied to all renditions
   */
  ON("ON"),
  
  /**
   * Detail preservation is disabled
   */
  OFF("OFF");

  private String value;

  Av1DetailPreservationMode(String value) {
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
  public static Av1DetailPreservationMode fromValue(String text) {
    for (Av1DetailPreservationMode b : Av1DetailPreservationMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


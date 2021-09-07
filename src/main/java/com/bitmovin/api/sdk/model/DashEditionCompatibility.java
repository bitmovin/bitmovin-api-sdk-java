package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DashEditionCompatibility {
  
  /**
   * States the compatibility of the DASH manifest with the standard DASH Edition. When set to V4, the endNumber attribute will be automatically added to the last Media Segment in the Representation of the Period, in order to improve playback compatibility. If the property is not set the endNumber attribute tag will not be added.
   */
  V4("V4");

  private String value;

  DashEditionCompatibility(String value) {
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
  public static DashEditionCompatibility fromValue(String text) {
    for (DashEditionCompatibility b : DashEditionCompatibility.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


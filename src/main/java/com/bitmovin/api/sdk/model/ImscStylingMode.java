package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ImscStylingMode {
  
  /**
   * Keep the styling of the input file.
   */
  PASSTHROUGH("PASSTHROUGH"),
  
  /**
   * Drop the styling of the input file.
   */
  DROP_STYLING("DROP_STYLING");

  private String value;

  ImscStylingMode(String value) {
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
  public static ImscStylingMode fromValue(String text) {
    for (ImscStylingMode b : ImscStylingMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


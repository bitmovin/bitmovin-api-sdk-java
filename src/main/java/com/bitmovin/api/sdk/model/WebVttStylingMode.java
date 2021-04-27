package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WebVttStylingMode {
  
  /**
   * Keep the styling of the input file.
   */
  PASSTHROUGH("PASSTHROUGH"),
  
  /**
   * Drop the styling of the input file.
   */
  DROP_STYLING("DROP_STYLING");

  private String value;

  WebVttStylingMode(String value) {
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
  public static WebVttStylingMode fromValue(String text) {
    for (WebVttStylingMode b : WebVttStylingMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


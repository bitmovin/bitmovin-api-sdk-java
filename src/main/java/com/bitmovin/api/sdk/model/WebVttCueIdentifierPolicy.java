package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WebVttCueIdentifierPolicy {
  
  /**
   * Cue identifiers are added in the resulting webvtt file
   */
  INCLUDE_IDENTIFIERS("INCLUDE_IDENTIFIERS"),
  
  /**
   * Cue identifiers are not added in the resulting webvtt file
   */
  OMIT_IDENTIFIERS("OMIT_IDENTIFIERS");

  private String value;

  WebVttCueIdentifierPolicy(String value) {
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
  public static WebVttCueIdentifierPolicy fromValue(String text) {
    for (WebVttCueIdentifierPolicy b : WebVttCueIdentifierPolicy.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


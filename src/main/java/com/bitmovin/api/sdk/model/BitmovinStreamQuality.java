package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BitmovinStreamQuality {
  
  /**
   * The loading placeholder displayed until the first encoding is done
   */
  NONE("NONE"),
  
  /**
   * A lower quality preview encoding
   */
  PREVIEW("PREVIEW"),
  
  /**
   * The default Per-title encoding
   */
  DEFAULT("DEFAULT");

  private String value;

  BitmovinStreamQuality(String value) {
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
  public static BitmovinStreamQuality fromValue(String text) {
    for (BitmovinStreamQuality b : BitmovinStreamQuality.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


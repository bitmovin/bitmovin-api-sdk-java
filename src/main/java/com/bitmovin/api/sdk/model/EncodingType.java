package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EncodingType
 */
public enum EncodingType {
  
  /**
   * Live Encoding
   */
  LIVE("LIVE"),
  
  /**
   * VOD Encoding
   */
  VOD("VOD"),
  
  /**
   * Type of an Encoding which has not yet been started
   */
  NONE("NONE");

  private String value;

  EncodingType(String value) {
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
  public static EncodingType fromValue(String text) {
    for (EncodingType b : EncodingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


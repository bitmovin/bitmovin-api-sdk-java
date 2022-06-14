package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleEncodingVodJobInputSourceType {
  
  /**
   * Input source type
   */
  URL("URL"),
  
  /**
   * Input source type
   */
  DIRECT_FILE_UPLOAD("DIRECT_FILE_UPLOAD");

  private String value;

  SimpleEncodingVodJobInputSourceType(String value) {
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
  public static SimpleEncodingVodJobInputSourceType fromValue(String text) {
    for (SimpleEncodingVodJobInputSourceType b : SimpleEncodingVodJobInputSourceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


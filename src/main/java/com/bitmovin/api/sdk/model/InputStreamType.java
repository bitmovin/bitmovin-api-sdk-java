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
 * Gets or Sets InputStreamType
 */
public enum InputStreamType {
  
  
  INGEST("INGEST"),
  
  
  CONCATENATION("CONCATENATION"),
  
  
  TRIMMING_TIME_BASED("TRIMMING_TIME_BASED"),
  
  
  TRIMMING_TIME_CODE_TRACK("TRIMMING_TIME_CODE_TRACK"),
  
  
  TRIMMING_H264_PICTURE_TIMING("TRIMMING_H264_PICTURE_TIMING"),
  
  
  AUDIO_MIX("AUDIO_MIX");

  private String value;

  InputStreamType(String value) {
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
  public static InputStreamType fromValue(String text) {
    for (InputStreamType b : InputStreamType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProgramDateTimeSource {
  
  /**
   * Use the current UTC date time
   */
  SYSTEM_CLOCK("SYSTEM_CLOCK"),
  
  /**
   * Use the timecode in the source video. If no embedded timecode is found in the source, the encoding will fail.
   */
  EMBEDDED("EMBEDDED");

  private String value;

  ProgramDateTimeSource(String value) {
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
  public static ProgramDateTimeSource fromValue(String text) {
    for (ProgramDateTimeSource b : ProgramDateTimeSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


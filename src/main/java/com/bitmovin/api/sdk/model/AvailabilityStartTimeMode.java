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
 * Gets or Sets AvailabilityStartTimeMode
 */
public enum AvailabilityStartTimeMode {
  
  /**
   * The availabilityStartTime will be set to the time, the first segment is available
   */
  ON_FIRST_SEGMENT("ON_FIRST_SEGMENT"),
  
  /**
   * The availabilityStartTime will be set to the time, the encoder starts encoding and the stream is ingesting
   */
  ON_STREAM_INGEST("ON_STREAM_INGEST");

  private String value;

  AvailabilityStartTimeMode(String value) {
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
  public static AvailabilityStartTimeMode fromValue(String text) {
    for (AvailabilityStartTimeMode b : AvailabilityStartTimeMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


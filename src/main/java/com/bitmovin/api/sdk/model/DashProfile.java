package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DashProfile {
  
  /**
   * Profile that supports segmented representations/muxings (FMP4, CMAF, WEBM, CHUNKED_TEXT)
   */
  LIVE("LIVE"),
  
  /**
   * Profile that supports progressive representations/muxings (MP4, PROGRESSIVE_WEBM)
   */
  ON_DEMAND("ON_DEMAND");

  private String value;

  DashProfile(String value) {
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
  public static DashProfile fromValue(String text) {
    for (DashProfile b : DashProfile.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


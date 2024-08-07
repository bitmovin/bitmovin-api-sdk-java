package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PcmChannelLayout {
  
  /**
   * Channel layout with single channel
   */
  MONO("MONO"),
  
  /**
   * Channel layout with left and right channel
   */
  STEREO("STEREO");

  private String value;

  PcmChannelLayout(String value) {
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
  public static PcmChannelLayout fromValue(String text) {
    for (PcmChannelLayout b : PcmChannelLayout.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


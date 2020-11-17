package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChannelsAttributeForAudio {
  
  /**
   * Always add CHANNELS attribute
   */
  ALWAYS("ALWAYS"),
  
  /**
   * Add CHANNELS attribute according to the HLS specifications
   */
  STANDARD_CONFORM("STANDARD_CONFORM"),
  
  /**
   * Legacy setting for the CHANNELS attribute
   */
  LEGACY("LEGACY");

  private String value;

  ChannelsAttributeForAudio(String value) {
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
  public static ChannelsAttributeForAudio fromValue(String text) {
    for (ChannelsAttributeForAudio b : ChannelsAttributeForAudio.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


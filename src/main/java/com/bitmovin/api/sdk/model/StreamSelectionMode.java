package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamSelectionMode {
  
  /**
   * Automatically select the first stream that fits the Stream&#39;s codec configuration
   */
  AUTO("AUTO"),
  
  /**
   * Use the stream specified by &#39;position&#39;
   */
  POSITION_ABSOLUTE("POSITION_ABSOLUTE"),
  
  /**
   * Use the stream specified by &#39;position&#39;, counting video streams only
   */
  VIDEO_RELATIVE("VIDEO_RELATIVE"),
  
  /**
   * Use the stream specified by &#39;position&#39;, counting audio streams only
   */
  AUDIO_RELATIVE("AUDIO_RELATIVE"),
  
  /**
   * Use the stream specified by &#39;position&#39;, counting subtitle streams only
   */
  SUBTITLE_RELATIVE("SUBTITLE_RELATIVE");

  private String value;

  StreamSelectionMode(String value) {
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
  public static StreamSelectionMode fromValue(String text) {
    for (StreamSelectionMode b : StreamSelectionMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


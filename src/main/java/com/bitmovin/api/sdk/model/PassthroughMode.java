package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PassthroughMode {
  
  /**
   * Select the embedded captions from the video stream
   */
  VIDEO_STREAM("VIDEO_STREAM"),
  
  /**
   * Select the captions from a separate caption stream
   */
  CAPTION_STREAM("CAPTION_STREAM"),
  
  /**
   * Select the captions from the video stream or from the caption stream. Don&#39;t use this option if the input file contains both caption variants.
   */
  VIDEO_CAPTION_STREAM("VIDEO_CAPTION_STREAM");

  private String value;

  PassthroughMode(String value) {
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
  public static PassthroughMode fromValue(String text) {
    for (PassthroughMode b : PassthroughMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


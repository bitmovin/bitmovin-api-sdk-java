package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleEncodingVodJobInputType {
  
  /**
   * Indicates that the linked input file contains a video stream
   */
  VIDEO("VIDEO"),
  
  /**
   * Indicates that the linked input file contains at least one audio stream
   */
  AUDIO("AUDIO"),
  
  /**
   * Indicates that the linked input file is a subtitle media file
   */
  SUBTITLES("SUBTITLES"),
  
  /**
   * Indicates that the linked input file is a closed caption media file
   */
  CLOSED_CAPTIONS("CLOSED_CAPTIONS");

  private String value;

  SimpleEncodingVodJobInputType(String value) {
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
  public static SimpleEncodingVodJobInputType fromValue(String text) {
    for (SimpleEncodingVodJobInputType b : SimpleEncodingVodJobInputType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


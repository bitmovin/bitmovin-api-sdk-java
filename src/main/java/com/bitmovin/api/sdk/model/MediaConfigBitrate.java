package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MediaConfigBitrate {
  
  /**
   * The supported bitrate
   */
  MCB_160000("160000"),
  
  /**
   * The supported bitrate
   */
  MCB_192000("192000"),
  
  /**
   * The supported bitrate
   */
  MCB_224000("224000"),
  
  /**
   * The supported bitrate
   */
  MCB_256000("256000"),
  
  /**
   * The supported bitrate
   */
  MCB_288000("288000"),
  
  /**
   * The supported bitrate
   */
  MCB_320000("320000"),
  
  /**
   * The supported bitrate
   */
  MCB_384000("384000"),
  
  /**
   * The supported bitrate
   */
  MCB_448000("448000");

  private String value;

  MediaConfigBitrate(String value) {
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
  public static MediaConfigBitrate fromValue(String text) {
    for (MediaConfigBitrate b : MediaConfigBitrate.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


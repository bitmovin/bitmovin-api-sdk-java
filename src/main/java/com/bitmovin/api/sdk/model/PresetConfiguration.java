package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PresetConfiguration {
  
  /**
   * supported for H264
   */
  LIVE_ULTRAHIGH_QUALITY("LIVE_ULTRAHIGH_QUALITY"),
  
  /**
   * supported for H264
   */
  LIVE_VERYHIGH_QUALITY("LIVE_VERYHIGH_QUALITY"),
  
  /**
   * supported for H264, H265
   */
  LIVE_HIGH_QUALITY("LIVE_HIGH_QUALITY"),
  
  /**
   * supported for H264, H265
   */
  LIVE_STANDARD("LIVE_STANDARD"),
  
  /**
   * supported for H264, H265
   */
  LIVE_LOW_LATENCY("LIVE_LOW_LATENCY"),
  
  /**
   * supported for H264
   */
  LIVE_LOWER_LATENCY("LIVE_LOWER_LATENCY"),
  
  /**
   * supported for H264
   */
  LIVE_VERYLOW_LATENCY("LIVE_VERYLOW_LATENCY"),
  
  /**
   * supported for H264, H265, VP9
   */
  VOD_HIGH_QUALITY("VOD_HIGH_QUALITY"),
  
  /**
   * supported for H264
   */
  VOD_QUALITY("VOD_QUALITY"),
  
  /**
   * supported for H264, H265, VP9
   */
  VOD_STANDARD("VOD_STANDARD"),
  
  /**
   * supported for H264, H265, VP9
   */
  VOD_SPEED("VOD_SPEED"),
  
  /**
   * supported for H264, H265
   */
  VOD_HIGH_SPEED("VOD_HIGH_SPEED"),
  
  /**
   * supported for H264, H265
   */
  VOD_VERYHIGH_SPEED("VOD_VERYHIGH_SPEED"),
  
  /**
   * supported for H264, H265
   */
  VOD_EXTRAHIGH_SPEED("VOD_EXTRAHIGH_SPEED"),
  
  /**
   * supported for H264, H265
   */
  VOD_SUPERHIGH_SPEED("VOD_SUPERHIGH_SPEED"),
  
  /**
   * supported for H264, H265
   */
  VOD_ULTRAHIGH_SPEED("VOD_ULTRAHIGH_SPEED");

  private String value;

  PresetConfiguration(String value) {
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
  public static PresetConfiguration fromValue(String text) {
    for (PresetConfiguration b : PresetConfiguration.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


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
 * Type of this channel
 */
public enum AudioMixChannelType {
  
  /**
   * Type of this channel
   */
  CHANNEL_NUMBER("CHANNEL_NUMBER"),
  
  /**
   * Type of this channel
   */
  FRONT_LEFT("FRONT_LEFT"),
  
  /**
   * Type of this channel
   */
  FRONT_RIGHT("FRONT_RIGHT"),
  
  /**
   * Type of this channel
   */
  CENTER("CENTER"),
  
  /**
   * Type of this channel
   */
  LOW_FREQUENCY("LOW_FREQUENCY"),
  
  /**
   * Type of this channel
   */
  BACK_LEFT("BACK_LEFT"),
  
  /**
   * Type of this channel
   */
  BACK_RIGHT("BACK_RIGHT"),
  
  /**
   * Type of this channel
   */
  SURROUND_LEFT("SURROUND_LEFT"),
  
  /**
   * Type of this channel
   */
  SURROUND_RIGHT("SURROUND_RIGHT");

  private String value;

  AudioMixChannelType(String value) {
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
  public static AudioMixChannelType fromValue(String text) {
    for (AudioMixChannelType b : AudioMixChannelType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


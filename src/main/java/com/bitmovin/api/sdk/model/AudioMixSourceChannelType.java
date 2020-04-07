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
 * Type of this source channel
 */
public enum AudioMixSourceChannelType {
  
  /**
   * Type of this source channel
   */
  CHANNEL_NUMBER("CHANNEL_NUMBER"),
  
  /**
   * Type of this source channel
   */
  FRONT_LEFT("FRONT_LEFT"),
  
  /**
   * Type of this source channel
   */
  FRONT_RIGHT("FRONT_RIGHT"),
  
  /**
   * Type of this source channel
   */
  CENTER("CENTER"),
  
  /**
   * Type of this source channel
   */
  LOW_FREQUENCY("LOW_FREQUENCY"),
  
  /**
   * Type of this source channel
   */
  BACK_LEFT("BACK_LEFT"),
  
  /**
   * Type of this source channel
   */
  BACK_RIGHT("BACK_RIGHT"),
  
  /**
   * Type of this source channel
   */
  SURROUND_LEFT("SURROUND_LEFT"),
  
  /**
   * Type of this source channel
   */
  SURROUND_RIGHT("SURROUND_RIGHT");

  private String value;

  AudioMixSourceChannelType(String value) {
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
  public static AudioMixSourceChannelType fromValue(String text) {
    for (AudioMixSourceChannelType b : AudioMixSourceChannelType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


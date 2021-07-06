package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalPlusDynamicRangeCompressionMode {
  
  /**
   * No dynamic range processing preset
   */
  NONE("NONE"),
  
  /**
   * Film standard dynamic range processing preset
   */
  FILM_STANDARD("FILM_STANDARD"),
  
  /**
   * Film light dynamic range processing preset
   */
  FILM_LIGHT("FILM_LIGHT"),
  
  /**
   * Music standard dynamic range processing preset
   */
  MUSIC_STANDARD("MUSIC_STANDARD"),
  
  /**
   * Music light dynamic range processing preset
   */
  MUSIC_LIGHT("MUSIC_LIGHT"),
  
  /**
   * Speech dynamic range processing preset
   */
  SPEECH("SPEECH");

  private String value;

  DolbyDigitalPlusDynamicRangeCompressionMode(String value) {
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
  public static DolbyDigitalPlusDynamicRangeCompressionMode fromValue(String text) {
    for (DolbyDigitalPlusDynamicRangeCompressionMode b : DolbyDigitalPlusDynamicRangeCompressionMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


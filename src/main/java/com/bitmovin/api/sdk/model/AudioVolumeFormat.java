package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AudioVolumeFormat {
  
  /**
   * Audio volume format
   */
  U8("U8"),
  
  /**
   * Audio volume format
   */
  S16("S16"),
  
  /**
   * Audio volume format
   */
  S32("S32"),
  
  /**
   * Audio volume format
   */
  U8P("U8P"),
  
  /**
   * Audio volume format
   */
  S16P("S16P"),
  
  /**
   * Audio volume format
   */
  S32P("S32P"),
  
  /**
   * Audio volume format
   */
  S64("S64"),
  
  /**
   * Audio volume format
   */
  S64P("S64P"),
  
  /**
   * Audio volume format
   */
  FLT("FLT"),
  
  /**
   * Audio volume format
   */
  FLTP("FLTP"),
  
  /**
   * Audio volume format
   */
  NONE("NONE"),
  
  /**
   * Audio volume format
   */
  DBL("DBL"),
  
  /**
   * Audio volume format
   */
  DBLP("DBLP");

  private String value;

  AudioVolumeFormat(String value) {
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
  public static AudioVolumeFormat fromValue(String text) {
    for (AudioVolumeFormat b : AudioVolumeFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


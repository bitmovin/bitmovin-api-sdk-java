package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalPlusLoudnessControlMode {
  
  /**
   * The provided &#39;dialnorm&#39; value will be set in DD/DD+ bit-stream metadata. The provided value is assumed to be a correct measure of content loudness. No additional loudness measurement or loudness correction will take place.
   */
  PASSTHROUGH("PASSTHROUGH"),
  
  /**
   * The loudness is corrected with the values provided
   */
  CORRECTION("CORRECTION");

  private String value;

  DolbyDigitalPlusLoudnessControlMode(String value) {
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
  public static DolbyDigitalPlusLoudnessControlMode fromValue(String text) {
    for (DolbyDigitalPlusLoudnessControlMode b : DolbyDigitalPlusLoudnessControlMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


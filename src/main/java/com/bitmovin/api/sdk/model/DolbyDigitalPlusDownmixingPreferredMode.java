package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalPlusDownmixingPreferredMode {
  
  /**
   * Lo/Ro stereo downmixing mode
   */
  LO_RO("LO_RO"),
  
  /**
   * Lt/Rt surround downmixing mode
   */
  LT_RT("LT_RT"),
  
  /**
   * Dolby Pro Logic 2 downmixing mode
   */
  PRO_LOGIC_II("PRO_LOGIC_II");

  private String value;

  DolbyDigitalPlusDownmixingPreferredMode(String value) {
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
  public static DolbyDigitalPlusDownmixingPreferredMode fromValue(String text) {
    for (DolbyDigitalPlusDownmixingPreferredMode b : DolbyDigitalPlusDownmixingPreferredMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


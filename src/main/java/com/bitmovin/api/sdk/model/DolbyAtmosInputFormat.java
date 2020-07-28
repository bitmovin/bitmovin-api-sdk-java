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
 * Gets or Sets DolbyAtmosInputFormat
 */
public enum DolbyAtmosInputFormat {
  
  /**
   * Dolby Atmos input format is DAMF (Dolby Atmos Master Format), usually a .atmos file. The &#39;metadata&#39; and &#39;audio&#39; files referenced within this file need to reside in the same directory and will be resolved automatically.
   */
  DAMF("DAMF"),
  
  /**
   * Dolby Atmos input format is ADM (Audio Definition Model), usually a .wav file
   */
  ADM("ADM");

  private String value;

  DolbyAtmosInputFormat(String value) {
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
  public static DolbyAtmosInputFormat fromValue(String text) {
    for (DolbyAtmosInputFormat b : DolbyAtmosInputFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyVisionTrackSampleEntryName {
  
  /**
   * Sets the Dolby Vision track&#39;s sample entry name to &#x60;dvhe&#x60;. This is the default value
   */
  DVHE("DVHE"),
  
  /**
   * Sets the Dolby Vision track&#39;s sample entry name to &#x60;dvh1&#x60;
   */
  DVH1("DVH1");

  private String value;

  DolbyVisionTrackSampleEntryName(String value) {
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
  public static DolbyVisionTrackSampleEntryName fromValue(String text) {
    for (DolbyVisionTrackSampleEntryName b : DolbyVisionTrackSampleEntryName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


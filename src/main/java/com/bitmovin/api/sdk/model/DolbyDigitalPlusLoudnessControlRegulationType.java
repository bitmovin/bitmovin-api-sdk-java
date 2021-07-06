package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalPlusLoudnessControlRegulationType {
  
  /**
   * EBU 128 loudness control regulation type
   */
  EBU_R128("EBU_R128"),
  
  /**
   * ATSC A85 loudness control regulation type
   */
  ATSC_A85_FIXED("ATSC_A85_FIXED"),
  
  /**
   * ATSC A85 loudness control regulation type
   */
  ATSC_A85_AGILE("ATSC_A85_AGILE"),
  
  /**
   * Manual loudness control regulation type
   */
  MANUAL("MANUAL");

  private String value;

  DolbyDigitalPlusLoudnessControlRegulationType(String value) {
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
  public static DolbyDigitalPlusLoudnessControlRegulationType fromValue(String text) {
    for (DolbyDigitalPlusLoudnessControlRegulationType b : DolbyDigitalPlusLoudnessControlRegulationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalEvolutionFrameworkControl {
  
  /**
   * Enable Dolby Evolution Framework control feature
   */
  ENABLED("ENABLED"),
  
  /**
   * Disable Dolby Evolution Framework control feature
   */
  DISABLED("DISABLED");

  private String value;

  DolbyDigitalEvolutionFrameworkControl(String value) {
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
  public static DolbyDigitalEvolutionFrameworkControl fromValue(String text) {
    for (DolbyDigitalEvolutionFrameworkControl b : DolbyDigitalEvolutionFrameworkControl.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


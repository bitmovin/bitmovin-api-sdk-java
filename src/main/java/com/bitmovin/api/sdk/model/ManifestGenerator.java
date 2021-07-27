package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ManifestGenerator {
  
  /**
   * Legacy manifest generator.
   */
  LEGACY("LEGACY"),
  
  /**
   * Improved manifest generator which covers all manifest features available in our API.
   */
  V2("V2"),
  
  /**
   * DEPRECATED - Please use V2 instead, this option will be removed soon.
   */
  V2_BETA("V2_BETA");

  private String value;

  ManifestGenerator(String value) {
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
  public static ManifestGenerator fromValue(String text) {
    for (ManifestGenerator b : ManifestGenerator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


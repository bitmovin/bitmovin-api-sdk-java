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
 * Gets or Sets DolbyVisionMetadataSource
 */
public enum DolbyVisionMetadataSource {
  
  /**
   * Dolby Vision Metadata is provided with an external XML file specified by the inputStreamId attribute.
   */
  INPUT_STREAM("INPUT_STREAM"),
  
  /**
   * Dolby Vision Metadata is embedded in the input video.
   */
  EMBEDDED("EMBEDDED");

  private String value;

  DolbyVisionMetadataSource(String value) {
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
  public static DolbyVisionMetadataSource fromValue(String text) {
    for (DolbyVisionMetadataSource b : DolbyVisionMetadataSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


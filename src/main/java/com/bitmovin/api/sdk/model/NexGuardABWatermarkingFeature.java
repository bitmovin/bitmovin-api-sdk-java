package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NexGuardABWatermarkingFeature {
  
  /**
   * For video streams with NexGuard FileMarker OTT Watermarking
   */
  OTT("OTT"),
  
  /**
   * For audio streams that have been duplicated for NexGuard A/B Watermarking
   */
  DUPLICATED("DUPLICATED");

  private String value;

  NexGuardABWatermarkingFeature(String value) {
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
  public static NexGuardABWatermarkingFeature fromValue(String text) {
    for (NexGuardABWatermarkingFeature b : NexGuardABWatermarkingFeature.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


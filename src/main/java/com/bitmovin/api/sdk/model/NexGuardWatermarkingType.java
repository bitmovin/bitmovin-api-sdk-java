package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NexGuardWatermarkingType {
  
  /**
   * A/B watermarking (for video streams only)
   */
  OTT("OTT"),
  
  /**
   * Stream duplication to match A/B video streams in CDN delivery (for audio streams only)
   */
  DUPLICATED("DUPLICATED");

  private String value;

  NexGuardWatermarkingType(String value) {
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
  public static NexGuardWatermarkingType fromValue(String text) {
    for (NexGuardWatermarkingType b : NexGuardWatermarkingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


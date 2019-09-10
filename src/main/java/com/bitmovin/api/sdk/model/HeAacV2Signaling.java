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
 * Gets or Sets HeAacV2Signaling
 */
public enum HeAacV2Signaling {
  
  /**
   * Choose signaling implicitly (explicit hierarchical by default, implicit if global header is disabled).
   */
  DEFAULT("DEFAULT"),
  
  /**
   * Implicit backwards compatible signaling.
   */
  IMPLICIT("IMPLICIT"),
  
  /**
   * Explicit SBR, implicit PS signaling.
   */
  EXPLICIT_SBR("EXPLICIT_SBR"),
  
  /**
   * Explicit hierarchical signaling.
   */
  EXPLICIT_HIERACHICAL("EXPLICIT_HIERACHICAL");

  private String value;

  HeAacV2Signaling(String value) {
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
  public static HeAacV2Signaling fromValue(String text) {
    for (HeAacV2Signaling b : HeAacV2Signaling.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


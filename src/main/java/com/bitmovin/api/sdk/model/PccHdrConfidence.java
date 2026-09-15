package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PccHdrConfidence {
  
  /**
   * Which instrument established the picture, where anything did.
   */
  EVIDENCE("evidence"),
  
  /**
   * Which instrument established the picture, where anything did.
   */
  CLAIM("claim"),
  
  /**
   * Which instrument established the picture, where anything did.
   */
  UNESTABLISHED("unestablished");

  private String value;

  PccHdrConfidence(String value) {
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
  public static PccHdrConfidence fromValue(String text) {
    for (PccHdrConfidence b : PccHdrConfidence.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


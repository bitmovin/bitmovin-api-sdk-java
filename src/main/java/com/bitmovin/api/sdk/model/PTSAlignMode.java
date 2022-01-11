package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PTSAlignMode {
  
  /**
   * Align the initial PTS to zero using negative CTS offsets. This is achieved by using &#x60;trun&#x60; version 1 boxes in the mp4 fragments.
   */
  ALIGN_ZERO_NEGATIVE_CTO("ALIGN_ZERO_NEGATIVE_CTO");

  private String value;

  PTSAlignMode(String value) {
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
  public static PTSAlignMode fromValue(String text) {
    for (PTSAlignMode b : PTSAlignMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PccHdrOutcome {
  
  
  HDR("hdr"),
  
  
  SDR("sdr"),
  
  
  CLAIMED("claimed"),
  
  
  DENIED("denied"),
  
  
  UNESTABLISHED("unestablished"),
  
  
  UNREPORTED("unreported");

  private String value;

  PccHdrOutcome(String value) {
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
  public static PccHdrOutcome fromValue(String text) {
    for (PccHdrOutcome b : PccHdrOutcome.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


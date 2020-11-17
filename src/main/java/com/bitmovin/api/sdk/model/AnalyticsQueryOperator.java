package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AnalyticsQueryOperator {
  
  
  IN("IN"),
  
  
  EQ("EQ"),
  
  
  NE("NE"),
  
  
  LT("LT"),
  
  
  LTE("LTE"),
  
  
  GT("GT"),
  
  
  GTE("GTE"),
  
  
  CONTAINS("CONTAINS"),
  
  
  NOTCONTAINS("NOTCONTAINS");

  private String value;

  AnalyticsQueryOperator(String value) {
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
  public static AnalyticsQueryOperator fromValue(String text) {
    for (AnalyticsQueryOperator b : AnalyticsQueryOperator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


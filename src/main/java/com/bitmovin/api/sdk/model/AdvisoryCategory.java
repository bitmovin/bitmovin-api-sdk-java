package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AdvisoryCategory {
  
  /**
   * Tobacco imagery such as smoking, cigarettes, cigars, pipes, or tobacco products
   */
  TOBACCO("TOBACCO"),
  
  /**
   * Vaping imagery such as e-cigarettes, vape pens, or their use
   */
  VAPE("VAPE");

  private String value;

  AdvisoryCategory(String value) {
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
  public static AdvisoryCategory fromValue(String text) {
    for (AdvisoryCategory b : AdvisoryCategory.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


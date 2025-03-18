package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OciCloudRegion {
  
  /**
   * Frankfurt, Germany
   */
  EU_FRANKFURT_1("EU_FRANKFURT_1"),
  
  /**
   * Ashburn, Virginia, USA
   */
  US_ASHBURN_1("US_ASHBURN_1");

  private String value;

  OciCloudRegion(String value) {
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
  public static OciCloudRegion fromValue(String text) {
    for (OciCloudRegion b : OciCloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


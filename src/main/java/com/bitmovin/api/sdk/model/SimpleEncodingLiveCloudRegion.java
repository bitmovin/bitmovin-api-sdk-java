package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleEncodingLiveCloudRegion {
  
  /**
   * The Live Encoding will be executed in the North America region
   */
  NORTH_AMERICA("NORTH_AMERICA"),
  
  /**
   * The Live Encoding will be executed in the South America region
   */
  SOUTH_AMERICA("SOUTH_AMERICA"),
  
  /**
   * The Live Encoding will be executed in the Europe region
   */
  EUROPE("EUROPE"),
  
  /**
   * The Live Encoding will be executed in the Africa region
   */
  AFRICA("AFRICA"),
  
  /**
   * The Live Encoding will be executed in the Asia region
   */
  ASIA("ASIA"),
  
  /**
   * The Live Encoding will be executed in the Australia region
   */
  AUSTRALIA("AUSTRALIA");

  private String value;

  SimpleEncodingLiveCloudRegion(String value) {
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
  public static SimpleEncodingLiveCloudRegion fromValue(String text) {
    for (SimpleEncodingLiveCloudRegion b : SimpleEncodingLiveCloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


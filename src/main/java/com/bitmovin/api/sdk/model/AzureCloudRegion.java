package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AzureCloudRegion {
  
  /**
   * Hong Kong
   */
  ASIA_EAST("ASIA_EAST"),
  
  /**
   * Singapore
   */
  ASIA_SOUTHEAST("ASIA_SOUTHEAST"),
  
  /**
   * New South Wales
   */
  AUSTRALIA_EAST("AUSTRALIA_EAST"),
  
  /**
   * Victoria
   */
  AUSTRALIA_SOUTHEAST("AUSTRALIA_SOUTHEAST"),
  
  /**
   * São Paulo
   */
  BRAZIL_SOUTH("BRAZIL_SOUTH"),
  
  /**
   * Toronto
   */
  CANADA_CENTRAL("CANADA_CENTRAL"),
  
  /**
   * Ireland
   */
  EUROPE_NORTH("EUROPE_NORTH"),
  
  /**
   * Netherlands
   */
  EUROPE_WEST("EUROPE_WEST"),
  
  /**
   * Paris
   */
  FRANCE_CENTRAL("FRANCE_CENTRAL"),
  
  /**
   * Frankfurt
   */
  GERMANY_WESTCENTRAL("GERMANY_WESTCENTRAL"),
  
  /**
   * Pune
   */
  INDIA_CENTRAL("INDIA_CENTRAL"),
  
  /**
   * Chennai
   */
  INDIA_SOUTH("INDIA_SOUTH"),
  
  /**
   * Tokyo, Saitama
   */
  JAPAN_EAST("JAPAN_EAST"),
  
  /**
   * Osaka
   */
  JAPAN_WEST("JAPAN_WEST"),
  
  /**
   * Seoul
   */
  KOREA_CENTRAL("KOREA_CENTRAL"),
  
  /**
   * Dubai
   */
  UAE_NORTH("UAE_NORTH"),
  
  /**
   * Iowa
   */
  US_CENTRAL("US_CENTRAL"),
  
  /**
   * Virginia
   */
  US_EAST("US_EAST"),
  
  /**
   * Virginia
   */
  US_EAST2("US_EAST2"),
  
  /**
   * California
   */
  US_WEST("US_WEST"),
  
  /**
   * Washington
   */
  US_WEST2("US_WEST2"),
  
  /**
   * Texas
   */
  US_SOUTH_CENTRAL("US_SOUTH_CENTRAL");

  private String value;

  AzureCloudRegion(String value) {
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
  public static AzureCloudRegion fromValue(String text) {
    for (AzureCloudRegion b : AzureCloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


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
   * California
   */
  US_WEST("US_WEST"),
  
  /**
   * Washington
   */
  US_WEST2("US_WEST2"),
  
  /**
   * Iowa
   */
  US_CENTRAL("US_CENTRAL"),
  
  
  US_EAST("US_EAST"),
  
  /**
   * Virginia
   */
  US_EAST2("US_EAST2"),
  
  /**
   * Illinois
   */
  US_NORTH_CENTRAL("US_NORTH_CENTRAL"),
  
  /**
   * Texas
   */
  US_SOUTH_CENTRAL("US_SOUTH_CENTRAL"),
  
  /**
   * Wyoming
   */
  US_WEST_CENTRAL("US_WEST_CENTRAL"),
  
  /**
   * Toronto
   */
  CANADA_CENTRAL("CANADA_CENTRAL"),
  
  /**
   * Quebec City
   */
  CANADA_EAST("CANADA_EAST"),
  
  /**
   * São Paulo State
   */
  BRAZIL_SOUTH("BRAZIL_SOUTH"),
  
  /**
   * Ireland
   */
  EUROPE_NORTH("EUROPE_NORTH"),
  
  /**
   * Netherlands
   */
  EUROPE_WEST("EUROPE_WEST"),
  
  /**
   * London
   */
  UK_SOUTH("UK_SOUTH"),
  
  /**
   * Cardiff
   */
  UK_WEST("UK_WEST"),
  
  /**
   * Hong Kong
   */
  ASIA_EAST("ASIA_EAST"),
  
  /**
   * Singapore
   */
  ASIA_SOUTHEAST("ASIA_SOUTHEAST"),
  
  /**
   * Tokyo, Saitama
   */
  JAPAN_EAST("JAPAN_EAST"),
  
  /**
   * Osaka
   */
  JAPAN_WEST("JAPAN_WEST"),
  
  /**
   * New South Wales
   */
  AUSTRALIA_EAST("AUSTRALIA_EAST"),
  
  /**
   * Victoria
   */
  AUSTRALIA_SOUTHEAST("AUSTRALIA_SOUTHEAST"),
  
  /**
   * Pune
   */
  INDIA_CENTRAL("INDIA_CENTRAL"),
  
  /**
   * Chennai
   */
  INDIA_SOUTH("INDIA_SOUTH"),
  
  /**
   * Mumbai
   */
  INDIA_WEST("INDIA_WEST"),
  
  /**
   * Seoul
   */
  KOREA_CENTRAL("KOREA_CENTRAL"),
  
  /**
   * Busan
   */
  KOREA_SOUTH("KOREA_SOUTH"),
  
  /**
   * Beijing
   */
  CHINA_NORTH("CHINA_NORTH"),
  
  /**
   * Shanghai
   */
  CHINA_EAST("CHINA_EAST"),
  
  /**
   * Frankfurt
   */
  GERMANY_CENTRAL("GERMANY_CENTRAL"),
  
  /**
   * Magdeburg
   */
  GERMANY_NORTHEAST("GERMANY_NORTHEAST"),
  
  /**
   * Virginia
   */
  GOV_US_VIRGINIA("GOV_US_VIRGINIA"),
  
  /**
   * Iowa
   */
  GOV_US_IOWA("GOV_US_IOWA");

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


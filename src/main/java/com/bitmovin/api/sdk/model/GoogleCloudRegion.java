package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets GoogleCloudRegion
 */
public enum GoogleCloudRegion {
  
  /**
   * Council Bluffs, Iowa, USA
   */
  US_CENTRAL_1("US_CENTRAL_1"),
  
  /**
   * Moncks Corner, South Carolina, USA
   */
  US_EAST_1("US_EAST_1"),
  
  /**
   * Changhua County, Taiwan
   */
  ASIA_EAST_1("ASIA_EAST_1"),
  
  /**
   * St. Ghislain, Belgium
   */
  EUROPE_WEST_1("EUROPE_WEST_1"),
  
  /**
   * The Dalles, Oregon, USA
   */
  US_WEST_1("US_WEST_1"),
  
  /**
   * Hong Kong
   */
  ASIA_EAST_2("ASIA_EAST_2"),
  
  /**
   * Tokyo, Japan
   */
  ASIA_NORTHEAST_1("ASIA_NORTHEAST_1"),
  
  /**
   * Mumbai, India
   */
  ASIA_SOUTH_1("ASIA_SOUTH_1"),
  
  /**
   * Jurong West, Singapore
   */
  ASIA_SOUTHEAST_1("ASIA_SOUTHEAST_1"),
  
  /**
   * Sydney, Australia
   */
  AUSTRALIA_SOUTHEAST_1("AUSTRALIA_SOUTHEAST_1"),
  
  /**
   * Hamina, Finland
   */
  EUROPE_NORTH_1("EUROPE_NORTH_1"),
  
  /**
   * London, England, UK
   */
  EUROPE_WEST_2("EUROPE_WEST_2"),
  
  /**
   * Eemshaven, Netherlands
   */
  EUROPE_WEST_4("EUROPE_WEST_4"),
  
  /**
   * Montréal, Québec, Canada
   */
  NORTHAMERICA_NORTHEAST_1("NORTHAMERICA_NORTHEAST_1"),
  
  /**
   * São Paulo, Brazil
   */
  SOUTHAMERICA_EAST_1("SOUTHAMERICA_EAST_1"),
  
  /**
   * Ashburn, Northern Virginia, USA
   */
  US_EAST_4("US_EAST_4"),
  
  /**
   * Los Angeles, California, USA
   */
  US_WEST_2("US_WEST_2");

  private String value;

  GoogleCloudRegion(String value) {
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
  public static GoogleCloudRegion fromValue(String text) {
    for (GoogleCloudRegion b : GoogleCloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


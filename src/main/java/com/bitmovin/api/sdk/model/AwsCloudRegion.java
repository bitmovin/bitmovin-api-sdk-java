package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AwsCloudRegion {
  
  /**
   * US East (N. Virginia)
   */
  US_EAST_1("US_EAST_1"),
  
  /**
   * US East (Ohio)
   */
  US_EAST_2("US_EAST_2"),
  
  /**
   * US West (N. California)
   */
  US_WEST_1("US_WEST_1"),
  
  /**
   * US West (Oregon)
   */
  US_WEST_2("US_WEST_2"),
  
  /**
   * Europe (Ireland)
   */
  EU_WEST_1("EU_WEST_1"),
  
  /**
   * Europe (Frankfurt)
   */
  EU_CENTRAL_1("EU_CENTRAL_1"),
  
  /**
   * Asia Pacific (Singapore)
   */
  AP_SOUTHEAST_1("AP_SOUTHEAST_1"),
  
  /**
   * Asia Pacific (Sydney)
   */
  AP_SOUTHEAST_2("AP_SOUTHEAST_2"),
  
  /**
   * Asia Pacific (Tokyo)
   */
  AP_NORTHEAST_1("AP_NORTHEAST_1"),
  
  /**
   * Asia Pacific (Seoul)
   */
  AP_NORTHEAST_2("AP_NORTHEAST_2"),
  
  /**
   * Asia Pacific (Mumbai)
   */
  AP_SOUTH_1("AP_SOUTH_1"),
  
  /**
   * South America (São Paulo)
   */
  SA_EAST_1("SA_EAST_1"),
  
  /**
   * Europe (London)
   */
  EU_WEST_2("EU_WEST_2"),
  
  /**
   * Europe (Paris)
   */
  EU_WEST_3("EU_WEST_3"),
  
  /**
   * Canada (Central)
   */
  CA_CENTRAL_1("CA_CENTRAL_1"),
  
  /**
   * Europe (Stockholm)
   */
  EU_NORTH_1("EU_NORTH_1");

  private String value;

  AwsCloudRegion(String value) {
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
  public static AwsCloudRegion fromValue(String text) {
    for (AwsCloudRegion b : AwsCloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


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
   * Washington
   */
  US_WEST2("AUSTRALIA_EAST"),
  
  /**
   * Virginia
   */
  US_EAST("AUSTRALIA_SOUTHEAST"),
  
  /**
   * Ireland
   */
  EUROPE_NORTH("EUROPE_NORTH"),
  
  /**
   * Netherlands
   */
  EUROPE_WEST("EUROPE_WEST"),
  
  /**
   * Frankfurt
   */
  GERMANY_WESTCENTRAL("GERMANY_WESTCENTRAL"),
  
  /**
   * New South Wales
   */
  AUSTRALIA_EAST("UAE_NORTH"),
  
  /**
   * Victoria
   */
  AUSTRALIA_SOUTHEAST("US_EAST"),
  
  /**
   * Dubai
   */
  UAE_NORTH("US_WEST2");

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


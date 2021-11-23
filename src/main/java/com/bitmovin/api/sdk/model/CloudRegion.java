package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CloudRegion {
  
  /**
   * AWS US East (N. Virginia)
   */
  AWS_US_EAST_1("AWS_US_EAST_1"),
  
  /**
   * AWS US East (Ohio)
   */
  AWS_US_EAST_2("AWS_US_EAST_2"),
  
  /**
   * AWS US West (N. California)
   */
  AWS_US_WEST_1("AWS_US_WEST_1"),
  
  /**
   * AWS US West (Oregon)
   */
  AWS_US_WEST_2("AWS_US_WEST_2"),
  
  /**
   * AWS EU (Ireland)
   */
  AWS_EU_WEST_1("AWS_EU_WEST_1"),
  
  /**
   * AWS EU (Frankfurt)
   */
  AWS_EU_CENTRAL_1("AWS_EU_CENTRAL_1"),
  
  /**
   * AWS Asia Pacific (Singapore)
   */
  AWS_AP_SOUTHEAST_1("AWS_AP_SOUTHEAST_1"),
  
  /**
   * AWS Asia Pacific (Sydney)
   */
  AWS_AP_SOUTHEAST_2("AWS_AP_SOUTHEAST_2"),
  
  /**
   * AWS Asia Pacific (Tokyo)
   */
  AWS_AP_NORTHEAST_1("AWS_AP_NORTHEAST_1"),
  
  /**
   * AWS Asia Pacific (Seoul)
   */
  AWS_AP_NORTHEAST_2("AWS_AP_NORTHEAST_2"),
  
  /**
   * AWS Asia Pacific (Mumbai)
   */
  AWS_AP_SOUTH_1("AWS_AP_SOUTH_1"),
  
  /**
   * AWS South America (São Paulo)
   */
  AWS_SA_EAST_1("AWS_SA_EAST_1"),
  
  /**
   * AWS EU (London)
   */
  AWS_EU_WEST_2("AWS_EU_WEST_2"),
  
  /**
   * AWS EU (Paris)
   */
  AWS_EU_WEST_3("AWS_EU_WEST_3"),
  
  /**
   * AWS Canada (Central)
   */
  AWS_CA_CENTRAL_1("AWS_CA_CENTRAL_1"),
  
  /**
   * Google Council Bluffs, Iowa, USA
   */
  GOOGLE_US_CENTRAL_1("GOOGLE_US_CENTRAL_1"),
  
  /**
   * Google Moncks Corner, South Carolina, USA
   */
  GOOGLE_US_EAST_1("GOOGLE_US_EAST_1"),
  
  /**
   * Google Changhua County, Taiwan
   */
  GOOGLE_ASIA_EAST_1("GOOGLE_ASIA_EAST_1"),
  
  /**
   * Google St. Ghislain, Belgium
   */
  GOOGLE_EUROPE_WEST_1("GOOGLE_EUROPE_WEST_1"),
  
  /**
   * Google The Dalles, Oregon, USA
   */
  GOOGLE_US_WEST_1("GOOGLE_US_WEST_1"),
  
  /**
   * Google Hong Kong
   */
  GOOGLE_ASIA_EAST_2("GOOGLE_ASIA_EAST_2"),
  
  /**
   * Google Tokyo, Japan
   */
  GOOGLE_ASIA_NORTHEAST_1("GOOGLE_ASIA_NORTHEAST_1"),
  
  /**
   * Google Mumbai, India
   */
  GOOGLE_ASIA_SOUTH_1("GOOGLE_ASIA_SOUTH_1"),
  
  /**
   * Google Jurong West, Singapore
   */
  GOOGLE_ASIA_SOUTHEAST_1("GOOGLE_ASIA_SOUTHEAST_1"),
  
  /**
   * Google Sydney, Australia
   */
  GOOGLE_AUSTRALIA_SOUTHEAST_1("GOOGLE_AUSTRALIA_SOUTHEAST_1"),
  
  /**
   * Google Hamina, Finland
   */
  GOOGLE_EUROPE_NORTH_1("GOOGLE_EUROPE_NORTH_1"),
  
  /**
   * Google London, England, UK
   */
  GOOGLE_EUROPE_WEST_2("GOOGLE_EUROPE_WEST_2"),
  
  /**
   * Google Frankfurt, Germany
   */
  GOOGLE_EUROPE_WEST_3("GOOGLE_EUROPE_WEST_3"),
  
  /**
   * Google Eemshaven, Netherlands
   */
  GOOGLE_EUROPE_WEST_4("GOOGLE_EUROPE_WEST_4"),
  
  /**
   * Google Montréal, Québec, Canada
   */
  GOOGLE_NORTHAMERICA_NORTHEAST_1("GOOGLE_NORTHAMERICA_NORTHEAST_1"),
  
  /**
   * Google São Paulo, Brazil
   */
  GOOGLE_SOUTHAMERICA_EAST_1("GOOGLE_SOUTHAMERICA_EAST_1"),
  
  /**
   * Google Ashburn, Northern Virginia, USA
   */
  GOOGLE_US_EAST_4("GOOGLE_US_EAST_4"),
  
  /**
   * Google Los Angeles, California, USA
   */
  GOOGLE_US_WEST_2("GOOGLE_US_WEST_2"),
  
  /**
   * Azure Netherlands
   */
  AZURE_EUROPE_WEST("AZURE_EUROPE_WEST"),
  
  /**
   * Azure Ireland
   */
  AZURE_EUROPE_NORTH("AZURE_EUROPE_NORTH"),
  
  /**
   * Azure Washington, USA
   */
  AZURE_US_WEST2("AZURE_US_WEST2"),
  
  /**
   * Azure Virginia, USA
   */
  AZURE_US_EAST("AZURE_US_EAST"),
  
  /**
   * Azure Victoria, Australia
   */
  AZURE_AUSTRALIA_SOUTHEAST("AZURE_AUSTRALIA_SOUTHEAST"),
  
  /**
   * Azure New South Wales, Australia
   */
  AZURE_AUSTRALIA_EAST("AZURE_AUSTRALIA_EAST"),
  
  /**
   * Azure Frankfurt, Germany
   */
  AZURE_GERMANY_WESTCENTRAL("AZURE_GERMANY_WESTCENTRAL"),
  
  /**
   * Azure Dubai, United Arab Emirates
   */
  AZURE_UAE_NORTH("AZURE_UAE_NORTH"),
  
  
  NORTH_AMERICA("NORTH_AMERICA"),
  
  
  SOUTH_AMERICA("SOUTH_AMERICA"),
  
  
  EUROPE("EUROPE"),
  
  
  AFRICA("AFRICA"),
  
  
  ASIA("ASIA"),
  
  
  AUSTRALIA("AUSTRALIA"),
  
  
  AWS("AWS"),
  
  
  GOOGLE("GOOGLE"),
  
  
  EXTERNAL("EXTERNAL"),
  
  
  AUTO("AUTO");

  private String value;

  CloudRegion(String value) {
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
  public static CloudRegion fromValue(String text) {
    for (CloudRegion b : CloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


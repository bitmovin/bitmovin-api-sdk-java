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
   * AWS Europe (Ireland)
   */
  AWS_EU_WEST_1("AWS_EU_WEST_1"),
  
  /**
   * AWS Europe (Frankfurt)
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
   * AWS Europe (London)
   */
  AWS_EU_WEST_2("AWS_EU_WEST_2"),
  
  /**
   * AWS Europe (Paris)
   */
  AWS_EU_WEST_3("AWS_EU_WEST_3"),
  
  /**
   * AWS Canada (Central)
   */
  AWS_CA_CENTRAL_1("AWS_CA_CENTRAL_1"),
  
  /**
   * AWS Europe (Stockholm)
   */
  AWS_EU_NORTH_1("AWS_EU_NORTH_1"),
  
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
   * Azure East Asia, Hong Kong
   */
  AZURE_ASIA_EAST("AZURE_ASIA_EAST"),
  
  /**
   * Azure Southeast Asia, Singapore
   */
  AZURE_ASIA_SOUTHEAST("AZURE_ASIA_SOUTHEAST"),
  
  /**
   * Azure Australia East, Canberra
   */
  AZURE_AUSTRALIA_EAST("AZURE_AUSTRALIA_EAST"),
  
  /**
   * Azure Australia Southeast, Victoria
   */
  AZURE_AUSTRALIA_SOUTHEAST("AZURE_AUSTRALIA_SOUTHEAST"),
  
  /**
   * Azure Brazil South, São Paulo
   */
  AZURE_BRAZIL_SOUTH("AZURE_BRAZIL_SOUTH"),
  
  /**
   * Azure Canada Central, Toronto
   */
  AZURE_CANADA_CENTRAL("AZURE_CANADA_CENTRAL"),
  
  /**
   * Azure North Europe, Ireland
   */
  AZURE_EUROPE_NORTH("AZURE_EUROPE_NORTH"),
  
  /**
   * Azure West Europe, Netherlands
   */
  AZURE_EUROPE_WEST("AZURE_EUROPE_WEST"),
  
  /**
   * Azure France Central, Paris
   */
  AZURE_FRANCE_CENTRAL("AZURE_FRANCE_CENTRAL"),
  
  /**
   * Azure Germany West Central, Frankfurt
   */
  AZURE_GERMANY_WESTCENTRAL("AZURE_GERMANY_WESTCENTRAL"),
  
  /**
   * Azure Central India, Pune
   */
  AZURE_INDIA_CENTRAL("AZURE_INDIA_CENTRAL"),
  
  /**
   * Azure South India, Chennai
   */
  AZURE_INDIA_SOUTH("AZURE_INDIA_SOUTH"),
  
  /**
   * Azure Japan East, Tokyo, Saitama
   */
  AZURE_JAPAN_EAST("AZURE_JAPAN_EAST"),
  
  /**
   * Azure Japan West, Osaka
   */
  AZURE_JAPAN_WEST("AZURE_JAPAN_WEST"),
  
  /**
   * Azure Korea Central, Seoul
   */
  AZURE_KOREA_CENTRAL("AZURE_KOREA_CENTRAL"),
  
  /**
   * Azure UAE North, Dubai, United Arab Emirates
   */
  AZURE_UAE_NORTH("AZURE_UAE_NORTH"),
  
  /**
   * Azure Central US, Iowa, USA
   */
  AZURE_US_CENTRAL("AZURE_US_CENTRAL"),
  
  /**
   * Azure East US, Virginia, USA
   */
  AZURE_US_EAST("AZURE_US_EAST"),
  
  /**
   * Azure East US 2, Virginia, USA
   */
  AZURE_US_EAST2("AZURE_US_EAST2"),
  
  /**
   * Azure West US, California, USA
   */
  AZURE_US_WEST("AZURE_US_WEST"),
  
  /**
   * Azure West US 2, Washington, USA
   */
  AZURE_US_WEST2("AZURE_US_WEST2"),
  
  /**
   * Azure South Central US, Texas, USA
   */
  AZURE_US_SOUTH_CENTRAL("AZURE_US_SOUTH_CENTRAL"),
  
  
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


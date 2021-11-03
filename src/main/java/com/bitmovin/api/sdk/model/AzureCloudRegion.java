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
  
  /**
   * Virginia
   */
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
   * Rio de Janeiro - Reserved for Brazil South customers requiring scenario-based in-country disaster recovery
   */
  BRAZIL_SOUTHEAST("BRAZIL_SOUTHEAST"),
  
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
   * Paris
   */
  FRANCE_CENTRAL("FRANCE_CENTRAL"),
  
  /**
   * Marseille - Reserved for France Central customers requiring in-country disaster recovery
   */
  FRANCE_SOUTH("FRANCE_SOUTH"),
  
  /**
   * Zürich
   */
  SWITZERLAND_NORTH("SWITZERLAND_NORTH"),
  
  /**
   * Geneva - Reserved for Switzerland North customers requiring in-country disaster recovery
   */
  SWITZERLAND_WEST("SWITZERLAND_WEST"),
  
  /**
   * Berlin - Reserved for Germany West Central customers requiring in-country disaster recovery
   */
  GERMANY_NORTH("GERMANY_NORTH"),
  
  /**
   * Frankfurt
   */
  GERMANY_WESTCENTRAL("GERMANY_WESTCENTRAL"),
  
  /**
   * Stavanger - Reserved for Norway East customers requiring in-country diaster recovery
   */
  NORWAY_WEST("NORWAY_WEST"),
  
  /**
   * Oslo
   */
  NORWAY_EAST("NORWAY_EAST"),
  
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
   * Canberra
   */
  AUSTRALIA_CENTRAL("AUSTRALIA_CENTRAL"),
  
  /**
   * Canberra - Reserved for Australia Central customers requiring in-country disaster recovery
   */
  AUSTRALIA_CENTRAL2("AUSTRALIA_CENTRAL2"),
  
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
   * Abu Dhabi - Reserved for UAE North customers requiring in-country disaster recovery
   */
  UAE_CENTRAL("UAE_CENTRAL"),
  
  /**
   * Dubai
   */
  UAE_NORTH("UAE_NORTH"),
  
  /**
   * Johannesburg
   */
  SOUTHAFRICA_NORTH("SOUTHAFRICA_NORTH"),
  
  /**
   * Cape Town - Reserved for South Africa North customers requiring in-country disaster recovery
   */
  SOUTHAFRICA_WEST("SOUTHAFRICA_WEST"),
  
  /**
   * Beijing
   */
  CHINA_NORTH("CHINA_NORTH"),
  
  /**
   * Shanghai
   */
  CHINA_EAST("CHINA_EAST"),
  
  /**
   * Beijing
   */
  CHINA_NORTH2("CHINA_NORTH2"),
  
  /**
   * Shanghai
   */
  CHINA_EAST2("CHINA_EAST2"),
  
  /**
   * Frankfurt - No longer listed by https://azure.microsoft.com/en-us/global-infrastructure/data-residency
   */
  GERMANY_CENTRAL("GERMANY_CENTRAL"),
  
  /**
   * Magdeburg - No longer listed by https://azure.microsoft.com/en-us/global-infrastructure/data-residency
   */
  GERMANY_NORTHEAST("GERMANY_NORTHEAST"),
  
  /**
   * US Government Virginia - Reserved for US government entities and their partners only
   */
  GOV_US_VIRGINIA("GOV_US_VIRGINIA"),
  
  /**
   * US Government Iowa - Reserved for US government entities and their partners only
   */
  GOV_US_IOWA("GOV_US_IOWA"),
  
  /**
   * US Government Arizona - Reserved for US government entities and their partners only
   */
  GOV_US_ARIZONA("GOV_US_ARIZONA"),
  
  /**
   * US Government Texas - Reserved for US government entities and their partners only
   */
  GOV_US_TEXAS("GOV_US_TEXAS"),
  
  /**
   * Virginia - Reserved for exclusive use by the Department of Defense
   */
  GOV_US_DOD_EAST("GOV_US_DOD_EAST"),
  
  /**
   * Iowa - Reserved for exclusive use by the Department of Defense
   */
  GOV_US_DOD_CENTRAL("GOV_US_DOD_CENTRAL");

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


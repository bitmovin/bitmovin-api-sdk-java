package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AkamaiCloudRegion {
  
  /**
   * São Paulo, Brazil
   */
  BR_GRU("BR_GRU"),
  
  /**
   * Madrid, Spain
   */
  ES_MAD("ES_MAD"),
  
  /**
   * Paris, France
   */
  FR_PAR("FR_PAR"),
  
  /**
   * Jakarta, Indonesia
   */
  ID_CGK("ID_CGK"),
  
  /**
   * Chennai, India
   */
  IN_MAA("IN_MAA"),
  
  /**
   * Milan, Italy
   */
  IT_MIL("IT_MIL"),
  
  /**
   * Osaka, Japan
   */
  JP_OSA("JP_OSA"),
  
  /**
   * Amsterdam, Netherlands
   */
  NL_AMS("NL_AMS"),
  
  /**
   * Stockholm, Sweden
   */
  SE_STO("SE_STO"),
  
  /**
   * Los Angeles, USA
   */
  US_LAX("US_LAX"),
  
  /**
   * Miami, USA
   */
  US_MIA("US_MIA"),
  
  /**
   * Chicago, USA
   */
  US_ORD("US_ORD"),
  
  /**
   * Seattle, USA
   */
  US_SEA("US_SEA");

  private String value;

  AkamaiCloudRegion(String value) {
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
  public static AkamaiCloudRegion fromValue(String text) {
    for (AkamaiCloudRegion b : AkamaiCloudRegion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum HlsManifestAdMarkerType {
  
  /**
   * Ad markers will be inserted using &#x60;#EXT-X-CUE-OUT&#x60; and &#x60;#EXT-X-CUE-IN&#x60; tags
   */
  EXT_X_CUE_OUT_IN("EXT_X_CUE_OUT_IN"),
  
  /**
   * Ad markers will be inserted using &#x60;#EXT-OATCLS-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger.
   */
  EXT_OATCLS_SCTE35("EXT_OATCLS_SCTE35"),
  
  /**
   * Ad markers will be inserted using &#x60;#EXT-X-SPLICEPOINT-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger.
   */
  EXT_X_SPLICEPOINT_SCTE35("EXT_X_SPLICEPOINT_SCTE35"),
  
  /**
   * Ad markers will be inserted using &#x60;#EXT-X-DATERANGE&#x60; tags. They contain the ID, start timestamp and hex encoded raw bytes of the original SCTE-35 trigger.
   */
  EXT_X_DATERANGE("EXT_X_DATERANGE"),
  
  /**
   * Ad markers will be inserted using &#x60;#EXT-X-SCTE35&#x60; tags. They contain the base64 encoded raw bytes of the original SCTE-35 trigger.
   */
  EXT_X_SCTE35("EXT_X_SCTE35");

  private String value;

  HlsManifestAdMarkerType(String value) {
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
  public static HlsManifestAdMarkerType fromValue(String text) {
    for (HlsManifestAdMarkerType b : HlsManifestAdMarkerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


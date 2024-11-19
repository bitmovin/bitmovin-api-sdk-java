package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LiveStandbyPoolEncodingManifestType {
  
  /**
   * The manifest is a DASH manifest
   */
  DASH("DASH"),
  
  /**
   * The manifest is a HLS manifest
   */
  HLS("HLS");

  private String value;

  LiveStandbyPoolEncodingManifestType(String value) {
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
  public static LiveStandbyPoolEncodingManifestType fromValue(String text) {
    for (LiveStandbyPoolEncodingManifestType b : LiveStandbyPoolEncodingManifestType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


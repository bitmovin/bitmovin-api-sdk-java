package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FragmentedMp4MuxingManifestType {
  
  /**
   * Smooth Streaming manifest
   */
  SMOOTH("SMOOTH"),
  
  /**
   * DASH On-demand manifest
   */
  DASH_ON_DEMAND("DASH_ON_DEMAND"),
  
  /**
   * HLS manifest with byte ranges
   */
  HLS_BYTE_RANGES("HLS_BYTE_RANGES"),
  
  /**
   * Do not create a manifest
   */
  NONE("NONE"),
  
  /**
   * HLS manifest with byte ranges and I-frame playlist
   */
  HLS_BYTE_RANGES_AND_IFRAME_PLAYLIST("HLS_BYTE_RANGES_AND_IFRAME_PLAYLIST");

  private String value;

  FragmentedMp4MuxingManifestType(String value) {
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
  public static FragmentedMp4MuxingManifestType fromValue(String text) {
    for (FragmentedMp4MuxingManifestType b : FragmentedMp4MuxingManifestType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies the manifest type which will be allowed for the ProgressiveWebmMuxingManifestType Muxing.
 */
public enum ProgressiveWebmMuxingManifestType {
  
  /**
   * Allow creation of DASH on-demand manifests
   */
  DASH_ON_DEMAND("DASH_ON_DEMAND"),
  
  /**
   * Do not allow creation of manifests
   */
  NONE("NONE");

  private String value;

  ProgressiveWebmMuxingManifestType(String value) {
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
  public static ProgressiveWebmMuxingManifestType fromValue(String text) {
    for (ProgressiveWebmMuxingManifestType b : ProgressiveWebmMuxingManifestType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


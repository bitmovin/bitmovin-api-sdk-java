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
 * Gets or Sets DashOnDemandRepresentationType
 */
public enum DashOnDemandRepresentationType {
  
  /**
   * Generates a SegmentBase representation
   */
  SEGMENT_BASE("SEGMENT_BASE"),
  
  /**
   * Generates a SegmentList representation
   */
  SEGMENT_LIST("SEGMENT_LIST");

  private String value;

  DashOnDemandRepresentationType(String value) {
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
  public static DashOnDemandRepresentationType fromValue(String text) {
    for (DashOnDemandRepresentationType b : DashOnDemandRepresentationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


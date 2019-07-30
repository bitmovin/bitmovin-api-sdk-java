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
 * Gets or Sets DashRepresentationType
 */
public enum DashRepresentationType {
  
  /**
   * Generates a SegmentTemplate which will be positioned under the representation
   */
  TEMPLATE("TEMPLATE"),
  
  /**
   * Generates a SegmentList based representation
   */
  LIST("LIST"),
  
  /**
   * Generates a SegmentTimeline based representation
   */
  TIMELINE("TIMELINE");

  private String value;

  DashRepresentationType(String value) {
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
  public static DashRepresentationType fromValue(String text) {
    for (DashRepresentationType b : DashRepresentationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


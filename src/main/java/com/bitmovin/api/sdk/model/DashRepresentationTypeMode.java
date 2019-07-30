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
 * Gets or Sets DashRepresentationTypeMode
 */
public enum DashRepresentationTypeMode {
  
  /**
   * Generates representations containing segment templates. This is the default.
   */
  TEMPLATE_REPRESENTATION("TEMPLATE_REPRESENTATION"),
  
  /**
   * Generates segment templates in the adaption sets. The representations will not contain any segment templates anymore.
   */
  TEMPLATE_ADAPTATION_SET("TEMPLATE_ADAPTATION_SET");

  private String value;

  DashRepresentationTypeMode(String value) {
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
  public static DashRepresentationTypeMode fromValue(String text) {
    for (DashRepresentationTypeMode b : DashRepresentationTypeMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


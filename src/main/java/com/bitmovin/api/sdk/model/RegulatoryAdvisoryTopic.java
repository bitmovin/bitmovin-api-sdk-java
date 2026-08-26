package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RegulatoryAdvisoryTopic {
  
  /**
   * Tobacco and vaping imagery, as covered by statutory on-screen advisory requirements such as the Indian Cigarettes and Other Tobacco Products Amendment Rules, 2023. Detected shots are reported per category, distinguishing tobacco from vaping imagery
   */
  TOBACCO("TOBACCO");

  private String value;

  RegulatoryAdvisoryTopic(String value) {
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
  public static RegulatoryAdvisoryTopic fromValue(String text) {
    for (RegulatoryAdvisoryTopic b : RegulatoryAdvisoryTopic.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


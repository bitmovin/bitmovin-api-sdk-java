package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AnalyticsExportStatus {
  
  /**
   * Export has started
   */
  STARTED("STARTED"),
  
  /**
   * Export has finished
   */
  FINISHED("FINISHED"),
  
  /**
   * Export is queued and will be stared soon
   */
  QUEUED("QUEUED"),
  
  /**
   * Error has happened during export
   */
  ERROR("ERROR");

  private String value;

  AnalyticsExportStatus(String value) {
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
  public static AnalyticsExportStatus fromValue(String text) {
    for (AnalyticsExportStatus b : AnalyticsExportStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


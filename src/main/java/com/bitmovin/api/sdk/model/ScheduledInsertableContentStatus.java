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
 * Gets or Sets ScheduledInsertableContentStatus
 */
public enum ScheduledInsertableContentStatus {
  
  
  CREATED("CREATED"),
  
  
  SCHEDULED("SCHEDULED"),
  
  
  TO_BE_DESCHEDULED("TO_BE_DESCHEDULED"),
  
  
  DESCHEDULED("DESCHEDULED"),
  
  
  ERROR("ERROR");

  private String value;

  ScheduledInsertableContentStatus(String value) {
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
  public static ScheduledInsertableContentStatus fromValue(String text) {
    for (ScheduledInsertableContentStatus b : ScheduledInsertableContentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


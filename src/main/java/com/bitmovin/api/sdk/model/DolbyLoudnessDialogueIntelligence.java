package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyLoudnessDialogueIntelligence {
  
  /**
   * Enable Dolby Dialogue Intelligence feature
   */
  ENABLED("ENABLED"),
  
  /**
   * Disable Dolby Dialogue Intelligence feature
   */
  DISABLED("DISABLED");

  private String value;

  DolbyLoudnessDialogueIntelligence(String value) {
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
  public static DolbyLoudnessDialogueIntelligence fromValue(String text) {
    for (DolbyLoudnessDialogueIntelligence b : DolbyLoudnessDialogueIntelligence.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


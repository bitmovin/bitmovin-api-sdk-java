package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AdvisoryConfidence {
  
  /**
   * The model is certain of the detection, with the subject plainly visible
   */
  HIGH("HIGH"),
  
  /**
   * The model is reasonably certain, but the subject is partly obscured, brief or otherwise not plainly visible
   */
  MEDIUM("MEDIUM"),
  
  /**
   * The model flagged the shot on a cue it could not resolve, for example a small, dark or fleeting object, and another reading of it is possible. Detection is tuned to flag uncertain cases rather than miss them, so advisories below HIGH confidence are expected
   */
  LOW("LOW"),
  
  /**
   * No confidence could be established because the shot was never assessed. Returned with status BLOCKED, where the advisory is a conservative assumption rather than an observation
   */
  UNKNOWN("UNKNOWN");

  private String value;

  AdvisoryConfidence(String value) {
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
  public static AdvisoryConfidence fromValue(String text) {
    for (AdvisoryConfidence b : AdvisoryConfidence.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


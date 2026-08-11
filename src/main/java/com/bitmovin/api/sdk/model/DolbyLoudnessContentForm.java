package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyLoudnessContentForm {
  
  /**
   * Long-form content, i.e. longer than 3 minutes (180 seconds), such as movies or episodes. Uses relative gating for the loudness measurement.
   */
  LONG("LONG"),
  
  /**
   * Short-form content, i.e. 3 minutes (180 seconds) or shorter, such as advertisements or promos. Uses no relative gating for the loudness measurement.
   */
  SHORT("SHORT"),
  
  /**
   * Automatically detect the content form and apply the corresponding gating.
   */
  AUTO_DETECT("AUTO_DETECT");

  private String value;

  DolbyLoudnessContentForm(String value) {
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
  public static DolbyLoudnessContentForm fromValue(String text) {
    for (DolbyLoudnessContentForm b : DolbyLoudnessContentForm.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


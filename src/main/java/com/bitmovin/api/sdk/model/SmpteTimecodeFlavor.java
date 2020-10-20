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
 * Gets or Sets SmpteTimecodeFlavor
 */
public enum SmpteTimecodeFlavor {
  
  /**
   * Automatically detect the flavor of timecodes depending on the separation character between seconds and frames (&quot;:&quot; meaning NON_DROP_FRAME, &quot;;&quot; or &quot;.&quot; meaning DROP_FRAME)
   */
  AUTO("AUTO"),
  
  /**
   * Interpret timecodes as non-drop frame (NDF or wall-clock time) timecodes
   */
  NON_DROP_FRAME("NON_DROP_FRAME"),
  
  /**
   * Interpret timecodes as drop-frame (DF) timecodes
   */
  DROP_FRAME("DROP_FRAME");

  private String value;

  SmpteTimecodeFlavor(String value) {
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
  public static SmpteTimecodeFlavor fromValue(String text) {
    for (SmpteTimecodeFlavor b : SmpteTimecodeFlavor.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


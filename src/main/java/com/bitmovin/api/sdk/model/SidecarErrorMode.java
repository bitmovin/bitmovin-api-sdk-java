package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SidecarErrorMode {
  
  /**
   * If the transfer of the sidecar file fails, the whole encoding will fail
   */
  FAIL_ON_ERROR("FAIL_ON_ERROR"),
  
  /**
   * If the transfer of the sidecar file fails, there is only a warning and the encoding will still continue
   */
  CONTINUE_ON_ERROR("CONTINUE_ON_ERROR");

  private String value;

  SidecarErrorMode(String value) {
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
  public static SidecarErrorMode fromValue(String text) {
    for (SidecarErrorMode b : SidecarErrorMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InputColorPrimaries {
  
  
  UNSPECIFIED("UNSPECIFIED"),
  
  
  BT709("BT709"),
  
  
  BT470M("BT470M"),
  
  
  BT470BG("BT470BG"),
  
  
  SMPTE170M("SMPTE170M"),
  
  
  SMPTE240M("SMPTE240M"),
  
  
  FILM("FILM"),
  
  
  BT2020("BT2020"),
  
  
  SMPTE428("SMPTE428"),
  
  
  SMPTEST428_1("SMPTEST428_1"),
  
  
  SMPTE431("SMPTE431"),
  
  
  SMPTE432("SMPTE432"),
  
  
  JEDEC_P22("JEDEC_P22");

  private String value;

  InputColorPrimaries(String value) {
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
  public static InputColorPrimaries fromValue(String text) {
    for (InputColorPrimaries b : InputColorPrimaries.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


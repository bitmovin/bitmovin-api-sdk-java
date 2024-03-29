package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InputColorTransfer {
  
  
  UNSPECIFIED("UNSPECIFIED"),
  
  
  BT709("BT709"),
  
  
  GAMMA22("GAMMA22"),
  
  
  GAMMA28("GAMMA28"),
  
  
  SMPTE170M("SMPTE170M"),
  
  
  SMPTE240M("SMPTE240M"),
  
  
  LINEAR("LINEAR"),
  
  
  LOG("LOG"),
  
  
  LOG_SQRT("LOG_SQRT"),
  
  
  IEC61966_2_4("IEC61966_2_4"),
  
  
  BT1361_ECG("BT1361_ECG"),
  
  
  IEC61966_2_1("IEC61966_2_1"),
  
  
  BT2020_10("BT2020_10"),
  
  
  BT2020_12("BT2020_12"),
  
  
  SMPTE2084("SMPTE2084"),
  
  
  SMPTE428("SMPTE428"),
  
  
  ARIB_STD_B67("ARIB_STD_B67");

  private String value;

  InputColorTransfer(String value) {
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
  public static InputColorTransfer fromValue(String text) {
    for (InputColorTransfer b : InputColorTransfer.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


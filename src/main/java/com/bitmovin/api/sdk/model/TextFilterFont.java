package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TextFilterFont {
  
  
  DEJAVUSANS("DEJAVUSANS"),
  
  
  DEJAVUSERIF("DEJAVUSERIF"),
  
  
  DEJAVUSANSMONO("DEJAVUSANSMONO"),
  
  
  ROBOTOMONO("ROBOTOMONO"),
  
  
  ROBOTOBLACK("ROBOTOBLACK"),
  
  
  ROBOTO("ROBOTO"),
  
  
  ROBOTOCONDENSED("ROBOTOCONDENSED");

  private String value;

  TextFilterFont(String value) {
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
  public static TextFilterFont fromValue(String text) {
    for (TextFilterFont b : TextFilterFont.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


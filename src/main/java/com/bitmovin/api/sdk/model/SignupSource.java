package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SignupSource {
  
  /**
   * platform which initiated the creation of the resource
   */
  AWS("AWS"),
  
  /**
   * platform which initiated the creation of the resource
   */
  AZURE("AZURE"),
  
  /**
   * platform which initiated the creation of the resource
   */
  BITMOVIN("BITMOVIN"),
  
  /**
   * platform which initiated the creation of the resource
   */
  GOOGLE("GOOGLE");

  private String value;

  SignupSource(String value) {
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
  public static SignupSource fromValue(String text) {
    for (SignupSource b : SignupSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


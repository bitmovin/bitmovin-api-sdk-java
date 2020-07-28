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
 * Algorithm to be used for measuring loudness
 */
public enum DolbyAtmosMeteringMode {
  
  /**
   * ITU-R BS.1770-1
   */
  ITU_R_BS_1770_1("ITU-R BS.1770-1"),
  
  /**
   * ITU-R BS.1770-2
   */
  ITU_R_BS_1770_2("ITU-R BS.1770-2"),
  
  /**
   * ITU-R BS.1770-3
   */
  ITU_R_BS_1770_3("ITU-R BS.1770-3"),
  
  /**
   * ITU-R BS.1770-4
   */
  ITU_R_BS_1770_4("ITU-R BS.1770-4"),
  
  /**
   * Leq (A)
   */
  LEQ_A("Leq (A)");

  private String value;

  DolbyAtmosMeteringMode(String value) {
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
  public static DolbyAtmosMeteringMode fromValue(String text) {
    for (DolbyAtmosMeteringMode b : DolbyAtmosMeteringMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


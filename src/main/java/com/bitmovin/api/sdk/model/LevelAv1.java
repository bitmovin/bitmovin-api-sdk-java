package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LevelAv1 {
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L2_0("2.0"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L2_1("2.1"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L3_0("3.0"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L3_1("3.1"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L4_0("4.0"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L4_1("4.1"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L5_0("5.0"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L5_1("5.1"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L5_2("5.2"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L5_3("5.3"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L6_0("6.0"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L6_1("6.1"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L6_2("6.2"),
  
  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile, see: https://aomediacodec.github.io/av1-spec/av1-spec.pdf (Annex A.3)
   */
  L6_3("6.3");

  private String value;

  LevelAv1(String value) {
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
  public static LevelAv1 fromValue(String text) {
    for (LevelAv1 b : LevelAv1.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


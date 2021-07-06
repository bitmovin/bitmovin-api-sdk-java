package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DolbyDigitalChannelLayout {
  
  /**
   * No channel layout
   */
  NONE("NONE"),
  
  /**
   * Channel layout Mono
   */
  MONO("MONO"),
  
  /**
   * Channel layout Stereo
   */
  CL_STEREO("STEREO"),
  
  /**
   * Channel layout 3.0 (3 front (left + center + right), no LFE)
   */
  CL_SURROUND("SURROUND"),
  
  /**
   * Channel layout 3.1 (3 front (left + center + right), LFE)
   */
  CL_3_1("3.1"),
  
  /**
   * Channel layout Surround (2 front (left + right), 1 back center, no LFE)
   */
  CL_BACK_SURROUND("BACK_SURROUND"),
  
  /**
   * Channel layout Surround with LFE (2 front (left + right), 1 back center, LFE)
   */
  CL_BACK_SURROUND_LFE("BACK_SURROUND_LFE"),
  
  /**
   * Channel layout Quad (2 front (left + right), 2 back (left + right), no LFE)
   */
  CL_QUAD("QUAD"),
  
  /**
   * Channel layout Quad with LFE (2 front (left + right), 2 back (left + right), LFE)
   */
  CL_QUAD_LFE("QUAD_LFE"),
  
  /**
   * Channel layout 4.0 (3 front (left + center + right), 1 back center, no LFE)
   */
  CL_4_0("4.0"),
  
  /**
   * Channel layout 4.1 (3 front (left + center + right), 1 back center, LFE)
   */
  CL_4_1("4.1"),
  
  /**
   * Channel layout 5.0 (3 front (left + center + right), 2 side (left + right), no LFE)
   */
  CL_5_0("5.0"),
  
  /**
   * Channel layout 5.1 (3 front (left + center + right), 2 side (left + right), LFE)
   */
  CL_5_1("5.1");

  private String value;

  DolbyDigitalChannelLayout(String value) {
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
  public static DolbyDigitalChannelLayout fromValue(String text) {
    for (DolbyDigitalChannelLayout b : DolbyDigitalChannelLayout.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


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
 * Channel layout of this audio mix
 */
public enum AudioMixChannelLayout {
  
  /**
   * Channel layout of this audio mix
   */
  NONE("NONE"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_MONO("MONO"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_STEREO("STEREO"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_SURROUND("SURROUND"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_QUAD("QUAD"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_OCTAGONAL("OCTAGONAL"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_HEXAGONAL("HEXAGONAL"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_STEREO_DOWNMIX("STEREO_DOWNMIX"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_2_1("2.1"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_2_2("2.2"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_3_1("3.1"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_4_0("4.0"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_4_1("4.1"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_5_0("5.0"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_5_1("5.1"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_5_0_BACK("5.0_BACK"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_5_1_BACK("5.1_BACK"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_6_0("6.0"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_6_0_FRONT("6.0_FRONT"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_6_1("6.1"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_6_1_BACK("6.1_BACK"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_6_1_FRONT("6.1_FRONT"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_7_0("7.0"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_7_0_FRONT("7.0_FRONT"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_7_1("7.1"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_7_1_WIDE("7.1_WIDE"),
  
  /**
   * Channel layout of this audio mix
   */
  CL_7_1_WIDE_BACK("7.1_WIDE_BACK");

  private String value;

  AudioMixChannelLayout(String value) {
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
  public static AudioMixChannelLayout fromValue(String text) {
    for (AudioMixChannelLayout b : AudioMixChannelLayout.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


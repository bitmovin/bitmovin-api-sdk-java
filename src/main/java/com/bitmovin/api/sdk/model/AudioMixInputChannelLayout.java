package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AudioMixInputChannelLayout {
  
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
   * Channel layout Surround
   */
  CL_SURROUND("SURROUND"),
  
  /**
   * Channel layout Quad
   */
  CL_QUAD("QUAD"),
  
  /**
   * Channel layout Hexagonal
   */
  CL_HEXAGONAL("HEXAGONAL"),
  
  /**
   * Channel layout Octagonal
   */
  CL_OCTAGONAL("OCTAGONAL"),
  
  /**
   * Channel layout Stereo Downmix
   */
  CL_STEREO_DOWNMIX("STEREO_DOWNMIX"),
  
  /**
   * Channel layout 2.1
   */
  CL_2_1("2.1"),
  
  /**
   * Channel layout 2.2
   */
  CL_2_2("2.2"),
  
  /**
   * Channel layout 3.1
   */
  CL_3_1("3.1"),
  
  /**
   * Channel layout 4.0
   */
  CL_4_0("4.0"),
  
  /**
   * Channel layout 4.1
   */
  CL_4_1("4.1"),
  
  /**
   * Channel layout 5.0
   */
  CL_5_0("5.0"),
  
  /**
   * Channel layout 5.1
   */
  CL_5_1("5.1"),
  
  /**
   * Channel layout 5.0 Back
   */
  CL_5_0_BACK("5.0_BACK"),
  
  /**
   * Channel layout 5.1 Back
   */
  CL_5_1_BACK("5.1_BACK"),
  
  /**
   * Channel layout 6.0
   */
  CL_6_0("6.0"),
  
  /**
   * Channel layout 6.0 Front
   */
  CL_6_0_FRONT("6.0_FRONT"),
  
  /**
   * Channel layout 6.1
   */
  CL_6_1("6.1"),
  
  /**
   * Channel layout 6.1 Front
   */
  CL_6_1_FRONT("6.1_FRONT"),
  
  /**
   * Channel layout 6.1 Back
   */
  CL_6_1_BACK("6.1_BACK"),
  
  /**
   * Channel layout 7.0
   */
  CL_7_0("7.0"),
  
  /**
   * Channel layout 7.0 Front
   */
  CL_7_0_FRONT("7.0_FRONT"),
  
  /**
   * Channel layout 7.1
   */
  CL_7_1("7.1"),
  
  /**
   * Channel layout 7.1 Wide
   */
  CL_7_1_WIDE("7.1_WIDE"),
  
  /**
   * Channel layout 7.1 Wide Back
   */
  CL_7_1_WIDE_BACK("7.1_WIDE_BACK");

  private String value;

  AudioMixInputChannelLayout(String value) {
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
  public static AudioMixInputChannelLayout fromValue(String text) {
    for (AudioMixInputChannelLayout b : AudioMixInputChannelLayout.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


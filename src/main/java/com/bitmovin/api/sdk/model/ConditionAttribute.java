package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ConditionAttribute {
  
  /**
   * Height of the input
   */
  HEIGHT("HEIGHT"),
  
  /**
   * Width of the input
   */
  WIDTH("WIDTH"),
  
  /**
   * Bitrate of the input
   */
  BITRATE("BITRATE"),
  
  /**
   * Frames per second of the input
   */
  FPS("FPS"),
  
  /**
   * Aspect ratio of the input (greater 1 &#x3D; landscape; smaller 1 &#x3D; portrait)
   */
  ASPECTRATIO("ASPECTRATIO"),
  
  /**
   * Input stream is present (boolean)
   */
  INPUTSTREAM("INPUTSTREAM"),
  
  /**
   * The language of the audio stream (string)
   */
  LANGUAGE("LANGUAGE"),
  
  /**
   * The channel format of the audio stream (string)
   */
  CHANNELFORMAT("CHANNELFORMAT"),
  
  /**
   * The channel layout of the audio stream (integer)
   */
  CHANNELLAYOUT("CHANNELLAYOUT"),
  
  /**
   * The total numbers of streams in the input file (integer)
   */
  STREAMCOUNT("STREAMCOUNT"),
  
  /**
   * The total numbers of audio streams in the input file (integer)
   */
  AUDIOSTREAMCOUNT("AUDIOSTREAMCOUNT"),
  
  /**
   * The total numbers of video streams in the input file (integer)
   */
  VIDEOSTREAMCOUNT("VIDEOSTREAMCOUNT"),
  
  /**
   * The duration of the input file (double)
   */
  DURATION("DURATION"),
  
  /**
   * The rotation of the input file (double)
   */
  ROTATION("ROTATION"),
  
  /**
   * String value representing the changed connection status
   */
  CONNECTION_STATUS("CONNECTION_STATUS"),
  
  /**
   * Boolean value if the connection status changed
   */
  CONNECTION_STATUS_JUST_CHANGED("CONNECTION_STATUS_JUST_CHANGED"),
  
  /**
   * The container-native identifier of the stream (integer). Depending on the container format of the input file, this maps to: - MPEG-TS: the stream&#39;s PID (Packet ID) - ISOBMFF/MOV (e.g. MP4): the stream&#39;s Track ID  Tools such as &#x60;ffprobe&#x60; and &#x60;tsduck&#x60; display these identifiers in hexadecimal (for example, &#x60;Stream #0:0[0x101]&#x60;). The value used for this condition is matched in decimal: PID &#x60;0x101&#x60; corresponds to &#x60;STREAMID &#x3D;&#x3D; 257&#x60;. Hexadecimal values prefixed with &#x60;0x&#x60; are also accepted, so &#x60;STREAMID &#x3D;&#x3D; 0x101&#x60; matches the same stream.
   */
  STREAMID("STREAMID");

  private String value;

  ConditionAttribute(String value) {
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
  public static ConditionAttribute fromValue(String text) {
    for (ConditionAttribute b : ConditionAttribute.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MuxingType {
  
  
  FMP4("FMP4"),
  
  
  CMAF("CMAF"),
  
  
  MP4("MP4"),
  
  
  TS("TS"),
  
  
  WEBM("WEBM"),
  
  
  MP3("MP3"),
  
  
  MXF("MXF"),
  
  
  PROGRESSIVE_WEBM("PROGRESSIVE_WEBM"),
  
  
  PROGRESSIVE_MOV("PROGRESSIVE_MOV"),
  
  
  PROGRESSIVE_TS("PROGRESSIVE_TS"),
  
  
  BROADCAST_TS("BROADCAST_TS"),
  
  
  CHUNKED_TEXT("CHUNKED_TEXT"),
  
  
  TEXT("TEXT"),
  
  
  SEGMENTED_RAW("SEGMENTED_RAW"),
  
  
  PACKED_AUDIO("PACKED_AUDIO");

  private String value;

  MuxingType(String value) {
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
  public static MuxingType fromValue(String text) {
    for (MuxingType b : MuxingType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


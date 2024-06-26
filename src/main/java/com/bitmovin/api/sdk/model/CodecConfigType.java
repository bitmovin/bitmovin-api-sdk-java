package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CodecConfigType {
  
  
  AAC("AAC"),
  
  
  DTS("DTS"),
  
  
  DTSX("DTSX"),
  
  
  DTS_PASSTHROUGH("DTS_PASSTHROUGH"),
  
  
  AUDIO_PASSTHROUGH("AUDIO_PASSTHROUGH"),
  
  
  HE_AAC_V1("HE_AAC_V1"),
  
  
  HE_AAC_V2("HE_AAC_V2"),
  
  
  H264("H264"),
  
  
  H265("H265"),
  
  
  VP9("VP9"),
  
  
  VP8("VP8"),
  
  
  MP2("MP2"),
  
  
  MP3("MP3"),
  
  
  AC3("AC3"),
  
  
  EAC3("EAC3"),
  
  
  DD("DD"),
  
  
  DDPLUS("DDPLUS"),
  
  
  OPUS("OPUS"),
  
  
  VORBIS("VORBIS"),
  
  
  MJPEG("MJPEG"),
  
  
  AV1("AV1"),
  
  
  DOLBY_ATMOS("DOLBY_ATMOS"),
  
  
  H262("H262"),
  
  
  PCM("PCM"),
  
  
  WEBVTT("WEBVTT"),
  
  
  IMSC("IMSC"),
  
  
  DVB_SUBTITLE("DVB_SUBTITLE");

  private String value;

  CodecConfigType(String value) {
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
  public static CodecConfigType fromValue(String text) {
    for (CodecConfigType b : CodecConfigType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


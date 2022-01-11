package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DashRepresentationTypeDiscriminator {
  
  
  DRM_FMP4("DRM_FMP4"),
  
  
  FMP4("FMP4"),
  
  
  WEBM("WEBM"),
  
  
  CMAF("CMAF"),
  
  
  CHUNKED_TEXT("CHUNKED_TEXT"),
  
  
  MP4("MP4"),
  
  
  DRM_MP4("DRM_MP4"),
  
  
  PROGRESSIVE_WEBM("PROGRESSIVE_WEBM"),
  
  
  VTT("VTT"),
  
  
  SPRITE("SPRITE"),
  
  
  IMSC("IMSC"),
  
  
  CONTENT_PROTECTION("CONTENT_PROTECTION");

  private String value;

  DashRepresentationTypeDiscriminator(String value) {
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
  public static DashRepresentationTypeDiscriminator fromValue(String text) {
    for (DashRepresentationTypeDiscriminator b : DashRepresentationTypeDiscriminator.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


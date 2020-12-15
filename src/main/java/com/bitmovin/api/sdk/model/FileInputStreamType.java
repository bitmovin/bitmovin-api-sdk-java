package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FileInputStreamType {
  
  /**
   * Specifies that the sidecar file conforms to the TTML standard
   */
  TTML("TTML"),
  
  /**
   * Specifies that the sidecar file conforms to the WEBVTT standard
   */
  WEBVTT("WEBVTT"),
  
  /**
   * Specifies that the sidecar file conforms to the SRT standard
   */
  SRT("SRT");

  private String value;

  FileInputStreamType(String value) {
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
  public static FileInputStreamType fromValue(String text) {
    for (FileInputStreamType b : FileInputStreamType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


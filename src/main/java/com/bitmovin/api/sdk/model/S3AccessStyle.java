package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum S3AccessStyle {
  
  /**
   * virtual-hosted style (example: bucket-name.s3.example.com)
   */
  VIRTUAL_HOSTED("VIRTUAL_HOSTED"),
  
  /**
   * path style (example: s3.example.com/bucket-name)
   */
  PATH("PATH");

  private String value;

  S3AccessStyle(String value) {
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
  public static S3AccessStyle fromValue(String text) {
    for (S3AccessStyle b : S3AccessStyle.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


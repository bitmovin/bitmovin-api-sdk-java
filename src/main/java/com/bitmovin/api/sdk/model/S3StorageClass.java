package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum S3StorageClass {
  
  
  GLACIER_IR("GLACIER_IR"),
  
  
  INTELLIGENT_TIERING("INTELLIGENT_TIERING"),
  
  
  ONEZONE_IA("ONEZONE_IA"),
  
  
  REDUCED_REDUNDANCY("REDUCED_REDUNDANCY"),
  
  
  STANDARD("STANDARD"),
  
  
  STANDARD_IA("STANDARD_IA");

  private String value;

  S3StorageClass(String value) {
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
  public static S3StorageClass fromValue(String text) {
    for (S3StorageClass b : S3StorageClass.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


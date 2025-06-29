package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum InputType {
  
  
  AKAMAI_NETSTORAGE("AKAMAI_NETSTORAGE"),
  
  
  ASPERA("ASPERA"),
  
  
  AZURE("AZURE"),
  
  
  REDUNDANT_RTMP("REDUNDANT_RTMP"),
  
  
  FTP("FTP"),
  
  
  HLS("HLS"),
  
  
  GENERIC_S3("GENERIC_S3"),
  
  
  GCS("GCS"),
  
  
  HTTP("HTTP"),
  
  
  HTTPS("HTTPS"),
  
  
  LOCAL("LOCAL"),
  
  
  RTMP("RTMP"),
  
  
  S3("S3"),
  
  
  S3_ROLE_BASED("S3_ROLE_BASED"),
  
  
  SFTP("SFTP"),
  
  
  ZIXI("ZIXI"),
  
  
  SRT("SRT"),
  
  
  GCS_SERVICE_ACCOUNT("GCS_SERVICE_ACCOUNT"),
  
  
  DIRECT_FILE_UPLOAD("DIRECT_FILE_UPLOAD");

  private String value;

  InputType(String value) {
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
  public static InputType fromValue(String text) {
    for (InputType b : InputType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


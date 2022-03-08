package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SimpleEncodingLiveJobStatus {
  
  /**
   * The Simple Encoding Live Job has been created and is waiting to be executed
   */
  CREATED("CREATED"),
  
  /**
   * The Simple Encoding Live Job is currently being executed and creating the encoding
   */
  EXECUTING("EXECUTING"),
  
  /**
   * The Simple Encoding Live Job could not create the encoding, check the details for more information
   */
  FAILURE("FAILURE"),
  
  /**
   * The Simple Encoding Live Job has triggered the encoding and is currently starting
   */
  STARTING("STARTING"),
  
  /**
   * The Simple Encoding Live Job has triggered the encoding and is accepting/encoding ingress
   */
  RUNNING("RUNNING"),
  
  /**
   * The Simple Encoding Live Job has been executed and the encoding has finished
   */
  STOPPED("STOPPED"),
  
  /**
   * The Simple Encoding Live Job has been executed but the encoding failed, check the encoding details for more information
   */
  ERROR("ERROR"),
  
  /**
   * The Simple Encoding Live Job has been executed but the encoding has been canceled manually by the user
   */
  CANCELED("CANCELED");

  private String value;

  SimpleEncodingLiveJobStatus(String value) {
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
  public static SimpleEncodingLiveJobStatus fromValue(String text) {
    for (SimpleEncodingLiveJobStatus b : SimpleEncodingLiveJobStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


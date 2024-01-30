package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StreamKeyStatus {
  
  /**
   * Stream key is assigned to a live encoding.  This means, it **can not be assigned** to a RedundantRtmpInput at the moment. It will be set to UNASSIGNED if the live encoding is finished or in error state
   */
  ASSIGNED("ASSIGNED"),
  
  /**
   * Stream key is not assigned to a live encoding.  This means, that it **is available** to be used with a RedundantRtmpInput
   */
  UNASSIGNED("UNASSIGNED");

  private String value;

  StreamKeyStatus(String value) {
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
  public static StreamKeyStatus fromValue(String text) {
    for (StreamKeyStatus b : StreamKeyStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


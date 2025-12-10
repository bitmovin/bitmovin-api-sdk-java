package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LiveEncodingHeartbeatEventType {
  
  /**
   * First connection of the ingest
   */
  FIRST_CONNECT("FIRST_CONNECT"),
  
  /**
   * Ingest has disconnected
   */
  DISCONNECT("DISCONNECT"),
  
  /**
   * Ingest has reconnected
   */
  RECONNECT("RECONNECT"),
  
  /**
   * Warning occurred, please see the message for further details
   */
  WARNING("WARNING"),
  
  /**
   * Error occurred, please see the message for further details
   */
  ERROR("ERROR");

  private String value;

  LiveEncodingHeartbeatEventType(String value) {
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
  public static LiveEncodingHeartbeatEventType fromValue(String text) {
    for (LiveEncodingHeartbeatEventType b : LiveEncodingHeartbeatEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LiveStandbyPoolEncodingStatus {
  
  /**
   * The encoding is about to be created
   */
  TO_BE_CREATED("TO_BE_CREATED"),
  
  /**
   * The encoding is being created
   */
  CREATING("CREATING"),
  
  /**
   * The encoding is starting and configured and not ready for streaming yet
   */
  PREPARING("PREPARING"),
  
  /**
   * The encoding is ready to be acquired from the pool
   */
  READY("READY"),
  
  /**
   * The encoding is about to be deleted
   */
  TO_BE_DELETED("TO_BE_DELETED"),
  
  /**
   * The encoding is being deleted
   */
  DELETING("DELETING"),
  
  /**
   * The encoding of the pool is acquired and removed from the pool
   */
  ACQUIRED("ACQUIRED"),
  
  /**
   * The encoding of the pool is in error state
   */
  ERROR("ERROR");

  private String value;

  LiveStandbyPoolEncodingStatus(String value) {
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
  public static LiveStandbyPoolEncodingStatus fromValue(String text) {
    for (LiveStandbyPoolEncodingStatus b : LiveStandbyPoolEncodingStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum WatchFolderStatus {
  
  /**
   * The watch folder is currently inactive
   */
  STOPPED("STOPPED"),
  
  /**
   * The watch folder is currently active and monitors the storage for new files to be encoded
   */
  STARTED("STARTED"),
  
  /**
   * The watch folder is inactive due to an error
   */
  ERROR("ERROR");

  private String value;

  WatchFolderStatus(String value) {
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
  public static WatchFolderStatus fromValue(String text) {
    for (WatchFolderStatus b : WatchFolderStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SceneAnalysisListSort {
  
  /**
   * Sort by analysis creation date in descending order
   */
  CREATED_AT_DESC("createdAt:DESC"),
  
  /**
   * Sort by analysis creation date in ascending order
   */
  CREATED_AT_ASC("createdAt:ASC");

  private String value;

  SceneAnalysisListSort(String value) {
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
  public static SceneAnalysisListSort fromValue(String text) {
    for (SceneAnalysisListSort b : SceneAnalysisListSort.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


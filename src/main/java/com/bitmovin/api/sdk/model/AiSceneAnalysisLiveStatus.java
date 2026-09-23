package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AiSceneAnalysisLiveStatus {
  
  /**
   * The Analysis has been created and has not been started
   */
  CREATED("CREATED"),
  
  /**
   * The start request was accepted and AI analysis is preparing to receive input
   */
  QUEUED("QUEUED"),
  
  /**
   * AI analysis is ready to receive RTMP input
   */
  RUNNING("RUNNING"),
  
  /**
   * The running analysis stopped gracefully and final required delivery completed
   */
  FINISHED("FINISHED"),
  
  /**
   * Queued work was stopped before analysis began
   */
  CANCELED("CANCELED"),
  
  /**
   * Provisioning, validation, processing, or final generation failed
   */
  ERROR("ERROR"),
  
  /**
   * Required result delivery exhausted its retry budget
   */
  TRANSFER_ERROR("TRANSFER_ERROR");

  private String value;

  AiSceneAnalysisLiveStatus(String value) {
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
  public static AiSceneAnalysisLiveStatus fromValue(String text) {
    for (AiSceneAnalysisLiveStatus b : AiSceneAnalysisLiveStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


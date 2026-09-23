package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AiSceneAnalysisLiveSourceGapReason {
  
  /**
   * The RTMP source disconnected and later reconnected
   */
  SOURCE_DISCONNECTED("SOURCE_DISCONNECTED"),
  
  /**
   * The media interval was not analyzed because temporary storage capacity was reached
   */
  PROCESSING_MEDIA_PRESSURE("PROCESSING_MEDIA_PRESSURE"),
  
  /**
   * The media interval was not analyzed because analysis lag exceeded the configured maximum latency and the analysis window was skipped to catch up
   */
  ANALYSIS_LAG("ANALYSIS_LAG"),
  
  /**
   * The media interval was not analyzed because the analysis window could not be created from the recorded media
   */
  WINDOW_BUILD_FAILED("WINDOW_BUILD_FAILED"),
  
  /**
   * The media interval was received but remained unanalyzed when AI analysis ended
   */
  FINALIZATION_BACKLOG("FINALIZATION_BACKLOG");

  private String value;

  AiSceneAnalysisLiveSourceGapReason(String value) {
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
  public static AiSceneAnalysisLiveSourceGapReason fromValue(String text) {
    for (AiSceneAnalysisLiveSourceGapReason b : AiSceneAnalysisLiveSourceGapReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


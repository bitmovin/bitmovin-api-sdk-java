package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SceneType {
  
  /**
   * Network, studio, or platform identification bumpers
   */
  LOGO_IDENT("LOGO_IDENT"),
  
  /**
   * Opening sequence presenting title, credits, or thematic elements without in-world dialogue
   */
  OPENING_CREDITS("OPENING_CREDITS"),
  
  /**
   * &quot;Previously on …&quot; montage sequences from prior episodes
   */
  RECAP("RECAP"),
  
  /**
   * Teaser or preview for this title or its upcoming episode
   */
  PREVIEW_THIS_TITLE("PREVIEW_THIS_TITLE"),
  
  /**
   * Promotion or trailer for a different title or programming
   */
  PROMOTION_OTHER_TITLE("PROMOTION_OTHER_TITLE"),
  
  /**
   * Short bumper marking an act or advertising break
   */
  BREAK_BUMPER("BREAK_BUMPER"),
  
  /**
   * Closing credits, acknowledgments, or copyright notices
   */
  END_CREDITS("END_CREDITS"),
  
  /**
   * Commercial advertisements with promotional intent and call-to-action
   */
  ADS("ADS"),
  
  /**
   * Main narrative, dialogue, or educational material
   */
  MAIN_CONTENT("MAIN_CONTENT"),
  
  /**
   * Fallback when AI confidence is below minimum threshold
   */
  UNKNOWN("UNKNOWN");

  private String value;

  SceneType(String value) {
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
  public static SceneType fromValue(String text) {
    for (SceneType b : SceneType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


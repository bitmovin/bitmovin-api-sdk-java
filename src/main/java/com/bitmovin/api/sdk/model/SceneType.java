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
   * Opening sequence presenting title, credits, and/or thematic elements; no in-world character dialogue
   */
  OPENING_TITLES("OPENING_TITLES"),
  
  /**
   * Episode-specific title/chapter card (e.g., &quot;S02E04 — The Pact&quot;)
   */
  EPISODE_TITLE_CARD("EPISODE_TITLE_CARD"),
  
  /**
   * Production/distributor logo stingers (e.g., MGM, WB, New Line)
   */
  STUDIO_LOGO_BUMPER("STUDIO_LOGO_BUMPER"),
  
  /**
   * Network/platform idents/slates (e.g., &quot;A Netflix Original&quot;, channel idents)
   */
  NETWORK_OR_PLATFORM_IDENT("NETWORK_OR_PLATFORM_IDENT"),
  
  /**
   * &quot;Previously on …&quot; montage sequences from previous episodes
   */
  RECAP("RECAP"),
  
  /**
   * Teaser for this or the next episode of the same title
   */
  PREVIEW_THIS_TITLE("PREVIEW_THIS_TITLE"),
  
  /**
   * Network promo for a different show on the same network/platform (schedule-centric)
   */
  PROMO_OTHER_TITLE("PROMO_OTHER_TITLE"),
  
  /**
   * Full/standard trailer for a different title (cinematic style, not schedule-centric)
   */
  TRAILER_OTHER_TITLE("TRAILER_OTHER_TITLE"),
  
  /**
   * Commercial advertisements with promotional intent and call-to-action
   */
  ADS("ADS"),
  
  /**
   * Short bumpers marking act/ad breaks (incl. anime eyecatches)
   */
  ACT_BREAK_EYECATCH("ACT_BREAK_EYECATCH"),
  
  /**
   * Technical/packaging: test bars, countdowns, black/slates, legal-only cards
   */
  TECHNICAL_SLATE_OR_TEST("TECHNICAL_SLATE_OR_TEST"),
  
  /**
   * Main narrative, dialogue, or educational material (default)
   */
  MAIN_CONTENT("MAIN_CONTENT"),
  
  /**
   * Narrative content interspersed within end credits
   */
  MID_CREDIT_SCENE("MID_CREDIT_SCENE"),
  
  /**
   * Narrative content appearing after all credits finish
   */
  POST_CREDIT_SCENE("POST_CREDIT_SCENE"),
  
  /**
   * Closing credits, copyright notices, staff acknowledgments
   */
  END_CREDITS("END_CREDITS"),
  
  /**
   * Fallback when AI confidence below minimum threshold
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


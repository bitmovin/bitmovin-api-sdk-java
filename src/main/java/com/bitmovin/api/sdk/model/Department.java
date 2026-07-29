package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Department {
  
  /**
   * Cast members and their portrayed characters
   */
  ACTING("ACTING"),
  
  /**
   * Chief Animation Director, Animation Director, Character Designer, Color Design
   */
  ANIMATION("ANIMATION"),
  
  /**
   * Casting Director
   */
  CASTING("CASTING"),
  
  /**
   * Director of Photography
   */
  CINEMATOGRAPHY("CINEMATOGRAPHY"),
  
  /**
   * Costume Designer
   */
  COSTUME_DESIGN("COSTUME_DESIGN"),
  
  /**
   * Director
   */
  DIRECTING("DIRECTING"),
  
  /**
   * Film Editor
   */
  FILM_EDITING("FILM_EDITING"),
  
  /**
   * Department head Makeup Artist and Hair Stylist
   */
  MAKEUP_AND_HAIRSTYLING("MAKEUP_AND_HAIRSTYLING"),
  
  /**
   * Film score Composer
   */
  MUSIC("MUSIC"),
  
  /**
   * Producers and Executive Producers
   */
  PRODUCTION("PRODUCTION"),
  
  /**
   * Production Designer
   */
  PRODUCTION_DESIGN("PRODUCTION_DESIGN"),
  
  /**
   * Primary Sound Designer or Sound Mixer
   */
  SOUND("SOUND"),
  
  /**
   * Visual Effects Supervisor
   */
  VISUAL_EFFECTS("VISUAL_EFFECTS"),
  
  /**
   * Screenplay, Created By, or Story By credits
   */
  WRITING("WRITING"),
  
  /**
   * Fallback when department cannot be determined
   */
  UNKNOWN("UNKNOWN");

  private String value;

  Department(String value) {
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
  public static Department fromValue(String text) {
    for (Department b : Department.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


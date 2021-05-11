package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SpriteCreationMode {
  
  /**
   * Creation of the thumbnails starts after the first period interval configured.  When using distance&#x3D;10 and unit&#x3D;SECONDS, the first image of the sprite is from second 10 of the video.
   */
  INTERVAL_END("INTERVAL_END"),
  
  /**
   * Creation of the thumbnails starts at the beginning of the first period interval configured, therefore, at the beginning of the video.  When using distance&#x3D;10 and unit&#x3D;SECONDS, the first image of the sprite is from the very start of the video, while the second image is from second 10 of the video.
   */
  INTERVAL_START("INTERVAL_START");

  private String value;

  SpriteCreationMode(String value) {
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
  public static SpriteCreationMode fromValue(String text) {
    for (SpriteCreationMode b : SpriteCreationMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


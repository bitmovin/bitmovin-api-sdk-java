package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ThumbnailAspectMode {
  
  /**
   * Specifies that the Padding aspect mode is used when adapting to configured the width and height.  Padding means that either horiziontally or vertically black boxes are added to make sure that the thumbnail image fits the aspect ratio.
   */
  PAD("PAD"),
  
  /**
   * Specifies that the Cropping aspect mode is used when adapting to configured the width and height.  Cropping means that parts of the image are removed so that the thumbnail fits the aspect ratio.
   */
  CROP("CROP"),
  
  /**
   * Specifies that the Stretching aspect mode is used when adapting to configured the width and height.  Stretching means that the image is stretched either vertically or horizontally until it fits the aspect ratio.
   */
  STRETCH("STRETCH");

  private String value;

  ThumbnailAspectMode(String value) {
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
  public static ThumbnailAspectMode fromValue(String text) {
    for (ThumbnailAspectMode b : ThumbnailAspectMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


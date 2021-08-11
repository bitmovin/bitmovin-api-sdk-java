package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OttLoudnessMode {
  
  /**
   * Specifies the OTT loudness mode. If the mode is &#x60;DTSX_OTT_LOUDNESS_DETECT&#x60;, the &#x60;lkfs&#x60; value will be calculated internally and does not need to be provided. A provided &#x60;lkfs&#x60; value will be ignored. For the modes &#x60;DTSX_OTT_LOUDNESS_INPUT&#x60; and &#x60;DTSX_OTT_LOUDNESS_TARGET&#x60; an &#x60;lkfs&#x60; value must be provided by the user. 
   */
  DTSX_OTT_LOUDNESS_DETECT("DTSX_OTT_LOUDNESS_DETECT"),
  
  /**
   * Specifies the OTT loudness mode. If the mode is &#x60;DTSX_OTT_LOUDNESS_DETECT&#x60;, the &#x60;lkfs&#x60; value will be calculated internally and does not need to be provided. A provided &#x60;lkfs&#x60; value will be ignored. For the modes &#x60;DTSX_OTT_LOUDNESS_INPUT&#x60; and &#x60;DTSX_OTT_LOUDNESS_TARGET&#x60; an &#x60;lkfs&#x60; value must be provided by the user. 
   */
  DTSX_OTT_LOUDNESS_INPUT("DTSX_OTT_LOUDNESS_INPUT"),
  
  /**
   * Specifies the OTT loudness mode. If the mode is &#x60;DTSX_OTT_LOUDNESS_DETECT&#x60;, the &#x60;lkfs&#x60; value will be calculated internally and does not need to be provided. A provided &#x60;lkfs&#x60; value will be ignored. For the modes &#x60;DTSX_OTT_LOUDNESS_INPUT&#x60; and &#x60;DTSX_OTT_LOUDNESS_TARGET&#x60; an &#x60;lkfs&#x60; value must be provided by the user. 
   */
  DTSX_OTT_LOUDNESS_TARGET("DTSX_OTT_LOUDNESS_TARGET");

  private String value;

  OttLoudnessMode(String value) {
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
  public static OttLoudnessMode fromValue(String text) {
    for (OttLoudnessMode b : OttLoudnessMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


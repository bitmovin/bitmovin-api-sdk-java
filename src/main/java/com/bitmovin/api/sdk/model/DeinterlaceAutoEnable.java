package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Specifies if the deinterlace filter should be applied unconditionally or only on demand.
 */
public enum DeinterlaceAutoEnable {
  
  /**
   * The content will always be deinterlaced with the settings specified (mode, parity, frameSelectionMode)
   */
  ALWAYS_ON("ALWAYS_ON"),
  
  /**
   * The deinterlace filter will only be applied when interlaced content is detected in the meta data of the input stream. Additionally the parity will be set using the meta data if the parity is set as &quot;AUTO&quot; or &quot;default&quot;. Otherwise it will use the specified parity.
   */
  META_DATA_BASED("META_DATA_BASED"),
  
  /**
   * This option will test the meta data and analyse the content to detect interlaced frames. If meta data detects interlaced content the mode works same as &quot;META_DATA_BASED&quot;. If content analysis detects interlaced frames the deinterlace filter will be applied in frameSelectionMode &quot;ALL&quot;.
   */
  META_DATA_AND_CONTENT_BASED("META_DATA_AND_CONTENT_BASED");

  private String value;

  DeinterlaceAutoEnable(String value) {
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
  public static DeinterlaceAutoEnable fromValue(String text) {
    for (DeinterlaceAutoEnable b : DeinterlaceAutoEnable.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


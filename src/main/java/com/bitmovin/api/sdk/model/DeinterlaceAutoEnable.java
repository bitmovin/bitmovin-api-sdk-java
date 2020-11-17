package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeinterlaceAutoEnable {
  
  /**
   * The content will always be deinterlaced with the settings specified (mode, parity, frameSelectionMode)
   */
  ALWAYS_ON("ALWAYS_ON"),
  
  /**
   * The deinterlace filter will only be applied when interlaced content is signaled in the meta data of the input stream. In that case, if the parity setting is set to &quot;AUTO&quot;, it will be overwritten with the result of the metadata probing. In cases where parity is not set to &quot;AUTO&quot; the configured value will be used.
   */
  META_DATA_BASED("META_DATA_BASED"),
  
  /**
   * This option will check if the content is signaled as interlaced first. If not, the frames are analyzed to detect interlaced frames. If the content is signaled as interlaced by the meta data this mode works same as &quot;META_DATA_BASED&quot;. If content analysis detects interlaced frames the deinterlace filter will be applied in frameSelectionMode &quot;ALL&quot;. Additionally, the parity will always be overwritten with the result of the metadata probing.
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


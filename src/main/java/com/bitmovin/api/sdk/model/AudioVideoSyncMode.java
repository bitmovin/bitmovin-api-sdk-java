package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AudioVideoSyncMode {
  
  /**
   * Do not add or drop any audio samples.
   */
  STANDARD("STANDARD"),
  
  /**
   * Drop audio samples or add audio silence samples at the start of the audio stream.
   */
  RESYNC_AT_START("RESYNC_AT_START"),
  
  /**
   * Adds or drops audio samples at the start.&lt;br&gt; Adds silence audio samples at the end of the audio inputs.&lt;br&gt; This mode does not drop audio samples from the end.
   */
  RESYNC_AT_START_AND_END("RESYNC_AT_START_AND_END");

  private String value;

  AudioVideoSyncMode(String value) {
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
  public static AudioVideoSyncMode fromValue(String text) {
    for (AudioVideoSyncMode b : AudioVideoSyncMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


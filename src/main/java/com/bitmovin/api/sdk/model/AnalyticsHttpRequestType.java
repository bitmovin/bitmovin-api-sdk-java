package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AnalyticsHttpRequestType {
  
  
  DRM_LICENSE_WIDEVINE_("DRM_LICENSE_WIDEVINE,"),
  
  
  MEDIA_THUMBNAILS_("MEDIA_THUMBNAILS,"),
  
  
  MEDIA_VIDEO_("MEDIA_VIDEO,"),
  
  
  MEDIA_AUDIO_("MEDIA_AUDIO,"),
  
  
  MEDIA_PROGRESSIVE_("MEDIA_PROGRESSIVE,"),
  
  
  MEDIA_SUBTITLES_("MEDIA_SUBTITLES,"),
  
  
  MANIFEST_DASH_("MANIFEST_DASH,"),
  
  
  MANIFEST_HLS_MASTER_("MANIFEST_HLS_MASTER,"),
  
  
  MANIFEST_HLS_VARIANT_("MANIFEST_HLS_VARIANT,"),
  
  
  MANIFEST_SMOOTH_("MANIFEST_SMOOTH,"),
  
  
  KEY_HLS_AES_("KEY_HLS_AES,"),
  
  
  UNKNOWN("UNKNOWN");

  private String value;

  AnalyticsHttpRequestType(String value) {
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
  public static AnalyticsHttpRequestType fromValue(String text) {
    for (AnalyticsHttpRequestType b : AnalyticsHttpRequestType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


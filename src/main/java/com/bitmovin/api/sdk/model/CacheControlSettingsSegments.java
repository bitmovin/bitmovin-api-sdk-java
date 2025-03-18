package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CacheControl;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CacheControlSettingsSegments
 */

public class CacheControlSettingsSegments {
  @JsonProperty("initSegment")
  private CacheControl initSegment;

  @JsonProperty("mediaSegment")
  private CacheControl mediaSegment;


  /**
   * Cache control settings for init segment.
   * @return initSegment
   */
  public CacheControl getInitSegment() {
    return initSegment;
  }

  /**
   * Cache control settings for init segment.
   *
   * @param initSegment
   *        Cache control settings for init segment.
   */
  public void setInitSegment(CacheControl initSegment) {
    this.initSegment = initSegment;
  }


  /**
   * Cache control settings for media segment.
   * @return mediaSegment
   */
  public CacheControl getMediaSegment() {
    return mediaSegment;
  }

  /**
   * Cache control settings for media segment.
   *
   * @param mediaSegment
   *        Cache control settings for media segment.
   */
  public void setMediaSegment(CacheControl mediaSegment) {
    this.mediaSegment = mediaSegment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheControlSettingsSegments cacheControlSettingsSegments = (CacheControlSettingsSegments) o;
    return Objects.equals(this.initSegment, cacheControlSettingsSegments.initSegment) &&
        Objects.equals(this.mediaSegment, cacheControlSettingsSegments.mediaSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initSegment, mediaSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheControlSettingsSegments {\n");
    
    sb.append("    initSegment: ").append(toIndentedString(initSegment)).append("\n");
    sb.append("    mediaSegment: ").append(toIndentedString(mediaSegment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


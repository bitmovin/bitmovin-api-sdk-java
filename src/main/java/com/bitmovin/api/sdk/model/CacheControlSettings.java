package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CacheControlSettingsDash;
import com.bitmovin.api.sdk.model.CacheControlSettingsHls;
import com.bitmovin.api.sdk.model.CacheControlSettingsSegments;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CacheControlSettings
 */

public class CacheControlSettings {
  @JsonProperty("hls")
  private CacheControlSettingsHls hls;

  @JsonProperty("dash")
  private CacheControlSettingsDash dash;

  @JsonProperty("segments")
  private CacheControlSettingsSegments segments;


  /**
   * Cache control settings for HLS manifest.
   * @return hls
   */
  public CacheControlSettingsHls getHls() {
    return hls;
  }

  /**
   * Cache control settings for HLS manifest.
   *
   * @param hls
   *        Cache control settings for HLS manifest.
   */
  public void setHls(CacheControlSettingsHls hls) {
    this.hls = hls;
  }


  /**
   * Cache control settings for DASH manifest.
   * @return dash
   */
  public CacheControlSettingsDash getDash() {
    return dash;
  }

  /**
   * Cache control settings for DASH manifest.
   *
   * @param dash
   *        Cache control settings for DASH manifest.
   */
  public void setDash(CacheControlSettingsDash dash) {
    this.dash = dash;
  }


  /**
   * Cache control settings for segments.
   * @return segments
   */
  public CacheControlSettingsSegments getSegments() {
    return segments;
  }

  /**
   * Cache control settings for segments.
   *
   * @param segments
   *        Cache control settings for segments.
   */
  public void setSegments(CacheControlSettingsSegments segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheControlSettings cacheControlSettings = (CacheControlSettings) o;
    return Objects.equals(this.hls, cacheControlSettings.hls) &&
        Objects.equals(this.dash, cacheControlSettings.dash) &&
        Objects.equals(this.segments, cacheControlSettings.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hls, dash, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheControlSettings {\n");
    
    sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
    sb.append("    dash: ").append(toIndentedString(dash)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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


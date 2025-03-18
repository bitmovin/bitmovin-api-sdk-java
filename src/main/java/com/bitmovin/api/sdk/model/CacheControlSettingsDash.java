package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CacheControl;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CacheControlSettingsDash
 */

public class CacheControlSettingsDash {
  @JsonProperty("timelineManifest")
  private CacheControl timelineManifest;

  @JsonProperty("templateManifest")
  private CacheControl templateManifest;


  /**
   * Cache control settings for DASH Timeline manifest.
   * @return timelineManifest
   */
  public CacheControl getTimelineManifest() {
    return timelineManifest;
  }

  /**
   * Cache control settings for DASH Timeline manifest.
   *
   * @param timelineManifest
   *        Cache control settings for DASH Timeline manifest.
   */
  public void setTimelineManifest(CacheControl timelineManifest) {
    this.timelineManifest = timelineManifest;
  }


  /**
   * Cache control settings for DASH Template manifest.
   * @return templateManifest
   */
  public CacheControl getTemplateManifest() {
    return templateManifest;
  }

  /**
   * Cache control settings for DASH Template manifest.
   *
   * @param templateManifest
   *        Cache control settings for DASH Template manifest.
   */
  public void setTemplateManifest(CacheControl templateManifest) {
    this.templateManifest = templateManifest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheControlSettingsDash cacheControlSettingsDash = (CacheControlSettingsDash) o;
    return Objects.equals(this.timelineManifest, cacheControlSettingsDash.timelineManifest) &&
        Objects.equals(this.templateManifest, cacheControlSettingsDash.templateManifest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timelineManifest, templateManifest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheControlSettingsDash {\n");
    
    sb.append("    timelineManifest: ").append(toIndentedString(timelineManifest)).append("\n");
    sb.append("    templateManifest: ").append(toIndentedString(templateManifest)).append("\n");
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


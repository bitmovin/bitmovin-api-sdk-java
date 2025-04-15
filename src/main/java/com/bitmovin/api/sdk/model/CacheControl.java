package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CacheControl
 */

public class CacheControl {
  @JsonProperty("cacheControl")
  private String cacheControl;


  /**
   * Cache control for storing data on CDN. Example \&quot;public, max-age&#x3D;0, no-cache\&quot;. Cache control is supported on S3, GCS and Azure output storage providers.
   * @return cacheControl
   */
  public String getCacheControl() {
    return cacheControl;
  }

  /**
   * Cache control for storing data on CDN. Example \&quot;public, max-age&#x3D;0, no-cache\&quot;. Cache control is supported on S3, GCS and Azure output storage providers.
   *
   * @param cacheControl
   *        Cache control for storing data on CDN. Example \&quot;public, max-age&#x3D;0, no-cache\&quot;. Cache control is supported on S3, GCS and Azure output storage providers.
   */
  public void setCacheControl(String cacheControl) {
    this.cacheControl = cacheControl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheControl cacheControl = (CacheControl) o;
    return Objects.equals(this.cacheControl, cacheControl.cacheControl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cacheControl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheControl {\n");
    
    sb.append("    cacheControl: ").append(toIndentedString(cacheControl)).append("\n");
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


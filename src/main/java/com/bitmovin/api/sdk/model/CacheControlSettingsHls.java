package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CacheControl;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CacheControlSettingsHls
 */

public class CacheControlSettingsHls {
  @JsonProperty("multiVariantPlaylist")
  private CacheControl multiVariantPlaylist;

  @JsonProperty("variantPlaylist")
  private CacheControl variantPlaylist;


  /**
   * Cache control settings for HLS Multivariant playlist.
   * @return multiVariantPlaylist
   */
  public CacheControl getMultiVariantPlaylist() {
    return multiVariantPlaylist;
  }

  /**
   * Cache control settings for HLS Multivariant playlist.
   *
   * @param multiVariantPlaylist
   *        Cache control settings for HLS Multivariant playlist.
   */
  public void setMultiVariantPlaylist(CacheControl multiVariantPlaylist) {
    this.multiVariantPlaylist = multiVariantPlaylist;
  }


  /**
   * Cache control settings for HLS Media playlist.
   * @return variantPlaylist
   */
  public CacheControl getVariantPlaylist() {
    return variantPlaylist;
  }

  /**
   * Cache control settings for HLS Media playlist.
   *
   * @param variantPlaylist
   *        Cache control settings for HLS Media playlist.
   */
  public void setVariantPlaylist(CacheControl variantPlaylist) {
    this.variantPlaylist = variantPlaylist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CacheControlSettingsHls cacheControlSettingsHls = (CacheControlSettingsHls) o;
    return Objects.equals(this.multiVariantPlaylist, cacheControlSettingsHls.multiVariantPlaylist) &&
        Objects.equals(this.variantPlaylist, cacheControlSettingsHls.variantPlaylist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiVariantPlaylist, variantPlaylist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CacheControlSettingsHls {\n");
    
    sb.append("    multiVariantPlaylist: ").append(toIndentedString(multiVariantPlaylist)).append("\n");
    sb.append("    variantPlaylist: ").append(toIndentedString(variantPlaylist)).append("\n");
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


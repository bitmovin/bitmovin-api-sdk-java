package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdMarkersSource;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HlsInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = HlsInput.class)
public class HlsInput extends Input {
  @JsonProperty("url")
  private String url;

  @JsonProperty("adMarkersSource")
  private AdMarkersSource adMarkersSource;


  /**
   * URL of HLS input
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * URL of HLS input
   *
   * @param url
   *        URL of HLS input
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Specifies the source for ad markers messages: - MANIFEST: Ad marker messages are read from tags in the HLS manifest - SEGMENTS: Ad marker messages are read from the content segments from the data stream 
   * @return adMarkersSource
   */
  public AdMarkersSource getAdMarkersSource() {
    return adMarkersSource;
  }

  /**
   * Specifies the source for ad markers messages: - MANIFEST: Ad marker messages are read from tags in the HLS manifest - SEGMENTS: Ad marker messages are read from the content segments from the data stream 
   *
   * @param adMarkersSource
   *        Specifies the source for ad markers messages: - MANIFEST: Ad marker messages are read from tags in the HLS manifest - SEGMENTS: Ad marker messages are read from the content segments from the data stream 
   */
  public void setAdMarkersSource(AdMarkersSource adMarkersSource) {
    this.adMarkersSource = adMarkersSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HlsInput hlsInput = (HlsInput) o;
    return Objects.equals(this.url, hlsInput.url) &&
        Objects.equals(this.adMarkersSource, hlsInput.adMarkersSource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, adMarkersSource, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HlsInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    adMarkersSource: ").append(toIndentedString(adMarkersSource)).append("\n");
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


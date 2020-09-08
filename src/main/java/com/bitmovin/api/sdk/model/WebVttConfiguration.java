package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SubtitleConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WebVttConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = WebVttConfiguration.class)
public class WebVttConfiguration extends SubtitleConfiguration {
  @JsonProperty("appendOptionalZeroHour")
  private Boolean appendOptionalZeroHour;

  @JsonProperty("ignoreRegion")
  private Boolean ignoreRegion;


  /**
   * If set to true, the hours section on webvtt timestamp values will explicitely have zeroes instead of being omitted for values where hours &#x3D; 0.
   * @return appendOptionalZeroHour
   */
  public Boolean getAppendOptionalZeroHour() {
    return appendOptionalZeroHour;
  }

  /**
   * If set to true, the hours section on webvtt timestamp values will explicitely have zeroes instead of being omitted for values where hours &#x3D; 0.
   *
   * @param appendOptionalZeroHour
   *        If set to true, the hours section on webvtt timestamp values will explicitely have zeroes instead of being omitted for values where hours &#x3D; 0.
   */
  public void setAppendOptionalZeroHour(Boolean appendOptionalZeroHour) {
    this.appendOptionalZeroHour = appendOptionalZeroHour;
  }


  /**
   * If set to true, the region information of the resulting webvtt file will be omitted. Defaults to false.
   * @return ignoreRegion
   */
  public Boolean getIgnoreRegion() {
    return ignoreRegion;
  }

  /**
   * If set to true, the region information of the resulting webvtt file will be omitted. Defaults to false.
   *
   * @param ignoreRegion
   *        If set to true, the region information of the resulting webvtt file will be omitted. Defaults to false.
   */
  public void setIgnoreRegion(Boolean ignoreRegion) {
    this.ignoreRegion = ignoreRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebVttConfiguration webVttConfiguration = (WebVttConfiguration) o;
    return Objects.equals(this.appendOptionalZeroHour, webVttConfiguration.appendOptionalZeroHour) &&
        Objects.equals(this.ignoreRegion, webVttConfiguration.ignoreRegion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appendOptionalZeroHour, ignoreRegion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebVttConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    appendOptionalZeroHour: ").append(toIndentedString(appendOptionalZeroHour)).append("\n");
    sb.append("    ignoreRegion: ").append(toIndentedString(ignoreRegion)).append("\n");
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


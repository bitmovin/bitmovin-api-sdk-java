package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Av1PerTitleConfiguration;
import com.bitmovin.api.sdk.model.H264PerTitleConfiguration;
import com.bitmovin.api.sdk.model.H265PerTitleConfiguration;
import com.bitmovin.api.sdk.model.Vp9PerTitleConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PerTitle
 */

public class PerTitle {
  @JsonProperty("h264Configuration")
  private H264PerTitleConfiguration h264Configuration;

  @JsonProperty("h265Configuration")
  private H265PerTitleConfiguration h265Configuration;

  @JsonProperty("vp9Configuration")
  private Vp9PerTitleConfiguration vp9Configuration;

  @JsonProperty("av1Configuration")
  private Av1PerTitleConfiguration av1Configuration;


  /**
   * Per-Title configuration for H264
   * @return h264Configuration
   */
  public H264PerTitleConfiguration getH264Configuration() {
    return h264Configuration;
  }

  /**
   * Per-Title configuration for H264
   *
   * @param h264Configuration
   *        Per-Title configuration for H264
   */
  public void setH264Configuration(H264PerTitleConfiguration h264Configuration) {
    this.h264Configuration = h264Configuration;
  }


  /**
   * Per-Title configuration for H265
   * @return h265Configuration
   */
  public H265PerTitleConfiguration getH265Configuration() {
    return h265Configuration;
  }

  /**
   * Per-Title configuration for H265
   *
   * @param h265Configuration
   *        Per-Title configuration for H265
   */
  public void setH265Configuration(H265PerTitleConfiguration h265Configuration) {
    this.h265Configuration = h265Configuration;
  }


  /**
   * Per-Title configuration for VP9
   * @return vp9Configuration
   */
  public Vp9PerTitleConfiguration getVp9Configuration() {
    return vp9Configuration;
  }

  /**
   * Per-Title configuration for VP9
   *
   * @param vp9Configuration
   *        Per-Title configuration for VP9
   */
  public void setVp9Configuration(Vp9PerTitleConfiguration vp9Configuration) {
    this.vp9Configuration = vp9Configuration;
  }


  /**
   * Per-Title configuration for AV1
   * @return av1Configuration
   */
  public Av1PerTitleConfiguration getAv1Configuration() {
    return av1Configuration;
  }

  /**
   * Per-Title configuration for AV1
   *
   * @param av1Configuration
   *        Per-Title configuration for AV1
   */
  public void setAv1Configuration(Av1PerTitleConfiguration av1Configuration) {
    this.av1Configuration = av1Configuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerTitle perTitle = (PerTitle) o;
    return Objects.equals(this.h264Configuration, perTitle.h264Configuration) &&
        Objects.equals(this.h265Configuration, perTitle.h265Configuration) &&
        Objects.equals(this.vp9Configuration, perTitle.vp9Configuration) &&
        Objects.equals(this.av1Configuration, perTitle.av1Configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(h264Configuration, h265Configuration, vp9Configuration, av1Configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerTitle {\n");
    
    sb.append("    h264Configuration: ").append(toIndentedString(h264Configuration)).append("\n");
    sb.append("    h265Configuration: ").append(toIndentedString(h265Configuration)).append("\n");
    sb.append("    vp9Configuration: ").append(toIndentedString(vp9Configuration)).append("\n");
    sb.append("    av1Configuration: ").append(toIndentedString(av1Configuration)).append("\n");
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


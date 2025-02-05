package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AutoRepresentation;
import com.bitmovin.api.sdk.model.PerTitleConfiguration;
import com.bitmovin.api.sdk.model.PerTitleFixedResolutionAndBitrateConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * H264PerTitleConfiguration
 */

public class H264PerTitleConfiguration extends PerTitleConfiguration {
  @JsonProperty("codecMinBitrateFactor")
  private Double codecMinBitrateFactor;

  @JsonProperty("codecMaxBitrateFactor")
  private Double codecMaxBitrateFactor;

  @JsonProperty("codecBufsizeFactor")
  private Double codecBufsizeFactor;


  /**
   * This factor doesn&#39;t have any impact!
   * @return codecMinBitrateFactor
   */
  public Double getCodecMinBitrateFactor() {
    return codecMinBitrateFactor;
  }

  /**
   * This factor doesn&#39;t have any impact!
   *
   * @param codecMinBitrateFactor
   *        This factor doesn&#39;t have any impact!
   */
  public void setCodecMinBitrateFactor(Double codecMinBitrateFactor) {
    this.codecMinBitrateFactor = codecMinBitrateFactor;
  }


  /**
   * This factor is used to calculate the maxBitrate of the codec configuration for the generated representations as a multiple of the targetBitrate
   * @return codecMaxBitrateFactor
   */
  public Double getCodecMaxBitrateFactor() {
    return codecMaxBitrateFactor;
  }

  /**
   * This factor is used to calculate the maxBitrate of the codec configuration for the generated representations as a multiple of the targetBitrate
   *
   * @param codecMaxBitrateFactor
   *        This factor is used to calculate the maxBitrate of the codec configuration for the generated representations as a multiple of the targetBitrate
   */
  public void setCodecMaxBitrateFactor(Double codecMaxBitrateFactor) {
    this.codecMaxBitrateFactor = codecMaxBitrateFactor;
  }


  /**
   * This factor is used to calculate the bufsize of the codec configuration for the generated representations as a multiple of the targetBitrate
   * @return codecBufsizeFactor
   */
  public Double getCodecBufsizeFactor() {
    return codecBufsizeFactor;
  }

  /**
   * This factor is used to calculate the bufsize of the codec configuration for the generated representations as a multiple of the targetBitrate
   *
   * @param codecBufsizeFactor
   *        This factor is used to calculate the bufsize of the codec configuration for the generated representations as a multiple of the targetBitrate
   */
  public void setCodecBufsizeFactor(Double codecBufsizeFactor) {
    this.codecBufsizeFactor = codecBufsizeFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    H264PerTitleConfiguration h264PerTitleConfiguration = (H264PerTitleConfiguration) o;
    return Objects.equals(this.codecMinBitrateFactor, h264PerTitleConfiguration.codecMinBitrateFactor) &&
        Objects.equals(this.codecMaxBitrateFactor, h264PerTitleConfiguration.codecMaxBitrateFactor) &&
        Objects.equals(this.codecBufsizeFactor, h264PerTitleConfiguration.codecBufsizeFactor) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codecMinBitrateFactor, codecMaxBitrateFactor, codecBufsizeFactor, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H264PerTitleConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    codecMinBitrateFactor: ").append(toIndentedString(codecMinBitrateFactor)).append("\n");
    sb.append("    codecMaxBitrateFactor: ").append(toIndentedString(codecMaxBitrateFactor)).append("\n");
    sb.append("    codecBufsizeFactor: ").append(toIndentedString(codecBufsizeFactor)).append("\n");
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


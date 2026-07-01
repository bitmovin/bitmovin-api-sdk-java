package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.DisplayAspectRatio;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.H265DynamicRangeFormat;
import com.bitmovin.api.sdk.model.H265V2MotionCompensatedTemporalFiltering;
import com.bitmovin.api.sdk.model.H265V2PresetConfiguration;
import com.bitmovin.api.sdk.model.H265V2RateControlModeConfig;
import com.bitmovin.api.sdk.model.PixelFormat;
import com.bitmovin.api.sdk.model.VideoConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * H265V2VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = H265V2VideoConfiguration.class)
public class H265V2VideoConfiguration extends VideoConfiguration {
  @JsonProperty("presetConfiguration")
  private H265V2PresetConfiguration presetConfiguration;

  @JsonProperty("dynamicRangeFormat")
  private H265DynamicRangeFormat dynamicRangeFormat;

  @JsonProperty("rateControlModeConfig")
  private H265V2RateControlModeConfig rateControlModeConfig;

  @JsonProperty("motionCompensatedTemporalFiltering")
  private H265V2MotionCompensatedTemporalFiltering motionCompensatedTemporalFiltering;

  @JsonProperty("levelHighTier")
  private Boolean levelHighTier;


  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   * @return presetConfiguration
   */
  public H265V2PresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   *
   * @param presetConfiguration
   *        Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   */
  public void setPresetConfiguration(H265V2PresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  /**
   * Automatically configures the encoder for the given SDR/HDR format.
   * @return dynamicRangeFormat
   */
  public H265DynamicRangeFormat getDynamicRangeFormat() {
    return dynamicRangeFormat;
  }

  /**
   * Automatically configures the encoder for the given SDR/HDR format.
   *
   * @param dynamicRangeFormat
   *        Automatically configures the encoder for the given SDR/HDR format.
   */
  public void setDynamicRangeFormat(H265DynamicRangeFormat dynamicRangeFormat) {
    this.dynamicRangeFormat = dynamicRangeFormat;
  }


  /**
   * Rate control mode configuration. Used to Configure the Perceptual Encoding Mode Settings.
   * @return rateControlModeConfig
   */
  public H265V2RateControlModeConfig getRateControlModeConfig() {
    return rateControlModeConfig;
  }

  /**
   * Rate control mode configuration. Used to Configure the Perceptual Encoding Mode Settings.
   *
   * @param rateControlModeConfig
   *        Rate control mode configuration. Used to Configure the Perceptual Encoding Mode Settings.
   */
  public void setRateControlModeConfig(H265V2RateControlModeConfig rateControlModeConfig) {
    this.rateControlModeConfig = rateControlModeConfig;
  }


  /**
   * Motion compensated temporal filtering mode.
   * @return motionCompensatedTemporalFiltering
   */
  public H265V2MotionCompensatedTemporalFiltering getMotionCompensatedTemporalFiltering() {
    return motionCompensatedTemporalFiltering;
  }

  /**
   * Motion compensated temporal filtering mode.
   *
   * @param motionCompensatedTemporalFiltering
   *        Motion compensated temporal filtering mode.
   */
  public void setMotionCompensatedTemporalFiltering(H265V2MotionCompensatedTemporalFiltering motionCompensatedTemporalFiltering) {
    this.motionCompensatedTemporalFiltering = motionCompensatedTemporalFiltering;
  }


  /**
   * Set codec tier to high when true, main when false.
   * @return levelHighTier
   */
  public Boolean getLevelHighTier() {
    return levelHighTier;
  }

  /**
   * Set codec tier to high when true, main when false.
   *
   * @param levelHighTier
   *        Set codec tier to high when true, main when false.
   */
  public void setLevelHighTier(Boolean levelHighTier) {
    this.levelHighTier = levelHighTier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    H265V2VideoConfiguration h265V2VideoConfiguration = (H265V2VideoConfiguration) o;
    return Objects.equals(this.presetConfiguration, h265V2VideoConfiguration.presetConfiguration) &&
        Objects.equals(this.dynamicRangeFormat, h265V2VideoConfiguration.dynamicRangeFormat) &&
        Objects.equals(this.rateControlModeConfig, h265V2VideoConfiguration.rateControlModeConfig) &&
        Objects.equals(this.motionCompensatedTemporalFiltering, h265V2VideoConfiguration.motionCompensatedTemporalFiltering) &&
        Objects.equals(this.levelHighTier, h265V2VideoConfiguration.levelHighTier) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, dynamicRangeFormat, rateControlModeConfig, motionCompensatedTemporalFiltering, levelHighTier, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H265V2VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
    sb.append("    dynamicRangeFormat: ").append(toIndentedString(dynamicRangeFormat)).append("\n");
    sb.append("    rateControlModeConfig: ").append(toIndentedString(rateControlModeConfig)).append("\n");
    sb.append("    motionCompensatedTemporalFiltering: ").append(toIndentedString(motionCompensatedTemporalFiltering)).append("\n");
    sb.append("    levelHighTier: ").append(toIndentedString(levelHighTier)).append("\n");
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


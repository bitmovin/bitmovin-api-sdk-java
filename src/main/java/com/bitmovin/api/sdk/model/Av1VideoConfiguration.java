package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AutoLevelSetup;
import com.bitmovin.api.sdk.model.Av1PresetConfiguration;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.DisplayAspectRatio;
import com.bitmovin.api.sdk.model.EncodingMode;
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
 * Av1VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Av1VideoConfiguration.class)
public class Av1VideoConfiguration extends VideoConfiguration {
  @JsonProperty("presetConfiguration")
  private Av1PresetConfiguration presetConfiguration;

  @JsonProperty("autoLevelSetup")
  private AutoLevelSetup autoLevelSetup;

  @JsonProperty("masterDisplay")
  private String masterDisplay;

  @JsonProperty("maxContentLightLevel")
  private Integer maxContentLightLevel;

  @JsonProperty("maxPictureAverageLightLevel")
  private Integer maxPictureAverageLightLevel;


  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   * @return presetConfiguration
   */
  public Av1PresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   *
   * @param presetConfiguration
   *        Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   */
  public void setPresetConfiguration(Av1PresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  /**
   * Enable/disable automatic calculation of level, maxBitrate, and bufsize based on the least level that satisfies maximum property values for picture resolution, frame rate, and bit rate. In the case the target level is set explicitly, the maximum bitrate and buffer size are calculated based on the defined level. Explicitly setting maxBitrate, or bufsize properties will disable the automatic calculation.
   * @return autoLevelSetup
   */
  public AutoLevelSetup getAutoLevelSetup() {
    return autoLevelSetup;
  }

  /**
   * Enable/disable automatic calculation of level, maxBitrate, and bufsize based on the least level that satisfies maximum property values for picture resolution, frame rate, and bit rate. In the case the target level is set explicitly, the maximum bitrate and buffer size are calculated based on the defined level. Explicitly setting maxBitrate, or bufsize properties will disable the automatic calculation.
   *
   * @param autoLevelSetup
   *        Enable/disable automatic calculation of level, maxBitrate, and bufsize based on the least level that satisfies maximum property values for picture resolution, frame rate, and bit rate. In the case the target level is set explicitly, the maximum bitrate and buffer size are calculated based on the defined level. Explicitly setting maxBitrate, or bufsize properties will disable the automatic calculation.
   */
  public void setAutoLevelSetup(AutoLevelSetup autoLevelSetup) {
    this.autoLevelSetup = autoLevelSetup;
  }


  /**
   * Set the mastering display color volume metadata. The chromaticity coordinates for the green (G), blue (B), red (R) primaries and the white point (WP) are given in increments of 0.00002 (i.e. multiply the actual value by 50000), and the luminance values (L) are given in increments of 0.0001 cd/m² (i.e. multiply the actual value by 10000). For example &#x60;G(13250,34500)B(7500,3000)R(34000,16000)WP(15635,16450)L(10000000,1)&#x60; describes a P3D65 1000-nits monitor, where G(x&#x3D;0.265, y&#x3D;0.690), B(x&#x3D;0.150, y&#x3D;0.060), R(x&#x3D;0.680, y&#x3D;0.320), WP(x&#x3D;0.3127, y&#x3D;0.3290), L(max&#x3D;1000, min&#x3D;0.0001). Part of HDR-10 metadata.
   * @return masterDisplay
   */
  public String getMasterDisplay() {
    return masterDisplay;
  }

  /**
   * Set the mastering display color volume metadata. The chromaticity coordinates for the green (G), blue (B), red (R) primaries and the white point (WP) are given in increments of 0.00002 (i.e. multiply the actual value by 50000), and the luminance values (L) are given in increments of 0.0001 cd/m² (i.e. multiply the actual value by 10000). For example &#x60;G(13250,34500)B(7500,3000)R(34000,16000)WP(15635,16450)L(10000000,1)&#x60; describes a P3D65 1000-nits monitor, where G(x&#x3D;0.265, y&#x3D;0.690), B(x&#x3D;0.150, y&#x3D;0.060), R(x&#x3D;0.680, y&#x3D;0.320), WP(x&#x3D;0.3127, y&#x3D;0.3290), L(max&#x3D;1000, min&#x3D;0.0001). Part of HDR-10 metadata.
   *
   * @param masterDisplay
   *        Set the mastering display color volume metadata. The chromaticity coordinates for the green (G), blue (B), red (R) primaries and the white point (WP) are given in increments of 0.00002 (i.e. multiply the actual value by 50000), and the luminance values (L) are given in increments of 0.0001 cd/m² (i.e. multiply the actual value by 10000). For example &#x60;G(13250,34500)B(7500,3000)R(34000,16000)WP(15635,16450)L(10000000,1)&#x60; describes a P3D65 1000-nits monitor, where G(x&#x3D;0.265, y&#x3D;0.690), B(x&#x3D;0.150, y&#x3D;0.060), R(x&#x3D;0.680, y&#x3D;0.320), WP(x&#x3D;0.3127, y&#x3D;0.3290), L(max&#x3D;1000, min&#x3D;0.0001). Part of HDR-10 metadata.
   */
  public void setMasterDisplay(String masterDisplay) {
    this.masterDisplay = masterDisplay;
  }


  /**
   * Set the max content light level (MaxCLL). Use together with maxPictureAverageLightLevel (which will be 0 if not set). Part of HDR-10 metadata.
   * minimum: 0
   * maximum: 65535
   * @return maxContentLightLevel
   */
  public Integer getMaxContentLightLevel() {
    return maxContentLightLevel;
  }

  /**
   * Set the max content light level (MaxCLL). Use together with maxPictureAverageLightLevel (which will be 0 if not set). Part of HDR-10 metadata.
   * minimum: 0
   * maximum: 65535
   *
   * @param maxContentLightLevel
   *        Set the max content light level (MaxCLL). Use together with maxPictureAverageLightLevel (which will be 0 if not set). Part of HDR-10 metadata.
   *        minimum: 0
   *        maximum: 65535
   */
  public void setMaxContentLightLevel(Integer maxContentLightLevel) {
    this.maxContentLightLevel = maxContentLightLevel;
  }


  /**
   * Set the maximum picture average light level (MaxFALL). Use together with maxContentLightLevel (which will be 0 if not set). Part of HDR-10 metadata.
   * minimum: 0
   * maximum: 65535
   * @return maxPictureAverageLightLevel
   */
  public Integer getMaxPictureAverageLightLevel() {
    return maxPictureAverageLightLevel;
  }

  /**
   * Set the maximum picture average light level (MaxFALL). Use together with maxContentLightLevel (which will be 0 if not set). Part of HDR-10 metadata.
   * minimum: 0
   * maximum: 65535
   *
   * @param maxPictureAverageLightLevel
   *        Set the maximum picture average light level (MaxFALL). Use together with maxContentLightLevel (which will be 0 if not set). Part of HDR-10 metadata.
   *        minimum: 0
   *        maximum: 65535
   */
  public void setMaxPictureAverageLightLevel(Integer maxPictureAverageLightLevel) {
    this.maxPictureAverageLightLevel = maxPictureAverageLightLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Av1VideoConfiguration av1VideoConfiguration = (Av1VideoConfiguration) o;
    return Objects.equals(this.presetConfiguration, av1VideoConfiguration.presetConfiguration) &&
        Objects.equals(this.autoLevelSetup, av1VideoConfiguration.autoLevelSetup) &&
        Objects.equals(this.masterDisplay, av1VideoConfiguration.masterDisplay) &&
        Objects.equals(this.maxContentLightLevel, av1VideoConfiguration.maxContentLightLevel) &&
        Objects.equals(this.maxPictureAverageLightLevel, av1VideoConfiguration.maxPictureAverageLightLevel) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, autoLevelSetup, masterDisplay, maxContentLightLevel, maxPictureAverageLightLevel, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Av1VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
    sb.append("    autoLevelSetup: ").append(toIndentedString(autoLevelSetup)).append("\n");
    sb.append("    masterDisplay: ").append(toIndentedString(masterDisplay)).append("\n");
    sb.append("    maxContentLightLevel: ").append(toIndentedString(maxContentLightLevel)).append("\n");
    sb.append("    maxPictureAverageLightLevel: ").append(toIndentedString(maxPictureAverageLightLevel)).append("\n");
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


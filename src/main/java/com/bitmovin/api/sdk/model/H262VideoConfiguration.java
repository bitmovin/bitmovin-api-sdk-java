package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.DisplayAspectRatio;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.H262InterlaceMode;
import com.bitmovin.api.sdk.model.H262PresetConfiguration;
import com.bitmovin.api.sdk.model.LevelH262;
import com.bitmovin.api.sdk.model.PixelFormat;
import com.bitmovin.api.sdk.model.ProfileH262;
import com.bitmovin.api.sdk.model.VideoConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * H262VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = H262VideoConfiguration.class)
public class H262VideoConfiguration extends VideoConfiguration {
  @JsonProperty("presetConfiguration")
  private H262PresetConfiguration presetConfiguration;

  @JsonProperty("profile")
  private ProfileH262 profile;

  @JsonProperty("bframes")
  private Integer bframes;

  @JsonProperty("maxBitrate")
  private Long maxBitrate;

  @JsonProperty("minBitrate")
  private Long minBitrate;

  @JsonProperty("bufsize")
  private Long bufsize;

  @JsonProperty("gopSize")
  private Integer gopSize;

  @JsonProperty("level")
  private LevelH262 level;

  @JsonProperty("interlaceMode")
  private H262InterlaceMode interlaceMode;


  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   * @return presetConfiguration
   */
  public H262PresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   *
   * @param presetConfiguration
   *        Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   */
  public void setPresetConfiguration(H262PresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  /**
   * When setting a profile, all other settings must not exceed the limits which are defined in the profile. Otherwise, a higher profile may be automatically chosen. (required)
   * @return profile
   */
  public ProfileH262 getProfile() {
    return profile;
  }

  /**
   * When setting a profile, all other settings must not exceed the limits which are defined in the profile. Otherwise, a higher profile may be automatically chosen. (required)
   *
   * @param profile
   *        When setting a profile, all other settings must not exceed the limits which are defined in the profile. Otherwise, a higher profile may be automatically chosen. (required)
   */
  public void setProfile(ProfileH262 profile) {
    this.profile = profile;
  }


  /**
   * Amount of b frames.
   * minimum: 0
   * maximum: 16
   * @return bframes
   */
  public Integer getBframes() {
    return bframes;
  }

  /**
   * Amount of b frames.
   * minimum: 0
   * maximum: 16
   *
   * @param bframes
   *        Amount of b frames.
   *        minimum: 0
   *        maximum: 16
   */
  public void setBframes(Integer bframes) {
    this.bframes = bframes;
  }


  /**
   * Maximum Bitrate
   * @return maxBitrate
   */
  public Long getMaxBitrate() {
    return maxBitrate;
  }

  /**
   * Maximum Bitrate
   *
   * @param maxBitrate
   *        Maximum Bitrate
   */
  public void setMaxBitrate(Long maxBitrate) {
    this.maxBitrate = maxBitrate;
  }


  /**
   * Minimum Bitrate
   * @return minBitrate
   */
  public Long getMinBitrate() {
    return minBitrate;
  }

  /**
   * Minimum Bitrate
   *
   * @param minBitrate
   *        Minimum Bitrate
   */
  public void setMinBitrate(Long minBitrate) {
    this.minBitrate = minBitrate;
  }


  /**
   * Playback device buffer size
   * @return bufsize
   */
  public Long getBufsize() {
    return bufsize;
  }

  /**
   * Playback device buffer size
   *
   * @param bufsize
   *        Playback device buffer size
   */
  public void setBufsize(Long bufsize) {
    this.bufsize = bufsize;
  }


  /**
   * Minimum GOP length, the minimum distance between I-frames
   * @return gopSize
   */
  public Integer getGopSize() {
    return gopSize;
  }

  /**
   * Minimum GOP length, the minimum distance between I-frames
   *
   * @param gopSize
   *        Minimum GOP length, the minimum distance between I-frames
   */
  public void setGopSize(Integer gopSize) {
    this.gopSize = gopSize;
  }


  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile
   * @return level
   */
  public LevelH262 getLevel() {
    return level;
  }

  /**
   * Specified set of constraints that indicate a degree of required decoder performance for a profile
   *
   * @param level
   *        Specified set of constraints that indicate a degree of required decoder performance for a profile
   */
  public void setLevel(LevelH262 level) {
    this.level = level;
  }


  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   * @return interlaceMode
   */
  public H262InterlaceMode getInterlaceMode() {
    return interlaceMode;
  }

  /**
   * Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   *
   * @param interlaceMode
   *        Using TOP_FIELD_FIRST or BOTTOM_FIELD_FIRST will output interlaced video
   */
  public void setInterlaceMode(H262InterlaceMode interlaceMode) {
    this.interlaceMode = interlaceMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    H262VideoConfiguration h262VideoConfiguration = (H262VideoConfiguration) o;
    return Objects.equals(this.presetConfiguration, h262VideoConfiguration.presetConfiguration) &&
        Objects.equals(this.profile, h262VideoConfiguration.profile) &&
        Objects.equals(this.bframes, h262VideoConfiguration.bframes) &&
        Objects.equals(this.maxBitrate, h262VideoConfiguration.maxBitrate) &&
        Objects.equals(this.minBitrate, h262VideoConfiguration.minBitrate) &&
        Objects.equals(this.bufsize, h262VideoConfiguration.bufsize) &&
        Objects.equals(this.gopSize, h262VideoConfiguration.gopSize) &&
        Objects.equals(this.level, h262VideoConfiguration.level) &&
        Objects.equals(this.interlaceMode, h262VideoConfiguration.interlaceMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, profile, bframes, maxBitrate, minBitrate, bufsize, gopSize, level, interlaceMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class H262VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    bframes: ").append(toIndentedString(bframes)).append("\n");
    sb.append("    maxBitrate: ").append(toIndentedString(maxBitrate)).append("\n");
    sb.append("    minBitrate: ").append(toIndentedString(minBitrate)).append("\n");
    sb.append("    bufsize: ").append(toIndentedString(bufsize)).append("\n");
    sb.append("    gopSize: ").append(toIndentedString(gopSize)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    interlaceMode: ").append(toIndentedString(interlaceMode)).append("\n");
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


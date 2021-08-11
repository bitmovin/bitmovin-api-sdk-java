package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.DtsXChannelLayout;
import com.bitmovin.api.sdk.model.MediaConfigBitrate;
import com.bitmovin.api.sdk.model.OttLoudnessMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The configuration for the DTS:X
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DtsXAudioConfiguration.class)
public class DtsXAudioConfiguration extends AudioConfiguration {
  @JsonProperty("channelLayout")
  private DtsXChannelLayout channelLayout;

  @JsonProperty("lkfsValue")
  private Double lkfsValue;

  @JsonProperty("ottLoudnessMode")
  private OttLoudnessMode ottLoudnessMode;

  @JsonProperty("syncInterval")
  private Long syncInterval;


  /**
   * Get channelLayout
   * @return channelLayout
   */
  public DtsXChannelLayout getChannelLayout() {
    return channelLayout;
  }

  /**
   * Set channelLayout
   *
   * @param channelLayout
   */
  public void setChannelLayout(DtsXChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  /**
   * Loudness relative to full scale (K-weighted).
   * minimum: -40
   * maximum: 0
   * @return lkfsValue
   */
  public Double getLkfsValue() {
    return lkfsValue;
  }

  /**
   * Loudness relative to full scale (K-weighted).
   * minimum: -40
   * maximum: 0
   *
   * @param lkfsValue
   *        Loudness relative to full scale (K-weighted).
   *        minimum: -40
   *        maximum: 0
   */
  public void setLkfsValue(Double lkfsValue) {
    this.lkfsValue = lkfsValue;
  }


  /**
   * Get ottLoudnessMode
   * @return ottLoudnessMode
   */
  public OttLoudnessMode getOttLoudnessMode() {
    return ottLoudnessMode;
  }

  /**
   * Set ottLoudnessMode
   *
   * @param ottLoudnessMode
   */
  public void setOttLoudnessMode(OttLoudnessMode ottLoudnessMode) {
    this.ottLoudnessMode = ottLoudnessMode;
  }


  /**
   * Specifies the sync interval which ranges from 1 to 10
   * minimum: 1
   * maximum: 10
   * @return syncInterval
   */
  public Long getSyncInterval() {
    return syncInterval;
  }

  /**
   * Specifies the sync interval which ranges from 1 to 10
   * minimum: 1
   * maximum: 10
   *
   * @param syncInterval
   *        Specifies the sync interval which ranges from 1 to 10
   *        minimum: 1
   *        maximum: 10
   */
  public void setSyncInterval(Long syncInterval) {
    this.syncInterval = syncInterval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DtsXAudioConfiguration dtsXAudioConfiguration = (DtsXAudioConfiguration) o;
    return Objects.equals(this.channelLayout, dtsXAudioConfiguration.channelLayout) &&
        Objects.equals(this.lkfsValue, dtsXAudioConfiguration.lkfsValue) &&
        Objects.equals(this.ottLoudnessMode, dtsXAudioConfiguration.ottLoudnessMode) &&
        Objects.equals(this.syncInterval, dtsXAudioConfiguration.syncInterval) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLayout, lkfsValue, ottLoudnessMode, syncInterval, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DtsXAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    lkfsValue: ").append(toIndentedString(lkfsValue)).append("\n");
    sb.append("    ottLoudnessMode: ").append(toIndentedString(ottLoudnessMode)).append("\n");
    sb.append("    syncInterval: ").append(toIndentedString(syncInterval)).append("\n");
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


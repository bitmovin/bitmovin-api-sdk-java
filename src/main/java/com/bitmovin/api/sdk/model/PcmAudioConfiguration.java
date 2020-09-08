package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.PcmChannelLayout;
import com.bitmovin.api.sdk.model.PcmPresetConfiguration;
import com.bitmovin.api.sdk.model.PcmSampleFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PcmAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = PcmAudioConfiguration.class)
public class PcmAudioConfiguration extends AudioConfiguration {
  @JsonProperty("presetConfiguration")
  private PcmPresetConfiguration presetConfiguration;

  @JsonProperty("channelLayout")
  private PcmChannelLayout channelLayout;

  @JsonProperty("sampleFormat")
  private PcmSampleFormat sampleFormat;


  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   * @return presetConfiguration
   */
  public PcmPresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   *
   * @param presetConfiguration
   *        Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   */
  public void setPresetConfiguration(PcmPresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  /**
   * Channel layout of the audio codec configuration
   * @return channelLayout
   */
  public PcmChannelLayout getChannelLayout() {
    return channelLayout;
  }

  /**
   * Channel layout of the audio codec configuration
   *
   * @param channelLayout
   *        Channel layout of the audio codec configuration
   */
  public void setChannelLayout(PcmChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  /**
   * Sampling format of the audio codec configuration
   * @return sampleFormat
   */
  public PcmSampleFormat getSampleFormat() {
    return sampleFormat;
  }

  /**
   * Sampling format of the audio codec configuration
   *
   * @param sampleFormat
   *        Sampling format of the audio codec configuration
   */
  public void setSampleFormat(PcmSampleFormat sampleFormat) {
    this.sampleFormat = sampleFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PcmAudioConfiguration pcmAudioConfiguration = (PcmAudioConfiguration) o;
    return Objects.equals(this.presetConfiguration, pcmAudioConfiguration.presetConfiguration) &&
        Objects.equals(this.channelLayout, pcmAudioConfiguration.channelLayout) &&
        Objects.equals(this.sampleFormat, pcmAudioConfiguration.sampleFormat) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, channelLayout, sampleFormat, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PcmAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    sampleFormat: ").append(toIndentedString(sampleFormat)).append("\n");
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


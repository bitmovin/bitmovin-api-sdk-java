package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AacChannelLayout;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AacAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AacAudioConfiguration.class)
public class AacAudioConfiguration extends AudioConfiguration {
  @JsonProperty("channelLayout")
  private AacChannelLayout channelLayout;

  @JsonProperty("cutoffFrequency")
  private Integer cutoffFrequency;


  /**
   * Channel layout of the audio codec configuration
   * @return channelLayout
   */
  public AacChannelLayout getChannelLayout() {
    return channelLayout;
  }

  /**
   * Channel layout of the audio codec configuration
   *
   * @param channelLayout
   *        Channel layout of the audio codec configuration
   */
  public void setChannelLayout(AacChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  /**
   * The highest frequency that will pass the audio encoder. This value is optional.
   * @return cutoffFrequency
   */
  public Integer getCutoffFrequency() {
    return cutoffFrequency;
  }

  /**
   * The highest frequency that will pass the audio encoder. This value is optional.
   *
   * @param cutoffFrequency
   *        The highest frequency that will pass the audio encoder. This value is optional.
   */
  public void setCutoffFrequency(Integer cutoffFrequency) {
    this.cutoffFrequency = cutoffFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AacAudioConfiguration aacAudioConfiguration = (AacAudioConfiguration) o;
    return Objects.equals(this.channelLayout, aacAudioConfiguration.channelLayout) &&
        Objects.equals(this.cutoffFrequency, aacAudioConfiguration.cutoffFrequency) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLayout, cutoffFrequency, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AacAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    cutoffFrequency: ").append(toIndentedString(cutoffFrequency)).append("\n");
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


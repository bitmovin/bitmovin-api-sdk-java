package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.OpusChannelLayout;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * OpusAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = OpusAudioConfiguration.class)
public class OpusAudioConfiguration extends AudioConfiguration {
  @JsonProperty("channelLayout")
  private OpusChannelLayout channelLayout;


  /**
   * Channel layout of the audio codec configuration
   * @return channelLayout
   */
  public OpusChannelLayout getChannelLayout() {
    return channelLayout;
  }

  /**
   * Channel layout of the audio codec configuration
   *
   * @param channelLayout
   *        Channel layout of the audio codec configuration
   */
  public void setChannelLayout(OpusChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpusAudioConfiguration opusAudioConfiguration = (OpusAudioConfiguration) o;
    return Objects.equals(this.channelLayout, opusAudioConfiguration.channelLayout) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLayout, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpusAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
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


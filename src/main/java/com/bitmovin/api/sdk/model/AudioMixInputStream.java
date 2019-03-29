package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioMixInputChannelLayout;
import com.bitmovin.api.sdk.model.AudioMixInputStreamChannel;
import com.bitmovin.api.sdk.model.BasicInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioMixInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class AudioMixInputStream extends BasicInputStream {
  @JsonProperty("channelLayout")
  private AudioMixInputChannelLayout channelLayout = null;

  @JsonProperty("audioMixChannels")
  private List<AudioMixInputStreamChannel> audioMixChannels;


  /**
   * Channel layout of the audio mix input stream
   * @return channelLayout
   */
  public AudioMixInputChannelLayout getChannelLayout() {
    return channelLayout;
  }

  public void setChannelLayout(AudioMixInputChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  public AudioMixInputStream addAudioMixChannelsItem(AudioMixInputStreamChannel audioMixChannelsItem) {
    if (this.audioMixChannels == null) {
      this.audioMixChannels = new ArrayList<>();
    }
    this.audioMixChannels.add(audioMixChannelsItem);
    return this;
  }

  /**
   * Get audioMixChannels
   * @return audioMixChannels
   */
  public List<AudioMixInputStreamChannel> getAudioMixChannels() {
    return audioMixChannels;
  }

  public void setAudioMixChannels(List<AudioMixInputStreamChannel> audioMixChannels) {
    this.audioMixChannels = audioMixChannels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioMixInputStream audioMixInputStream = (AudioMixInputStream) o;
    return Objects.equals(this.channelLayout, audioMixInputStream.channelLayout) &&
        Objects.equals(this.audioMixChannels, audioMixInputStream.audioMixChannels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLayout, audioMixChannels, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioMixInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    audioMixChannels: ").append(toIndentedString(audioMixChannels)).append("\n");
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


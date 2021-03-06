package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioMixSourceChannelType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioMixInputStreamSourceChannel
 */

public class AudioMixInputStreamSourceChannel {
  @JsonProperty("gain")
  private Double gain;

  @JsonProperty("type")
  private AudioMixSourceChannelType type;

  @JsonProperty("channelNumber")
  private Integer channelNumber;


  /**
   * Gain for this source channel. Default is 1.0.
   * @return gain
   */
  public Double getGain() {
    return gain;
  }

  /**
   * Gain for this source channel. Default is 1.0.
   *
   * @param gain
   *        Gain for this source channel. Default is 1.0.
   */
  public void setGain(Double gain) {
    this.gain = gain;
  }


  /**
   * Get type
   * @return type
   */
  public AudioMixSourceChannelType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(AudioMixSourceChannelType type) {
    this.type = type;
  }


  /**
   * Number of this source channel. If type is &#39;CHANNEL_NUMBER&#39;, this must be set.
   * @return channelNumber
   */
  public Integer getChannelNumber() {
    return channelNumber;
  }

  /**
   * Number of this source channel. If type is &#39;CHANNEL_NUMBER&#39;, this must be set.
   *
   * @param channelNumber
   *        Number of this source channel. If type is &#39;CHANNEL_NUMBER&#39;, this must be set.
   */
  public void setChannelNumber(Integer channelNumber) {
    this.channelNumber = channelNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioMixInputStreamSourceChannel audioMixInputStreamSourceChannel = (AudioMixInputStreamSourceChannel) o;
    return Objects.equals(this.gain, audioMixInputStreamSourceChannel.gain) &&
        Objects.equals(this.type, audioMixInputStreamSourceChannel.type) &&
        Objects.equals(this.channelNumber, audioMixInputStreamSourceChannel.channelNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gain, type, channelNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioMixInputStreamSourceChannel {\n");
    
    sb.append("    gain: ").append(toIndentedString(gain)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    channelNumber: ").append(toIndentedString(channelNumber)).append("\n");
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


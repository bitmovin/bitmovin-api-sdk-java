package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AacChannelLayout;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.HeAacV1Signaling;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HeAacV1AudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = HeAacV1AudioConfiguration.class)
public class HeAacV1AudioConfiguration extends AudioConfiguration {
  @JsonProperty("channelLayout")
  private AacChannelLayout channelLayout;

  @JsonProperty("signaling")
  private HeAacV1Signaling signaling;


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
   * Spectral Band Replication (SBR) and Parameteric Stereo (PS) signaling style.
   * @return signaling
   */
  public HeAacV1Signaling getSignaling() {
    return signaling;
  }

  /**
   * Spectral Band Replication (SBR) and Parameteric Stereo (PS) signaling style.
   *
   * @param signaling
   *        Spectral Band Replication (SBR) and Parameteric Stereo (PS) signaling style.
   */
  public void setSignaling(HeAacV1Signaling signaling) {
    this.signaling = signaling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeAacV1AudioConfiguration heAacV1AudioConfiguration = (HeAacV1AudioConfiguration) o;
    return Objects.equals(this.channelLayout, heAacV1AudioConfiguration.channelLayout) &&
        Objects.equals(this.signaling, heAacV1AudioConfiguration.signaling) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLayout, signaling, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeAacV1AudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    signaling: ").append(toIndentedString(signaling)).append("\n");
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


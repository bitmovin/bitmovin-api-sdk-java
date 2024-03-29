package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.DolbyDigitalBitstreamInfo;
import com.bitmovin.api.sdk.model.DolbyDigitalChannelLayout;
import com.bitmovin.api.sdk.model.DolbyDigitalDownmixing;
import com.bitmovin.api.sdk.model.DolbyDigitalEvolutionFrameworkControl;
import com.bitmovin.api.sdk.model.DolbyDigitalLoudnessControl;
import com.bitmovin.api.sdk.model.DolbyDigitalPreprocessing;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyDigitalAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DolbyDigitalAudioConfiguration.class)
public class DolbyDigitalAudioConfiguration extends AudioConfiguration {
  @JsonProperty("bitstreamInfo")
  private DolbyDigitalBitstreamInfo bitstreamInfo;

  @JsonProperty("channelLayout")
  private DolbyDigitalChannelLayout channelLayout;

  @JsonProperty("downmixing")
  private DolbyDigitalDownmixing downmixing;

  @JsonProperty("evolutionFrameworkControl")
  private DolbyDigitalEvolutionFrameworkControl evolutionFrameworkControl;

  @JsonProperty("loudnessControl")
  private DolbyDigitalLoudnessControl loudnessControl;

  @JsonProperty("preprocessing")
  private DolbyDigitalPreprocessing preprocessing;


  /**
   * BitstreamInfo defines metadata parameters contained in the Dolby Digital audio bitstream
   * @return bitstreamInfo
   */
  public DolbyDigitalBitstreamInfo getBitstreamInfo() {
    return bitstreamInfo;
  }

  /**
   * BitstreamInfo defines metadata parameters contained in the Dolby Digital audio bitstream
   *
   * @param bitstreamInfo
   *        BitstreamInfo defines metadata parameters contained in the Dolby Digital audio bitstream
   */
  public void setBitstreamInfo(DolbyDigitalBitstreamInfo bitstreamInfo) {
    this.bitstreamInfo = bitstreamInfo;
  }


  /**
   * Channel layout of the audio codec configuration.
   * @return channelLayout
   */
  public DolbyDigitalChannelLayout getChannelLayout() {
    return channelLayout;
  }

  /**
   * Channel layout of the audio codec configuration.
   *
   * @param channelLayout
   *        Channel layout of the audio codec configuration.
   */
  public void setChannelLayout(DolbyDigitalChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  /**
   * Get downmixing
   * @return downmixing
   */
  public DolbyDigitalDownmixing getDownmixing() {
    return downmixing;
  }

  /**
   * Set downmixing
   *
   * @param downmixing
   */
  public void setDownmixing(DolbyDigitalDownmixing downmixing) {
    this.downmixing = downmixing;
  }


  /**
   * It provides a framework for signaling new evolution framework applications, such as Intelligent Loudness, in each Dolby codec. 
   * @return evolutionFrameworkControl
   */
  public DolbyDigitalEvolutionFrameworkControl getEvolutionFrameworkControl() {
    return evolutionFrameworkControl;
  }

  /**
   * It provides a framework for signaling new evolution framework applications, such as Intelligent Loudness, in each Dolby codec. 
   *
   * @param evolutionFrameworkControl
   *        It provides a framework for signaling new evolution framework applications, such as Intelligent Loudness, in each Dolby codec. 
   */
  public void setEvolutionFrameworkControl(DolbyDigitalEvolutionFrameworkControl evolutionFrameworkControl) {
    this.evolutionFrameworkControl = evolutionFrameworkControl;
  }


  /**
   * Settings for loudness control (required)
   * @return loudnessControl
   */
  public DolbyDigitalLoudnessControl getLoudnessControl() {
    return loudnessControl;
  }

  /**
   * Settings for loudness control (required)
   *
   * @param loudnessControl
   *        Settings for loudness control (required)
   */
  public void setLoudnessControl(DolbyDigitalLoudnessControl loudnessControl) {
    this.loudnessControl = loudnessControl;
  }


  /**
   * Get preprocessing
   * @return preprocessing
   */
  public DolbyDigitalPreprocessing getPreprocessing() {
    return preprocessing;
  }

  /**
   * Set preprocessing
   *
   * @param preprocessing
   */
  public void setPreprocessing(DolbyDigitalPreprocessing preprocessing) {
    this.preprocessing = preprocessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyDigitalAudioConfiguration dolbyDigitalAudioConfiguration = (DolbyDigitalAudioConfiguration) o;
    return Objects.equals(this.bitstreamInfo, dolbyDigitalAudioConfiguration.bitstreamInfo) &&
        Objects.equals(this.channelLayout, dolbyDigitalAudioConfiguration.channelLayout) &&
        Objects.equals(this.downmixing, dolbyDigitalAudioConfiguration.downmixing) &&
        Objects.equals(this.evolutionFrameworkControl, dolbyDigitalAudioConfiguration.evolutionFrameworkControl) &&
        Objects.equals(this.loudnessControl, dolbyDigitalAudioConfiguration.loudnessControl) &&
        Objects.equals(this.preprocessing, dolbyDigitalAudioConfiguration.preprocessing) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitstreamInfo, channelLayout, downmixing, evolutionFrameworkControl, loudnessControl, preprocessing, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bitstreamInfo: ").append(toIndentedString(bitstreamInfo)).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    downmixing: ").append(toIndentedString(downmixing)).append("\n");
    sb.append("    evolutionFrameworkControl: ").append(toIndentedString(evolutionFrameworkControl)).append("\n");
    sb.append("    loudnessControl: ").append(toIndentedString(loudnessControl)).append("\n");
    sb.append("    preprocessing: ").append(toIndentedString(preprocessing)).append("\n");
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


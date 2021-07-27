package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusBitstreamInfo;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusChannelLayout;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusDownmixing;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusEvolutionFrameworkControl;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusLoudnessControl;
import com.bitmovin.api.sdk.model.DolbyDigitalPlusPreprocessing;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyDigitalPlusAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DolbyDigitalPlusAudioConfiguration.class)
public class DolbyDigitalPlusAudioConfiguration extends AudioConfiguration {
  @JsonProperty("bitstreamInfo")
  private DolbyDigitalPlusBitstreamInfo bitstreamInfo;

  @JsonProperty("channelLayout")
  private DolbyDigitalPlusChannelLayout channelLayout;

  @JsonProperty("downmixing")
  private DolbyDigitalPlusDownmixing downmixing;

  @JsonProperty("evolutionFrameworkControl")
  private DolbyDigitalPlusEvolutionFrameworkControl evolutionFrameworkControl;

  @JsonProperty("loudnessControl")
  private DolbyDigitalPlusLoudnessControl loudnessControl;

  @JsonProperty("preprocessing")
  private DolbyDigitalPlusPreprocessing preprocessing;


  /**
   * BitstreamInfo defines metadata parameters contained in the Dolby Digital Plus audio bitstream
   * @return bitstreamInfo
   */
  public DolbyDigitalPlusBitstreamInfo getBitstreamInfo() {
    return bitstreamInfo;
  }

  /**
   * BitstreamInfo defines metadata parameters contained in the Dolby Digital Plus audio bitstream
   *
   * @param bitstreamInfo
   *        BitstreamInfo defines metadata parameters contained in the Dolby Digital Plus audio bitstream
   */
  public void setBitstreamInfo(DolbyDigitalPlusBitstreamInfo bitstreamInfo) {
    this.bitstreamInfo = bitstreamInfo;
  }


  /**
   * Channel layout of the audio codec configuration.
   * @return channelLayout
   */
  public DolbyDigitalPlusChannelLayout getChannelLayout() {
    return channelLayout;
  }

  /**
   * Channel layout of the audio codec configuration.
   *
   * @param channelLayout
   *        Channel layout of the audio codec configuration.
   */
  public void setChannelLayout(DolbyDigitalPlusChannelLayout channelLayout) {
    this.channelLayout = channelLayout;
  }


  /**
   * Get downmixing
   * @return downmixing
   */
  public DolbyDigitalPlusDownmixing getDownmixing() {
    return downmixing;
  }

  /**
   * Set downmixing
   *
   * @param downmixing
   */
  public void setDownmixing(DolbyDigitalPlusDownmixing downmixing) {
    this.downmixing = downmixing;
  }


  /**
   * It provides a framework for signaling new evolution framework applications, such as Intelligent Loudness, in each Dolby codec. 
   * @return evolutionFrameworkControl
   */
  public DolbyDigitalPlusEvolutionFrameworkControl getEvolutionFrameworkControl() {
    return evolutionFrameworkControl;
  }

  /**
   * It provides a framework for signaling new evolution framework applications, such as Intelligent Loudness, in each Dolby codec. 
   *
   * @param evolutionFrameworkControl
   *        It provides a framework for signaling new evolution framework applications, such as Intelligent Loudness, in each Dolby codec. 
   */
  public void setEvolutionFrameworkControl(DolbyDigitalPlusEvolutionFrameworkControl evolutionFrameworkControl) {
    this.evolutionFrameworkControl = evolutionFrameworkControl;
  }


  /**
   * Settings for loudness control (required)
   * @return loudnessControl
   */
  public DolbyDigitalPlusLoudnessControl getLoudnessControl() {
    return loudnessControl;
  }

  /**
   * Settings for loudness control (required)
   *
   * @param loudnessControl
   *        Settings for loudness control (required)
   */
  public void setLoudnessControl(DolbyDigitalPlusLoudnessControl loudnessControl) {
    this.loudnessControl = loudnessControl;
  }


  /**
   * Get preprocessing
   * @return preprocessing
   */
  public DolbyDigitalPlusPreprocessing getPreprocessing() {
    return preprocessing;
  }

  /**
   * Set preprocessing
   *
   * @param preprocessing
   */
  public void setPreprocessing(DolbyDigitalPlusPreprocessing preprocessing) {
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
    DolbyDigitalPlusAudioConfiguration dolbyDigitalPlusAudioConfiguration = (DolbyDigitalPlusAudioConfiguration) o;
    return Objects.equals(this.bitstreamInfo, dolbyDigitalPlusAudioConfiguration.bitstreamInfo) &&
        Objects.equals(this.channelLayout, dolbyDigitalPlusAudioConfiguration.channelLayout) &&
        Objects.equals(this.downmixing, dolbyDigitalPlusAudioConfiguration.downmixing) &&
        Objects.equals(this.evolutionFrameworkControl, dolbyDigitalPlusAudioConfiguration.evolutionFrameworkControl) &&
        Objects.equals(this.loudnessControl, dolbyDigitalPlusAudioConfiguration.loudnessControl) &&
        Objects.equals(this.preprocessing, dolbyDigitalPlusAudioConfiguration.preprocessing) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitstreamInfo, channelLayout, downmixing, evolutionFrameworkControl, loudnessControl, preprocessing, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalPlusAudioConfiguration {\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioConfiguration;
import com.bitmovin.api.sdk.model.DolbyAtmosLoudnessControl;
import com.bitmovin.api.sdk.model.DolbyAtmosPreprocessing;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyAtmosAudioConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DolbyAtmosAudioConfiguration.class)
public class DolbyAtmosAudioConfiguration extends AudioConfiguration {
  @JsonProperty("loudnessControl")
  private DolbyAtmosLoudnessControl loudnessControl;

  @JsonProperty("preprocessing")
  private DolbyAtmosPreprocessing preprocessing;


  /**
   * Settings for loudness control (required)
   * @return loudnessControl
   */
  public DolbyAtmosLoudnessControl getLoudnessControl() {
    return loudnessControl;
  }

  /**
   * Settings for loudness control (required)
   *
   * @param loudnessControl
   *        Settings for loudness control (required)
   */
  public void setLoudnessControl(DolbyAtmosLoudnessControl loudnessControl) {
    this.loudnessControl = loudnessControl;
  }


  /**
   * Get preprocessing
   * @return preprocessing
   */
  public DolbyAtmosPreprocessing getPreprocessing() {
    return preprocessing;
  }

  /**
   * Set preprocessing
   *
   * @param preprocessing
   */
  public void setPreprocessing(DolbyAtmosPreprocessing preprocessing) {
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
    DolbyAtmosAudioConfiguration dolbyAtmosAudioConfiguration = (DolbyAtmosAudioConfiguration) o;
    return Objects.equals(this.loudnessControl, dolbyAtmosAudioConfiguration.loudnessControl) &&
        Objects.equals(this.preprocessing, dolbyAtmosAudioConfiguration.preprocessing) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loudnessControl, preprocessing, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyAtmosAudioConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


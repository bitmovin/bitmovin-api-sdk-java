package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Av1PresetConfiguration;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.DisplayAspectRatio;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.PixelFormat;
import com.bitmovin.api.sdk.model.VideoConfiguration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Av1VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Av1VideoConfiguration.class)
public class Av1VideoConfiguration extends VideoConfiguration {
  @JsonProperty("presetConfiguration")
  private Av1PresetConfiguration presetConfiguration;


  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   * @return presetConfiguration
   */
  public Av1PresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   *
   * @param presetConfiguration
   *        Use a set of well defined configurations preset to support certain use cases. Can be overwritten with more specific values.
   */
  public void setPresetConfiguration(Av1PresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Av1VideoConfiguration av1VideoConfiguration = (Av1VideoConfiguration) o;
    return Objects.equals(this.presetConfiguration, av1VideoConfiguration.presetConfiguration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Av1VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
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


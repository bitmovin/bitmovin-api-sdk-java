package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioVolumeFormat;
import com.bitmovin.api.sdk.model.AudioVolumeUnit;
import com.bitmovin.api.sdk.model.Filter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AudioVolumeFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AudioVolumeFilter.class)
public class AudioVolumeFilter extends Filter {
  @JsonProperty("volume")
  private Double volume;

  @JsonProperty("unit")
  private AudioVolumeUnit unit;

  @JsonProperty("format")
  private AudioVolumeFormat format;


  /**
   * Audio volume value (required)
   * @return volume
   */
  public Double getVolume() {
    return volume;
  }

  /**
   * Audio volume value (required)
   *
   * @param volume
   *        Audio volume value (required)
   */
  public void setVolume(Double volume) {
    this.volume = volume;
  }


  /**
   * Get unit
   * @return unit
   */
  public AudioVolumeUnit getUnit() {
    return unit;
  }

  /**
   * Set unit
   *
   * @param unit
   */
  public void setUnit(AudioVolumeUnit unit) {
    this.unit = unit;
  }


  /**
   * Get format
   * @return format
   */
  public AudioVolumeFormat getFormat() {
    return format;
  }

  /**
   * Set format
   *
   * @param format
   */
  public void setFormat(AudioVolumeFormat format) {
    this.format = format;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudioVolumeFilter audioVolumeFilter = (AudioVolumeFilter) o;
    return Objects.equals(this.volume, audioVolumeFilter.volume) &&
        Objects.equals(this.unit, audioVolumeFilter.unit) &&
        Objects.equals(this.format, audioVolumeFilter.format) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, unit, format, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudioVolumeFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
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


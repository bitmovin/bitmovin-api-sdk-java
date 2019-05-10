package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitrateSelectionMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamPerTitleFixedResolutionAndBitrateSettings
 */

public class StreamPerTitleFixedResolutionAndBitrateSettings {
  @JsonProperty("minBitrate")
  private Integer minBitrate;

  @JsonProperty("maxBitrate")
  private Integer maxBitrate;

  @JsonProperty("bitrateSelectionMode")
  private BitrateSelectionMode bitrateSelectionMode = null;

  @JsonProperty("lowComplexityBoundaryForMaxBitrate")
  private Double lowComplexityBoundaryForMaxBitrate;

  @JsonProperty("highComplexityBoundaryForMaxBitrate")
  private Double highComplexityBoundaryForMaxBitrate;


  /**
   * The minimum bitrate that will be used for that template.
   * @return minBitrate
   */
  public Integer getMinBitrate() {
    return minBitrate;
  }

  public void setMinBitrate(Integer minBitrate) {
    this.minBitrate = minBitrate;
  }


  /**
   * The maximum bitrate that will be used for that template.
   * @return maxBitrate
   */
  public Integer getMaxBitrate() {
    return maxBitrate;
  }

  public void setMaxBitrate(Integer maxBitrate) {
    this.maxBitrate = maxBitrate;
  }


  /**
   * Bitrate selection mode
   * @return bitrateSelectionMode
   */
  public BitrateSelectionMode getBitrateSelectionMode() {
    return bitrateSelectionMode;
  }

  public void setBitrateSelectionMode(BitrateSelectionMode bitrateSelectionMode) {
    this.bitrateSelectionMode = bitrateSelectionMode;
  }


  /**
   * Low complexity boundary for max bitrate
   * @return lowComplexityBoundaryForMaxBitrate
   */
  public Double getLowComplexityBoundaryForMaxBitrate() {
    return lowComplexityBoundaryForMaxBitrate;
  }

  public void setLowComplexityBoundaryForMaxBitrate(Double lowComplexityBoundaryForMaxBitrate) {
    this.lowComplexityBoundaryForMaxBitrate = lowComplexityBoundaryForMaxBitrate;
  }


  /**
   * High complexity boundary for max bitrate
   * @return highComplexityBoundaryForMaxBitrate
   */
  public Double getHighComplexityBoundaryForMaxBitrate() {
    return highComplexityBoundaryForMaxBitrate;
  }

  public void setHighComplexityBoundaryForMaxBitrate(Double highComplexityBoundaryForMaxBitrate) {
    this.highComplexityBoundaryForMaxBitrate = highComplexityBoundaryForMaxBitrate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamPerTitleFixedResolutionAndBitrateSettings streamPerTitleFixedResolutionAndBitrateSettings = (StreamPerTitleFixedResolutionAndBitrateSettings) o;
    return Objects.equals(this.minBitrate, streamPerTitleFixedResolutionAndBitrateSettings.minBitrate) &&
        Objects.equals(this.maxBitrate, streamPerTitleFixedResolutionAndBitrateSettings.maxBitrate) &&
        Objects.equals(this.bitrateSelectionMode, streamPerTitleFixedResolutionAndBitrateSettings.bitrateSelectionMode) &&
        Objects.equals(this.lowComplexityBoundaryForMaxBitrate, streamPerTitleFixedResolutionAndBitrateSettings.lowComplexityBoundaryForMaxBitrate) &&
        Objects.equals(this.highComplexityBoundaryForMaxBitrate, streamPerTitleFixedResolutionAndBitrateSettings.highComplexityBoundaryForMaxBitrate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minBitrate, maxBitrate, bitrateSelectionMode, lowComplexityBoundaryForMaxBitrate, highComplexityBoundaryForMaxBitrate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamPerTitleFixedResolutionAndBitrateSettings {\n");
    
    sb.append("    minBitrate: ").append(toIndentedString(minBitrate)).append("\n");
    sb.append("    maxBitrate: ").append(toIndentedString(maxBitrate)).append("\n");
    sb.append("    bitrateSelectionMode: ").append(toIndentedString(bitrateSelectionMode)).append("\n");
    sb.append("    lowComplexityBoundaryForMaxBitrate: ").append(toIndentedString(lowComplexityBoundaryForMaxBitrate)).append("\n");
    sb.append("    highComplexityBoundaryForMaxBitrate: ").append(toIndentedString(highComplexityBoundaryForMaxBitrate)).append("\n");
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


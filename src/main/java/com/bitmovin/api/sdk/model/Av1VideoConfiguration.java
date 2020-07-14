package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Av1AdaptiveQuantMode;
import com.bitmovin.api.sdk.model.Av1KeyPlacementMode;
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
  @JsonProperty("keyPlacementMode")
  private Av1KeyPlacementMode keyPlacementMode;

  @JsonProperty("adaptiveQuantMode")
  private Av1AdaptiveQuantMode adaptiveQuantMode;

  @JsonProperty("lagInFrames")
  private Integer lagInFrames;

  @JsonProperty("minQ")
  private Integer minQ;

  @JsonProperty("maxQ")
  private Integer maxQ;

  @JsonProperty("undershootPct")
  private Integer undershootPct;

  @JsonProperty("overshootPct")
  private Integer overshootPct;

  @JsonProperty("clientBufferSize")
  private Long clientBufferSize;

  @JsonProperty("clientInitialBufferSize")
  private Long clientInitialBufferSize;

  @JsonProperty("clientOptimalBufferSize")
  private Long clientOptimalBufferSize;

  @JsonProperty("tileColumns")
  private Integer tileColumns;

  @JsonProperty("tileRows")
  private Integer tileRows;

  @JsonProperty("isAutomaticAltRefFramesEnabled")
  private Boolean isAutomaticAltRefFramesEnabled;

  @JsonProperty("arnrMaxFrames")
  private Integer arnrMaxFrames;

  @JsonProperty("arnrStrength")
  private Integer arnrStrength;

  @JsonProperty("maxIntraRate")
  private Long maxIntraRate;

  @JsonProperty("isLossless")
  private Boolean isLossless;

  @JsonProperty("isFrameParallel")
  private Boolean isFrameParallel;

  @JsonProperty("sharpness")
  private Integer sharpness;

  @JsonProperty("isFrameBoostEnabled")
  private Boolean isFrameBoostEnabled;

  @JsonProperty("noiseSensitivity")
  private Boolean noiseSensitivity;

  @JsonProperty("minGfInterval")
  private Integer minGfInterval;

  @JsonProperty("maxGfInterval")
  private Integer maxGfInterval;

  @JsonProperty("numTileGroups")
  private Integer numTileGroups;

  @JsonProperty("mtuSize")
  private Integer mtuSize;


  /**
   * Get keyPlacementMode
   * @return keyPlacementMode
   */
  public Av1KeyPlacementMode getKeyPlacementMode() {
    return keyPlacementMode;
  }

  /**
   * Set keyPlacementMode
   *
   * @param keyPlacementMode
   */
  public void setKeyPlacementMode(Av1KeyPlacementMode keyPlacementMode) {
    this.keyPlacementMode = keyPlacementMode;
  }


  /**
   * Get adaptiveQuantMode
   * @return adaptiveQuantMode
   */
  public Av1AdaptiveQuantMode getAdaptiveQuantMode() {
    return adaptiveQuantMode;
  }

  /**
   * Set adaptiveQuantMode
   *
   * @param adaptiveQuantMode
   */
  public void setAdaptiveQuantMode(Av1AdaptiveQuantMode adaptiveQuantMode) {
    this.adaptiveQuantMode = adaptiveQuantMode;
  }


  /**
   * Number of frames to look ahead for alternate reference frame selection
   * minimum: 0
   * maximum: 25
   * @return lagInFrames
   */
  public Integer getLagInFrames() {
    return lagInFrames;
  }

  /**
   * Number of frames to look ahead for alternate reference frame selection
   * minimum: 0
   * maximum: 25
   *
   * @param lagInFrames
   *        Number of frames to look ahead for alternate reference frame selection
   * minimum: 0
   * maximum: 25
   */
  public void setLagInFrames(Integer lagInFrames) {
    this.lagInFrames = lagInFrames;
  }


  /**
   * Minimum (best quality) quantizer
   * @return minQ
   */
  public Integer getMinQ() {
    return minQ;
  }

  /**
   * Minimum (best quality) quantizer
   *
   * @param minQ
   *        Minimum (best quality) quantizer
   */
  public void setMinQ(Integer minQ) {
    this.minQ = minQ;
  }


  /**
   * Maximum (worst quality) quantizer
   * @return maxQ
   */
  public Integer getMaxQ() {
    return maxQ;
  }

  /**
   * Maximum (worst quality) quantizer
   *
   * @param maxQ
   *        Maximum (worst quality) quantizer
   */
  public void setMaxQ(Integer maxQ) {
    this.maxQ = maxQ;
  }


  /**
   * Rate control adaptation undershoot control
   * minimum: 0
   * maximum: 1000
   * @return undershootPct
   */
  public Integer getUndershootPct() {
    return undershootPct;
  }

  /**
   * Rate control adaptation undershoot control
   * minimum: 0
   * maximum: 1000
   *
   * @param undershootPct
   *        Rate control adaptation undershoot control
   * minimum: 0
   * maximum: 1000
   */
  public void setUndershootPct(Integer undershootPct) {
    this.undershootPct = undershootPct;
  }


  /**
   * Rate control adaptation overshoot control
   * minimum: 0
   * maximum: 1000
   * @return overshootPct
   */
  public Integer getOvershootPct() {
    return overshootPct;
  }

  /**
   * Rate control adaptation overshoot control
   * minimum: 0
   * maximum: 1000
   *
   * @param overshootPct
   *        Rate control adaptation overshoot control
   * minimum: 0
   * maximum: 1000
   */
  public void setOvershootPct(Integer overshootPct) {
    this.overshootPct = overshootPct;
  }


  /**
   * Decoder buffer size in milliseconds
   * @return clientBufferSize
   */
  public Long getClientBufferSize() {
    return clientBufferSize;
  }

  /**
   * Decoder buffer size in milliseconds
   *
   * @param clientBufferSize
   *        Decoder buffer size in milliseconds
   */
  public void setClientBufferSize(Long clientBufferSize) {
    this.clientBufferSize = clientBufferSize;
  }


  /**
   * Decoder buffer initial size in milliseconds
   * @return clientInitialBufferSize
   */
  public Long getClientInitialBufferSize() {
    return clientInitialBufferSize;
  }

  /**
   * Decoder buffer initial size in milliseconds
   *
   * @param clientInitialBufferSize
   *        Decoder buffer initial size in milliseconds
   */
  public void setClientInitialBufferSize(Long clientInitialBufferSize) {
    this.clientInitialBufferSize = clientInitialBufferSize;
  }


  /**
   * Decoder buffer optimal size in milliseconds
   * @return clientOptimalBufferSize
   */
  public Long getClientOptimalBufferSize() {
    return clientOptimalBufferSize;
  }

  /**
   * Decoder buffer optimal size in milliseconds
   *
   * @param clientOptimalBufferSize
   *        Decoder buffer optimal size in milliseconds
   */
  public void setClientOptimalBufferSize(Long clientOptimalBufferSize) {
    this.clientOptimalBufferSize = clientOptimalBufferSize;
  }


  /**
   * Number of tile columns to use, log2
   * minimum: 0
   * maximum: 6
   * @return tileColumns
   */
  public Integer getTileColumns() {
    return tileColumns;
  }

  /**
   * Number of tile columns to use, log2
   * minimum: 0
   * maximum: 6
   *
   * @param tileColumns
   *        Number of tile columns to use, log2
   * minimum: 0
   * maximum: 6
   */
  public void setTileColumns(Integer tileColumns) {
    this.tileColumns = tileColumns;
  }


  /**
   * Number of tile rows to use, log2
   * minimum: 0
   * maximum: 2
   * @return tileRows
   */
  public Integer getTileRows() {
    return tileRows;
  }

  /**
   * Number of tile rows to use, log2
   * minimum: 0
   * maximum: 2
   *
   * @param tileRows
   *        Number of tile rows to use, log2
   * minimum: 0
   * maximum: 2
   */
  public void setTileRows(Integer tileRows) {
    this.tileRows = tileRows;
  }


  /**
   * Enable automatic set and use alf frames
   * @return isAutomaticAltRefFramesEnabled
   */
  public Boolean getIsAutomaticAltRefFramesEnabled() {
    return isAutomaticAltRefFramesEnabled;
  }

  /**
   * Enable automatic set and use alf frames
   *
   * @param isAutomaticAltRefFramesEnabled
   *        Enable automatic set and use alf frames
   */
  public void setIsAutomaticAltRefFramesEnabled(Boolean isAutomaticAltRefFramesEnabled) {
    this.isAutomaticAltRefFramesEnabled = isAutomaticAltRefFramesEnabled;
  }


  /**
   * The max number of frames to create arf
   * @return arnrMaxFrames
   */
  public Integer getArnrMaxFrames() {
    return arnrMaxFrames;
  }

  /**
   * The max number of frames to create arf
   *
   * @param arnrMaxFrames
   *        The max number of frames to create arf
   */
  public void setArnrMaxFrames(Integer arnrMaxFrames) {
    this.arnrMaxFrames = arnrMaxFrames;
  }


  /**
   * The filter strength for the arf
   * @return arnrStrength
   */
  public Integer getArnrStrength() {
    return arnrStrength;
  }

  /**
   * The filter strength for the arf
   *
   * @param arnrStrength
   *        The filter strength for the arf
   */
  public void setArnrStrength(Integer arnrStrength) {
    this.arnrStrength = arnrStrength;
  }


  /**
   * Maximum data rate for intra frames, expressed as a percentage of the average per-frame bitrate. Default value 0 meaning unlimited
   * @return maxIntraRate
   */
  public Long getMaxIntraRate() {
    return maxIntraRate;
  }

  /**
   * Maximum data rate for intra frames, expressed as a percentage of the average per-frame bitrate. Default value 0 meaning unlimited
   *
   * @param maxIntraRate
   *        Maximum data rate for intra frames, expressed as a percentage of the average per-frame bitrate. Default value 0 meaning unlimited
   */
  public void setMaxIntraRate(Long maxIntraRate) {
    this.maxIntraRate = maxIntraRate;
  }


  /**
   * Lossless encoding mode
   * @return isLossless
   */
  public Boolean getIsLossless() {
    return isLossless;
  }

  /**
   * Lossless encoding mode
   *
   * @param isLossless
   *        Lossless encoding mode
   */
  public void setIsLossless(Boolean isLossless) {
    this.isLossless = isLossless;
  }


  /**
   * Enable frame parallel decoding feature
   * @return isFrameParallel
   */
  public Boolean getIsFrameParallel() {
    return isFrameParallel;
  }

  /**
   * Enable frame parallel decoding feature
   *
   * @param isFrameParallel
   *        Enable frame parallel decoding feature
   */
  public void setIsFrameParallel(Boolean isFrameParallel) {
    this.isFrameParallel = isFrameParallel;
  }


  /**
   * Sets the sharpness
   * @return sharpness
   */
  public Integer getSharpness() {
    return sharpness;
  }

  /**
   * Sets the sharpness
   *
   * @param sharpness
   *        Sets the sharpness
   */
  public void setSharpness(Integer sharpness) {
    this.sharpness = sharpness;
  }


  /**
   * Enable quality boost by lowering frame level Q periodically
   * @return isFrameBoostEnabled
   */
  public Boolean getIsFrameBoostEnabled() {
    return isFrameBoostEnabled;
  }

  /**
   * Enable quality boost by lowering frame level Q periodically
   *
   * @param isFrameBoostEnabled
   *        Enable quality boost by lowering frame level Q periodically
   */
  public void setIsFrameBoostEnabled(Boolean isFrameBoostEnabled) {
    this.isFrameBoostEnabled = isFrameBoostEnabled;
  }


  /**
   * Enable noise sensitivity on Y channel
   * @return noiseSensitivity
   */
  public Boolean getNoiseSensitivity() {
    return noiseSensitivity;
  }

  /**
   * Enable noise sensitivity on Y channel
   *
   * @param noiseSensitivity
   *        Enable noise sensitivity on Y channel
   */
  public void setNoiseSensitivity(Boolean noiseSensitivity) {
    this.noiseSensitivity = noiseSensitivity;
  }


  /**
   * Minimum interval between GF/ARF frames
   * @return minGfInterval
   */
  public Integer getMinGfInterval() {
    return minGfInterval;
  }

  /**
   * Minimum interval between GF/ARF frames
   *
   * @param minGfInterval
   *        Minimum interval between GF/ARF frames
   */
  public void setMinGfInterval(Integer minGfInterval) {
    this.minGfInterval = minGfInterval;
  }


  /**
   * Maximum interval between GF/ARF frames
   * @return maxGfInterval
   */
  public Integer getMaxGfInterval() {
    return maxGfInterval;
  }

  /**
   * Maximum interval between GF/ARF frames
   *
   * @param maxGfInterval
   *        Maximum interval between GF/ARF frames
   */
  public void setMaxGfInterval(Integer maxGfInterval) {
    this.maxGfInterval = maxGfInterval;
  }


  /**
   * Maximum number of tile groups
   * @return numTileGroups
   */
  public Integer getNumTileGroups() {
    return numTileGroups;
  }

  /**
   * Maximum number of tile groups
   *
   * @param numTileGroups
   *        Maximum number of tile groups
   */
  public void setNumTileGroups(Integer numTileGroups) {
    this.numTileGroups = numTileGroups;
  }


  /**
   * Maximum number of bytes in a tile group
   * @return mtuSize
   */
  public Integer getMtuSize() {
    return mtuSize;
  }

  /**
   * Maximum number of bytes in a tile group
   *
   * @param mtuSize
   *        Maximum number of bytes in a tile group
   */
  public void setMtuSize(Integer mtuSize) {
    this.mtuSize = mtuSize;
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
    return Objects.equals(this.keyPlacementMode, av1VideoConfiguration.keyPlacementMode) &&
        Objects.equals(this.adaptiveQuantMode, av1VideoConfiguration.adaptiveQuantMode) &&
        Objects.equals(this.lagInFrames, av1VideoConfiguration.lagInFrames) &&
        Objects.equals(this.minQ, av1VideoConfiguration.minQ) &&
        Objects.equals(this.maxQ, av1VideoConfiguration.maxQ) &&
        Objects.equals(this.undershootPct, av1VideoConfiguration.undershootPct) &&
        Objects.equals(this.overshootPct, av1VideoConfiguration.overshootPct) &&
        Objects.equals(this.clientBufferSize, av1VideoConfiguration.clientBufferSize) &&
        Objects.equals(this.clientInitialBufferSize, av1VideoConfiguration.clientInitialBufferSize) &&
        Objects.equals(this.clientOptimalBufferSize, av1VideoConfiguration.clientOptimalBufferSize) &&
        Objects.equals(this.tileColumns, av1VideoConfiguration.tileColumns) &&
        Objects.equals(this.tileRows, av1VideoConfiguration.tileRows) &&
        Objects.equals(this.isAutomaticAltRefFramesEnabled, av1VideoConfiguration.isAutomaticAltRefFramesEnabled) &&
        Objects.equals(this.arnrMaxFrames, av1VideoConfiguration.arnrMaxFrames) &&
        Objects.equals(this.arnrStrength, av1VideoConfiguration.arnrStrength) &&
        Objects.equals(this.maxIntraRate, av1VideoConfiguration.maxIntraRate) &&
        Objects.equals(this.isLossless, av1VideoConfiguration.isLossless) &&
        Objects.equals(this.isFrameParallel, av1VideoConfiguration.isFrameParallel) &&
        Objects.equals(this.sharpness, av1VideoConfiguration.sharpness) &&
        Objects.equals(this.isFrameBoostEnabled, av1VideoConfiguration.isFrameBoostEnabled) &&
        Objects.equals(this.noiseSensitivity, av1VideoConfiguration.noiseSensitivity) &&
        Objects.equals(this.minGfInterval, av1VideoConfiguration.minGfInterval) &&
        Objects.equals(this.maxGfInterval, av1VideoConfiguration.maxGfInterval) &&
        Objects.equals(this.numTileGroups, av1VideoConfiguration.numTileGroups) &&
        Objects.equals(this.mtuSize, av1VideoConfiguration.mtuSize) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyPlacementMode, adaptiveQuantMode, lagInFrames, minQ, maxQ, undershootPct, overshootPct, clientBufferSize, clientInitialBufferSize, clientOptimalBufferSize, tileColumns, tileRows, isAutomaticAltRefFramesEnabled, arnrMaxFrames, arnrStrength, maxIntraRate, isLossless, isFrameParallel, sharpness, isFrameBoostEnabled, noiseSensitivity, minGfInterval, maxGfInterval, numTileGroups, mtuSize, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Av1VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    keyPlacementMode: ").append(toIndentedString(keyPlacementMode)).append("\n");
    sb.append("    adaptiveQuantMode: ").append(toIndentedString(adaptiveQuantMode)).append("\n");
    sb.append("    lagInFrames: ").append(toIndentedString(lagInFrames)).append("\n");
    sb.append("    minQ: ").append(toIndentedString(minQ)).append("\n");
    sb.append("    maxQ: ").append(toIndentedString(maxQ)).append("\n");
    sb.append("    undershootPct: ").append(toIndentedString(undershootPct)).append("\n");
    sb.append("    overshootPct: ").append(toIndentedString(overshootPct)).append("\n");
    sb.append("    clientBufferSize: ").append(toIndentedString(clientBufferSize)).append("\n");
    sb.append("    clientInitialBufferSize: ").append(toIndentedString(clientInitialBufferSize)).append("\n");
    sb.append("    clientOptimalBufferSize: ").append(toIndentedString(clientOptimalBufferSize)).append("\n");
    sb.append("    tileColumns: ").append(toIndentedString(tileColumns)).append("\n");
    sb.append("    tileRows: ").append(toIndentedString(tileRows)).append("\n");
    sb.append("    isAutomaticAltRefFramesEnabled: ").append(toIndentedString(isAutomaticAltRefFramesEnabled)).append("\n");
    sb.append("    arnrMaxFrames: ").append(toIndentedString(arnrMaxFrames)).append("\n");
    sb.append("    arnrStrength: ").append(toIndentedString(arnrStrength)).append("\n");
    sb.append("    maxIntraRate: ").append(toIndentedString(maxIntraRate)).append("\n");
    sb.append("    isLossless: ").append(toIndentedString(isLossless)).append("\n");
    sb.append("    isFrameParallel: ").append(toIndentedString(isFrameParallel)).append("\n");
    sb.append("    sharpness: ").append(toIndentedString(sharpness)).append("\n");
    sb.append("    isFrameBoostEnabled: ").append(toIndentedString(isFrameBoostEnabled)).append("\n");
    sb.append("    noiseSensitivity: ").append(toIndentedString(noiseSensitivity)).append("\n");
    sb.append("    minGfInterval: ").append(toIndentedString(minGfInterval)).append("\n");
    sb.append("    maxGfInterval: ").append(toIndentedString(maxGfInterval)).append("\n");
    sb.append("    numTileGroups: ").append(toIndentedString(numTileGroups)).append("\n");
    sb.append("    mtuSize: ").append(toIndentedString(mtuSize)).append("\n");
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


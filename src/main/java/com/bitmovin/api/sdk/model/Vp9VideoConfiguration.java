package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.DisplayAspectRatio;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.PixelFormat;
import com.bitmovin.api.sdk.model.PresetConfiguration;
import com.bitmovin.api.sdk.model.VideoConfiguration;
import com.bitmovin.api.sdk.model.Vp9AqMode;
import com.bitmovin.api.sdk.model.Vp9ArnrType;
import com.bitmovin.api.sdk.model.Vp9Quality;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Vp9VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Vp9VideoConfiguration.class)
public class Vp9VideoConfiguration extends VideoConfiguration {
  @JsonProperty("presetConfiguration")
  private PresetConfiguration presetConfiguration;

  @JsonProperty("crf")
  private Integer crf;

  @JsonProperty("lagInFrames")
  private Integer lagInFrames;

  @JsonProperty("errorResiliencyEnabled")
  private Boolean errorResiliencyEnabled;

  @JsonProperty("tileColumns")
  private Integer tileColumns;

  @JsonProperty("tileRows")
  private Integer tileRows;

  @JsonProperty("frameParallel")
  private Boolean frameParallel;

  @JsonProperty("maxIntraRate")
  private Long maxIntraRate;

  @JsonProperty("qpMin")
  private Integer qpMin;

  @JsonProperty("qpMax")
  private Integer qpMax;

  @JsonProperty("rateUndershootPct")
  private Integer rateUndershootPct;

  @JsonProperty("rateOvershootPct")
  private Integer rateOvershootPct;

  @JsonProperty("clientBufferSize")
  private Long clientBufferSize;

  @JsonProperty("clientInitialBufferSize")
  private Long clientInitialBufferSize;

  @JsonProperty("biasPct")
  private Integer biasPct;

  @JsonProperty("noiseSensitivity")
  private Boolean noiseSensitivity;

  @JsonProperty("cpuUsed")
  private Integer cpuUsed;

  @JsonProperty("automaticAltRefFramesEnabled")
  private Boolean automaticAltRefFramesEnabled;

  @JsonProperty("targetLevel")
  private Integer targetLevel;

  @JsonProperty("rowMultiThreadingEnabled")
  private Boolean rowMultiThreadingEnabled;

  @JsonProperty("sharpness")
  private Integer sharpness;

  @JsonProperty("minGop")
  private Integer minGop;

  @JsonProperty("maxGop")
  private Integer maxGop;

  @JsonProperty("minKeyframeInterval")
  private Double minKeyframeInterval;

  @JsonProperty("maxKeyframeInterval")
  private Double maxKeyframeInterval;

  @JsonProperty("quality")
  private Vp9Quality quality;

  @JsonProperty("lossless")
  private Boolean lossless;

  @JsonProperty("staticThresh")
  private Integer staticThresh;

  @JsonProperty("aqMode")
  private Vp9AqMode aqMode;

  @JsonProperty("arnrMaxFrames")
  private Integer arnrMaxFrames;

  @JsonProperty("arnrStrength")
  private Integer arnrStrength;

  @JsonProperty("arnrType")
  private Vp9ArnrType arnrType;


  /**
   * Choose from a set of preset configurations tailored for common use cases. Check out [VP9 Presets](https://bitmovin.com/docs/encoding/tutorials/vp9-presets) to see which values get applied by each preset. Explicitly setting a property to a different value will override the preset&#39;s value for that property.
   * @return presetConfiguration
   */
  public PresetConfiguration getPresetConfiguration() {
    return presetConfiguration;
  }

  /**
   * Choose from a set of preset configurations tailored for common use cases. Check out [VP9 Presets](https://bitmovin.com/docs/encoding/tutorials/vp9-presets) to see which values get applied by each preset. Explicitly setting a property to a different value will override the preset&#39;s value for that property.
   *
   * @param presetConfiguration
   *        Choose from a set of preset configurations tailored for common use cases. Check out [VP9 Presets](https://bitmovin.com/docs/encoding/tutorials/vp9-presets) to see which values get applied by each preset. Explicitly setting a property to a different value will override the preset&#39;s value for that property.
   */
  public void setPresetConfiguration(PresetConfiguration presetConfiguration) {
    this.presetConfiguration = presetConfiguration;
  }


  /**
   * Sets the constant rate factor for quality-based variable bitrate. Either bitrate or crf is required.
   * minimum: 0
   * maximum: 63
   * @return crf
   */
  public Integer getCrf() {
    return crf;
  }

  /**
   * Sets the constant rate factor for quality-based variable bitrate. Either bitrate or crf is required.
   * minimum: 0
   * maximum: 63
   *
   * @param crf
   *        Sets the constant rate factor for quality-based variable bitrate. Either bitrate or crf is required.
   *        minimum: 0
   *        maximum: 63
   */
  public void setCrf(Integer crf) {
    this.crf = crf;
  }


  /**
   * Number of frames to look ahead for alternate reference frame selection.
   * minimum: 0
   * maximum: 25
   * @return lagInFrames
   */
  public Integer getLagInFrames() {
    return lagInFrames;
  }

  /**
   * Number of frames to look ahead for alternate reference frame selection.
   * minimum: 0
   * maximum: 25
   *
   * @param lagInFrames
   *        Number of frames to look ahead for alternate reference frame selection.
   *        minimum: 0
   *        maximum: 25
   */
  public void setLagInFrames(Integer lagInFrames) {
    this.lagInFrames = lagInFrames;
  }


  /**
   * Enables error resiliency feature
   * @return errorResiliencyEnabled
   */
  public Boolean getErrorResiliencyEnabled() {
    return errorResiliencyEnabled;
  }

  /**
   * Enables error resiliency feature
   *
   * @param errorResiliencyEnabled
   *        Enables error resiliency feature
   */
  public void setErrorResiliencyEnabled(Boolean errorResiliencyEnabled) {
    this.errorResiliencyEnabled = errorResiliencyEnabled;
  }


  /**
   * Number of tile columns to use, log2. Depending on the encoding width there are limitations on this value. The minimum values are 2 for width &gt;&#x3D; 1920 and 1 for width &gt;&#x3D; 1280. The minimum width of each tile is 256 pixels so the maximum values are 0 for width &lt; 256, 1 for width &lt; 512, 2 for width &lt; 1024, 3 for width &lt; 2048, 4 for width &lt; 4096, 5 for width &lt; 8192. If the value is too high or too low it will be overridden.
   * minimum: 0
   * maximum: 6
   * @return tileColumns
   */
  public Integer getTileColumns() {
    return tileColumns;
  }

  /**
   * Number of tile columns to use, log2. Depending on the encoding width there are limitations on this value. The minimum values are 2 for width &gt;&#x3D; 1920 and 1 for width &gt;&#x3D; 1280. The minimum width of each tile is 256 pixels so the maximum values are 0 for width &lt; 256, 1 for width &lt; 512, 2 for width &lt; 1024, 3 for width &lt; 2048, 4 for width &lt; 4096, 5 for width &lt; 8192. If the value is too high or too low it will be overridden.
   * minimum: 0
   * maximum: 6
   *
   * @param tileColumns
   *        Number of tile columns to use, log2. Depending on the encoding width there are limitations on this value. The minimum values are 2 for width &gt;&#x3D; 1920 and 1 for width &gt;&#x3D; 1280. The minimum width of each tile is 256 pixels so the maximum values are 0 for width &lt; 256, 1 for width &lt; 512, 2 for width &lt; 1024, 3 for width &lt; 2048, 4 for width &lt; 4096, 5 for width &lt; 8192. If the value is too high or too low it will be overridden.
   *        minimum: 0
   *        maximum: 6
   */
  public void setTileColumns(Integer tileColumns) {
    this.tileColumns = tileColumns;
  }


  /**
   * Number of tile rows to use, log2.
   * minimum: 0
   * maximum: 2
   * @return tileRows
   */
  public Integer getTileRows() {
    return tileRows;
  }

  /**
   * Number of tile rows to use, log2.
   * minimum: 0
   * maximum: 2
   *
   * @param tileRows
   *        Number of tile rows to use, log2.
   *        minimum: 0
   *        maximum: 2
   */
  public void setTileRows(Integer tileRows) {
    this.tileRows = tileRows;
  }


  /**
   * Enable frame parallel decodability features
   * @return frameParallel
   */
  public Boolean getFrameParallel() {
    return frameParallel;
  }

  /**
   * Enable frame parallel decodability features
   *
   * @param frameParallel
   *        Enable frame parallel decodability features
   */
  public void setFrameParallel(Boolean frameParallel) {
    this.frameParallel = frameParallel;
  }


  /**
   * Maximum I-frame bitrate (percentage) 0&#x3D;unlimited
   * @return maxIntraRate
   */
  public Long getMaxIntraRate() {
    return maxIntraRate;
  }

  /**
   * Maximum I-frame bitrate (percentage) 0&#x3D;unlimited
   *
   * @param maxIntraRate
   *        Maximum I-frame bitrate (percentage) 0&#x3D;unlimited
   */
  public void setMaxIntraRate(Long maxIntraRate) {
    this.maxIntraRate = maxIntraRate;
  }


  /**
   * Sets the minimum of quantization factor.
   * minimum: 0
   * maximum: 63
   * @return qpMin
   */
  public Integer getQpMin() {
    return qpMin;
  }

  /**
   * Sets the minimum of quantization factor.
   * minimum: 0
   * maximum: 63
   *
   * @param qpMin
   *        Sets the minimum of quantization factor.
   *        minimum: 0
   *        maximum: 63
   */
  public void setQpMin(Integer qpMin) {
    this.qpMin = qpMin;
  }


  /**
   * Sets the maximum of quantization factor.
   * minimum: 0
   * maximum: 63
   * @return qpMax
   */
  public Integer getQpMax() {
    return qpMax;
  }

  /**
   * Sets the maximum of quantization factor.
   * minimum: 0
   * maximum: 63
   *
   * @param qpMax
   *        Sets the maximum of quantization factor.
   *        minimum: 0
   *        maximum: 63
   */
  public void setQpMax(Integer qpMax) {
    this.qpMax = qpMax;
  }


  /**
   * Datarate undershoot (min) target (percentage).
   * minimum: 0
   * maximum: 100
   * @return rateUndershootPct
   */
  public Integer getRateUndershootPct() {
    return rateUndershootPct;
  }

  /**
   * Datarate undershoot (min) target (percentage).
   * minimum: 0
   * maximum: 100
   *
   * @param rateUndershootPct
   *        Datarate undershoot (min) target (percentage).
   *        minimum: 0
   *        maximum: 100
   */
  public void setRateUndershootPct(Integer rateUndershootPct) {
    this.rateUndershootPct = rateUndershootPct;
  }


  /**
   * Datarate overshoot (max) target (percentage).
   * minimum: 0
   * maximum: 100
   * @return rateOvershootPct
   */
  public Integer getRateOvershootPct() {
    return rateOvershootPct;
  }

  /**
   * Datarate overshoot (max) target (percentage).
   * minimum: 0
   * maximum: 100
   *
   * @param rateOvershootPct
   *        Datarate overshoot (max) target (percentage).
   *        minimum: 0
   *        maximum: 100
   */
  public void setRateOvershootPct(Integer rateOvershootPct) {
    this.rateOvershootPct = rateOvershootPct;
  }


  /**
   * Client buffer size (ms)
   * minimum: 0
   * @return clientBufferSize
   */
  public Long getClientBufferSize() {
    return clientBufferSize;
  }

  /**
   * Client buffer size (ms)
   * minimum: 0
   *
   * @param clientBufferSize
   *        Client buffer size (ms)
   *        minimum: 0
   */
  public void setClientBufferSize(Long clientBufferSize) {
    this.clientBufferSize = clientBufferSize;
  }


  /**
   * Client initial buffer size (ms)
   * minimum: 0
   * @return clientInitialBufferSize
   */
  public Long getClientInitialBufferSize() {
    return clientInitialBufferSize;
  }

  /**
   * Client initial buffer size (ms)
   * minimum: 0
   *
   * @param clientInitialBufferSize
   *        Client initial buffer size (ms)
   *        minimum: 0
   */
  public void setClientInitialBufferSize(Long clientInitialBufferSize) {
    this.clientInitialBufferSize = clientInitialBufferSize;
  }


  /**
   * CBR/VBR bias (0&#x3D;CBR, 100&#x3D;VBR)
   * minimum: 0
   * maximum: 100
   * @return biasPct
   */
  public Integer getBiasPct() {
    return biasPct;
  }

  /**
   * CBR/VBR bias (0&#x3D;CBR, 100&#x3D;VBR)
   * minimum: 0
   * maximum: 100
   *
   * @param biasPct
   *        CBR/VBR bias (0&#x3D;CBR, 100&#x3D;VBR)
   *        minimum: 0
   *        maximum: 100
   */
  public void setBiasPct(Integer biasPct) {
    this.biasPct = biasPct;
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
   * Controls the tradeoff between compression efficiency and encoding speed. Higher values indicate a faster encoding. The minimum value for width * height &gt;&#x3D; 1280 * 720 is 2. If the value is too low it will be overridden.
   * minimum: 1
   * maximum: 8
   * @return cpuUsed
   */
  public Integer getCpuUsed() {
    return cpuUsed;
  }

  /**
   * Controls the tradeoff between compression efficiency and encoding speed. Higher values indicate a faster encoding. The minimum value for width * height &gt;&#x3D; 1280 * 720 is 2. If the value is too low it will be overridden.
   * minimum: 1
   * maximum: 8
   *
   * @param cpuUsed
   *        Controls the tradeoff between compression efficiency and encoding speed. Higher values indicate a faster encoding. The minimum value for width * height &gt;&#x3D; 1280 * 720 is 2. If the value is too low it will be overridden.
   *        minimum: 1
   *        maximum: 8
   */
  public void setCpuUsed(Integer cpuUsed) {
    this.cpuUsed = cpuUsed;
  }


  /**
   * Enable automatic alternate reference frames (2pass only)
   * @return automaticAltRefFramesEnabled
   */
  public Boolean getAutomaticAltRefFramesEnabled() {
    return automaticAltRefFramesEnabled;
  }

  /**
   * Enable automatic alternate reference frames (2pass only)
   *
   * @param automaticAltRefFramesEnabled
   *        Enable automatic alternate reference frames (2pass only)
   */
  public void setAutomaticAltRefFramesEnabled(Boolean automaticAltRefFramesEnabled) {
    this.automaticAltRefFramesEnabled = automaticAltRefFramesEnabled;
  }


  /**
   * Target level (255: off, 0: only keep level stats; 10: level 1.0; 11: level 1.1; ... 62: level 6.2)
   * minimum: 0
   * maximum: 255
   * @return targetLevel
   */
  public Integer getTargetLevel() {
    return targetLevel;
  }

  /**
   * Target level (255: off, 0: only keep level stats; 10: level 1.0; 11: level 1.1; ... 62: level 6.2)
   * minimum: 0
   * maximum: 255
   *
   * @param targetLevel
   *        Target level (255: off, 0: only keep level stats; 10: level 1.0; 11: level 1.1; ... 62: level 6.2)
   *        minimum: 0
   *        maximum: 255
   */
  public void setTargetLevel(Integer targetLevel) {
    this.targetLevel = targetLevel;
  }


  /**
   * Enable row based non-deterministic multi-threading
   * @return rowMultiThreadingEnabled
   */
  public Boolean getRowMultiThreadingEnabled() {
    return rowMultiThreadingEnabled;
  }

  /**
   * Enable row based non-deterministic multi-threading
   *
   * @param rowMultiThreadingEnabled
   *        Enable row based non-deterministic multi-threading
   */
  public void setRowMultiThreadingEnabled(Boolean rowMultiThreadingEnabled) {
    this.rowMultiThreadingEnabled = rowMultiThreadingEnabled;
  }


  /**
   * Loop filter sharpness.
   * minimum: 0
   * maximum: 7
   * @return sharpness
   */
  public Integer getSharpness() {
    return sharpness;
  }

  /**
   * Loop filter sharpness.
   * minimum: 0
   * maximum: 7
   *
   * @param sharpness
   *        Loop filter sharpness.
   *        minimum: 0
   *        maximum: 7
   */
  public void setSharpness(Integer sharpness) {
    this.sharpness = sharpness;
  }


  /**
   * Minimum GOP length, the minimum distance between I-frames.
   * @return minGop
   */
  public Integer getMinGop() {
    return minGop;
  }

  /**
   * Minimum GOP length, the minimum distance between I-frames.
   *
   * @param minGop
   *        Minimum GOP length, the minimum distance between I-frames.
   */
  public void setMinGop(Integer minGop) {
    this.minGop = minGop;
  }


  /**
   * Maximum GOP length, the maximum distance between I-frames
   * @return maxGop
   */
  public Integer getMaxGop() {
    return maxGop;
  }

  /**
   * Maximum GOP length, the maximum distance between I-frames
   *
   * @param maxGop
   *        Maximum GOP length, the maximum distance between I-frames
   */
  public void setMaxGop(Integer maxGop) {
    this.maxGop = maxGop;
  }


  /**
   * Minimum interval in seconds between key frames
   * @return minKeyframeInterval
   */
  public Double getMinKeyframeInterval() {
    return minKeyframeInterval;
  }

  /**
   * Minimum interval in seconds between key frames
   *
   * @param minKeyframeInterval
   *        Minimum interval in seconds between key frames
   */
  public void setMinKeyframeInterval(Double minKeyframeInterval) {
    this.minKeyframeInterval = minKeyframeInterval;
  }


  /**
   * Maximum interval in seconds between key frames
   * @return maxKeyframeInterval
   */
  public Double getMaxKeyframeInterval() {
    return maxKeyframeInterval;
  }

  /**
   * Maximum interval in seconds between key frames
   *
   * @param maxKeyframeInterval
   *        Maximum interval in seconds between key frames
   */
  public void setMaxKeyframeInterval(Double maxKeyframeInterval) {
    this.maxKeyframeInterval = maxKeyframeInterval;
  }


  /**
   * Get quality
   * @return quality
   */
  public Vp9Quality getQuality() {
    return quality;
  }

  /**
   * Set quality
   *
   * @param quality
   */
  public void setQuality(Vp9Quality quality) {
    this.quality = quality;
  }


  /**
   * Lossless mode
   * @return lossless
   */
  public Boolean getLossless() {
    return lossless;
  }

  /**
   * Lossless mode
   *
   * @param lossless
   *        Lossless mode
   */
  public void setLossless(Boolean lossless) {
    this.lossless = lossless;
  }


  /**
   * A change threshold on blocks below which they will be skipped by the encoder.
   * minimum: 0
   * @return staticThresh
   */
  public Integer getStaticThresh() {
    return staticThresh;
  }

  /**
   * A change threshold on blocks below which they will be skipped by the encoder.
   * minimum: 0
   *
   * @param staticThresh
   *        A change threshold on blocks below which they will be skipped by the encoder.
   *        minimum: 0
   */
  public void setStaticThresh(Integer staticThresh) {
    this.staticThresh = staticThresh;
  }


  /**
   * Get aqMode
   * @return aqMode
   */
  public Vp9AqMode getAqMode() {
    return aqMode;
  }

  /**
   * Set aqMode
   *
   * @param aqMode
   */
  public void setAqMode(Vp9AqMode aqMode) {
    this.aqMode = aqMode;
  }


  /**
   * altref noise reduction max frame count.
   * minimum: 0
   * maximum: 15
   * @return arnrMaxFrames
   */
  public Integer getArnrMaxFrames() {
    return arnrMaxFrames;
  }

  /**
   * altref noise reduction max frame count.
   * minimum: 0
   * maximum: 15
   *
   * @param arnrMaxFrames
   *        altref noise reduction max frame count.
   *        minimum: 0
   *        maximum: 15
   */
  public void setArnrMaxFrames(Integer arnrMaxFrames) {
    this.arnrMaxFrames = arnrMaxFrames;
  }


  /**
   * altref noise reduction filter strength.
   * minimum: 0
   * maximum: 6
   * @return arnrStrength
   */
  public Integer getArnrStrength() {
    return arnrStrength;
  }

  /**
   * altref noise reduction filter strength.
   * minimum: 0
   * maximum: 6
   *
   * @param arnrStrength
   *        altref noise reduction filter strength.
   *        minimum: 0
   *        maximum: 6
   */
  public void setArnrStrength(Integer arnrStrength) {
    this.arnrStrength = arnrStrength;
  }


  /**
   * Get arnrType
   * @return arnrType
   */
  public Vp9ArnrType getArnrType() {
    return arnrType;
  }

  /**
   * Set arnrType
   *
   * @param arnrType
   */
  public void setArnrType(Vp9ArnrType arnrType) {
    this.arnrType = arnrType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vp9VideoConfiguration vp9VideoConfiguration = (Vp9VideoConfiguration) o;
    return Objects.equals(this.presetConfiguration, vp9VideoConfiguration.presetConfiguration) &&
        Objects.equals(this.crf, vp9VideoConfiguration.crf) &&
        Objects.equals(this.lagInFrames, vp9VideoConfiguration.lagInFrames) &&
        Objects.equals(this.errorResiliencyEnabled, vp9VideoConfiguration.errorResiliencyEnabled) &&
        Objects.equals(this.tileColumns, vp9VideoConfiguration.tileColumns) &&
        Objects.equals(this.tileRows, vp9VideoConfiguration.tileRows) &&
        Objects.equals(this.frameParallel, vp9VideoConfiguration.frameParallel) &&
        Objects.equals(this.maxIntraRate, vp9VideoConfiguration.maxIntraRate) &&
        Objects.equals(this.qpMin, vp9VideoConfiguration.qpMin) &&
        Objects.equals(this.qpMax, vp9VideoConfiguration.qpMax) &&
        Objects.equals(this.rateUndershootPct, vp9VideoConfiguration.rateUndershootPct) &&
        Objects.equals(this.rateOvershootPct, vp9VideoConfiguration.rateOvershootPct) &&
        Objects.equals(this.clientBufferSize, vp9VideoConfiguration.clientBufferSize) &&
        Objects.equals(this.clientInitialBufferSize, vp9VideoConfiguration.clientInitialBufferSize) &&
        Objects.equals(this.biasPct, vp9VideoConfiguration.biasPct) &&
        Objects.equals(this.noiseSensitivity, vp9VideoConfiguration.noiseSensitivity) &&
        Objects.equals(this.cpuUsed, vp9VideoConfiguration.cpuUsed) &&
        Objects.equals(this.automaticAltRefFramesEnabled, vp9VideoConfiguration.automaticAltRefFramesEnabled) &&
        Objects.equals(this.targetLevel, vp9VideoConfiguration.targetLevel) &&
        Objects.equals(this.rowMultiThreadingEnabled, vp9VideoConfiguration.rowMultiThreadingEnabled) &&
        Objects.equals(this.sharpness, vp9VideoConfiguration.sharpness) &&
        Objects.equals(this.minGop, vp9VideoConfiguration.minGop) &&
        Objects.equals(this.maxGop, vp9VideoConfiguration.maxGop) &&
        Objects.equals(this.minKeyframeInterval, vp9VideoConfiguration.minKeyframeInterval) &&
        Objects.equals(this.maxKeyframeInterval, vp9VideoConfiguration.maxKeyframeInterval) &&
        Objects.equals(this.quality, vp9VideoConfiguration.quality) &&
        Objects.equals(this.lossless, vp9VideoConfiguration.lossless) &&
        Objects.equals(this.staticThresh, vp9VideoConfiguration.staticThresh) &&
        Objects.equals(this.aqMode, vp9VideoConfiguration.aqMode) &&
        Objects.equals(this.arnrMaxFrames, vp9VideoConfiguration.arnrMaxFrames) &&
        Objects.equals(this.arnrStrength, vp9VideoConfiguration.arnrStrength) &&
        Objects.equals(this.arnrType, vp9VideoConfiguration.arnrType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presetConfiguration, crf, lagInFrames, errorResiliencyEnabled, tileColumns, tileRows, frameParallel, maxIntraRate, qpMin, qpMax, rateUndershootPct, rateOvershootPct, clientBufferSize, clientInitialBufferSize, biasPct, noiseSensitivity, cpuUsed, automaticAltRefFramesEnabled, targetLevel, rowMultiThreadingEnabled, sharpness, minGop, maxGop, minKeyframeInterval, maxKeyframeInterval, quality, lossless, staticThresh, aqMode, arnrMaxFrames, arnrStrength, arnrType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vp9VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    presetConfiguration: ").append(toIndentedString(presetConfiguration)).append("\n");
    sb.append("    crf: ").append(toIndentedString(crf)).append("\n");
    sb.append("    lagInFrames: ").append(toIndentedString(lagInFrames)).append("\n");
    sb.append("    errorResiliencyEnabled: ").append(toIndentedString(errorResiliencyEnabled)).append("\n");
    sb.append("    tileColumns: ").append(toIndentedString(tileColumns)).append("\n");
    sb.append("    tileRows: ").append(toIndentedString(tileRows)).append("\n");
    sb.append("    frameParallel: ").append(toIndentedString(frameParallel)).append("\n");
    sb.append("    maxIntraRate: ").append(toIndentedString(maxIntraRate)).append("\n");
    sb.append("    qpMin: ").append(toIndentedString(qpMin)).append("\n");
    sb.append("    qpMax: ").append(toIndentedString(qpMax)).append("\n");
    sb.append("    rateUndershootPct: ").append(toIndentedString(rateUndershootPct)).append("\n");
    sb.append("    rateOvershootPct: ").append(toIndentedString(rateOvershootPct)).append("\n");
    sb.append("    clientBufferSize: ").append(toIndentedString(clientBufferSize)).append("\n");
    sb.append("    clientInitialBufferSize: ").append(toIndentedString(clientInitialBufferSize)).append("\n");
    sb.append("    biasPct: ").append(toIndentedString(biasPct)).append("\n");
    sb.append("    noiseSensitivity: ").append(toIndentedString(noiseSensitivity)).append("\n");
    sb.append("    cpuUsed: ").append(toIndentedString(cpuUsed)).append("\n");
    sb.append("    automaticAltRefFramesEnabled: ").append(toIndentedString(automaticAltRefFramesEnabled)).append("\n");
    sb.append("    targetLevel: ").append(toIndentedString(targetLevel)).append("\n");
    sb.append("    rowMultiThreadingEnabled: ").append(toIndentedString(rowMultiThreadingEnabled)).append("\n");
    sb.append("    sharpness: ").append(toIndentedString(sharpness)).append("\n");
    sb.append("    minGop: ").append(toIndentedString(minGop)).append("\n");
    sb.append("    maxGop: ").append(toIndentedString(maxGop)).append("\n");
    sb.append("    minKeyframeInterval: ").append(toIndentedString(minKeyframeInterval)).append("\n");
    sb.append("    maxKeyframeInterval: ").append(toIndentedString(maxKeyframeInterval)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    lossless: ").append(toIndentedString(lossless)).append("\n");
    sb.append("    staticThresh: ").append(toIndentedString(staticThresh)).append("\n");
    sb.append("    aqMode: ").append(toIndentedString(aqMode)).append("\n");
    sb.append("    arnrMaxFrames: ").append(toIndentedString(arnrMaxFrames)).append("\n");
    sb.append("    arnrStrength: ").append(toIndentedString(arnrStrength)).append("\n");
    sb.append("    arnrType: ").append(toIndentedString(arnrType)).append("\n");
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


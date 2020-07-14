package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CodecConfigType;
import com.bitmovin.api.sdk.model.DolbyVisionPerStreamMode;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.InputFactor;
import com.bitmovin.api.sdk.model.PsnrPerStreamMode;
import com.bitmovin.api.sdk.model.StatisticsPerTitleStream;
import com.bitmovin.api.sdk.model.StatisticsResolution;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StatisticsPerStream
 */

public class StatisticsPerStream {
  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("codecConfigId")
  private String codecConfigId;

  @JsonProperty("multiplicator")
  private Double multiplicator;

  @JsonProperty("encodedBytes")
  private Long encodedBytes;

  @JsonProperty("encodedSeconds")
  private Double encodedSeconds;

  @JsonProperty("billableMinutes")
  private Double billableMinutes;

  @JsonProperty("width")
  private Long width;

  @JsonProperty("height")
  private Long height;

  @JsonProperty("rate")
  private Double rate;

  @JsonProperty("bitrate")
  private Long bitrate;

  @JsonProperty("codec")
  private CodecConfigType codec;

  @JsonProperty("resolution")
  private StatisticsResolution resolution;

  @JsonProperty("encodingMode")
  private EncodingMode encodingMode;

  @JsonProperty("encodingModeMultiplicator")
  private Double encodingModeMultiplicator;

  @JsonProperty("perTitleResultStream")
  private StatisticsPerTitleStream perTitleResultStream;

  @JsonProperty("perTitleMultiplicator")
  private Double perTitleMultiplicator;

  @JsonProperty("psnrMode")
  private PsnrPerStreamMode psnrMode;

  @JsonProperty("psnrMultiplicator")
  private Double psnrMultiplicator;

  @JsonProperty("dolbyVisionMode")
  private DolbyVisionPerStreamMode dolbyVisionMode;

  @JsonProperty("dolbyVisionMultiplicator")
  private Double dolbyVisionMultiplicator;

  @JsonProperty("preset")
  private String preset;

  @JsonProperty("presetMultiplicator")
  private Double presetMultiplicator;

  @JsonProperty("live")
  private Boolean live;

  @JsonProperty("liveMultiplicator")
  private Double liveMultiplicator;

  @JsonProperty("inputFactor")
  private InputFactor inputFactor;

  /**
   * ID of the stream (required)
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * ID of the condec configuration (required)
   * @return codecConfigId
   */
  public String getCodecConfigId() {
    return codecConfigId;
  }

  /**
   * Multiplier for the encoded minutes. Depends on muxing type. (required)
   * @return multiplicator
   */
  public Double getMultiplicator() {
    return multiplicator;
  }

  /**
   * Encoded bytes. (required)
   * @return encodedBytes
   */
  public Long getEncodedBytes() {
    return encodedBytes;
  }

  /**
   * Length of the stream. (required)
   * @return encodedSeconds
   */
  public Double getEncodedSeconds() {
    return encodedSeconds;
  }

  /**
   * Minutes you will be charged for (billableMinutes &#x3D; encodedSeconds * multiplicator) (required)
   * @return billableMinutes
   */
  public Double getBillableMinutes() {
    return billableMinutes;
  }

  /**
   * Video width, only if video stream
   * @return width
   */
  public Long getWidth() {
    return width;
  }

  /**
   * Video height, only if video stream
   * @return height
   */
  public Long getHeight() {
    return height;
  }

  /**
   * If it&#39; a video stream this value is the FPS, for audio it&#39;s the sample rate. (required)
   * @return rate
   */
  public Double getRate() {
    return rate;
  }

  /**
   * Bitrate of the stream (required)
   * @return bitrate
   */
  public Long getBitrate() {
    return bitrate;
  }


  /**
   * Get codec
   * @return codec
   */
  public CodecConfigType getCodec() {
    return codec;
  }

  /**
   * Set codec
   *
   * @param codec
   */
  public void setCodec(CodecConfigType codec) {
    this.codec = codec;
  }


  /**
   * Get resolution
   * @return resolution
   */
  public StatisticsResolution getResolution() {
    return resolution;
  }

  /**
   * Set resolution
   *
   * @param resolution
   */
  public void setResolution(StatisticsResolution resolution) {
    this.resolution = resolution;
  }


  /**
   * Get encodingMode
   * @return encodingMode
   */
  public EncodingMode getEncodingMode() {
    return encodingMode;
  }

  /**
   * Set encodingMode
   *
   * @param encodingMode
   */
  public void setEncodingMode(EncodingMode encodingMode) {
    this.encodingMode = encodingMode;
  }

  /**
   * The output minutes multiplicator for the given encodingMode
   * @return encodingModeMultiplicator
   */
  public Double getEncodingModeMultiplicator() {
    return encodingModeMultiplicator;
  }


  /**
   * Get perTitleResultStream
   * @return perTitleResultStream
   */
  public StatisticsPerTitleStream getPerTitleResultStream() {
    return perTitleResultStream;
  }

  /**
   * Set perTitleResultStream
   *
   * @param perTitleResultStream
   */
  public void setPerTitleResultStream(StatisticsPerTitleStream perTitleResultStream) {
    this.perTitleResultStream = perTitleResultStream;
  }

  /**
   * The output minutes multiplicator for per-title
   * @return perTitleMultiplicator
   */
  public Double getPerTitleMultiplicator() {
    return perTitleMultiplicator;
  }


  /**
   * Get psnrMode
   * @return psnrMode
   */
  public PsnrPerStreamMode getPsnrMode() {
    return psnrMode;
  }

  /**
   * Set psnrMode
   *
   * @param psnrMode
   */
  public void setPsnrMode(PsnrPerStreamMode psnrMode) {
    this.psnrMode = psnrMode;
  }

  /**
   * The output minutes multiplicator for psnr streams
   * @return psnrMultiplicator
   */
  public Double getPsnrMultiplicator() {
    return psnrMultiplicator;
  }


  /**
   * Get dolbyVisionMode
   * @return dolbyVisionMode
   */
  public DolbyVisionPerStreamMode getDolbyVisionMode() {
    return dolbyVisionMode;
  }

  /**
   * Set dolbyVisionMode
   *
   * @param dolbyVisionMode
   */
  public void setDolbyVisionMode(DolbyVisionPerStreamMode dolbyVisionMode) {
    this.dolbyVisionMode = dolbyVisionMode;
  }

  /**
   * The output minutes multiplicator for Dolby Vision streams
   * @return dolbyVisionMultiplicator
   */
  public Double getDolbyVisionMultiplicator() {
    return dolbyVisionMultiplicator;
  }

  /**
   * Name of the preset configuration used for the codec configuration or \&quot;CUSTOM\&quot; if any preset values were overridden
   * @return preset
   */
  public String getPreset() {
    return preset;
  }

  /**
   * The output minutes multiplicator for the used codec configuration preset.
   * @return presetMultiplicator
   */
  public Double getPresetMultiplicator() {
    return presetMultiplicator;
  }

  /**
   * Indicates if the stream was part of a live encoding.
   * @return live
   */
  public Boolean getLive() {
    return live;
  }

  /**
   * The output minutes multiplicator for live streams.
   * @return liveMultiplicator
   */
  public Double getLiveMultiplicator() {
    return liveMultiplicator;
  }


  /**
   * Get inputFactor
   * @return inputFactor
   */
  public InputFactor getInputFactor() {
    return inputFactor;
  }

  /**
   * Set inputFactor
   *
   * @param inputFactor
   */
  public void setInputFactor(InputFactor inputFactor) {
    this.inputFactor = inputFactor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticsPerStream statisticsPerStream = (StatisticsPerStream) o;
    return Objects.equals(this.streamId, statisticsPerStream.streamId) &&
        Objects.equals(this.codecConfigId, statisticsPerStream.codecConfigId) &&
        Objects.equals(this.multiplicator, statisticsPerStream.multiplicator) &&
        Objects.equals(this.encodedBytes, statisticsPerStream.encodedBytes) &&
        Objects.equals(this.encodedSeconds, statisticsPerStream.encodedSeconds) &&
        Objects.equals(this.billableMinutes, statisticsPerStream.billableMinutes) &&
        Objects.equals(this.width, statisticsPerStream.width) &&
        Objects.equals(this.height, statisticsPerStream.height) &&
        Objects.equals(this.rate, statisticsPerStream.rate) &&
        Objects.equals(this.bitrate, statisticsPerStream.bitrate) &&
        Objects.equals(this.codec, statisticsPerStream.codec) &&
        Objects.equals(this.resolution, statisticsPerStream.resolution) &&
        Objects.equals(this.encodingMode, statisticsPerStream.encodingMode) &&
        Objects.equals(this.encodingModeMultiplicator, statisticsPerStream.encodingModeMultiplicator) &&
        Objects.equals(this.perTitleResultStream, statisticsPerStream.perTitleResultStream) &&
        Objects.equals(this.perTitleMultiplicator, statisticsPerStream.perTitleMultiplicator) &&
        Objects.equals(this.psnrMode, statisticsPerStream.psnrMode) &&
        Objects.equals(this.psnrMultiplicator, statisticsPerStream.psnrMultiplicator) &&
        Objects.equals(this.dolbyVisionMode, statisticsPerStream.dolbyVisionMode) &&
        Objects.equals(this.dolbyVisionMultiplicator, statisticsPerStream.dolbyVisionMultiplicator) &&
        Objects.equals(this.preset, statisticsPerStream.preset) &&
        Objects.equals(this.presetMultiplicator, statisticsPerStream.presetMultiplicator) &&
        Objects.equals(this.live, statisticsPerStream.live) &&
        Objects.equals(this.liveMultiplicator, statisticsPerStream.liveMultiplicator) &&
        Objects.equals(this.inputFactor, statisticsPerStream.inputFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, codecConfigId, multiplicator, encodedBytes, encodedSeconds, billableMinutes, width, height, rate, bitrate, codec, resolution, encodingMode, encodingModeMultiplicator, perTitleResultStream, perTitleMultiplicator, psnrMode, psnrMultiplicator, dolbyVisionMode, dolbyVisionMultiplicator, preset, presetMultiplicator, live, liveMultiplicator, inputFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticsPerStream {\n");
    
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    codecConfigId: ").append(toIndentedString(codecConfigId)).append("\n");
    sb.append("    multiplicator: ").append(toIndentedString(multiplicator)).append("\n");
    sb.append("    encodedBytes: ").append(toIndentedString(encodedBytes)).append("\n");
    sb.append("    encodedSeconds: ").append(toIndentedString(encodedSeconds)).append("\n");
    sb.append("    billableMinutes: ").append(toIndentedString(billableMinutes)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    encodingMode: ").append(toIndentedString(encodingMode)).append("\n");
    sb.append("    encodingModeMultiplicator: ").append(toIndentedString(encodingModeMultiplicator)).append("\n");
    sb.append("    perTitleResultStream: ").append(toIndentedString(perTitleResultStream)).append("\n");
    sb.append("    perTitleMultiplicator: ").append(toIndentedString(perTitleMultiplicator)).append("\n");
    sb.append("    psnrMode: ").append(toIndentedString(psnrMode)).append("\n");
    sb.append("    psnrMultiplicator: ").append(toIndentedString(psnrMultiplicator)).append("\n");
    sb.append("    dolbyVisionMode: ").append(toIndentedString(dolbyVisionMode)).append("\n");
    sb.append("    dolbyVisionMultiplicator: ").append(toIndentedString(dolbyVisionMultiplicator)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    presetMultiplicator: ").append(toIndentedString(presetMultiplicator)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    liveMultiplicator: ").append(toIndentedString(liveMultiplicator)).append("\n");
    sb.append("    inputFactor: ").append(toIndentedString(inputFactor)).append("\n");
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


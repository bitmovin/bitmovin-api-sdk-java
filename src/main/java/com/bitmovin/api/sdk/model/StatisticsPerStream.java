package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CodecConfigType;
import com.bitmovin.api.sdk.model.DolbyVisionPerStreamMode;
import com.bitmovin.api.sdk.model.EncodingMode;
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


  /**
   * ID of the stream (required)
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * ID of the stream (required)
   *
   * @param streamId
   *        ID of the stream (required)
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * ID of the condec configuration (required)
   * @return codecConfigId
   */
  public String getCodecConfigId() {
    return codecConfigId;
  }

  /**
   * ID of the condec configuration (required)
   *
   * @param codecConfigId
   *        ID of the condec configuration (required)
   */
  public void setCodecConfigId(String codecConfigId) {
    this.codecConfigId = codecConfigId;
  }


  /**
   * Multiplier for the encoded minutes. Depends on muxing type. (required)
   * @return multiplicator
   */
  public Double getMultiplicator() {
    return multiplicator;
  }

  /**
   * Multiplier for the encoded minutes. Depends on muxing type. (required)
   *
   * @param multiplicator
   *        Multiplier for the encoded minutes. Depends on muxing type. (required)
   */
  public void setMultiplicator(Double multiplicator) {
    this.multiplicator = multiplicator;
  }


  /**
   * Encoded bytes. (required)
   * @return encodedBytes
   */
  public Long getEncodedBytes() {
    return encodedBytes;
  }

  /**
   * Encoded bytes. (required)
   *
   * @param encodedBytes
   *        Encoded bytes. (required)
   */
  public void setEncodedBytes(Long encodedBytes) {
    this.encodedBytes = encodedBytes;
  }


  /**
   * Length of the stream. (required)
   * @return encodedSeconds
   */
  public Double getEncodedSeconds() {
    return encodedSeconds;
  }

  /**
   * Length of the stream. (required)
   *
   * @param encodedSeconds
   *        Length of the stream. (required)
   */
  public void setEncodedSeconds(Double encodedSeconds) {
    this.encodedSeconds = encodedSeconds;
  }


  /**
   * Minutes you will be charged for (billableMinutes &#x3D; encodedSeconds * multiplicator) (required)
   * @return billableMinutes
   */
  public Double getBillableMinutes() {
    return billableMinutes;
  }

  /**
   * Minutes you will be charged for (billableMinutes &#x3D; encodedSeconds * multiplicator) (required)
   *
   * @param billableMinutes
   *        Minutes you will be charged for (billableMinutes &#x3D; encodedSeconds * multiplicator) (required)
   */
  public void setBillableMinutes(Double billableMinutes) {
    this.billableMinutes = billableMinutes;
  }


  /**
   * Video width, only if video stream
   * @return width
   */
  public Long getWidth() {
    return width;
  }

  /**
   * Video width, only if video stream
   *
   * @param width
   *        Video width, only if video stream
   */
  public void setWidth(Long width) {
    this.width = width;
  }


  /**
   * Video height, only if video stream
   * @return height
   */
  public Long getHeight() {
    return height;
  }

  /**
   * Video height, only if video stream
   *
   * @param height
   *        Video height, only if video stream
   */
  public void setHeight(Long height) {
    this.height = height;
  }


  /**
   * If it&#39; a video stream this value is the FPS, for audio it&#39;s the sample rate. (required)
   * @return rate
   */
  public Double getRate() {
    return rate;
  }

  /**
   * If it&#39; a video stream this value is the FPS, for audio it&#39;s the sample rate. (required)
   *
   * @param rate
   *        If it&#39; a video stream this value is the FPS, for audio it&#39;s the sample rate. (required)
   */
  public void setRate(Double rate) {
    this.rate = rate;
  }


  /**
   * Bitrate of the stream (required)
   * @return bitrate
   */
  public Long getBitrate() {
    return bitrate;
  }

  /**
   * Bitrate of the stream (required)
   *
   * @param bitrate
   *        Bitrate of the stream (required)
   */
  public void setBitrate(Long bitrate) {
    this.bitrate = bitrate;
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
   * The output minutes multiplicator for the given encodingMode
   *
   * @param encodingModeMultiplicator
   *        The output minutes multiplicator for the given encodingMode
   */
  public void setEncodingModeMultiplicator(Double encodingModeMultiplicator) {
    this.encodingModeMultiplicator = encodingModeMultiplicator;
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
   * The output minutes multiplicator for per-title
   *
   * @param perTitleMultiplicator
   *        The output minutes multiplicator for per-title
   */
  public void setPerTitleMultiplicator(Double perTitleMultiplicator) {
    this.perTitleMultiplicator = perTitleMultiplicator;
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
   * The output minutes multiplicator for psnr streams
   *
   * @param psnrMultiplicator
   *        The output minutes multiplicator for psnr streams
   */
  public void setPsnrMultiplicator(Double psnrMultiplicator) {
    this.psnrMultiplicator = psnrMultiplicator;
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
   * The output minutes multiplicator for Dolby Vision streams
   *
   * @param dolbyVisionMultiplicator
   *        The output minutes multiplicator for Dolby Vision streams
   */
  public void setDolbyVisionMultiplicator(Double dolbyVisionMultiplicator) {
    this.dolbyVisionMultiplicator = dolbyVisionMultiplicator;
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
        Objects.equals(this.dolbyVisionMultiplicator, statisticsPerStream.dolbyVisionMultiplicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, codecConfigId, multiplicator, encodedBytes, encodedSeconds, billableMinutes, width, height, rate, bitrate, codec, resolution, encodingMode, encodingModeMultiplicator, perTitleResultStream, perTitleMultiplicator, psnrMode, psnrMultiplicator, dolbyVisionMode, dolbyVisionMultiplicator);
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


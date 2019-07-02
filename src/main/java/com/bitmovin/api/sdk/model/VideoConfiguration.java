package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CodecConfiguration;
import com.bitmovin.api.sdk.model.ColorConfig;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.PixelFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * VideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class VideoConfiguration extends CodecConfiguration {
  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("bitrate")
  private Long bitrate;

  @JsonProperty("rate")
  private Double rate;

  @JsonProperty("pixelFormat")
  private PixelFormat pixelFormat;

  @JsonProperty("colorConfig")
  private ColorConfig colorConfig;

  @JsonProperty("sampleAspectRatioNumerator")
  private Integer sampleAspectRatioNumerator;

  @JsonProperty("sampleAspectRatioDenominator")
  private Integer sampleAspectRatioDenominator;

  @JsonProperty("encodingMode")
  private EncodingMode encodingMode;


  /**
   * Width of the encoded video in pixels
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width of the encoded video in pixels
   *
   * @param width
   *        Width of the encoded video in pixels
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * Height of the encoded video in pixels
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of the encoded video in pixels
   *
   * @param height
   *        Height of the encoded video in pixels
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Target bitrate for the encoded video in bps. Either bitrate or crf is required.
   * @return bitrate
   */
  public Long getBitrate() {
    return bitrate;
  }

  /**
   * Target bitrate for the encoded video in bps. Either bitrate or crf is required.
   *
   * @param bitrate
   *        Target bitrate for the encoded video in bps. Either bitrate or crf is required.
   */
  public void setBitrate(Long bitrate) {
    this.bitrate = bitrate;
  }


  /**
   * Target frame rate of the encoded video. Must be set for live encodings
   * @return rate
   */
  public Double getRate() {
    return rate;
  }

  /**
   * Target frame rate of the encoded video. Must be set for live encodings
   *
   * @param rate
   *        Target frame rate of the encoded video. Must be set for live encodings
   */
  public void setRate(Double rate) {
    this.rate = rate;
  }


  /**
   * Get pixelFormat
   * @return pixelFormat
   */
  public PixelFormat getPixelFormat() {
    return pixelFormat;
  }

  /**
   * Set pixelFormat
   *
   * @param pixelFormat
   */
  public void setPixelFormat(PixelFormat pixelFormat) {
    this.pixelFormat = pixelFormat;
  }


  /**
   * Get colorConfig
   * @return colorConfig
   */
  public ColorConfig getColorConfig() {
    return colorConfig;
  }

  /**
   * Set colorConfig
   *
   * @param colorConfig
   */
  public void setColorConfig(ColorConfig colorConfig) {
    this.colorConfig = colorConfig;
  }


  /**
   * The numerator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioDenominator is set.
   * @return sampleAspectRatioNumerator
   */
  public Integer getSampleAspectRatioNumerator() {
    return sampleAspectRatioNumerator;
  }

  /**
   * The numerator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioDenominator is set.
   *
   * @param sampleAspectRatioNumerator
   *        The numerator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioDenominator is set.
   */
  public void setSampleAspectRatioNumerator(Integer sampleAspectRatioNumerator) {
    this.sampleAspectRatioNumerator = sampleAspectRatioNumerator;
  }


  /**
   * The denominator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioNumerator is set.
   * @return sampleAspectRatioDenominator
   */
  public Integer getSampleAspectRatioDenominator() {
    return sampleAspectRatioDenominator;
  }

  /**
   * The denominator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioNumerator is set.
   *
   * @param sampleAspectRatioDenominator
   *        The denominator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioNumerator is set.
   */
  public void setSampleAspectRatioDenominator(Integer sampleAspectRatioDenominator) {
    this.sampleAspectRatioDenominator = sampleAspectRatioDenominator;
  }


  /**
   * The mode of the encoding
   * @return encodingMode
   */
  public EncodingMode getEncodingMode() {
    return encodingMode;
  }

  /**
   * The mode of the encoding
   *
   * @param encodingMode
   *        The mode of the encoding
   */
  public void setEncodingMode(EncodingMode encodingMode) {
    this.encodingMode = encodingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoConfiguration videoConfiguration = (VideoConfiguration) o;
    return Objects.equals(this.width, videoConfiguration.width) &&
        Objects.equals(this.height, videoConfiguration.height) &&
        Objects.equals(this.bitrate, videoConfiguration.bitrate) &&
        Objects.equals(this.rate, videoConfiguration.rate) &&
        Objects.equals(this.pixelFormat, videoConfiguration.pixelFormat) &&
        Objects.equals(this.colorConfig, videoConfiguration.colorConfig) &&
        Objects.equals(this.sampleAspectRatioNumerator, videoConfiguration.sampleAspectRatioNumerator) &&
        Objects.equals(this.sampleAspectRatioDenominator, videoConfiguration.sampleAspectRatioDenominator) &&
        Objects.equals(this.encodingMode, videoConfiguration.encodingMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, bitrate, rate, pixelFormat, colorConfig, sampleAspectRatioNumerator, sampleAspectRatioDenominator, encodingMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
    sb.append("    colorConfig: ").append(toIndentedString(colorConfig)).append("\n");
    sb.append("    sampleAspectRatioNumerator: ").append(toIndentedString(sampleAspectRatioNumerator)).append("\n");
    sb.append("    sampleAspectRatioDenominator: ").append(toIndentedString(sampleAspectRatioDenominator)).append("\n");
    sb.append("    encodingMode: ").append(toIndentedString(encodingMode)).append("\n");
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


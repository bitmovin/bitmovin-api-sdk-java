package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CodecConfiguration;
import com.bitmovin.api.sdk.model.PixelFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * MjpegVideoConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = MjpegVideoConfiguration.class)
public class MjpegVideoConfiguration extends CodecConfiguration {
  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("rate")
  private Double rate;

  @JsonProperty("qScale")
  private Integer qScale;

  @JsonProperty("pixelFormat")
  private PixelFormat pixelFormat;


  /**
   * Width of the encoded video
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width of the encoded video
   *
   * @param width
   *        Width of the encoded video
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * Height of the encoded video
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of the encoded video
   *
   * @param height
   *        Height of the encoded video
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Target frame rate of the encoded video! (required)
   * @return rate
   */
  public Double getRate() {
    return rate;
  }

  /**
   * Target frame rate of the encoded video! (required)
   *
   * @param rate
   *        Target frame rate of the encoded video! (required)
   */
  public void setRate(Double rate) {
    this.rate = rate;
  }


  /**
   * The quality scale parameter (required)
   * @return qScale
   */
  public Integer getQScale() {
    return qScale;
  }

  /**
   * The quality scale parameter (required)
   *
   * @param qScale
   *        The quality scale parameter (required)
   */
  public void setQScale(Integer qScale) {
    this.qScale = qScale;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MjpegVideoConfiguration mjpegVideoConfiguration = (MjpegVideoConfiguration) o;
    return Objects.equals(this.width, mjpegVideoConfiguration.width) &&
        Objects.equals(this.height, mjpegVideoConfiguration.height) &&
        Objects.equals(this.rate, mjpegVideoConfiguration.rate) &&
        Objects.equals(this.qScale, mjpegVideoConfiguration.qScale) &&
        Objects.equals(this.pixelFormat, mjpegVideoConfiguration.pixelFormat) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, rate, qScale, pixelFormat, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MjpegVideoConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    qScale: ").append(toIndentedString(qScale)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
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


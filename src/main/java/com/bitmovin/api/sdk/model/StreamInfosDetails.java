package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingCodec;
import com.bitmovin.api.sdk.model.MediaType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamInfosDetails
 */

public class StreamInfosDetails {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("mediaType")
  private MediaType mediaType;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("rate")
  private Long rate;

  @JsonProperty("codec")
  private LiveEncodingCodec codec;

  @JsonProperty("samplesReadPerSecondMin")
  private Double samplesReadPerSecondMin;

  @JsonProperty("samplesReadPerSecondMax")
  private Double samplesReadPerSecondMax;

  @JsonProperty("samplesReadPerSecondAvg")
  private Double samplesReadPerSecondAvg;

  @JsonProperty("samplesBackupPerSecondMin")
  private Double samplesBackupPerSecondMin;

  @JsonProperty("samplesBackupPerSecondMax")
  private Double samplesBackupPerSecondMax;

  @JsonProperty("samplesBackupPerSecondAvg")
  private Double samplesBackupPerSecondAvg;

  @JsonProperty("bytesReadPerSecondMin")
  private Double bytesReadPerSecondMin;

  @JsonProperty("bytesReadPerSecondMax")
  private Double bytesReadPerSecondMax;

  @JsonProperty("bytesReadPerSecondAvg")
  private Double bytesReadPerSecondAvg;

  @JsonProperty("bytesBackupPerSecondMin")
  private Double bytesBackupPerSecondMin;

  @JsonProperty("bytesBackupPerSecondMax")
  private Double bytesBackupPerSecondMax;

  @JsonProperty("bytesBackupPerSecondAvg")
  private Double bytesBackupPerSecondAvg;


  /**
   * The id of the stream (required)
   * @return id
   */
  public Long getId() {
    return id;
  }

  /**
   * The id of the stream (required)
   *
   * @param id
   *        The id of the stream (required)
   */
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * The media type of the stream (required)
   * @return mediaType
   */
  public MediaType getMediaType() {
    return mediaType;
  }

  /**
   * The media type of the stream (required)
   *
   * @param mediaType
   *        The media type of the stream (required)
   */
  public void setMediaType(MediaType mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * The width of the stream, if it is a video stream
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * The width of the stream, if it is a video stream
   *
   * @param width
   *        The width of the stream, if it is a video stream
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * The height of the stream, if it is a video stream
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * The height of the stream, if it is a video stream
   *
   * @param height
   *        The height of the stream, if it is a video stream
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * The rate (sample rate / fps) of the stream (required)
   * @return rate
   */
  public Long getRate() {
    return rate;
  }

  /**
   * The rate (sample rate / fps) of the stream (required)
   *
   * @param rate
   *        The rate (sample rate / fps) of the stream (required)
   */
  public void setRate(Long rate) {
    this.rate = rate;
  }


  /**
   * The codec of the input stream (required)
   * @return codec
   */
  public LiveEncodingCodec getCodec() {
    return codec;
  }

  /**
   * The codec of the input stream (required)
   *
   * @param codec
   *        The codec of the input stream (required)
   */
  public void setCodec(LiveEncodingCodec codec) {
    this.codec = codec;
  }


  /**
   * The minimum samples read per second within the last minute (required)
   * @return samplesReadPerSecondMin
   */
  public Double getSamplesReadPerSecondMin() {
    return samplesReadPerSecondMin;
  }

  /**
   * The minimum samples read per second within the last minute (required)
   *
   * @param samplesReadPerSecondMin
   *        The minimum samples read per second within the last minute (required)
   */
  public void setSamplesReadPerSecondMin(Double samplesReadPerSecondMin) {
    this.samplesReadPerSecondMin = samplesReadPerSecondMin;
  }


  /**
   * The maximum samples read per second within the last minute (required)
   * @return samplesReadPerSecondMax
   */
  public Double getSamplesReadPerSecondMax() {
    return samplesReadPerSecondMax;
  }

  /**
   * The maximum samples read per second within the last minute (required)
   *
   * @param samplesReadPerSecondMax
   *        The maximum samples read per second within the last minute (required)
   */
  public void setSamplesReadPerSecondMax(Double samplesReadPerSecondMax) {
    this.samplesReadPerSecondMax = samplesReadPerSecondMax;
  }


  /**
   * The average samples read per second within the last minute (required)
   * @return samplesReadPerSecondAvg
   */
  public Double getSamplesReadPerSecondAvg() {
    return samplesReadPerSecondAvg;
  }

  /**
   * The average samples read per second within the last minute (required)
   *
   * @param samplesReadPerSecondAvg
   *        The average samples read per second within the last minute (required)
   */
  public void setSamplesReadPerSecondAvg(Double samplesReadPerSecondAvg) {
    this.samplesReadPerSecondAvg = samplesReadPerSecondAvg;
  }


  /**
   * The minimum amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   * @return samplesBackupPerSecondMin
   */
  public Double getSamplesBackupPerSecondMin() {
    return samplesBackupPerSecondMin;
  }

  /**
   * The minimum amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   *
   * @param samplesBackupPerSecondMin
   *        The minimum amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   */
  public void setSamplesBackupPerSecondMin(Double samplesBackupPerSecondMin) {
    this.samplesBackupPerSecondMin = samplesBackupPerSecondMin;
  }


  /**
   * The maximum amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   * @return samplesBackupPerSecondMax
   */
  public Double getSamplesBackupPerSecondMax() {
    return samplesBackupPerSecondMax;
  }

  /**
   * The maximum amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   *
   * @param samplesBackupPerSecondMax
   *        The maximum amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   */
  public void setSamplesBackupPerSecondMax(Double samplesBackupPerSecondMax) {
    this.samplesBackupPerSecondMax = samplesBackupPerSecondMax;
  }


  /**
   * The average amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   * @return samplesBackupPerSecondAvg
   */
  public Double getSamplesBackupPerSecondAvg() {
    return samplesBackupPerSecondAvg;
  }

  /**
   * The average amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   *
   * @param samplesBackupPerSecondAvg
   *        The average amount of backup samples used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   */
  public void setSamplesBackupPerSecondAvg(Double samplesBackupPerSecondAvg) {
    this.samplesBackupPerSecondAvg = samplesBackupPerSecondAvg;
  }


  /**
   * The minimum bytes read per second within the last minute (required)
   * @return bytesReadPerSecondMin
   */
  public Double getBytesReadPerSecondMin() {
    return bytesReadPerSecondMin;
  }

  /**
   * The minimum bytes read per second within the last minute (required)
   *
   * @param bytesReadPerSecondMin
   *        The minimum bytes read per second within the last minute (required)
   */
  public void setBytesReadPerSecondMin(Double bytesReadPerSecondMin) {
    this.bytesReadPerSecondMin = bytesReadPerSecondMin;
  }


  /**
   * The maximum bytes read per second within the last minute (required)
   * @return bytesReadPerSecondMax
   */
  public Double getBytesReadPerSecondMax() {
    return bytesReadPerSecondMax;
  }

  /**
   * The maximum bytes read per second within the last minute (required)
   *
   * @param bytesReadPerSecondMax
   *        The maximum bytes read per second within the last minute (required)
   */
  public void setBytesReadPerSecondMax(Double bytesReadPerSecondMax) {
    this.bytesReadPerSecondMax = bytesReadPerSecondMax;
  }


  /**
   * The average bytes read per second within the last minute (required)
   * @return bytesReadPerSecondAvg
   */
  public Double getBytesReadPerSecondAvg() {
    return bytesReadPerSecondAvg;
  }

  /**
   * The average bytes read per second within the last minute (required)
   *
   * @param bytesReadPerSecondAvg
   *        The average bytes read per second within the last minute (required)
   */
  public void setBytesReadPerSecondAvg(Double bytesReadPerSecondAvg) {
    this.bytesReadPerSecondAvg = bytesReadPerSecondAvg;
  }


  /**
   * The minimum amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   * @return bytesBackupPerSecondMin
   */
  public Double getBytesBackupPerSecondMin() {
    return bytesBackupPerSecondMin;
  }

  /**
   * The minimum amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   *
   * @param bytesBackupPerSecondMin
   *        The minimum amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   */
  public void setBytesBackupPerSecondMin(Double bytesBackupPerSecondMin) {
    this.bytesBackupPerSecondMin = bytesBackupPerSecondMin;
  }


  /**
   * The maximum amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   * @return bytesBackupPerSecondMax
   */
  public Double getBytesBackupPerSecondMax() {
    return bytesBackupPerSecondMax;
  }

  /**
   * The maximum amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   *
   * @param bytesBackupPerSecondMax
   *        The maximum amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   */
  public void setBytesBackupPerSecondMax(Double bytesBackupPerSecondMax) {
    this.bytesBackupPerSecondMax = bytesBackupPerSecondMax;
  }


  /**
   * The average amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   * @return bytesBackupPerSecondAvg
   */
  public Double getBytesBackupPerSecondAvg() {
    return bytesBackupPerSecondAvg;
  }

  /**
   * The average amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   *
   * @param bytesBackupPerSecondAvg
   *        The average amount of backup bytes used per second within the last minute. This will be written when no live stream is ingested. The last picture will be repeated with silent audio. (required)
   */
  public void setBytesBackupPerSecondAvg(Double bytesBackupPerSecondAvg) {
    this.bytesBackupPerSecondAvg = bytesBackupPerSecondAvg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamInfosDetails streamInfosDetails = (StreamInfosDetails) o;
    return Objects.equals(this.id, streamInfosDetails.id) &&
        Objects.equals(this.mediaType, streamInfosDetails.mediaType) &&
        Objects.equals(this.width, streamInfosDetails.width) &&
        Objects.equals(this.height, streamInfosDetails.height) &&
        Objects.equals(this.rate, streamInfosDetails.rate) &&
        Objects.equals(this.codec, streamInfosDetails.codec) &&
        Objects.equals(this.samplesReadPerSecondMin, streamInfosDetails.samplesReadPerSecondMin) &&
        Objects.equals(this.samplesReadPerSecondMax, streamInfosDetails.samplesReadPerSecondMax) &&
        Objects.equals(this.samplesReadPerSecondAvg, streamInfosDetails.samplesReadPerSecondAvg) &&
        Objects.equals(this.samplesBackupPerSecondMin, streamInfosDetails.samplesBackupPerSecondMin) &&
        Objects.equals(this.samplesBackupPerSecondMax, streamInfosDetails.samplesBackupPerSecondMax) &&
        Objects.equals(this.samplesBackupPerSecondAvg, streamInfosDetails.samplesBackupPerSecondAvg) &&
        Objects.equals(this.bytesReadPerSecondMin, streamInfosDetails.bytesReadPerSecondMin) &&
        Objects.equals(this.bytesReadPerSecondMax, streamInfosDetails.bytesReadPerSecondMax) &&
        Objects.equals(this.bytesReadPerSecondAvg, streamInfosDetails.bytesReadPerSecondAvg) &&
        Objects.equals(this.bytesBackupPerSecondMin, streamInfosDetails.bytesBackupPerSecondMin) &&
        Objects.equals(this.bytesBackupPerSecondMax, streamInfosDetails.bytesBackupPerSecondMax) &&
        Objects.equals(this.bytesBackupPerSecondAvg, streamInfosDetails.bytesBackupPerSecondAvg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaType, width, height, rate, codec, samplesReadPerSecondMin, samplesReadPerSecondMax, samplesReadPerSecondAvg, samplesBackupPerSecondMin, samplesBackupPerSecondMax, samplesBackupPerSecondAvg, bytesReadPerSecondMin, bytesReadPerSecondMax, bytesReadPerSecondAvg, bytesBackupPerSecondMin, bytesBackupPerSecondMax, bytesBackupPerSecondAvg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamInfosDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    samplesReadPerSecondMin: ").append(toIndentedString(samplesReadPerSecondMin)).append("\n");
    sb.append("    samplesReadPerSecondMax: ").append(toIndentedString(samplesReadPerSecondMax)).append("\n");
    sb.append("    samplesReadPerSecondAvg: ").append(toIndentedString(samplesReadPerSecondAvg)).append("\n");
    sb.append("    samplesBackupPerSecondMin: ").append(toIndentedString(samplesBackupPerSecondMin)).append("\n");
    sb.append("    samplesBackupPerSecondMax: ").append(toIndentedString(samplesBackupPerSecondMax)).append("\n");
    sb.append("    samplesBackupPerSecondAvg: ").append(toIndentedString(samplesBackupPerSecondAvg)).append("\n");
    sb.append("    bytesReadPerSecondMin: ").append(toIndentedString(bytesReadPerSecondMin)).append("\n");
    sb.append("    bytesReadPerSecondMax: ").append(toIndentedString(bytesReadPerSecondMax)).append("\n");
    sb.append("    bytesReadPerSecondAvg: ").append(toIndentedString(bytesReadPerSecondAvg)).append("\n");
    sb.append("    bytesBackupPerSecondMin: ").append(toIndentedString(bytesBackupPerSecondMin)).append("\n");
    sb.append("    bytesBackupPerSecondMax: ").append(toIndentedString(bytesBackupPerSecondMax)).append("\n");
    sb.append("    bytesBackupPerSecondAvg: ").append(toIndentedString(bytesBackupPerSecondAvg)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Details about an individual stream within the live ingest.
 */

public class LiveEncodingHeartbeatIngestStream {
  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("mediaType")
  private String mediaType;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("rate")
  private Double rate;

  @JsonProperty("codec")
  private String codec;

  @JsonProperty("aspectRatio")
  private String aspectRatio;

  @JsonProperty("bitrate")
  private Integer bitrate;

  @JsonProperty("samplesReadPerSecondAvg")
  private Double samplesReadPerSecondAvg;

  @JsonProperty("incomingBitrate")
  private Double incomingBitrate;

  @JsonProperty("keyFrameIntervalMax")
  private Integer keyFrameIntervalMax;

  @JsonProperty("keyFrameIntervalAvg")
  private Double keyFrameIntervalAvg;

  @JsonProperty("lastTimestamp")
  private Integer lastTimestamp;

  @JsonProperty("lastTimestampTimescale")
  private Integer lastTimestampTimescale;

  @JsonProperty("numberOfAudioChannels")
  private Integer numberOfAudioChannels;

  @JsonProperty("audioChannelFormat")
  private String audioChannelFormat;

  @JsonProperty("lastArrivalTime")
  private Date lastArrivalTime;

  @JsonProperty("healthy")
  private Boolean healthy;


  /**
   * Unique identifier of the stream.
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * Unique identifier of the stream.
   *
   * @param streamId
   *        Unique identifier of the stream.
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * Media type for the stream (e.g., \&quot;video\&quot; or \&quot;audio\&quot;).
   * @return mediaType
   */
  public String getMediaType() {
    return mediaType;
  }

  /**
   * Media type for the stream (e.g., \&quot;video\&quot; or \&quot;audio\&quot;).
   *
   * @param mediaType
   *        Media type for the stream (e.g., \&quot;video\&quot; or \&quot;audio\&quot;).
   */
  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Width of the video stream in pixels.
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width of the video stream in pixels.
   *
   * @param width
   *        Width of the video stream in pixels.
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * Height of the video stream in pixels.
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of the video stream in pixels.
   *
   * @param height
   *        Height of the video stream in pixels.
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Frame rate of the video stream.
   * @return rate
   */
  public Double getRate() {
    return rate;
  }

  /**
   * Frame rate of the video stream.
   *
   * @param rate
   *        Frame rate of the video stream.
   */
  public void setRate(Double rate) {
    this.rate = rate;
  }


  /**
   * Codec of the stream.
   * @return codec
   */
  public String getCodec() {
    return codec;
  }

  /**
   * Codec of the stream.
   *
   * @param codec
   *        Codec of the stream.
   */
  public void setCodec(String codec) {
    this.codec = codec;
  }


  /**
   * Aspect ratio of the video.
   * @return aspectRatio
   */
  public String getAspectRatio() {
    return aspectRatio;
  }

  /**
   * Aspect ratio of the video.
   *
   * @param aspectRatio
   *        Aspect ratio of the video.
   */
  public void setAspectRatio(String aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  /**
   * Container format&#39;s bitrate of the stream, in bits per second.
   * @return bitrate
   */
  public Integer getBitrate() {
    return bitrate;
  }

  /**
   * Container format&#39;s bitrate of the stream, in bits per second.
   *
   * @param bitrate
   *        Container format&#39;s bitrate of the stream, in bits per second.
   */
  public void setBitrate(Integer bitrate) {
    this.bitrate = bitrate;
  }


  /**
   * Average number of samples/frames read per second.
   * @return samplesReadPerSecondAvg
   */
  public Double getSamplesReadPerSecondAvg() {
    return samplesReadPerSecondAvg;
  }

  /**
   * Average number of samples/frames read per second.
   *
   * @param samplesReadPerSecondAvg
   *        Average number of samples/frames read per second.
   */
  public void setSamplesReadPerSecondAvg(Double samplesReadPerSecondAvg) {
    this.samplesReadPerSecondAvg = samplesReadPerSecondAvg;
  }


  /**
   * Incoming bitrate measured in bits per second.
   * @return incomingBitrate
   */
  public Double getIncomingBitrate() {
    return incomingBitrate;
  }

  /**
   * Incoming bitrate measured in bits per second.
   *
   * @param incomingBitrate
   *        Incoming bitrate measured in bits per second.
   */
  public void setIncomingBitrate(Double incomingBitrate) {
    this.incomingBitrate = incomingBitrate;
  }


  /**
   * Largest encountered key-frame interval in milliseconds.
   * @return keyFrameIntervalMax
   */
  public Integer getKeyFrameIntervalMax() {
    return keyFrameIntervalMax;
  }

  /**
   * Largest encountered key-frame interval in milliseconds.
   *
   * @param keyFrameIntervalMax
   *        Largest encountered key-frame interval in milliseconds.
   */
  public void setKeyFrameIntervalMax(Integer keyFrameIntervalMax) {
    this.keyFrameIntervalMax = keyFrameIntervalMax;
  }


  /**
   * Average key-frame interval in milliseconds.
   * @return keyFrameIntervalAvg
   */
  public Double getKeyFrameIntervalAvg() {
    return keyFrameIntervalAvg;
  }

  /**
   * Average key-frame interval in milliseconds.
   *
   * @param keyFrameIntervalAvg
   *        Average key-frame interval in milliseconds.
   */
  public void setKeyFrameIntervalAvg(Double keyFrameIntervalAvg) {
    this.keyFrameIntervalAvg = keyFrameIntervalAvg;
  }


  /**
   * Last presentation timestamp (PTS) of the stream.
   * @return lastTimestamp
   */
  public Integer getLastTimestamp() {
    return lastTimestamp;
  }

  /**
   * Last presentation timestamp (PTS) of the stream.
   *
   * @param lastTimestamp
   *        Last presentation timestamp (PTS) of the stream.
   */
  public void setLastTimestamp(Integer lastTimestamp) {
    this.lastTimestamp = lastTimestamp;
  }


  /**
   * Timescale of lastTimestamp
   * @return lastTimestampTimescale
   */
  public Integer getLastTimestampTimescale() {
    return lastTimestampTimescale;
  }

  /**
   * Timescale of lastTimestamp
   *
   * @param lastTimestampTimescale
   *        Timescale of lastTimestamp
   */
  public void setLastTimestampTimescale(Integer lastTimestampTimescale) {
    this.lastTimestampTimescale = lastTimestampTimescale;
  }


  /**
   * Number of audio channels.
   * @return numberOfAudioChannels
   */
  public Integer getNumberOfAudioChannels() {
    return numberOfAudioChannels;
  }

  /**
   * Number of audio channels.
   *
   * @param numberOfAudioChannels
   *        Number of audio channels.
   */
  public void setNumberOfAudioChannels(Integer numberOfAudioChannels) {
    this.numberOfAudioChannels = numberOfAudioChannels;
  }


  /**
   * Format of the audio channel.
   * @return audioChannelFormat
   */
  public String getAudioChannelFormat() {
    return audioChannelFormat;
  }

  /**
   * Format of the audio channel.
   *
   * @param audioChannelFormat
   *        Format of the audio channel.
   */
  public void setAudioChannelFormat(String audioChannelFormat) {
    this.audioChannelFormat = audioChannelFormat;
  }


  /**
   * lastArrivalTime timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return lastArrivalTime
   */
  public Date getLastArrivalTime() {
    return lastArrivalTime;
  }

  /**
   * lastArrivalTime timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   *
   * @param lastArrivalTime
   *        lastArrivalTime timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   */
  public void setLastArrivalTime(Date lastArrivalTime) {
    this.lastArrivalTime = lastArrivalTime;
  }


  /**
   * Indicates whether this particular stream is healthy.
   * @return healthy
   */
  public Boolean getHealthy() {
    return healthy;
  }

  /**
   * Indicates whether this particular stream is healthy.
   *
   * @param healthy
   *        Indicates whether this particular stream is healthy.
   */
  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatIngestStream liveEncodingHeartbeatIngestStream = (LiveEncodingHeartbeatIngestStream) o;
    return Objects.equals(this.streamId, liveEncodingHeartbeatIngestStream.streamId) &&
        Objects.equals(this.mediaType, liveEncodingHeartbeatIngestStream.mediaType) &&
        Objects.equals(this.width, liveEncodingHeartbeatIngestStream.width) &&
        Objects.equals(this.height, liveEncodingHeartbeatIngestStream.height) &&
        Objects.equals(this.rate, liveEncodingHeartbeatIngestStream.rate) &&
        Objects.equals(this.codec, liveEncodingHeartbeatIngestStream.codec) &&
        Objects.equals(this.aspectRatio, liveEncodingHeartbeatIngestStream.aspectRatio) &&
        Objects.equals(this.bitrate, liveEncodingHeartbeatIngestStream.bitrate) &&
        Objects.equals(this.samplesReadPerSecondAvg, liveEncodingHeartbeatIngestStream.samplesReadPerSecondAvg) &&
        Objects.equals(this.incomingBitrate, liveEncodingHeartbeatIngestStream.incomingBitrate) &&
        Objects.equals(this.keyFrameIntervalMax, liveEncodingHeartbeatIngestStream.keyFrameIntervalMax) &&
        Objects.equals(this.keyFrameIntervalAvg, liveEncodingHeartbeatIngestStream.keyFrameIntervalAvg) &&
        Objects.equals(this.lastTimestamp, liveEncodingHeartbeatIngestStream.lastTimestamp) &&
        Objects.equals(this.lastTimestampTimescale, liveEncodingHeartbeatIngestStream.lastTimestampTimescale) &&
        Objects.equals(this.numberOfAudioChannels, liveEncodingHeartbeatIngestStream.numberOfAudioChannels) &&
        Objects.equals(this.audioChannelFormat, liveEncodingHeartbeatIngestStream.audioChannelFormat) &&
        Objects.equals(this.lastArrivalTime, liveEncodingHeartbeatIngestStream.lastArrivalTime) &&
        Objects.equals(this.healthy, liveEncodingHeartbeatIngestStream.healthy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, mediaType, width, height, rate, codec, aspectRatio, bitrate, samplesReadPerSecondAvg, incomingBitrate, keyFrameIntervalMax, keyFrameIntervalAvg, lastTimestamp, lastTimestampTimescale, numberOfAudioChannels, audioChannelFormat, lastArrivalTime, healthy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatIngestStream {\n");
    
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    samplesReadPerSecondAvg: ").append(toIndentedString(samplesReadPerSecondAvg)).append("\n");
    sb.append("    incomingBitrate: ").append(toIndentedString(incomingBitrate)).append("\n");
    sb.append("    keyFrameIntervalMax: ").append(toIndentedString(keyFrameIntervalMax)).append("\n");
    sb.append("    keyFrameIntervalAvg: ").append(toIndentedString(keyFrameIntervalAvg)).append("\n");
    sb.append("    lastTimestamp: ").append(toIndentedString(lastTimestamp)).append("\n");
    sb.append("    lastTimestampTimescale: ").append(toIndentedString(lastTimestampTimescale)).append("\n");
    sb.append("    numberOfAudioChannels: ").append(toIndentedString(numberOfAudioChannels)).append("\n");
    sb.append("    audioChannelFormat: ").append(toIndentedString(audioChannelFormat)).append("\n");
    sb.append("    lastArrivalTime: ").append(toIndentedString(lastArrivalTime)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
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


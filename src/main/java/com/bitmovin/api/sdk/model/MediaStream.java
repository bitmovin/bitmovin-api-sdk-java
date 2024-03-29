package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * MediaStream
 */

public class MediaStream extends BitmovinResponse {
  @JsonProperty("position")
  private Integer position;

  @JsonProperty("duration")
  private Double duration;

  @JsonProperty("codec")
  private String codec;


  /**
   * Position of the stream in the media, starting from 0.
   * minimum: 0
   * @return position
   */
  public Integer getPosition() {
    return position;
  }

  /**
   * Position of the stream in the media, starting from 0.
   * minimum: 0
   *
   * @param position
   *        Position of the stream in the media, starting from 0.
   *        minimum: 0
   */
  public void setPosition(Integer position) {
    this.position = position;
  }


  /**
   * Duration of the stream in seconds
   * @return duration
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * Duration of the stream in seconds
   *
   * @param duration
   *        Duration of the stream in seconds
   */
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  /**
   * Codec of the stream
   * @return codec
   */
  public String getCodec() {
    return codec;
  }

  /**
   * Codec of the stream
   *
   * @param codec
   *        Codec of the stream
   */
  public void setCodec(String codec) {
    this.codec = codec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStream mediaStream = (MediaStream) o;
    return Objects.equals(this.position, mediaStream.position) &&
        Objects.equals(this.duration, mediaStream.duration) &&
        Objects.equals(this.codec, mediaStream.codec) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, duration, codec, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
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


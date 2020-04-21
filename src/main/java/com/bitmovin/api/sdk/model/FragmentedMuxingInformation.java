package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.MuxingInformationAudioTrack;
import com.bitmovin.api.sdk.model.MuxingInformationVideoTrack;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * FragmentedMuxingInformation
 */

public class FragmentedMuxingInformation {
  @JsonProperty("mimeType")
  private String mimeType;

  @JsonProperty("fileSize")
  private Long fileSize;

  @JsonProperty("containerFormat")
  private String containerFormat;

  @JsonProperty("containerBitrate")
  private Long containerBitrate;

  @JsonProperty("duration")
  private Double duration;

  @JsonProperty("videoTracks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<MuxingInformationVideoTrack> videoTracks = new ArrayList<MuxingInformationVideoTrack>();

  @JsonProperty("audioTracks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<MuxingInformationAudioTrack> audioTracks = new ArrayList<MuxingInformationAudioTrack>();

  /**
   * The mime type of the muxing
   * @return mimeType
   */
  public String getMimeType() {
    return mimeType;
  }

  /**
   * The file size of the muxing in bytes
   * @return fileSize
   */
  public Long getFileSize() {
    return fileSize;
  }

  /**
   * The container format used
   * @return containerFormat
   */
  public String getContainerFormat() {
    return containerFormat;
  }

  /**
   * The bitrate of the container if available (tracks + container overhead)
   * @return containerBitrate
   */
  public Long getContainerBitrate() {
    return containerBitrate;
  }

  /**
   * The duration of the container in seconds
   * @return duration
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * Information about the video tracks in the container
   * @return videoTracks
   */
  public List<MuxingInformationVideoTrack> getVideoTracks() {
    return videoTracks;
  }

  /**
   * Information about the audio tracks in the container
   * @return audioTracks
   */
  public List<MuxingInformationAudioTrack> getAudioTracks() {
    return audioTracks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FragmentedMuxingInformation fragmentedMuxingInformation = (FragmentedMuxingInformation) o;
    return Objects.equals(this.mimeType, fragmentedMuxingInformation.mimeType) &&
        Objects.equals(this.fileSize, fragmentedMuxingInformation.fileSize) &&
        Objects.equals(this.containerFormat, fragmentedMuxingInformation.containerFormat) &&
        Objects.equals(this.containerBitrate, fragmentedMuxingInformation.containerBitrate) &&
        Objects.equals(this.duration, fragmentedMuxingInformation.duration) &&
        Objects.equals(this.videoTracks, fragmentedMuxingInformation.videoTracks) &&
        Objects.equals(this.audioTracks, fragmentedMuxingInformation.audioTracks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeType, fileSize, containerFormat, containerBitrate, duration, videoTracks, audioTracks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FragmentedMuxingInformation {\n");
    
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    containerFormat: ").append(toIndentedString(containerFormat)).append("\n");
    sb.append("    containerBitrate: ").append(toIndentedString(containerBitrate)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    videoTracks: ").append(toIndentedString(videoTracks)).append("\n");
    sb.append("    audioTracks: ").append(toIndentedString(audioTracks)).append("\n");
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


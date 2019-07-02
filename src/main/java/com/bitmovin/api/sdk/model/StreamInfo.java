package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AudioGroupConfiguration;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamInfo
 */

public class StreamInfo extends BitmovinResource {
  @JsonProperty("audio")
  private String audio;

  @JsonProperty("audioGroups")
  private AudioGroupConfiguration audioGroups;

  @JsonProperty("video")
  private String video;

  @JsonProperty("subtitles")
  private String subtitles;

  @JsonProperty("closedCaptions")
  private String closedCaptions;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("muxingId")
  private String muxingId;

  @JsonProperty("drmId")
  private String drmId;

  @JsonProperty("segmentPath")
  private String segmentPath;

  @JsonProperty("uri")
  private String uri;

  @JsonProperty("startSegmentNumber")
  private Long startSegmentNumber;

  @JsonProperty("endSegmentNumber")
  private Long endSegmentNumber;

  @JsonProperty("forceFrameRateAttribute")
  private Boolean forceFrameRateAttribute;

  @JsonProperty("forceVideoRangeAttribute")
  private Boolean forceVideoRangeAttribute;


  /**
   * It MUST match the value of the GROUP-ID attribute of an Audio EXT-X-MEDIA tag elsewhere in the Master Playlist. Either this or &#x60;audioGroups&#x60; must be set.
   * @return audio
   */
  public String getAudio() {
    return audio;
  }

  /**
   * It MUST match the value of the GROUP-ID attribute of an Audio EXT-X-MEDIA tag elsewhere in the Master Playlist. Either this or &#x60;audioGroups&#x60; must be set.
   *
   * @param audio
   *        It MUST match the value of the GROUP-ID attribute of an Audio EXT-X-MEDIA tag elsewhere in the Master Playlist. Either this or &#x60;audioGroups&#x60; must be set.
   */
  public void setAudio(String audio) {
    this.audio = audio;
  }


  /**
   * HLS Audio Group Configuration. You will want to use this configuration property in case you specify conditions on audio streams. The first matching audio group will be used for the specific variant stream. Either this or &#x60;audio&#x60; must be set.
   * @return audioGroups
   */
  public AudioGroupConfiguration getAudioGroups() {
    return audioGroups;
  }

  /**
   * HLS Audio Group Configuration. You will want to use this configuration property in case you specify conditions on audio streams. The first matching audio group will be used for the specific variant stream. Either this or &#x60;audio&#x60; must be set.
   *
   * @param audioGroups
   *        HLS Audio Group Configuration. You will want to use this configuration property in case you specify conditions on audio streams. The first matching audio group will be used for the specific variant stream. Either this or &#x60;audio&#x60; must be set.
   */
  public void setAudioGroups(AudioGroupConfiguration audioGroups) {
    this.audioGroups = audioGroups;
  }


  /**
   * It MUST match the value of the GROUP-ID attribute of a Video EXT-X-MEDIA tag elsewhere in the Master Playlist
   * @return video
   */
  public String getVideo() {
    return video;
  }

  /**
   * It MUST match the value of the GROUP-ID attribute of a Video EXT-X-MEDIA tag elsewhere in the Master Playlist
   *
   * @param video
   *        It MUST match the value of the GROUP-ID attribute of a Video EXT-X-MEDIA tag elsewhere in the Master Playlist
   */
  public void setVideo(String video) {
    this.video = video;
  }


  /**
   * It MUST match the value of the GROUP-ID attribute of a Subtitles EXT-X-MEDIA tag elsewhere in the Master Playlist
   * @return subtitles
   */
  public String getSubtitles() {
    return subtitles;
  }

  /**
   * It MUST match the value of the GROUP-ID attribute of a Subtitles EXT-X-MEDIA tag elsewhere in the Master Playlist
   *
   * @param subtitles
   *        It MUST match the value of the GROUP-ID attribute of a Subtitles EXT-X-MEDIA tag elsewhere in the Master Playlist
   */
  public void setSubtitles(String subtitles) {
    this.subtitles = subtitles;
  }


  /**
   * If the value is not &#39;NONE&#39;, it MUST match the value of the GROUP-ID attribute of a Closed Captions EXT-X-MEDIA tag elsewhere in the Playlist (required)
   * @return closedCaptions
   */
  public String getClosedCaptions() {
    return closedCaptions;
  }

  /**
   * If the value is not &#39;NONE&#39;, it MUST match the value of the GROUP-ID attribute of a Closed Captions EXT-X-MEDIA tag elsewhere in the Playlist (required)
   *
   * @param closedCaptions
   *        If the value is not &#39;NONE&#39;, it MUST match the value of the GROUP-ID attribute of a Closed Captions EXT-X-MEDIA tag elsewhere in the Playlist (required)
   */
  public void setClosedCaptions(String closedCaptions) {
    this.closedCaptions = closedCaptions;
  }


  /**
   * Id of the encoding. (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * Id of the encoding. (required)
   *
   * @param encodingId
   *        Id of the encoding. (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * Id of the stream. (required)
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * Id of the stream. (required)
   *
   * @param streamId
   *        Id of the stream. (required)
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * Id of the muxing. (required)
   * @return muxingId
   */
  public String getMuxingId() {
    return muxingId;
  }

  /**
   * Id of the muxing. (required)
   *
   * @param muxingId
   *        Id of the muxing. (required)
   */
  public void setMuxingId(String muxingId) {
    this.muxingId = muxingId;
  }


  /**
   * Id of the DRM.
   * @return drmId
   */
  public String getDrmId() {
    return drmId;
  }

  /**
   * Id of the DRM.
   *
   * @param drmId
   *        Id of the DRM.
   */
  public void setDrmId(String drmId) {
    this.drmId = drmId;
  }


  /**
   * Path to segments. (required)
   * @return segmentPath
   */
  public String getSegmentPath() {
    return segmentPath;
  }

  /**
   * Path to segments. (required)
   *
   * @param segmentPath
   *        Path to segments. (required)
   */
  public void setSegmentPath(String segmentPath) {
    this.segmentPath = segmentPath;
  }


  /**
   * The URI of the playlist file. (required)
   * @return uri
   */
  public String getUri() {
    return uri;
  }

  /**
   * The URI of the playlist file. (required)
   *
   * @param uri
   *        The URI of the playlist file. (required)
   */
  public void setUri(String uri) {
    this.uri = uri;
  }


  /**
   * Number of the first segment. Default is 0.
   * @return startSegmentNumber
   */
  public Long getStartSegmentNumber() {
    return startSegmentNumber;
  }

  /**
   * Number of the first segment. Default is 0.
   *
   * @param startSegmentNumber
   *        Number of the first segment. Default is 0.
   */
  public void setStartSegmentNumber(Long startSegmentNumber) {
    this.startSegmentNumber = startSegmentNumber;
  }


  /**
   * Number of the last segment. Default is the last one that was encoded.
   * @return endSegmentNumber
   */
  public Long getEndSegmentNumber() {
    return endSegmentNumber;
  }

  /**
   * Number of the last segment. Default is the last one that was encoded.
   *
   * @param endSegmentNumber
   *        Number of the last segment. Default is the last one that was encoded.
   */
  public void setEndSegmentNumber(Long endSegmentNumber) {
    this.endSegmentNumber = endSegmentNumber;
  }


  /**
   * Force the addition of the frame rate attribute to all stream infos.
   * @return forceFrameRateAttribute
   */
  public Boolean getForceFrameRateAttribute() {
    return forceFrameRateAttribute;
  }

  /**
   * Force the addition of the frame rate attribute to all stream infos.
   *
   * @param forceFrameRateAttribute
   *        Force the addition of the frame rate attribute to all stream infos.
   */
  public void setForceFrameRateAttribute(Boolean forceFrameRateAttribute) {
    this.forceFrameRateAttribute = forceFrameRateAttribute;
  }


  /**
   * Force the addition of the video-range attribute to all stream infos.
   * @return forceVideoRangeAttribute
   */
  public Boolean getForceVideoRangeAttribute() {
    return forceVideoRangeAttribute;
  }

  /**
   * Force the addition of the video-range attribute to all stream infos.
   *
   * @param forceVideoRangeAttribute
   *        Force the addition of the video-range attribute to all stream infos.
   */
  public void setForceVideoRangeAttribute(Boolean forceVideoRangeAttribute) {
    this.forceVideoRangeAttribute = forceVideoRangeAttribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamInfo streamInfo = (StreamInfo) o;
    return Objects.equals(this.audio, streamInfo.audio) &&
        Objects.equals(this.audioGroups, streamInfo.audioGroups) &&
        Objects.equals(this.video, streamInfo.video) &&
        Objects.equals(this.subtitles, streamInfo.subtitles) &&
        Objects.equals(this.closedCaptions, streamInfo.closedCaptions) &&
        Objects.equals(this.encodingId, streamInfo.encodingId) &&
        Objects.equals(this.streamId, streamInfo.streamId) &&
        Objects.equals(this.muxingId, streamInfo.muxingId) &&
        Objects.equals(this.drmId, streamInfo.drmId) &&
        Objects.equals(this.segmentPath, streamInfo.segmentPath) &&
        Objects.equals(this.uri, streamInfo.uri) &&
        Objects.equals(this.startSegmentNumber, streamInfo.startSegmentNumber) &&
        Objects.equals(this.endSegmentNumber, streamInfo.endSegmentNumber) &&
        Objects.equals(this.forceFrameRateAttribute, streamInfo.forceFrameRateAttribute) &&
        Objects.equals(this.forceVideoRangeAttribute, streamInfo.forceVideoRangeAttribute) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, audioGroups, video, subtitles, closedCaptions, encodingId, streamId, muxingId, drmId, segmentPath, uri, startSegmentNumber, endSegmentNumber, forceFrameRateAttribute, forceVideoRangeAttribute, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    audioGroups: ").append(toIndentedString(audioGroups)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    subtitles: ").append(toIndentedString(subtitles)).append("\n");
    sb.append("    closedCaptions: ").append(toIndentedString(closedCaptions)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    muxingId: ").append(toIndentedString(muxingId)).append("\n");
    sb.append("    drmId: ").append(toIndentedString(drmId)).append("\n");
    sb.append("    segmentPath: ").append(toIndentedString(segmentPath)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    startSegmentNumber: ").append(toIndentedString(startSegmentNumber)).append("\n");
    sb.append("    endSegmentNumber: ").append(toIndentedString(endSegmentNumber)).append("\n");
    sb.append("    forceFrameRateAttribute: ").append(toIndentedString(forceFrameRateAttribute)).append("\n");
    sb.append("    forceVideoRangeAttribute: ").append(toIndentedString(forceVideoRangeAttribute)).append("\n");
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


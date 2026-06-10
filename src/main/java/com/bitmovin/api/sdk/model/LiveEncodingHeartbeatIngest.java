package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatIngestPoint;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatIngestStream;
import com.bitmovin.api.sdk.model.LiveEncodingStatus;
import com.bitmovin.api.sdk.model.RtmpUserIngestInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Information about the live ingestion status
 */

public class LiveEncodingHeartbeatIngest {
  @JsonProperty("status")
  private LiveEncodingStatus status;

  @JsonProperty("healthy")
  private Boolean healthy;

  @JsonProperty("ingestPoints")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatIngestPoint> ingestPoints = new ArrayList<LiveEncodingHeartbeatIngestPoint>();

  @JsonProperty("streams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatIngestStream> streams = new ArrayList<LiveEncodingHeartbeatIngestStream>();

  @JsonProperty("rtmpUserIngestInfo")
  private RtmpUserIngestInfo rtmpUserIngestInfo;

  @JsonProperty("droppedPacketsVideo")
  private Long droppedPacketsVideo;

  @JsonProperty("droppedPacketsAudio")
  private Long droppedPacketsAudio;

  @JsonProperty("corruptPacketsVideo")
  private Long corruptPacketsVideo;

  @JsonProperty("corruptPacketsAudio")
  private Long corruptPacketsAudio;


  /**
   * Get status
   * @return status
   */
  public LiveEncodingStatus getStatus() {
    return status;
  }

  /**
   * Set status
   *
   * @param status
   */
  public void setStatus(LiveEncodingStatus status) {
    this.status = status;
  }


  /**
   * Indicates whether the ingest is healthy.
   * @return healthy
   */
  public Boolean getHealthy() {
    return healthy;
  }

  /**
   * Indicates whether the ingest is healthy.
   *
   * @param healthy
   *        Indicates whether the ingest is healthy.
   */
  public void setHealthy(Boolean healthy) {
    this.healthy = healthy;
  }


  public LiveEncodingHeartbeatIngest addIngestPointsItem(LiveEncodingHeartbeatIngestPoint ingestPointsItem) {
    this.ingestPoints.add(ingestPointsItem);
    return this;
  }

  /**
   * Data about individual ingestPoints within the active live ingest. 
   * @return ingestPoints
   */
  public List<LiveEncodingHeartbeatIngestPoint> getIngestPoints() {
    return ingestPoints;
  }

  /**
   * Data about individual ingestPoints within the active live ingest. 
   *
   * @param ingestPoints
   *        Data about individual ingestPoints within the active live ingest. 
   */
  public void setIngestPoints(List<LiveEncodingHeartbeatIngestPoint> ingestPoints) {
    this.ingestPoints = ingestPoints;
  }


  public LiveEncodingHeartbeatIngest addStreamsItem(LiveEncodingHeartbeatIngestStream streamsItem) {
    this.streams.add(streamsItem);
    return this;
  }

  /**
   * Data about individual streams within the active live ingest. 
   * @return streams
   */
  public List<LiveEncodingHeartbeatIngestStream> getStreams() {
    return streams;
  }

  /**
   * Data about individual streams within the active live ingest. 
   *
   * @param streams
   *        Data about individual streams within the active live ingest. 
   */
  public void setStreams(List<LiveEncodingHeartbeatIngestStream> streams) {
    this.streams = streams;
  }


  /**
   * Get rtmpUserIngestInfo
   * @return rtmpUserIngestInfo
   */
  public RtmpUserIngestInfo getRtmpUserIngestInfo() {
    return rtmpUserIngestInfo;
  }

  /**
   * Set rtmpUserIngestInfo
   *
   * @param rtmpUserIngestInfo
   */
  public void setRtmpUserIngestInfo(RtmpUserIngestInfo rtmpUserIngestInfo) {
    this.rtmpUserIngestInfo = rtmpUserIngestInfo;
  }


  /**
   * Total number of dropped video packets since the live encoding started. 
   * @return droppedPacketsVideo
   */
  public Long getDroppedPacketsVideo() {
    return droppedPacketsVideo;
  }

  /**
   * Total number of dropped video packets since the live encoding started. 
   *
   * @param droppedPacketsVideo
   *        Total number of dropped video packets since the live encoding started. 
   */
  public void setDroppedPacketsVideo(Long droppedPacketsVideo) {
    this.droppedPacketsVideo = droppedPacketsVideo;
  }


  /**
   * Total number of dropped audio packets since the live encoding started. 
   * @return droppedPacketsAudio
   */
  public Long getDroppedPacketsAudio() {
    return droppedPacketsAudio;
  }

  /**
   * Total number of dropped audio packets since the live encoding started. 
   *
   * @param droppedPacketsAudio
   *        Total number of dropped audio packets since the live encoding started. 
   */
  public void setDroppedPacketsAudio(Long droppedPacketsAudio) {
    this.droppedPacketsAudio = droppedPacketsAudio;
  }


  /**
   * Total number of corrupt video packets since the live encoding started. 
   * @return corruptPacketsVideo
   */
  public Long getCorruptPacketsVideo() {
    return corruptPacketsVideo;
  }

  /**
   * Total number of corrupt video packets since the live encoding started. 
   *
   * @param corruptPacketsVideo
   *        Total number of corrupt video packets since the live encoding started. 
   */
  public void setCorruptPacketsVideo(Long corruptPacketsVideo) {
    this.corruptPacketsVideo = corruptPacketsVideo;
  }


  /**
   * Total number of corrupt audio packets since the live encoding started. 
   * @return corruptPacketsAudio
   */
  public Long getCorruptPacketsAudio() {
    return corruptPacketsAudio;
  }

  /**
   * Total number of corrupt audio packets since the live encoding started. 
   *
   * @param corruptPacketsAudio
   *        Total number of corrupt audio packets since the live encoding started. 
   */
  public void setCorruptPacketsAudio(Long corruptPacketsAudio) {
    this.corruptPacketsAudio = corruptPacketsAudio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatIngest liveEncodingHeartbeatIngest = (LiveEncodingHeartbeatIngest) o;
    return Objects.equals(this.status, liveEncodingHeartbeatIngest.status) &&
        Objects.equals(this.healthy, liveEncodingHeartbeatIngest.healthy) &&
        Objects.equals(this.ingestPoints, liveEncodingHeartbeatIngest.ingestPoints) &&
        Objects.equals(this.streams, liveEncodingHeartbeatIngest.streams) &&
        Objects.equals(this.rtmpUserIngestInfo, liveEncodingHeartbeatIngest.rtmpUserIngestInfo) &&
        Objects.equals(this.droppedPacketsVideo, liveEncodingHeartbeatIngest.droppedPacketsVideo) &&
        Objects.equals(this.droppedPacketsAudio, liveEncodingHeartbeatIngest.droppedPacketsAudio) &&
        Objects.equals(this.corruptPacketsVideo, liveEncodingHeartbeatIngest.corruptPacketsVideo) &&
        Objects.equals(this.corruptPacketsAudio, liveEncodingHeartbeatIngest.corruptPacketsAudio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, healthy, ingestPoints, streams, rtmpUserIngestInfo, droppedPacketsVideo, droppedPacketsAudio, corruptPacketsVideo, corruptPacketsAudio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatIngest {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
    sb.append("    ingestPoints: ").append(toIndentedString(ingestPoints)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    rtmpUserIngestInfo: ").append(toIndentedString(rtmpUserIngestInfo)).append("\n");
    sb.append("    droppedPacketsVideo: ").append(toIndentedString(droppedPacketsVideo)).append("\n");
    sb.append("    droppedPacketsAudio: ").append(toIndentedString(droppedPacketsAudio)).append("\n");
    sb.append("    corruptPacketsVideo: ").append(toIndentedString(corruptPacketsVideo)).append("\n");
    sb.append("    corruptPacketsAudio: ").append(toIndentedString(corruptPacketsAudio)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A single media-advancing HLS manifest update.
 */

public class LiveEncodingHeartbeatManifestUpdate {
  @JsonProperty("manifestUpdateWallClockTime")
  private Date manifestUpdateWallClockTime;

  @JsonProperty("latestMediaPresentationTime")
  private Date latestMediaPresentationTime;

  @JsonProperty("manifestUpdateLatency")
  private Long manifestUpdateLatency;


  /**
   * Wall-clock time the media-advancing manifest update occured, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return manifestUpdateWallClockTime
   */
  public Date getManifestUpdateWallClockTime() {
    return manifestUpdateWallClockTime;
  }

  /**
   * Wall-clock time the media-advancing manifest update occured, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   *
   * @param manifestUpdateWallClockTime
   *        Wall-clock time the media-advancing manifest update occured, returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   */
  public void setManifestUpdateWallClockTime(Date manifestUpdateWallClockTime) {
    this.manifestUpdateWallClockTime = manifestUpdateWallClockTime;
  }


  /**
   * Latest media presentation time across renditions (min of all playlists&#39; stream progress), returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return latestMediaPresentationTime
   */
  public Date getLatestMediaPresentationTime() {
    return latestMediaPresentationTime;
  }

  /**
   * Latest media presentation time across renditions (min of all playlists&#39; stream progress), returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   *
   * @param latestMediaPresentationTime
   *        Latest media presentation time across renditions (min of all playlists&#39; stream progress), returned as UTC in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   */
  public void setLatestMediaPresentationTime(Date latestMediaPresentationTime) {
    this.latestMediaPresentationTime = latestMediaPresentationTime;
  }


  /**
   * Manifest update latency in milliseconds (elapsed wall-clock minus media-time advanced).
   * @return manifestUpdateLatency
   */
  public Long getManifestUpdateLatency() {
    return manifestUpdateLatency;
  }

  /**
   * Manifest update latency in milliseconds (elapsed wall-clock minus media-time advanced).
   *
   * @param manifestUpdateLatency
   *        Manifest update latency in milliseconds (elapsed wall-clock minus media-time advanced).
   */
  public void setManifestUpdateLatency(Long manifestUpdateLatency) {
    this.manifestUpdateLatency = manifestUpdateLatency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatManifestUpdate liveEncodingHeartbeatManifestUpdate = (LiveEncodingHeartbeatManifestUpdate) o;
    return Objects.equals(this.manifestUpdateWallClockTime, liveEncodingHeartbeatManifestUpdate.manifestUpdateWallClockTime) &&
        Objects.equals(this.latestMediaPresentationTime, liveEncodingHeartbeatManifestUpdate.latestMediaPresentationTime) &&
        Objects.equals(this.manifestUpdateLatency, liveEncodingHeartbeatManifestUpdate.manifestUpdateLatency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestUpdateWallClockTime, latestMediaPresentationTime, manifestUpdateLatency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatManifestUpdate {\n");
    
    sb.append("    manifestUpdateWallClockTime: ").append(toIndentedString(manifestUpdateWallClockTime)).append("\n");
    sb.append("    latestMediaPresentationTime: ").append(toIndentedString(latestMediaPresentationTime)).append("\n");
    sb.append("    manifestUpdateLatency: ").append(toIndentedString(manifestUpdateLatency)).append("\n");
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


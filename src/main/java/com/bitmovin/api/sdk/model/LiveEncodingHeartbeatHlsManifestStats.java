package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatManifestUpdate;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatManifestUpdateLatencyStats;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HLS manifest update monitoring data for a live encoding heartbeat.
 */

public class LiveEncodingHeartbeatHlsManifestStats {
  @JsonProperty("manifestId")
  private String manifestId;

  @JsonProperty("manifestUpdateLatencyStats")
  private LiveEncodingHeartbeatManifestUpdateLatencyStats manifestUpdateLatencyStats;

  @JsonProperty("manifestUpdates")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatManifestUpdate> manifestUpdates = new ArrayList<LiveEncodingHeartbeatManifestUpdate>();


  /**
   * Id of the HLS manifest these statistics belong to.
   * @return manifestId
   */
  public String getManifestId() {
    return manifestId;
  }

  /**
   * Id of the HLS manifest these statistics belong to.
   *
   * @param manifestId
   *        Id of the HLS manifest these statistics belong to.
   */
  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }


  /**
   * Aggregate latency statistics over recorded manifest updates.
   * @return manifestUpdateLatencyStats
   */
  public LiveEncodingHeartbeatManifestUpdateLatencyStats getManifestUpdateLatencyStats() {
    return manifestUpdateLatencyStats;
  }

  /**
   * Aggregate latency statistics over recorded manifest updates.
   *
   * @param manifestUpdateLatencyStats
   *        Aggregate latency statistics over recorded manifest updates.
   */
  public void setManifestUpdateLatencyStats(LiveEncodingHeartbeatManifestUpdateLatencyStats manifestUpdateLatencyStats) {
    this.manifestUpdateLatencyStats = manifestUpdateLatencyStats;
  }


  public LiveEncodingHeartbeatHlsManifestStats addManifestUpdatesItem(LiveEncodingHeartbeatManifestUpdate manifestUpdatesItem) {
    this.manifestUpdates.add(manifestUpdatesItem);
    return this;
  }

  /**
   * Per-manifest outlier-only (high-latency) manifest updates, ordered newest to oldest.
   * @return manifestUpdates
   */
  public List<LiveEncodingHeartbeatManifestUpdate> getManifestUpdates() {
    return manifestUpdates;
  }

  /**
   * Per-manifest outlier-only (high-latency) manifest updates, ordered newest to oldest.
   *
   * @param manifestUpdates
   *        Per-manifest outlier-only (high-latency) manifest updates, ordered newest to oldest.
   */
  public void setManifestUpdates(List<LiveEncodingHeartbeatManifestUpdate> manifestUpdates) {
    this.manifestUpdates = manifestUpdates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatHlsManifestStats liveEncodingHeartbeatHlsManifestStats = (LiveEncodingHeartbeatHlsManifestStats) o;
    return Objects.equals(this.manifestId, liveEncodingHeartbeatHlsManifestStats.manifestId) &&
        Objects.equals(this.manifestUpdateLatencyStats, liveEncodingHeartbeatHlsManifestStats.manifestUpdateLatencyStats) &&
        Objects.equals(this.manifestUpdates, liveEncodingHeartbeatHlsManifestStats.manifestUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestId, manifestUpdateLatencyStats, manifestUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatHlsManifestStats {\n");
    
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    manifestUpdateLatencyStats: ").append(toIndentedString(manifestUpdateLatencyStats)).append("\n");
    sb.append("    manifestUpdates: ").append(toIndentedString(manifestUpdates)).append("\n");
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


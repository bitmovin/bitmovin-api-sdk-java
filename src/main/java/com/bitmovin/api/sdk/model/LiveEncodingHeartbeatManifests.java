package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatHlsManifestStats;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Manifest statistics for a live encoding heartbeat.
 */

public class LiveEncodingHeartbeatManifests {
  @JsonProperty("hls")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveEncodingHeartbeatHlsManifestStats> hls = new ArrayList<LiveEncodingHeartbeatHlsManifestStats>();


  public LiveEncodingHeartbeatManifests addHlsItem(LiveEncodingHeartbeatHlsManifestStats hlsItem) {
    this.hls.add(hlsItem);
    return this;
  }

  /**
   * Per-manifest HLS update statistics; one entry per HLS manifest.
   * @return hls
   */
  public List<LiveEncodingHeartbeatHlsManifestStats> getHls() {
    return hls;
  }

  /**
   * Per-manifest HLS update statistics; one entry per HLS manifest.
   *
   * @param hls
   *        Per-manifest HLS update statistics; one entry per HLS manifest.
   */
  public void setHls(List<LiveEncodingHeartbeatHlsManifestStats> hls) {
    this.hls = hls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatManifests liveEncodingHeartbeatManifests = (LiveEncodingHeartbeatManifests) o;
    return Objects.equals(this.hls, liveEncodingHeartbeatManifests.hls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatManifests {\n");
    
    sb.append("    hls: ").append(toIndentedString(hls)).append("\n");
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


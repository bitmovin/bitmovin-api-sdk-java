package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatManifests;
import com.bitmovin.api.sdk.model.LiveEncodingHeartbeatSegments;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Output statistics for a live encoding heartbeat.
 */

public class LiveEncodingHeartbeatOutput {
  @JsonProperty("manifests")
  private LiveEncodingHeartbeatManifests manifests;

  @JsonProperty("segments")
  private LiveEncodingHeartbeatSegments segments;


  /**
   * Manifest statistics for the live encoding output.
   * @return manifests
   */
  public LiveEncodingHeartbeatManifests getManifests() {
    return manifests;
  }

  /**
   * Manifest statistics for the live encoding output.
   *
   * @param manifests
   *        Manifest statistics for the live encoding output.
   */
  public void setManifests(LiveEncodingHeartbeatManifests manifests) {
    this.manifests = manifests;
  }


  /**
   * Segment processing statistics for the live encoding output.
   * @return segments
   */
  public LiveEncodingHeartbeatSegments getSegments() {
    return segments;
  }

  /**
   * Segment processing statistics for the live encoding output.
   *
   * @param segments
   *        Segment processing statistics for the live encoding output.
   */
  public void setSegments(LiveEncodingHeartbeatSegments segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatOutput liveEncodingHeartbeatOutput = (LiveEncodingHeartbeatOutput) o;
    return Objects.equals(this.manifests, liveEncodingHeartbeatOutput.manifests) &&
        Objects.equals(this.segments, liveEncodingHeartbeatOutput.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifests, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatOutput {\n");
    
    sb.append("    manifests: ").append(toIndentedString(manifests)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TsStreamConfiguration
 */

public class TsStreamConfiguration {
  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("pid")
  private Integer pid;


  /**
   * The UUID of the stream to which this configuration belongs to. This has to be a ID of a stream that has been added to the current muxing. (required)
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * The UUID of the stream to which this configuration belongs to. This has to be a ID of a stream that has been added to the current muxing. (required)
   *
   * @param streamId
   *        The UUID of the stream to which this configuration belongs to. This has to be a ID of a stream that has been added to the current muxing. (required)
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * An integer value. MPEG Transport Stream Packet Identifier (PID) for this stream. (required)
   * minimum: 16
   * maximum: 8190
   * @return pid
   */
  public Integer getPid() {
    return pid;
  }

  /**
   * An integer value. MPEG Transport Stream Packet Identifier (PID) for this stream. (required)
   * minimum: 16
   * maximum: 8190
   *
   * @param pid
   *        An integer value. MPEG Transport Stream Packet Identifier (PID) for this stream. (required)
   *        minimum: 16
   *        maximum: 8190
   */
  public void setPid(Integer pid) {
    this.pid = pid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsStreamConfiguration tsStreamConfiguration = (TsStreamConfiguration) o;
    return Objects.equals(this.streamId, tsStreamConfiguration.streamId) &&
        Objects.equals(this.pid, tsStreamConfiguration.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsStreamConfiguration {\n");
    
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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


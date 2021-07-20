package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BroadcastTsSubtitleInputStreamConfiguration
 */

public class BroadcastTsSubtitleInputStreamConfiguration {
  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("packetIdentifier")
  private Integer packetIdentifier;

  @JsonProperty("rate")
  private Integer rate;


  /**
   * The UUID of the subtitle stream to which this configuration belongs to. This has to be an ID of an subtitle stream that has been added to the current muxing. 
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * The UUID of the subtitle stream to which this configuration belongs to. This has to be an ID of an subtitle stream that has been added to the current muxing. 
   *
   * @param streamId
   *        The UUID of the subtitle stream to which this configuration belongs to. This has to be an ID of an subtitle stream that has been added to the current muxing. 
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * An integer value. Packet Identifier (PID) for this stream.
   * minimum: 16
   * maximum: 8190
   * @return packetIdentifier
   */
  public Integer getPacketIdentifier() {
    return packetIdentifier;
  }

  /**
   * An integer value. Packet Identifier (PID) for this stream.
   * minimum: 16
   * maximum: 8190
   *
   * @param packetIdentifier
   *        An integer value. Packet Identifier (PID) for this stream.
   *        minimum: 16
   *        maximum: 8190
   */
  public void setPacketIdentifier(Integer packetIdentifier) {
    this.packetIdentifier = packetIdentifier;
  }


  /**
   * The rate parameter determines the maximum rate in bits per second that should be used for the subtitle stream. The valid range is &#x60;100&#x60; to &#x60;60 000 000&#x60; bps or &#x60;0&#x60;. If the value is set to 0, we will examine the first 100 packets of subtitle packet data and use the highest rate that was computed. If the value is set too low, not enough to accommodate the subtitle bit-rate, then some PES packets corresponding to DVB subtitle stream will be dropped. This parameter is optional and the default value is 0. 
   * minimum: 0
   * maximum: 60000000
   * @return rate
   */
  public Integer getRate() {
    return rate;
  }

  /**
   * The rate parameter determines the maximum rate in bits per second that should be used for the subtitle stream. The valid range is &#x60;100&#x60; to &#x60;60 000 000&#x60; bps or &#x60;0&#x60;. If the value is set to 0, we will examine the first 100 packets of subtitle packet data and use the highest rate that was computed. If the value is set too low, not enough to accommodate the subtitle bit-rate, then some PES packets corresponding to DVB subtitle stream will be dropped. This parameter is optional and the default value is 0. 
   * minimum: 0
   * maximum: 60000000
   *
   * @param rate
   *        The rate parameter determines the maximum rate in bits per second that should be used for the subtitle stream. The valid range is &#x60;100&#x60; to &#x60;60 000 000&#x60; bps or &#x60;0&#x60;. If the value is set to 0, we will examine the first 100 packets of subtitle packet data and use the highest rate that was computed. If the value is set too low, not enough to accommodate the subtitle bit-rate, then some PES packets corresponding to DVB subtitle stream will be dropped. This parameter is optional and the default value is 0. 
   *        minimum: 0
   *        maximum: 60000000
   */
  public void setRate(Integer rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTsSubtitleInputStreamConfiguration broadcastTsSubtitleInputStreamConfiguration = (BroadcastTsSubtitleInputStreamConfiguration) o;
    return Objects.equals(this.streamId, broadcastTsSubtitleInputStreamConfiguration.streamId) &&
        Objects.equals(this.packetIdentifier, broadcastTsSubtitleInputStreamConfiguration.packetIdentifier) &&
        Objects.equals(this.rate, broadcastTsSubtitleInputStreamConfiguration.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, packetIdentifier, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTsSubtitleInputStreamConfiguration {\n");
    
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    packetIdentifier: ").append(toIndentedString(packetIdentifier)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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


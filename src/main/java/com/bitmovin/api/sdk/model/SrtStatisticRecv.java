package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtStatisticRecv
 */

public class SrtStatisticRecv {
  @JsonProperty("bytes")
  private Long bytes;

  @JsonProperty("bytesDropped")
  private Long bytesDropped;

  @JsonProperty("bytesLost")
  private Long bytesLost;

  @JsonProperty("mbitRate")
  private Double mbitRate;

  @JsonProperty("packets")
  private Long packets;

  @JsonProperty("packetsBelated")
  private Long packetsBelated;

  @JsonProperty("packetsDropped")
  private Long packetsDropped;

  @JsonProperty("packetsLost")
  private Long packetsLost;

  @JsonProperty("packetsRetransmitted")
  private Long packetsRetransmitted;


  /**
   * Get bytes
   * @return bytes
   */
  public Long getBytes() {
    return bytes;
  }

  public void setBytes(Long bytes) {
    this.bytes = bytes;
  }


  /**
   * Get bytesDropped
   * @return bytesDropped
   */
  public Long getBytesDropped() {
    return bytesDropped;
  }

  public void setBytesDropped(Long bytesDropped) {
    this.bytesDropped = bytesDropped;
  }


  /**
   * Get bytesLost
   * @return bytesLost
   */
  public Long getBytesLost() {
    return bytesLost;
  }

  public void setBytesLost(Long bytesLost) {
    this.bytesLost = bytesLost;
  }


  /**
   * Get mbitRate
   * @return mbitRate
   */
  public Double getMbitRate() {
    return mbitRate;
  }

  public void setMbitRate(Double mbitRate) {
    this.mbitRate = mbitRate;
  }


  /**
   * Get packets
   * @return packets
   */
  public Long getPackets() {
    return packets;
  }

  public void setPackets(Long packets) {
    this.packets = packets;
  }


  /**
   * Get packetsBelated
   * @return packetsBelated
   */
  public Long getPacketsBelated() {
    return packetsBelated;
  }

  public void setPacketsBelated(Long packetsBelated) {
    this.packetsBelated = packetsBelated;
  }


  /**
   * Get packetsDropped
   * @return packetsDropped
   */
  public Long getPacketsDropped() {
    return packetsDropped;
  }

  public void setPacketsDropped(Long packetsDropped) {
    this.packetsDropped = packetsDropped;
  }


  /**
   * Get packetsLost
   * @return packetsLost
   */
  public Long getPacketsLost() {
    return packetsLost;
  }

  public void setPacketsLost(Long packetsLost) {
    this.packetsLost = packetsLost;
  }


  /**
   * Get packetsRetransmitted
   * @return packetsRetransmitted
   */
  public Long getPacketsRetransmitted() {
    return packetsRetransmitted;
  }

  public void setPacketsRetransmitted(Long packetsRetransmitted) {
    this.packetsRetransmitted = packetsRetransmitted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrtStatisticRecv srtStatisticRecv = (SrtStatisticRecv) o;
    return Objects.equals(this.bytes, srtStatisticRecv.bytes) &&
        Objects.equals(this.bytesDropped, srtStatisticRecv.bytesDropped) &&
        Objects.equals(this.bytesLost, srtStatisticRecv.bytesLost) &&
        Objects.equals(this.mbitRate, srtStatisticRecv.mbitRate) &&
        Objects.equals(this.packets, srtStatisticRecv.packets) &&
        Objects.equals(this.packetsBelated, srtStatisticRecv.packetsBelated) &&
        Objects.equals(this.packetsDropped, srtStatisticRecv.packetsDropped) &&
        Objects.equals(this.packetsLost, srtStatisticRecv.packetsLost) &&
        Objects.equals(this.packetsRetransmitted, srtStatisticRecv.packetsRetransmitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, bytesDropped, bytesLost, mbitRate, packets, packetsBelated, packetsDropped, packetsLost, packetsRetransmitted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtStatisticRecv {\n");
    
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    bytesDropped: ").append(toIndentedString(bytesDropped)).append("\n");
    sb.append("    bytesLost: ").append(toIndentedString(bytesLost)).append("\n");
    sb.append("    mbitRate: ").append(toIndentedString(mbitRate)).append("\n");
    sb.append("    packets: ").append(toIndentedString(packets)).append("\n");
    sb.append("    packetsBelated: ").append(toIndentedString(packetsBelated)).append("\n");
    sb.append("    packetsDropped: ").append(toIndentedString(packetsDropped)).append("\n");
    sb.append("    packetsLost: ").append(toIndentedString(packetsLost)).append("\n");
    sb.append("    packetsRetransmitted: ").append(toIndentedString(packetsRetransmitted)).append("\n");
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


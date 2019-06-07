package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtStatisticSend
 */

public class SrtStatisticSend {
  @JsonProperty("bytes")
  private Long bytes;

  @JsonProperty("bytesDropped")
  private Long bytesDropped;

  @JsonProperty("mbitRate")
  private Double mbitRate;

  @JsonProperty("packets")
  private Long packets;

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

  /**
   * Set bytes
   *
   * @param bytes
   */
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

  /**
   * Set bytesDropped
   *
   * @param bytesDropped
   */
  public void setBytesDropped(Long bytesDropped) {
    this.bytesDropped = bytesDropped;
  }


  /**
   * Get mbitRate
   * @return mbitRate
   */
  public Double getMbitRate() {
    return mbitRate;
  }

  /**
   * Set mbitRate
   *
   * @param mbitRate
   */
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

  /**
   * Set packets
   *
   * @param packets
   */
  public void setPackets(Long packets) {
    this.packets = packets;
  }


  /**
   * Get packetsDropped
   * @return packetsDropped
   */
  public Long getPacketsDropped() {
    return packetsDropped;
  }

  /**
   * Set packetsDropped
   *
   * @param packetsDropped
   */
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

  /**
   * Set packetsLost
   *
   * @param packetsLost
   */
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

  /**
   * Set packetsRetransmitted
   *
   * @param packetsRetransmitted
   */
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
    SrtStatisticSend srtStatisticSend = (SrtStatisticSend) o;
    return Objects.equals(this.bytes, srtStatisticSend.bytes) &&
        Objects.equals(this.bytesDropped, srtStatisticSend.bytesDropped) &&
        Objects.equals(this.mbitRate, srtStatisticSend.mbitRate) &&
        Objects.equals(this.packets, srtStatisticSend.packets) &&
        Objects.equals(this.packetsDropped, srtStatisticSend.packetsDropped) &&
        Objects.equals(this.packetsLost, srtStatisticSend.packetsLost) &&
        Objects.equals(this.packetsRetransmitted, srtStatisticSend.packetsRetransmitted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytes, bytesDropped, mbitRate, packets, packetsDropped, packetsLost, packetsRetransmitted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtStatisticSend {\n");
    
    sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
    sb.append("    bytesDropped: ").append(toIndentedString(bytesDropped)).append("\n");
    sb.append("    mbitRate: ").append(toIndentedString(mbitRate)).append("\n");
    sb.append("    packets: ").append(toIndentedString(packets)).append("\n");
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


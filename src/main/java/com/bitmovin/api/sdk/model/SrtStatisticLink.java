package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtStatisticLink
 */

public class SrtStatisticLink {
  @JsonProperty("bandwidth")
  private Double bandwidth;

  @JsonProperty("maxBandwidth")
  private Double maxBandwidth;

  @JsonProperty("rtt")
  private Double rtt;


  /**
   * Get bandwidth
   * @return bandwidth
   */
  public Double getBandwidth() {
    return bandwidth;
  }

  /**
   * Set bandwidth
   *
   * @param bandwidth
   */
  public void setBandwidth(Double bandwidth) {
    this.bandwidth = bandwidth;
  }


  /**
   * Get maxBandwidth
   * @return maxBandwidth
   */
  public Double getMaxBandwidth() {
    return maxBandwidth;
  }

  /**
   * Set maxBandwidth
   *
   * @param maxBandwidth
   */
  public void setMaxBandwidth(Double maxBandwidth) {
    this.maxBandwidth = maxBandwidth;
  }


  /**
   * Get rtt
   * @return rtt
   */
  public Double getRtt() {
    return rtt;
  }

  /**
   * Set rtt
   *
   * @param rtt
   */
  public void setRtt(Double rtt) {
    this.rtt = rtt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrtStatisticLink srtStatisticLink = (SrtStatisticLink) o;
    return Objects.equals(this.bandwidth, srtStatisticLink.bandwidth) &&
        Objects.equals(this.maxBandwidth, srtStatisticLink.maxBandwidth) &&
        Objects.equals(this.rtt, srtStatisticLink.rtt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bandwidth, maxBandwidth, rtt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtStatisticLink {\n");
    
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
    sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
    sb.append("    rtt: ").append(toIndentedString(rtt)).append("\n");
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


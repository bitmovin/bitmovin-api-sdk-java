package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCodecDeviceTypeReach
 */

public class PccCodecDeviceTypeReach {
  @JsonProperty("deviceType")
  private String deviceType;

  @JsonProperty("played")
  private BigDecimal played;

  @JsonProperty("measured")
  private BigDecimal measured;


  /**
   * Get deviceType
   * @return deviceType
   */
  public String getDeviceType() {
    return deviceType;
  }

  /**
   * Set deviceType
   *
   * @param deviceType
   */
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  /**
   * Distinct selected device pools that played this codec. (required)
   * @return played
   */
  public BigDecimal getPlayed() {
    return played;
  }

  /**
   * Distinct selected device pools that played this codec. (required)
   *
   * @param played
   *        Distinct selected device pools that played this codec. (required)
   */
  public void setPlayed(BigDecimal played) {
    this.played = played;
  }


  /**
   * Distinct selected pools that answered about this codec. A protection-only refusal is excluded. (required)
   * @return measured
   */
  public BigDecimal getMeasured() {
    return measured;
  }

  /**
   * Distinct selected pools that answered about this codec. A protection-only refusal is excluded. (required)
   *
   * @param measured
   *        Distinct selected pools that answered about this codec. A protection-only refusal is excluded. (required)
   */
  public void setMeasured(BigDecimal measured) {
    this.measured = measured;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccCodecDeviceTypeReach pccCodecDeviceTypeReach = (PccCodecDeviceTypeReach) o;
    return Objects.equals(this.deviceType, pccCodecDeviceTypeReach.deviceType) &&
        Objects.equals(this.played, pccCodecDeviceTypeReach.played) &&
        Objects.equals(this.measured, pccCodecDeviceTypeReach.measured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, played, measured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCodecDeviceTypeReach {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("    measured: ").append(toIndentedString(measured)).append("\n");
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


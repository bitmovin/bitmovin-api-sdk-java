package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccSupportShare
 */

public class PccSupportShare {
  @JsonProperty("label")
  private String label;

  @JsonProperty("played")
  private BigDecimal played;

  @JsonProperty("measured")
  private BigDecimal measured;


  /**
   * What this share counts, in words rather than in codes. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * What this share counts, in words rather than in codes. (required)
   *
   * @param label
   *        What this share counts, in words rather than in codes. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Device pools that played it. (required)
   * @return played
   */
  public BigDecimal getPlayed() {
    return played;
  }

  /**
   * Device pools that played it. (required)
   *
   * @param played
   *        Device pools that played it. (required)
   */
  public void setPlayed(BigDecimal played) {
    this.played = played;
  }


  /**
   * Device pools that answered either way. The denominator, never the fleet size. (required)
   * @return measured
   */
  public BigDecimal getMeasured() {
    return measured;
  }

  /**
   * Device pools that answered either way. The denominator, never the fleet size. (required)
   *
   * @param measured
   *        Device pools that answered either way. The denominator, never the fleet size. (required)
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
    PccSupportShare pccSupportShare = (PccSupportShare) o;
    return Objects.equals(this.label, pccSupportShare.label) &&
        Objects.equals(this.played, pccSupportShare.played) &&
        Objects.equals(this.measured, pccSupportShare.measured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, played, measured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccSupportShare {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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


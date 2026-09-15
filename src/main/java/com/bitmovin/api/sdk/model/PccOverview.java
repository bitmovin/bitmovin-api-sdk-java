package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccOverview
 */

public class PccOverview {
  @JsonProperty("total")
  private BigDecimal total;

  @JsonProperty("answered")
  private BigDecimal answered;

  @JsonProperty("played")
  private BigDecimal played;


  /**
   * Number of selected cells, one per device pool and codec/protection combination. (required)
   * @return total
   */
  public BigDecimal getTotal() {
    return total;
  }

  /**
   * Number of selected cells, one per device pool and codec/protection combination. (required)
   *
   * @param total
   *        Number of selected cells, one per device pool and codec/protection combination. (required)
   */
  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  /**
   * Selected cells with a device-answering verdict, including refusals. (required)
   * @return answered
   */
  public BigDecimal getAnswered() {
    return answered;
  }

  /**
   * Selected cells with a device-answering verdict, including refusals. (required)
   *
   * @param answered
   *        Selected cells with a device-answering verdict, including refusals. (required)
   */
  public void setAnswered(BigDecimal answered) {
    this.answered = answered;
  }


  /**
   * Selected cells that played successfully. (required)
   * @return played
   */
  public BigDecimal getPlayed() {
    return played;
  }

  /**
   * Selected cells that played successfully. (required)
   *
   * @param played
   *        Selected cells that played successfully. (required)
   */
  public void setPlayed(BigDecimal played) {
    this.played = played;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccOverview pccOverview = (PccOverview) o;
    return Objects.equals(this.total, pccOverview.total) &&
        Objects.equals(this.answered, pccOverview.answered) &&
        Objects.equals(this.played, pccOverview.played);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, answered, played);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccOverview {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    answered: ").append(toIndentedString(answered)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
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


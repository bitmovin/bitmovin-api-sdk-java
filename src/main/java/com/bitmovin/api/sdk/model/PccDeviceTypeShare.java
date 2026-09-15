package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccDeviceTypeShare
 */

public class PccDeviceTypeShare {
  @JsonProperty("label")
  private String label;

  @JsonProperty("played")
  private BigDecimal played;

  @JsonProperty("measured")
  private BigDecimal measured;

  @JsonProperty("models")
  private BigDecimal models;


  /**
   * The device type reported by the fleet. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * The device type reported by the fleet. (required)
   *
   * @param label
   *        The device type reported by the fleet. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Cells that played, across device pools of this kind. (required)
   * @return played
   */
  public BigDecimal getPlayed() {
    return played;
  }

  /**
   * Cells that played, across device pools of this kind. (required)
   *
   * @param played
   *        Cells that played, across device pools of this kind. (required)
   */
  public void setPlayed(BigDecimal played) {
    this.played = played;
  }


  /**
   * Cells with a device-answering verdict, across pools of this kind. The denominator. (required)
   * @return measured
   */
  public BigDecimal getMeasured() {
    return measured;
  }

  /**
   * Cells with a device-answering verdict, across pools of this kind. The denominator. (required)
   *
   * @param measured
   *        Cells with a device-answering verdict, across pools of this kind. The denominator. (required)
   */
  public void setMeasured(BigDecimal measured) {
    this.measured = measured;
  }


  /**
   * Device pools of this kind with at least one device-answering verdict. (required)
   * @return models
   */
  public BigDecimal getModels() {
    return models;
  }

  /**
   * Device pools of this kind with at least one device-answering verdict. (required)
   *
   * @param models
   *        Device pools of this kind with at least one device-answering verdict. (required)
   */
  public void setModels(BigDecimal models) {
    this.models = models;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccDeviceTypeShare pccDeviceTypeShare = (PccDeviceTypeShare) o;
    return Objects.equals(this.label, pccDeviceTypeShare.label) &&
        Objects.equals(this.played, pccDeviceTypeShare.played) &&
        Objects.equals(this.measured, pccDeviceTypeShare.measured) &&
        Objects.equals(this.models, pccDeviceTypeShare.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, played, measured, models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccDeviceTypeShare {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    played: ").append(toIndentedString(played)).append("\n");
    sb.append("    measured: ").append(toIndentedString(measured)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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


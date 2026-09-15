package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccHdrConfidence;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccHdrShare
 */

public class PccHdrShare {
  @JsonProperty("confidence")
  private PccHdrConfidence confidence;

  @JsonProperty("label")
  private String label;

  @JsonProperty("cells")
  private BigDecimal cells;


  /**
   * Get confidence
   * @return confidence
   */
  public PccHdrConfidence getConfidence() {
    return confidence;
  }

  /**
   * Set confidence
   *
   * @param confidence
   */
  public void setConfidence(PccHdrConfidence confidence) {
    this.confidence = confidence;
  }


  /**
   * Get label
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Set label
   *
   * @param label
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Get cells
   * @return cells
   */
  public BigDecimal getCells() {
    return cells;
  }

  /**
   * Set cells
   *
   * @param cells
   */
  public void setCells(BigDecimal cells) {
    this.cells = cells;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccHdrShare pccHdrShare = (PccHdrShare) o;
    return Objects.equals(this.confidence, pccHdrShare.confidence) &&
        Objects.equals(this.label, pccHdrShare.label) &&
        Objects.equals(this.cells, pccHdrShare.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, label, cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccHdrShare {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
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


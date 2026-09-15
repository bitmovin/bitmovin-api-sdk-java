package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccHdrConfidence;
import com.bitmovin.api.sdk.model.PccHdrOutcome;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccHdrOutcomeCount
 */

public class PccHdrOutcomeCount {
  @JsonProperty("outcome")
  private PccHdrOutcome outcome;

  @JsonProperty("confidence")
  private PccHdrConfidence confidence;

  @JsonProperty("label")
  private String label;

  @JsonProperty("cells")
  private BigDecimal cells;


  /**
   * Get outcome
   * @return outcome
   */
  public PccHdrOutcome getOutcome() {
    return outcome;
  }

  /**
   * Set outcome
   *
   * @param outcome
   */
  public void setOutcome(PccHdrOutcome outcome) {
    this.outcome = outcome;
  }


  /**
   * Null only for unreported readings. Evidence includes both HDR and SDR outcomes. (required)
   * @return confidence
   */
  public PccHdrConfidence getConfidence() {
    return confidence;
  }

  /**
   * Null only for unreported readings. Evidence includes both HDR and SDR outcomes. (required)
   *
   * @param confidence
   *        Null only for unreported readings. Evidence includes both HDR and SDR outcomes. (required)
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
   * Selected HDR playback passes with this outcome. All six outcomes sum to HDR passes. (required)
   * @return cells
   */
  public BigDecimal getCells() {
    return cells;
  }

  /**
   * Selected HDR playback passes with this outcome. All six outcomes sum to HDR passes. (required)
   *
   * @param cells
   *        Selected HDR playback passes with this outcome. All six outcomes sum to HDR passes. (required)
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
    PccHdrOutcomeCount pccHdrOutcomeCount = (PccHdrOutcomeCount) o;
    return Objects.equals(this.outcome, pccHdrOutcomeCount.outcome) &&
        Objects.equals(this.confidence, pccHdrOutcomeCount.confidence) &&
        Objects.equals(this.label, pccHdrOutcomeCount.label) &&
        Objects.equals(this.cells, pccHdrOutcomeCount.cells);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, confidence, label, cells);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccHdrOutcomeCount {\n");
    
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccVerdict;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccVerdictShare
 */

public class PccVerdictShare {
  @JsonProperty("verdict")
  private PccVerdict verdict;

  @JsonProperty("label")
  private String label;

  @JsonProperty("cells")
  private BigDecimal cells;

  @JsonProperty("aboutTheDevice")
  private Boolean aboutTheDevice;


  /**
   * Get verdict
   * @return verdict
   */
  public PccVerdict getVerdict() {
    return verdict;
  }

  /**
   * Set verdict
   *
   * @param verdict
   */
  public void setVerdict(PccVerdict verdict) {
    this.verdict = verdict;
  }


  /**
   * The reader&#39;s word for it. (required)
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * The reader&#39;s word for it. (required)
   *
   * @param label
   *        The reader&#39;s word for it. (required)
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Cells sharing this label, including verdicts grouped under &#x60;Not measured&#x60;. (required)
   * @return cells
   */
  public BigDecimal getCells() {
    return cells;
  }

  /**
   * Cells sharing this label, including verdicts grouped under &#x60;Not measured&#x60;. (required)
   *
   * @param cells
   *        Cells sharing this label, including verdicts grouped under &#x60;Not measured&#x60;. (required)
   */
  public void setCells(BigDecimal cells) {
    this.cells = cells;
  }


  /**
   * False where the verdict says something about the measurement, not about the device. (required)
   * @return aboutTheDevice
   */
  public Boolean getAboutTheDevice() {
    return aboutTheDevice;
  }

  /**
   * False where the verdict says something about the measurement, not about the device. (required)
   *
   * @param aboutTheDevice
   *        False where the verdict says something about the measurement, not about the device. (required)
   */
  public void setAboutTheDevice(Boolean aboutTheDevice) {
    this.aboutTheDevice = aboutTheDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccVerdictShare pccVerdictShare = (PccVerdictShare) o;
    return Objects.equals(this.verdict, pccVerdictShare.verdict) &&
        Objects.equals(this.label, pccVerdictShare.label) &&
        Objects.equals(this.cells, pccVerdictShare.cells) &&
        Objects.equals(this.aboutTheDevice, pccVerdictShare.aboutTheDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verdict, label, cells, aboutTheDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccVerdictShare {\n");
    
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
    sb.append("    aboutTheDevice: ").append(toIndentedString(aboutTheDevice)).append("\n");
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


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
 * PccDeviceHdrVerdict
 */

public class PccDeviceHdrVerdict {
  @JsonProperty("mark")
  private String mark;

  @JsonProperty("label")
  private String label;

  @JsonProperty("confidence")
  private PccHdrConfidence confidence;

  @JsonProperty("actionable")
  private Boolean actionable;

  @JsonProperty("passes")
  private BigDecimal passes;


  /**
   * Get mark
   * @return mark
   */
  public String getMark() {
    return mark;
  }

  /**
   * Set mark
   *
   * @param mark
   */
  public void setMark(String mark) {
    this.mark = mark;
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
   * Get actionable
   * @return actionable
   */
  public Boolean getActionable() {
    return actionable;
  }

  /**
   * Set actionable
   *
   * @param actionable
   */
  public void setActionable(Boolean actionable) {
    this.actionable = actionable;
  }


  /**
   * HDR passes supporting this verdict, not all passes for the device. (required)
   * @return passes
   */
  public BigDecimal getPasses() {
    return passes;
  }

  /**
   * HDR passes supporting this verdict, not all passes for the device. (required)
   *
   * @param passes
   *        HDR passes supporting this verdict, not all passes for the device. (required)
   */
  public void setPasses(BigDecimal passes) {
    this.passes = passes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccDeviceHdrVerdict pccDeviceHdrVerdict = (PccDeviceHdrVerdict) o;
    return Objects.equals(this.mark, pccDeviceHdrVerdict.mark) &&
        Objects.equals(this.label, pccDeviceHdrVerdict.label) &&
        Objects.equals(this.confidence, pccDeviceHdrVerdict.confidence) &&
        Objects.equals(this.actionable, pccDeviceHdrVerdict.actionable) &&
        Objects.equals(this.passes, pccDeviceHdrVerdict.passes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mark, label, confidence, actionable, passes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccDeviceHdrVerdict {\n");
    
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    actionable: ").append(toIndentedString(actionable)).append("\n");
    sb.append("    passes: ").append(toIndentedString(passes)).append("\n");
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


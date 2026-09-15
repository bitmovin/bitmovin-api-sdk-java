package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccHdrDevice;
import com.bitmovin.api.sdk.model.PccHdrFinding;
import com.bitmovin.api.sdk.model.PccHdrOutcomeCount;
import com.bitmovin.api.sdk.model.PccHdrShare;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccHdrSummary
 */

public class PccHdrSummary {
  @JsonProperty("outcomes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccHdrOutcomeCount> outcomes = new ArrayList<PccHdrOutcomeCount>();

  @JsonProperty("byDevice")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccHdrDevice> byDevice = new ArrayList<PccHdrDevice>();

  @JsonProperty("shares")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccHdrShare> shares = new ArrayList<PccHdrShare>();

  @JsonProperty("passes")
  private BigDecimal passes;

  @JsonProperty("unreported")
  private BigDecimal unreported;

  @JsonProperty("established")
  private BigDecimal established;

  @JsonProperty("findings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccHdrFinding> findings = new ArrayList<PccHdrFinding>();


  public PccHdrSummary addOutcomesItem(PccHdrOutcomeCount outcomesItem) {
    this.outcomes.add(outcomesItem);
    return this;
  }

  /**
   * Get outcomes
   * @return outcomes
   */
  public List<PccHdrOutcomeCount> getOutcomes() {
    return outcomes;
  }

  /**
   * Set outcomes
   *
   * @param outcomes
   */
  public void setOutcomes(List<PccHdrOutcomeCount> outcomes) {
    this.outcomes = outcomes;
  }


  public PccHdrSummary addByDeviceItem(PccHdrDevice byDeviceItem) {
    this.byDevice.add(byDeviceItem);
    return this;
  }

  /**
   * Selected device pools with at least one HDR playback pass. (required)
   * @return byDevice
   */
  public List<PccHdrDevice> getByDevice() {
    return byDevice;
  }

  /**
   * Selected device pools with at least one HDR playback pass. (required)
   *
   * @param byDevice
   *        Selected device pools with at least one HDR playback pass. (required)
   */
  public void setByDevice(List<PccHdrDevice> byDevice) {
    this.byDevice = byDevice;
  }


  public PccHdrSummary addSharesItem(PccHdrShare sharesItem) {
    this.shares.add(sharesItem);
    return this;
  }

  /**
   * Get shares
   * @return shares
   */
  public List<PccHdrShare> getShares() {
    return shares;
  }

  /**
   * Set shares
   *
   * @param shares
   */
  public void setShares(List<PccHdrShare> shares) {
    this.shares = shares;
  }


  /**
   * HDR passes in the report. The picture question does not arise on a cell that failed. (required)
   * @return passes
   */
  public BigDecimal getPasses() {
    return passes;
  }

  /**
   * HDR passes in the report. The picture question does not arise on a cell that failed. (required)
   *
   * @param passes
   *        HDR passes in the report. The picture question does not arise on a cell that failed. (required)
   */
  public void setPasses(BigDecimal passes) {
    this.passes = passes;
  }


  /**
   * Passes carrying no reading at all, so a missing measurement never reads as a level of confidence. (required)
   * @return unreported
   */
  public BigDecimal getUnreported() {
    return unreported;
  }

  /**
   * Passes carrying no reading at all, so a missing measurement never reads as a level of confidence. (required)
   *
   * @param unreported
   *        Passes carrying no reading at all, so a missing measurement never reads as a level of confidence. (required)
   */
  public void setUnreported(BigDecimal unreported) {
    this.unreported = unreported;
  }


  /**
   * Passes where some instrument answered — frames read, or the device&#39;s own word. The &#x60;evidence&#x60; and &#x60;claim&#x60; shares above, added together. (required)
   * @return established
   */
  public BigDecimal getEstablished() {
    return established;
  }

  /**
   * Passes where some instrument answered — frames read, or the device&#39;s own word. The &#x60;evidence&#x60; and &#x60;claim&#x60; shares above, added together. (required)
   *
   * @param established
   *        Passes where some instrument answered — frames read, or the device&#39;s own word. The &#x60;evidence&#x60; and &#x60;claim&#x60; shares above, added together. (required)
   */
  public void setEstablished(BigDecimal established) {
    this.established = established;
  }


  public PccHdrSummary addFindingsItem(PccHdrFinding findingsItem) {
    this.findings.add(findingsItem);
    return this;
  }

  /**
   * Get findings
   * @return findings
   */
  public List<PccHdrFinding> getFindings() {
    return findings;
  }

  /**
   * Set findings
   *
   * @param findings
   */
  public void setFindings(List<PccHdrFinding> findings) {
    this.findings = findings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccHdrSummary pccHdrSummary = (PccHdrSummary) o;
    return Objects.equals(this.outcomes, pccHdrSummary.outcomes) &&
        Objects.equals(this.byDevice, pccHdrSummary.byDevice) &&
        Objects.equals(this.shares, pccHdrSummary.shares) &&
        Objects.equals(this.passes, pccHdrSummary.passes) &&
        Objects.equals(this.unreported, pccHdrSummary.unreported) &&
        Objects.equals(this.established, pccHdrSummary.established) &&
        Objects.equals(this.findings, pccHdrSummary.findings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomes, byDevice, shares, passes, unreported, established, findings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccHdrSummary {\n");
    
    sb.append("    outcomes: ").append(toIndentedString(outcomes)).append("\n");
    sb.append("    byDevice: ").append(toIndentedString(byDevice)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    passes: ").append(toIndentedString(passes)).append("\n");
    sb.append("    unreported: ").append(toIndentedString(unreported)).append("\n");
    sb.append("    established: ").append(toIndentedString(established)).append("\n");
    sb.append("    findings: ").append(toIndentedString(findings)).append("\n");
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


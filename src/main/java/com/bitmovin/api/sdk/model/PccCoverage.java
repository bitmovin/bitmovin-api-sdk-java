package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCoverage
 */

public class PccCoverage {
  @JsonProperty("devicesBeforeView")
  private Integer devicesBeforeView;

  @JsonProperty("devicesExcludedByDeviceFilter")
  private Integer devicesExcludedByDeviceFilter;

  @JsonProperty("devicesExcludedAsUnreported")
  private Integer devicesExcludedAsUnreported;

  @JsonProperty("devicesExcludedAsPrerelease")
  private Integer devicesExcludedAsPrerelease;

  @JsonProperty("devices")
  private BigDecimal devices;

  @JsonProperty("devicesWithNoSession")
  private BigDecimal devicesWithNoSession;

  @JsonProperty("devicesOnOneUnit")
  private BigDecimal devicesOnOneUnit;

  @JsonProperty("devicesUnderPlaceholderName")
  private BigDecimal devicesUnderPlaceholderName;

  @JsonProperty("cellsOnOneSession")
  private BigDecimal cellsOnOneSession;

  @JsonProperty("unattributableJobs")
  private BigDecimal unattributableJobs;

  @JsonProperty("unsettledJobs")
  private BigDecimal unsettledJobs;

  @JsonProperty("devicesOnRecentEvidence")
  private BigDecimal devicesOnRecentEvidence;


  /**
   * Distinct pools in the held measurement before any view exclusions. (required)
   * minimum: 0
   * @return devicesBeforeView
   */
  public Integer getDevicesBeforeView() {
    return devicesBeforeView;
  }

  /**
   * Distinct pools in the held measurement before any view exclusions. (required)
   * minimum: 0
   *
   * @param devicesBeforeView
   *        Distinct pools in the held measurement before any view exclusions. (required)
   *        minimum: 0
   */
  public void setDevicesBeforeView(Integer devicesBeforeView) {
    this.devicesBeforeView = devicesBeforeView;
  }


  /**
   * Pools omitted by the device filter after prerelease exclusions. Each omitted pool is counted once, in prerelease, device-filter, then reported-only order. (required)
   * minimum: 0
   * @return devicesExcludedByDeviceFilter
   */
  public Integer getDevicesExcludedByDeviceFilter() {
    return devicesExcludedByDeviceFilter;
  }

  /**
   * Pools omitted by the device filter after prerelease exclusions. Each omitted pool is counted once, in prerelease, device-filter, then reported-only order. (required)
   * minimum: 0
   *
   * @param devicesExcludedByDeviceFilter
   *        Pools omitted by the device filter after prerelease exclusions. Each omitted pool is counted once, in prerelease, device-filter, then reported-only order. (required)
   *        minimum: 0
   */
  public void setDevicesExcludedByDeviceFilter(Integer devicesExcludedByDeviceFilter) {
    this.devicesExcludedByDeviceFilter = devicesExcludedByDeviceFilter;
  }


  /**
   * Pools omitted by reportedOnly because no selected cell answers about the device, after prerelease and device-filter exclusions. (required)
   * minimum: 0
   * @return devicesExcludedAsUnreported
   */
  public Integer getDevicesExcludedAsUnreported() {
    return devicesExcludedAsUnreported;
  }

  /**
   * Pools omitted by reportedOnly because no selected cell answers about the device, after prerelease and device-filter exclusions. (required)
   * minimum: 0
   *
   * @param devicesExcludedAsUnreported
   *        Pools omitted by reportedOnly because no selected cell answers about the device, after prerelease and device-filter exclusions. (required)
   *        minimum: 0
   */
  public void setDevicesExcludedAsUnreported(Integer devicesExcludedAsUnreported) {
    this.devicesExcludedAsUnreported = devicesExcludedAsUnreported;
  }


  /**
   * Distinct pools omitted because all recorded browser evidence is pre-release. Zero when includePrerelease is true. Unknown browser identities do not cause prerelease exclusion. Row coverage and summaries describe the retained pools. (required)
   * minimum: 0
   * @return devicesExcludedAsPrerelease
   */
  public Integer getDevicesExcludedAsPrerelease() {
    return devicesExcludedAsPrerelease;
  }

  /**
   * Distinct pools omitted because all recorded browser evidence is pre-release. Zero when includePrerelease is true. Unknown browser identities do not cause prerelease exclusion. Row coverage and summaries describe the retained pools. (required)
   * minimum: 0
   *
   * @param devicesExcludedAsPrerelease
   *        Distinct pools omitted because all recorded browser evidence is pre-release. Zero when includePrerelease is true. Unknown browser identities do not cause prerelease exclusion. Row coverage and summaries describe the retained pools. (required)
   *        minimum: 0
   */
  public void setDevicesExcludedAsPrerelease(Integer devicesExcludedAsPrerelease) {
    this.devicesExcludedAsPrerelease = devicesExcludedAsPrerelease;
  }


  /**
   * Get devices
   * @return devices
   */
  public BigDecimal getDevices() {
    return devices;
  }

  /**
   * Set devices
   *
   * @param devices
   */
  public void setDevices(BigDecimal devices) {
    this.devices = devices;
  }


  /**
   * Pools with no included sessions. Present in the report as unmeasured, including when the start date excluded all evidence. (required)
   * @return devicesWithNoSession
   */
  public BigDecimal getDevicesWithNoSession() {
    return devicesWithNoSession;
  }

  /**
   * Pools with no included sessions. Present in the report as unmeasured, including when the start date excluded all evidence. (required)
   *
   * @param devicesWithNoSession
   *        Pools with no included sessions. Present in the report as unmeasured, including when the start date excluded all evidence. (required)
   */
  public void setDevicesWithNoSession(BigDecimal devicesWithNoSession) {
    this.devicesWithNoSession = devicesWithNoSession;
  }


  /**
   * Pools every one of whose sessions came from one physical machine — a claim about that machine, not the model. (required)
   * @return devicesOnOneUnit
   */
  public BigDecimal getDevicesOnOneUnit() {
    return devicesOnOneUnit;
  }

  /**
   * Pools every one of whose sessions came from one physical machine — a claim about that machine, not the model. (required)
   *
   * @param devicesOnOneUnit
   *        Pools every one of whose sessions came from one physical machine — a claim about that machine, not the model. (required)
   */
  public void setDevicesOnOneUnit(BigDecimal devicesOnOneUnit) {
    this.devicesOnOneUnit = devicesOnOneUnit;
  }


  /**
   * Pools no naming rule recognised, published under the stated placeholder. Counted here so a reader can tell how much of the fleet this report cannot name rather than discovering it row by row. (required)
   * @return devicesUnderPlaceholderName
   */
  public BigDecimal getDevicesUnderPlaceholderName() {
    return devicesUnderPlaceholderName;
  }

  /**
   * Pools no naming rule recognised, published under the stated placeholder. Counted here so a reader can tell how much of the fleet this report cannot name rather than discovering it row by row. (required)
   *
   * @param devicesUnderPlaceholderName
   *        Pools no naming rule recognised, published under the stated placeholder. Counted here so a reader can tell how much of the fleet this report cannot name rather than discovering it row by row. (required)
   */
  public void setDevicesUnderPlaceholderName(BigDecimal devicesUnderPlaceholderName) {
    this.devicesUnderPlaceholderName = devicesUnderPlaceholderName;
  }


  /**
   * Cells whose verdict rests on a single session. (required)
   * @return cellsOnOneSession
   */
  public BigDecimal getCellsOnOneSession() {
    return cellsOnOneSession;
  }

  /**
   * Cells whose verdict rests on a single session. (required)
   *
   * @param cellsOnOneSession
   *        Cells whose verdict rests on a single session. (required)
   */
  public void setCellsOnOneSession(BigDecimal cellsOnOneSession) {
    this.cellsOnOneSession = cellsOnOneSession;
  }


  /**
   * Jobs the fleet could not attribute to any pool, so no row of this report accounts for them. (required)
   * @return unattributableJobs
   */
  public BigDecimal getUnattributableJobs() {
    return unattributableJobs;
  }

  /**
   * Jobs the fleet could not attribute to any pool, so no row of this report accounts for them. (required)
   *
   * @param unattributableJobs
   *        Jobs the fleet could not attribute to any pool, so no row of this report accounts for them. (required)
   */
  public void setUnattributableJobs(BigDecimal unattributableJobs) {
    this.unattributableJobs = unattributableJobs;
  }


  /**
   * Jobs that had not finished when this was assembled. Their pools carry nothing measured. (required)
   * @return unsettledJobs
   */
  public BigDecimal getUnsettledJobs() {
    return unsettledJobs;
  }

  /**
   * Jobs that had not finished when this was assembled. Their pools carry nothing measured. (required)
   *
   * @param unsettledJobs
   *        Jobs that had not finished when this was assembled. Their pools carry nothing measured. (required)
   */
  public void setUnsettledJobs(BigDecimal unsettledJobs) {
    this.unsettledJobs = unsettledJobs;
  }


  /**
   * Pools with sessions excluded by the start date or session limit, including those with no included evidence. (required)
   * @return devicesOnRecentEvidence
   */
  public BigDecimal getDevicesOnRecentEvidence() {
    return devicesOnRecentEvidence;
  }

  /**
   * Pools with sessions excluded by the start date or session limit, including those with no included evidence. (required)
   *
   * @param devicesOnRecentEvidence
   *        Pools with sessions excluded by the start date or session limit, including those with no included evidence. (required)
   */
  public void setDevicesOnRecentEvidence(BigDecimal devicesOnRecentEvidence) {
    this.devicesOnRecentEvidence = devicesOnRecentEvidence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccCoverage pccCoverage = (PccCoverage) o;
    return Objects.equals(this.devicesBeforeView, pccCoverage.devicesBeforeView) &&
        Objects.equals(this.devicesExcludedByDeviceFilter, pccCoverage.devicesExcludedByDeviceFilter) &&
        Objects.equals(this.devicesExcludedAsUnreported, pccCoverage.devicesExcludedAsUnreported) &&
        Objects.equals(this.devicesExcludedAsPrerelease, pccCoverage.devicesExcludedAsPrerelease) &&
        Objects.equals(this.devices, pccCoverage.devices) &&
        Objects.equals(this.devicesWithNoSession, pccCoverage.devicesWithNoSession) &&
        Objects.equals(this.devicesOnOneUnit, pccCoverage.devicesOnOneUnit) &&
        Objects.equals(this.devicesUnderPlaceholderName, pccCoverage.devicesUnderPlaceholderName) &&
        Objects.equals(this.cellsOnOneSession, pccCoverage.cellsOnOneSession) &&
        Objects.equals(this.unattributableJobs, pccCoverage.unattributableJobs) &&
        Objects.equals(this.unsettledJobs, pccCoverage.unsettledJobs) &&
        Objects.equals(this.devicesOnRecentEvidence, pccCoverage.devicesOnRecentEvidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicesBeforeView, devicesExcludedByDeviceFilter, devicesExcludedAsUnreported, devicesExcludedAsPrerelease, devices, devicesWithNoSession, devicesOnOneUnit, devicesUnderPlaceholderName, cellsOnOneSession, unattributableJobs, unsettledJobs, devicesOnRecentEvidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCoverage {\n");
    
    sb.append("    devicesBeforeView: ").append(toIndentedString(devicesBeforeView)).append("\n");
    sb.append("    devicesExcludedByDeviceFilter: ").append(toIndentedString(devicesExcludedByDeviceFilter)).append("\n");
    sb.append("    devicesExcludedAsUnreported: ").append(toIndentedString(devicesExcludedAsUnreported)).append("\n");
    sb.append("    devicesExcludedAsPrerelease: ").append(toIndentedString(devicesExcludedAsPrerelease)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    devicesWithNoSession: ").append(toIndentedString(devicesWithNoSession)).append("\n");
    sb.append("    devicesOnOneUnit: ").append(toIndentedString(devicesOnOneUnit)).append("\n");
    sb.append("    devicesUnderPlaceholderName: ").append(toIndentedString(devicesUnderPlaceholderName)).append("\n");
    sb.append("    cellsOnOneSession: ").append(toIndentedString(cellsOnOneSession)).append("\n");
    sb.append("    unattributableJobs: ").append(toIndentedString(unattributableJobs)).append("\n");
    sb.append("    unsettledJobs: ").append(toIndentedString(unsettledJobs)).append("\n");
    sb.append("    devicesOnRecentEvidence: ").append(toIndentedString(devicesOnRecentEvidence)).append("\n");
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


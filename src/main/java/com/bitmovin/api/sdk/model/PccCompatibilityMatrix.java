package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccCombination;
import com.bitmovin.api.sdk.model.PccCoverage;
import com.bitmovin.api.sdk.model.PccDevice;
import com.bitmovin.api.sdk.model.PccHdrLegendEntry;
import com.bitmovin.api.sdk.model.PccReportView;
import com.bitmovin.api.sdk.model.PccSummary;
import com.bitmovin.api.sdk.model.PccVerdictLegendEntry;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccCompatibilityMatrix
 */

public class PccCompatibilityMatrix {
  @JsonProperty("view")
  private PccReportView view;

  @JsonProperty("assembledAt")
  private String assembledAt;

  @JsonProperty("playerVersions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> playerVersions = new ArrayList<String>();

  @JsonProperty("runIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> runIds = new ArrayList<String>();

  @JsonProperty("startDate")
  private Date startDate;

  @JsonProperty("sessionLimit")
  private Integer sessionLimit;

  @JsonProperty("coverage")
  private PccCoverage coverage;

  @JsonProperty("legend")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccVerdictLegendEntry> legend = new ArrayList<PccVerdictLegendEntry>();

  @JsonProperty("hdrLegend")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccHdrLegendEntry> hdrLegend = new ArrayList<PccHdrLegendEntry>();

  @JsonProperty("combinations")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccCombination> combinations = new ArrayList<PccCombination>();

  @JsonProperty("devices")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PccDevice> devices = new ArrayList<PccDevice>();

  @JsonProperty("summary")
  private PccSummary summary;


  /**
   * The effective selection already applied to this matrix, its summary and coverage. (required)
   * @return view
   */
  public PccReportView getView() {
    return view;
  }

  /**
   * The effective selection already applied to this matrix, its summary and coverage. (required)
   *
   * @param view
   *        The effective selection already applied to this matrix, its summary and coverage. (required)
   */
  public void setView(PccReportView view) {
    this.view = view;
  }


  /**
   * When this report was assembled from what had been measured by then. (required)
   * @return assembledAt
   */
  public String getAssembledAt() {
    return assembledAt;
  }

  /**
   * When this report was assembled from what had been measured by then. (required)
   *
   * @param assembledAt
   *        When this report was assembled from what had been measured by then. (required)
   */
  public void setAssembledAt(String assembledAt) {
    this.assembledAt = assembledAt;
  }


  public PccCompatibilityMatrix addPlayerVersionsItem(String playerVersionsItem) {
    this.playerVersions.add(playerVersionsItem);
    return this;
  }

  /**
   * Every Bitmovin Player version that measured any device here. More than one means the measurement spanned a player release, and support is a property of the player and the device together. (required)
   * @return playerVersions
   */
  public List<String> getPlayerVersions() {
    return playerVersions;
  }

  /**
   * Every Bitmovin Player version that measured any device here. More than one means the measurement spanned a player release, and support is a property of the player and the device together. (required)
   *
   * @param playerVersions
   *        Every Bitmovin Player version that measured any device here. More than one means the measurement spanned a player release, and support is a property of the player and the device together. (required)
   */
  public void setPlayerVersions(List<String> playerVersions) {
    this.playerVersions = playerVersions;
  }


  public PccCompatibilityMatrix addRunIdsItem(String runIdsItem) {
    this.runIds.add(runIdsItem);
    return this;
  }

  /**
   * UUIDs of matching runs whose job metadata was read, including runs with no included session evidence. Never run names. Quote one to Bitmovin support while the fleet still holds it. The count says nothing about coverage. (required)
   * @return runIds
   */
  public List<String> getRunIds() {
    return runIds;
  }

  /**
   * UUIDs of matching runs whose job metadata was read, including runs with no included session evidence. Never run names. Quote one to Bitmovin support while the fleet still holds it. The count says nothing about coverage. (required)
   *
   * @param runIds
   *        UUIDs of matching runs whose job metadata was read, including runs with no included session evidence. Never run names. Quote one to Bitmovin support while the fleet still holds it. The count says nothing about coverage. (required)
   */
  public void setRunIds(List<String> runIds) {
    this.runIds = runIds;
  }


  /**
   * Inclusive run creation instant in UTC used by this generation, or null for no cutoff. Legacy dates mean midnight UTC. Changing the held cutoff does not alter this report. (required)
   * @return startDate
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Inclusive run creation instant in UTC used by this generation, or null for no cutoff. Legacy dates mean midnight UTC. Changing the held cutoff does not alter this report. (required)
   *
   * @param startDate
   *        Inclusive run creation instant in UTC used by this generation, or null for no cutoff. Legacy dates mean midnight UTC. Changing the held cutoff does not alter this report. (required)
   */
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * Maximum sessions read per pool by this generation. Null for reports produced before a limit was recorded. (required)
   * minimum: 1
   * @return sessionLimit
   */
  public Integer getSessionLimit() {
    return sessionLimit;
  }

  /**
   * Maximum sessions read per pool by this generation. Null for reports produced before a limit was recorded. (required)
   * minimum: 1
   *
   * @param sessionLimit
   *        Maximum sessions read per pool by this generation. Null for reports produced before a limit was recorded. (required)
   *        minimum: 1
   */
  public void setSessionLimit(Integer sessionLimit) {
    this.sessionLimit = sessionLimit;
  }


  /**
   * Get coverage
   * @return coverage
   */
  public PccCoverage getCoverage() {
    return coverage;
  }

  /**
   * Set coverage
   *
   * @param coverage
   */
  public void setCoverage(PccCoverage coverage) {
    this.coverage = coverage;
  }


  public PccCompatibilityMatrix addLegendItem(PccVerdictLegendEntry legendItem) {
    this.legend.add(legendItem);
    return this;
  }

  /**
   * Every verdict mark and its wording, so the grid reads without this service&#39;s source. (required)
   * @return legend
   */
  public List<PccVerdictLegendEntry> getLegend() {
    return legend;
  }

  /**
   * Every verdict mark and its wording, so the grid reads without this service&#39;s source. (required)
   *
   * @param legend
   *        Every verdict mark and its wording, so the grid reads without this service&#39;s source. (required)
   */
  public void setLegend(List<PccVerdictLegendEntry> legend) {
    this.legend = legend;
  }


  public PccCompatibilityMatrix addHdrLegendItem(PccHdrLegendEntry hdrLegendItem) {
    this.hdrLegend.add(hdrLegendItem);
    return this;
  }

  /**
   * The same for the marks an HDR result wears. (required)
   * @return hdrLegend
   */
  public List<PccHdrLegendEntry> getHdrLegend() {
    return hdrLegend;
  }

  /**
   * The same for the marks an HDR result wears. (required)
   *
   * @param hdrLegend
   *        The same for the marks an HDR result wears. (required)
   */
  public void setHdrLegend(List<PccHdrLegendEntry> hdrLegend) {
    this.hdrLegend = hdrLegend;
  }


  public PccCompatibilityMatrix addCombinationsItem(PccCombination combinationsItem) {
    this.combinations.add(combinationsItem);
    return this;
  }

  /**
   * Get combinations
   * @return combinations
   */
  public List<PccCombination> getCombinations() {
    return combinations;
  }

  /**
   * Set combinations
   *
   * @param combinations
   */
  public void setCombinations(List<PccCombination> combinations) {
    this.combinations = combinations;
  }


  public PccCompatibilityMatrix addDevicesItem(PccDevice devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Get devices
   * @return devices
   */
  public List<PccDevice> getDevices() {
    return devices;
  }

  /**
   * Set devices
   *
   * @param devices
   */
  public void setDevices(List<PccDevice> devices) {
    this.devices = devices;
  }


  /**
   * Get summary
   * @return summary
   */
  public PccSummary getSummary() {
    return summary;
  }

  /**
   * Set summary
   *
   * @param summary
   */
  public void setSummary(PccSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccCompatibilityMatrix pccCompatibilityMatrix = (PccCompatibilityMatrix) o;
    return Objects.equals(this.view, pccCompatibilityMatrix.view) &&
        Objects.equals(this.assembledAt, pccCompatibilityMatrix.assembledAt) &&
        Objects.equals(this.playerVersions, pccCompatibilityMatrix.playerVersions) &&
        Objects.equals(this.runIds, pccCompatibilityMatrix.runIds) &&
        Objects.equals(this.startDate, pccCompatibilityMatrix.startDate) &&
        Objects.equals(this.sessionLimit, pccCompatibilityMatrix.sessionLimit) &&
        Objects.equals(this.coverage, pccCompatibilityMatrix.coverage) &&
        Objects.equals(this.legend, pccCompatibilityMatrix.legend) &&
        Objects.equals(this.hdrLegend, pccCompatibilityMatrix.hdrLegend) &&
        Objects.equals(this.combinations, pccCompatibilityMatrix.combinations) &&
        Objects.equals(this.devices, pccCompatibilityMatrix.devices) &&
        Objects.equals(this.summary, pccCompatibilityMatrix.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(view, assembledAt, playerVersions, runIds, startDate, sessionLimit, coverage, legend, hdrLegend, combinations, devices, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccCompatibilityMatrix {\n");
    
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    assembledAt: ").append(toIndentedString(assembledAt)).append("\n");
    sb.append("    playerVersions: ").append(toIndentedString(playerVersions)).append("\n");
    sb.append("    runIds: ").append(toIndentedString(runIds)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    sessionLimit: ").append(toIndentedString(sessionLimit)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    legend: ").append(toIndentedString(legend)).append("\n");
    sb.append("    hdrLegend: ").append(toIndentedString(hdrLegend)).append("\n");
    sb.append("    combinations: ").append(toIndentedString(combinations)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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


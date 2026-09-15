package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.PccCompatibilityMatrix;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccReport
 */

public class PccReport {
  @JsonProperty("reportId")
  private String reportId;

  @JsonProperty("generatedAt")
  private String generatedAt;

  @JsonProperty("report")
  private PccCompatibilityMatrix report;


  /**
   * Identifies this report. A new generation produces a new one. (required)
   * @return reportId
   */
  public String getReportId() {
    return reportId;
  }

  /**
   * Identifies this report. A new generation produces a new one. (required)
   *
   * @param reportId
   *        Identifies this report. A new generation produces a new one. (required)
   */
  public void setReportId(String reportId) {
    this.reportId = reportId;
  }


  /**
   * When the generation that produced this report finished. (required)
   * @return generatedAt
   */
  public String getGeneratedAt() {
    return generatedAt;
  }

  /**
   * When the generation that produced this report finished. (required)
   *
   * @param generatedAt
   *        When the generation that produced this report finished. (required)
   */
  public void setGeneratedAt(String generatedAt) {
    this.generatedAt = generatedAt;
  }


  /**
   * The selected report. By default, pools whose recorded browsers are all pre-release are excluded; includePrerelease retains them. Unknown browser identities do not cause prerelease exclusion. Null where a report is held that this service cannot read, which a generation replaces. (required)
   * @return report
   */
  public PccCompatibilityMatrix getReport() {
    return report;
  }

  /**
   * The selected report. By default, pools whose recorded browsers are all pre-release are excluded; includePrerelease retains them. Unknown browser identities do not cause prerelease exclusion. Null where a report is held that this service cannot read, which a generation replaces. (required)
   *
   * @param report
   *        The selected report. By default, pools whose recorded browsers are all pre-release are excluded; includePrerelease retains them. Unknown browser identities do not cause prerelease exclusion. Null where a report is held that this service cannot read, which a generation replaces. (required)
   */
  public void setReport(PccCompatibilityMatrix report) {
    this.report = report;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccReport pccReport = (PccReport) o;
    return Objects.equals(this.reportId, pccReport.reportId) &&
        Objects.equals(this.generatedAt, pccReport.generatedAt) &&
        Objects.equals(this.report, pccReport.report);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportId, generatedAt, report);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccReport {\n");
    
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
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


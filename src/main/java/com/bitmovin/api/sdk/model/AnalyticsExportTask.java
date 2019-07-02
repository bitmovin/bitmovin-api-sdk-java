package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsExportStatus;
import com.bitmovin.api.sdk.model.AnalyticsExportTaskOutputTarget;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsExportTask
 */

public class AnalyticsExportTask extends BitmovinResponse {
  @JsonProperty("startTime")
  private Date startTime;

  @JsonProperty("endTime")
  private Date endTime;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("output")
  private AnalyticsExportTaskOutputTarget output;

  @JsonProperty("progress")
  private Integer progress;

  @JsonProperty("status")
  private AnalyticsExportStatus status;

  @JsonProperty("startedAt")
  private Date startedAt;

  @JsonProperty("finishedAt")
  private Date finishedAt;


  /**
   * Start of timeframe which is exported in UTC format (required)
   * @return startTime
   */
  public Date getStartTime() {
    return startTime;
  }

  /**
   * Start of timeframe which is exported in UTC format (required)
   *
   * @param startTime
   *        Start of timeframe which is exported in UTC format (required)
   */
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  /**
   * End of timeframe which is exported in UTC format (required)
   * @return endTime
   */
  public Date getEndTime() {
    return endTime;
  }

  /**
   * End of timeframe which is exported in UTC format (required)
   *
   * @param endTime
   *        End of timeframe which is exported in UTC format (required)
   */
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  /**
   * Name of the export task (required)
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the export task (required)
   *
   * @param name
   *        Name of the export task (required)
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Export task description
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Export task description
   *
   * @param description
   *        Export task description
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * License key (required)
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * License key (required)
   *
   * @param licenseKey
   *        License key (required)
   */
  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }


  /**
   * Get output
   * @return output
   */
  public AnalyticsExportTaskOutputTarget getOutput() {
    return output;
  }

  /**
   * Set output
   *
   * @param output
   */
  public void setOutput(AnalyticsExportTaskOutputTarget output) {
    this.output = output;
  }

  /**
   * Progress of the export task
   * @return progress
   */
  public Integer getProgress() {
    return progress;
  }


  /**
   * Get status
   * @return status
   */
  public AnalyticsExportStatus getStatus() {
    return status;
  }

  /**
   * Set status
   *
   * @param status
   */
  public void setStatus(AnalyticsExportStatus status) {
    this.status = status;
  }

  /**
   * UTC timestamp when the export task started
   * @return startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }

  /**
   * UTC timestamp when the export task finished
   * @return finishedAt
   */
  public Date getFinishedAt() {
    return finishedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsExportTask analyticsExportTask = (AnalyticsExportTask) o;
    return Objects.equals(this.startTime, analyticsExportTask.startTime) &&
        Objects.equals(this.endTime, analyticsExportTask.endTime) &&
        Objects.equals(this.name, analyticsExportTask.name) &&
        Objects.equals(this.description, analyticsExportTask.description) &&
        Objects.equals(this.licenseKey, analyticsExportTask.licenseKey) &&
        Objects.equals(this.output, analyticsExportTask.output) &&
        Objects.equals(this.progress, analyticsExportTask.progress) &&
        Objects.equals(this.status, analyticsExportTask.status) &&
        Objects.equals(this.startedAt, analyticsExportTask.startedAt) &&
        Objects.equals(this.finishedAt, analyticsExportTask.finishedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, name, description, licenseKey, output, progress, status, startedAt, finishedAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsExportTask {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
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


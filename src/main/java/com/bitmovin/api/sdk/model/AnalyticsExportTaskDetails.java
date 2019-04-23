package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsExportStatus;
import com.bitmovin.api.sdk.model.AnalyticsExportTask;
import com.bitmovin.api.sdk.model.AnalyticsExportTaskOutputTarget;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsExportTaskDetails
 */

public class AnalyticsExportTaskDetails extends AnalyticsExportTask {
  @JsonProperty("progress")
  private Integer progress;

  @JsonProperty("status")
  private AnalyticsExportStatus status = null;

  @JsonProperty("startedAt")
  private String startedAt;

  @JsonProperty("finishedAt")
  private String finishedAt;


  /**
   * Progress of the export task
   * @return progress
   */
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }


  /**
   * Get status
   * @return status
   */
  public AnalyticsExportStatus getStatus() {
    return status;
  }

  public void setStatus(AnalyticsExportStatus status) {
    this.status = status;
  }


  /**
   * UTC timestamp when the export task started
   * @return startedAt
   */
  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  /**
   * UTC timestamp when the export task finished
   * @return finishedAt
   */
  public String getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsExportTaskDetails analyticsExportTaskDetails = (AnalyticsExportTaskDetails) o;
    return Objects.equals(this.progress, analyticsExportTaskDetails.progress) &&
        Objects.equals(this.status, analyticsExportTaskDetails.status) &&
        Objects.equals(this.startedAt, analyticsExportTaskDetails.startedAt) &&
        Objects.equals(this.finishedAt, analyticsExportTaskDetails.finishedAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(progress, status, startedAt, finishedAt, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsExportTaskDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


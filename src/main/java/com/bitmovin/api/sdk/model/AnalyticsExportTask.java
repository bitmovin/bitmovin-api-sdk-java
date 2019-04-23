package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsExportTaskOutputTarget;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsExportTask
 */

public class AnalyticsExportTask extends BitmovinResponse {
  @JsonProperty("startTime")
  private String startTime;

  @JsonProperty("endTime")
  private String endTime;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("output")
  private AnalyticsExportTaskOutputTarget output = null;


  /**
   * Start of timeframe which is exported in UTC format
   * @return startTime
   */
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  /**
   * End of timeframe which is exported in UTC format
   * @return endTime
   */
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  /**
   * Name of the export task
   * @return name
   */
  public String getName() {
    return name;
  }

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

  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * License key
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

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

  public void setOutput(AnalyticsExportTaskOutputTarget output) {
    this.output = output;
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, name, description, licenseKey, output, super.hashCode());
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


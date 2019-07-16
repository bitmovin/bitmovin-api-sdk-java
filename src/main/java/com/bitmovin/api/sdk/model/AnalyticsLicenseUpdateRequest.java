package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsLicenseCustomDataFieldLabels;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsLicenseUpdateRequest
 */

public class AnalyticsLicenseUpdateRequest {
  @JsonProperty("name")
  private String name;

  @JsonProperty("ignoreDNT")
  private Boolean ignoreDNT;

  @JsonProperty("timeZone")
  private String timeZone;

  @JsonProperty("customDataFieldLabels")
  private AnalyticsLicenseCustomDataFieldLabels customDataFieldLabels;


  /**
   * Get name
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get ignoreDNT
   * @return ignoreDNT
   */
  public Boolean getIgnoreDNT() {
    return ignoreDNT;
  }

  /**
   * Set ignoreDNT
   *
   * @param ignoreDNT
   */
  public void setIgnoreDNT(Boolean ignoreDNT) {
    this.ignoreDNT = ignoreDNT;
  }


  /**
   * Get timeZone
   * @return timeZone
   */
  public String getTimeZone() {
    return timeZone;
  }

  /**
   * Set timeZone
   *
   * @param timeZone
   */
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  /**
   * Labels for CustomData fields
   * @return customDataFieldLabels
   */
  public AnalyticsLicenseCustomDataFieldLabels getCustomDataFieldLabels() {
    return customDataFieldLabels;
  }

  /**
   * Labels for CustomData fields
   *
   * @param customDataFieldLabels
   *        Labels for CustomData fields
   */
  public void setCustomDataFieldLabels(AnalyticsLicenseCustomDataFieldLabels customDataFieldLabels) {
    this.customDataFieldLabels = customDataFieldLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsLicenseUpdateRequest analyticsLicenseUpdateRequest = (AnalyticsLicenseUpdateRequest) o;
    return Objects.equals(this.name, analyticsLicenseUpdateRequest.name) &&
        Objects.equals(this.ignoreDNT, analyticsLicenseUpdateRequest.ignoreDNT) &&
        Objects.equals(this.timeZone, analyticsLicenseUpdateRequest.timeZone) &&
        Objects.equals(this.customDataFieldLabels, analyticsLicenseUpdateRequest.customDataFieldLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, ignoreDNT, timeZone, customDataFieldLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsLicenseUpdateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ignoreDNT: ").append(toIndentedString(ignoreDNT)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    customDataFieldLabels: ").append(toIndentedString(customDataFieldLabels)).append("\n");
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


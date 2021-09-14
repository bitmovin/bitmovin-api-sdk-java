package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsLicenseErrorDetailsConfig;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsLicenseFeatures
 */

public class AnalyticsLicenseFeatures {
  @JsonProperty("errorDetails")
  private AnalyticsLicenseErrorDetailsConfig errorDetails;


  /**
   * Get errorDetails
   * @return errorDetails
   */
  public AnalyticsLicenseErrorDetailsConfig getErrorDetails() {
    return errorDetails;
  }

  /**
   * Set errorDetails
   *
   * @param errorDetails
   */
  public void setErrorDetails(AnalyticsLicenseErrorDetailsConfig errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsLicenseFeatures analyticsLicenseFeatures = (AnalyticsLicenseFeatures) o;
    return Objects.equals(this.errorDetails, analyticsLicenseFeatures.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsLicenseFeatures {\n");
    
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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


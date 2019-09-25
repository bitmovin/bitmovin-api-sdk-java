package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsInsightsOrganizationSettingsRequest
 */

public class AnalyticsInsightsOrganizationSettingsRequest {
  @JsonProperty("includeInInsights")
  private Boolean includeInInsights;


  /**
   * Whether the organization&#39;s data is being contributed to industry insights
   * @return includeInInsights
   */
  public Boolean getIncludeInInsights() {
    return includeInInsights;
  }

  /**
   * Whether the organization&#39;s data is being contributed to industry insights
   *
   * @param includeInInsights
   *        Whether the organization&#39;s data is being contributed to industry insights
   */
  public void setIncludeInInsights(Boolean includeInInsights) {
    this.includeInInsights = includeInInsights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsInsightsOrganizationSettingsRequest analyticsInsightsOrganizationSettingsRequest = (AnalyticsInsightsOrganizationSettingsRequest) o;
    return Objects.equals(this.includeInInsights, analyticsInsightsOrganizationSettingsRequest.includeInInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeInInsights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsInsightsOrganizationSettingsRequest {\n");
    
    sb.append("    includeInInsights: ").append(toIndentedString(includeInInsights)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsInsightsOrganizationSettings
 */

public class AnalyticsInsightsOrganizationSettings {
  @JsonProperty("orgId")
  private String orgId;

  @JsonProperty("includeInInsights")
  private Boolean includeInInsights;

  @JsonProperty("industry")
  private String industry;

  @JsonProperty("subIndustry")
  private String subIndustry;

  @JsonProperty("isTrial")
  private Boolean isTrial;


  /**
   * Organization ID
   * @return orgId
   */
  public String getOrgId() {
    return orgId;
  }

  /**
   * Organization ID
   *
   * @param orgId
   *        Organization ID
   */
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  /**
   * Whether the organization&#39;s data is included in the industry insights
   * @return includeInInsights
   */
  public Boolean getIncludeInInsights() {
    return includeInInsights;
  }

  /**
   * Whether the organization&#39;s data is included in the industry insights
   *
   * @param includeInInsights
   *        Whether the organization&#39;s data is included in the industry insights
   */
  public void setIncludeInInsights(Boolean includeInInsights) {
    this.includeInInsights = includeInInsights;
  }


  /**
   * Industry of the organization
   * @return industry
   */
  public String getIndustry() {
    return industry;
  }

  /**
   * Industry of the organization
   *
   * @param industry
   *        Industry of the organization
   */
  public void setIndustry(String industry) {
    this.industry = industry;
  }


  /**
   * Subindustry of the organization
   * @return subIndustry
   */
  public String getSubIndustry() {
    return subIndustry;
  }

  /**
   * Subindustry of the organization
   *
   * @param subIndustry
   *        Subindustry of the organization
   */
  public void setSubIndustry(String subIndustry) {
    this.subIndustry = subIndustry;
  }


  /**
   * Whether the organization is on an analytics trial plan
   * @return isTrial
   */
  public Boolean getIsTrial() {
    return isTrial;
  }

  /**
   * Whether the organization is on an analytics trial plan
   *
   * @param isTrial
   *        Whether the organization is on an analytics trial plan
   */
  public void setIsTrial(Boolean isTrial) {
    this.isTrial = isTrial;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsInsightsOrganizationSettings analyticsInsightsOrganizationSettings = (AnalyticsInsightsOrganizationSettings) o;
    return Objects.equals(this.orgId, analyticsInsightsOrganizationSettings.orgId) &&
        Objects.equals(this.includeInInsights, analyticsInsightsOrganizationSettings.includeInInsights) &&
        Objects.equals(this.industry, analyticsInsightsOrganizationSettings.industry) &&
        Objects.equals(this.subIndustry, analyticsInsightsOrganizationSettings.subIndustry) &&
        Objects.equals(this.isTrial, analyticsInsightsOrganizationSettings.isTrial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, includeInInsights, industry, subIndustry, isTrial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsInsightsOrganizationSettings {\n");
    
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    includeInInsights: ").append(toIndentedString(includeInInsights)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    subIndustry: ").append(toIndentedString(subIndustry)).append("\n");
    sb.append("    isTrial: ").append(toIndentedString(isTrial)).append("\n");
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


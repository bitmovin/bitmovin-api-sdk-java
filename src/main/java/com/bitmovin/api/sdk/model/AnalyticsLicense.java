package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsLicenseCustomDataFieldLabels;
import com.bitmovin.api.sdk.model.AnalyticsLicenseDomain;
import com.bitmovin.api.sdk.model.AnalyticsLicenseFeatures;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsLicense
 */

public class AnalyticsLicense {
  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("customData")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private Map<String, Object> customData = new HashMap<String, Object>();

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("name")
  private String name;

  @JsonProperty("industry")
  private String industry;

  @JsonProperty("subIndustry")
  private String subIndustry;

  @JsonProperty("ignoreDNT")
  private Boolean ignoreDNT;

  @JsonProperty("impressions")
  private Long impressions;

  @JsonProperty("maxImpressions")
  private Long maxImpressions;

  @JsonProperty("timeZone")
  private String timeZone;

  @JsonProperty("retentionTime")
  private String retentionTime;

  @JsonProperty("compressedRetentionTime")
  private String compressedRetentionTime;

  @JsonProperty("domains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsLicenseDomain> domains = new ArrayList<AnalyticsLicenseDomain>();

  @JsonProperty("playerDomains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> playerDomains = new ArrayList<String>();

  @JsonProperty("includeInInsights")
  private Boolean includeInInsights;

  @JsonProperty("customDataFieldLabels")
  private AnalyticsLicenseCustomDataFieldLabels customDataFieldLabels;

  @JsonProperty("customDataFieldsCount")
  private Integer customDataFieldsCount;

  @JsonProperty("orderIndex")
  private Integer orderIndex;

  @JsonProperty("rateLimit")
  private String rateLimit;

  @JsonProperty("features")
  private AnalyticsLicenseFeatures features;

  @JsonProperty("planExpiredAt")
  private Date planExpiredAt;

  /**
   * Id of the Analytics License
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Creation date of the Analytics License, returned as ISO 8601 date-time format
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * User-specific meta data. This can hold anything.
   * @return customData
   */
  public Map<String, Object> getCustomData() {
    return customData;
  }

  /**
   * License Key
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }


  /**
   * Name of the Analytics License
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the Analytics License
   *
   * @param name
   *        Name of the Analytics License
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The industry of the organization associated with the Analytics License
   * @return industry
   */
  public String getIndustry() {
    return industry;
  }

  /**
   * The subindustry of the organization associated with the Analytics License
   * @return subIndustry
   */
  public String getSubIndustry() {
    return subIndustry;
  }


  /**
   * Whether the Do Not Track request from the browser should be ignored
   * @return ignoreDNT
   */
  public Boolean getIgnoreDNT() {
    return ignoreDNT;
  }

  /**
   * Whether the Do Not Track request from the browser should be ignored
   *
   * @param ignoreDNT
   *        Whether the Do Not Track request from the browser should be ignored
   */
  public void setIgnoreDNT(Boolean ignoreDNT) {
    this.ignoreDNT = ignoreDNT;
  }

  /**
   * Number of impressions recorded
   * @return impressions
   */
  public Long getImpressions() {
    return impressions;
  }

  /**
   * Maximum number of impressions
   * @return maxImpressions
   */
  public Long getMaxImpressions() {
    return maxImpressions;
  }


  /**
   * The timezone of the Analytics License
   * @return timeZone
   */
  public String getTimeZone() {
    return timeZone;
  }

  /**
   * The timezone of the Analytics License
   *
   * @param timeZone
   *        The timezone of the Analytics License
   */
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   * Retention time of impressions, returned as ISO 8601 duration format: P(n)Y(n)M(n)DT(n)H(n)M(n)S
   * @return retentionTime
   */
  public String getRetentionTime() {
    return retentionTime;
  }

  /**
   * Retention time for compressed data, returned as ISO 8601 duration format: P(n)Y(n)M(n)DT(n)H(n)M(n)S
   * @return compressedRetentionTime
   */
  public String getCompressedRetentionTime() {
    return compressedRetentionTime;
  }

  /**
   * Whitelisted domains
   * @return domains
   */
  public List<AnalyticsLicenseDomain> getDomains() {
    return domains;
  }

  /**
   * Allowlisted player domains
   * @return playerDomains
   */
  public List<String> getPlayerDomains() {
    return playerDomains;
  }

  /**
   * Whether the data of this license should be included in the industry insights or not
   * @return includeInInsights
   */
  public Boolean getIncludeInInsights() {
    return includeInInsights;
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

  /**
   * The number of customData fields available
   * @return customDataFieldsCount
   */
  public Integer getCustomDataFieldsCount() {
    return customDataFieldsCount;
  }

  /**
   * Order index of license
   * @return orderIndex
   */
  public Integer getOrderIndex() {
    return orderIndex;
  }


  /**
   * The rate limit of this license
   * @return rateLimit
   */
  public String getRateLimit() {
    return rateLimit;
  }

  /**
   * The rate limit of this license
   *
   * @param rateLimit
   *        The rate limit of this license
   */
  public void setRateLimit(String rateLimit) {
    this.rateLimit = rateLimit;
  }


  /**
   * Get features
   * @return features
   */
  public AnalyticsLicenseFeatures getFeatures() {
    return features;
  }

  /**
   * Set features
   *
   * @param features
   */
  public void setFeatures(AnalyticsLicenseFeatures features) {
    this.features = features;
  }

  /**
   * The expiration date of the license if applicable, returned as ISO 8601 date-time format
   * @return planExpiredAt
   */
  public Date getPlanExpiredAt() {
    return planExpiredAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsLicense analyticsLicense = (AnalyticsLicense) o;
    return Objects.equals(this.id, analyticsLicense.id) &&
        Objects.equals(this.createdAt, analyticsLicense.createdAt) &&
        Objects.equals(this.customData, analyticsLicense.customData) &&
        Objects.equals(this.licenseKey, analyticsLicense.licenseKey) &&
        Objects.equals(this.name, analyticsLicense.name) &&
        Objects.equals(this.industry, analyticsLicense.industry) &&
        Objects.equals(this.subIndustry, analyticsLicense.subIndustry) &&
        Objects.equals(this.ignoreDNT, analyticsLicense.ignoreDNT) &&
        Objects.equals(this.impressions, analyticsLicense.impressions) &&
        Objects.equals(this.maxImpressions, analyticsLicense.maxImpressions) &&
        Objects.equals(this.timeZone, analyticsLicense.timeZone) &&
        Objects.equals(this.retentionTime, analyticsLicense.retentionTime) &&
        Objects.equals(this.compressedRetentionTime, analyticsLicense.compressedRetentionTime) &&
        Objects.equals(this.domains, analyticsLicense.domains) &&
        Objects.equals(this.playerDomains, analyticsLicense.playerDomains) &&
        Objects.equals(this.includeInInsights, analyticsLicense.includeInInsights) &&
        Objects.equals(this.customDataFieldLabels, analyticsLicense.customDataFieldLabels) &&
        Objects.equals(this.customDataFieldsCount, analyticsLicense.customDataFieldsCount) &&
        Objects.equals(this.orderIndex, analyticsLicense.orderIndex) &&
        Objects.equals(this.rateLimit, analyticsLicense.rateLimit) &&
        Objects.equals(this.features, analyticsLicense.features) &&
        Objects.equals(this.planExpiredAt, analyticsLicense.planExpiredAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, customData, licenseKey, name, industry, subIndustry, ignoreDNT, impressions, maxImpressions, timeZone, retentionTime, compressedRetentionTime, domains, playerDomains, includeInInsights, customDataFieldLabels, customDataFieldsCount, orderIndex, rateLimit, features, planExpiredAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsLicense {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    subIndustry: ").append(toIndentedString(subIndustry)).append("\n");
    sb.append("    ignoreDNT: ").append(toIndentedString(ignoreDNT)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    maxImpressions: ").append(toIndentedString(maxImpressions)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    retentionTime: ").append(toIndentedString(retentionTime)).append("\n");
    sb.append("    compressedRetentionTime: ").append(toIndentedString(compressedRetentionTime)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    playerDomains: ").append(toIndentedString(playerDomains)).append("\n");
    sb.append("    includeInInsights: ").append(toIndentedString(includeInInsights)).append("\n");
    sb.append("    customDataFieldLabels: ").append(toIndentedString(customDataFieldLabels)).append("\n");
    sb.append("    customDataFieldsCount: ").append(toIndentedString(customDataFieldsCount)).append("\n");
    sb.append("    orderIndex: ").append(toIndentedString(orderIndex)).append("\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    planExpiredAt: ").append(toIndentedString(planExpiredAt)).append("\n");
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


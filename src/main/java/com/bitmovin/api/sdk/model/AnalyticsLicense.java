package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsLicenseCustomDataFieldLabels;
import com.bitmovin.api.sdk.model.AnalyticsLicenseDomain;
import com.bitmovin.api.sdk.model.AnalyticsLicenseFeatures;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsLicense
 */

public class AnalyticsLicense extends BitmovinResponse {
  @JsonProperty("name")
  private String name;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("maxImpressions")
  private Long maxImpressions;

  @JsonProperty("impressions")
  private Long impressions;

  @JsonProperty("domains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsLicenseDomain> domains = new ArrayList<AnalyticsLicenseDomain>();

  @JsonProperty("ignoreDNT")
  private Boolean ignoreDNT;

  @JsonProperty("timeZone")
  private String timeZone;

  @JsonProperty("customDataFieldLabels")
  private AnalyticsLicenseCustomDataFieldLabels customDataFieldLabels;

  @JsonProperty("features")
  private AnalyticsLicenseFeatures features;


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
   * License Key
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * Creation date of the Analytics License in UTC format
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Maximum number of impressions
   * @return maxImpressions
   */
  public Long getMaxImpressions() {
    return maxImpressions;
  }

  /**
   * Number of impressions recorded
   * @return impressions
   */
  public Long getImpressions() {
    return impressions;
  }

  /**
   * Whitelisted domains
   * @return domains
   */
  public List<AnalyticsLicenseDomain> getDomains() {
    return domains;
  }

  /**
   * Whether the Do Not Track request from the browser should be ignored
   * @return ignoreDNT
   */
  public Boolean getIgnoreDNT() {
    return ignoreDNT;
  }

  /**
   * The timezone of the Analytics License
   * @return timeZone
   */
  public String getTimeZone() {
    return timeZone;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsLicense analyticsLicense = (AnalyticsLicense) o;
    return Objects.equals(this.name, analyticsLicense.name) &&
        Objects.equals(this.licenseKey, analyticsLicense.licenseKey) &&
        Objects.equals(this.createdAt, analyticsLicense.createdAt) &&
        Objects.equals(this.maxImpressions, analyticsLicense.maxImpressions) &&
        Objects.equals(this.impressions, analyticsLicense.impressions) &&
        Objects.equals(this.domains, analyticsLicense.domains) &&
        Objects.equals(this.ignoreDNT, analyticsLicense.ignoreDNT) &&
        Objects.equals(this.timeZone, analyticsLicense.timeZone) &&
        Objects.equals(this.customDataFieldLabels, analyticsLicense.customDataFieldLabels) &&
        Objects.equals(this.features, analyticsLicense.features) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, licenseKey, createdAt, maxImpressions, impressions, domains, ignoreDNT, timeZone, customDataFieldLabels, features, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsLicense {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    maxImpressions: ").append(toIndentedString(maxImpressions)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    ignoreDNT: ").append(toIndentedString(ignoreDNT)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    customDataFieldLabels: ").append(toIndentedString(customDataFieldLabels)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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


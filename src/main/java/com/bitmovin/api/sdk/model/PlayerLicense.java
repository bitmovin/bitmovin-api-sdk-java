package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.Domain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PlayerLicense
 */

public class PlayerLicense extends BitmovinResponse {
  @JsonProperty("name")
  private String name;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("impressions")
  private Integer impressions;

  @JsonProperty("maxImpressions")
  private Integer maxImpressions;

  @JsonProperty("thirdPartyLicensingEnabled")
  private Boolean thirdPartyLicensingEnabled;

  @JsonProperty("domains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Domain> domains = new ArrayList<Domain>();

  @JsonProperty("analyticsKey")
  private String analyticsKey;


  /**
   * Name of the resource (required)
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the resource (required)
   *
   * @param name
   *        Name of the resource (required)
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * License Key (required)
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * Number of impressions recorded (required)
   * @return impressions
   */
  public Integer getImpressions() {
    return impressions;
  }

  /**
   * Maximum number of impressions (required)
   * @return maxImpressions
   */
  public Integer getMaxImpressions() {
    return maxImpressions;
  }

  /**
   * Flag if third party licensing is enabled (required)
   * @return thirdPartyLicensingEnabled
   */
  public Boolean getThirdPartyLicensingEnabled() {
    return thirdPartyLicensingEnabled;
  }

  /**
   * Whitelisted domains (required)
   * @return domains
   */
  public List<Domain> getDomains() {
    return domains;
  }

  /**
   * Analytics License Key
   * @return analyticsKey
   */
  public String getAnalyticsKey() {
    return analyticsKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerLicense playerLicense = (PlayerLicense) o;
    return Objects.equals(this.name, playerLicense.name) &&
        Objects.equals(this.createdAt, playerLicense.createdAt) &&
        Objects.equals(this.licenseKey, playerLicense.licenseKey) &&
        Objects.equals(this.impressions, playerLicense.impressions) &&
        Objects.equals(this.maxImpressions, playerLicense.maxImpressions) &&
        Objects.equals(this.thirdPartyLicensingEnabled, playerLicense.thirdPartyLicensingEnabled) &&
        Objects.equals(this.domains, playerLicense.domains) &&
        Objects.equals(this.analyticsKey, playerLicense.analyticsKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, createdAt, licenseKey, impressions, maxImpressions, thirdPartyLicensingEnabled, domains, analyticsKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerLicense {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
    sb.append("    maxImpressions: ").append(toIndentedString(maxImpressions)).append("\n");
    sb.append("    thirdPartyLicensingEnabled: ").append(toIndentedString(thirdPartyLicensingEnabled)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    analyticsKey: ").append(toIndentedString(analyticsKey)).append("\n");
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


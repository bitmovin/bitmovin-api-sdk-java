package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsVirtualLicenseLicensesListItem
 */

public class AnalyticsVirtualLicenseLicensesListItem {
  @JsonProperty("id")
  private String id;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("orgId")
  private String orgId;

  @JsonProperty("name")
  private String name;

  /**
   * Analytics License Id
   * @return id
   */
  public String getId() {
    return id;
  }


  /**
   * Analytics License key
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * Analytics License key
   *
   * @param licenseKey
   *        Analytics License key
   */
  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }


  /**
   * Organisation Id of license
   * @return orgId
   */
  public String getOrgId() {
    return orgId;
  }

  /**
   * Organisation Id of license
   *
   * @param orgId
   *        Organisation Id of license
   */
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  /**
   * Analytics License name
   * @return name
   */
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsVirtualLicenseLicensesListItem analyticsVirtualLicenseLicensesListItem = (AnalyticsVirtualLicenseLicensesListItem) o;
    return Objects.equals(this.id, analyticsVirtualLicenseLicensesListItem.id) &&
        Objects.equals(this.licenseKey, analyticsVirtualLicenseLicensesListItem.licenseKey) &&
        Objects.equals(this.orgId, analyticsVirtualLicenseLicensesListItem.orgId) &&
        Objects.equals(this.name, analyticsVirtualLicenseLicensesListItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, licenseKey, orgId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsVirtualLicenseLicensesListItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


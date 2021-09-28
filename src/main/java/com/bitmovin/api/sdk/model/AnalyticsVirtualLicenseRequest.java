package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsVirtualLicenseLicensesListItem;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsVirtualLicenseRequest
 */

public class AnalyticsVirtualLicenseRequest {
  @JsonProperty("name")
  private String name;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("licenses")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsVirtualLicenseLicensesListItem> licenses = new ArrayList<AnalyticsVirtualLicenseLicensesListItem>();


  /**
   * Name of the Analytics Virtual License (required)
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the Analytics Virtual License (required)
   *
   * @param name
   *        Name of the Analytics Virtual License (required)
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The timezone of the Analytics Virtual License (required)
   * @return timezone
   */
  public String getTimezone() {
    return timezone;
  }

  /**
   * The timezone of the Analytics Virtual License (required)
   *
   * @param timezone
   *        The timezone of the Analytics Virtual License (required)
   */
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public AnalyticsVirtualLicenseRequest addLicensesItem(AnalyticsVirtualLicenseLicensesListItem licensesItem) {
    this.licenses.add(licensesItem);
    return this;
  }

  /**
   * List of Analytics Licenses (required)
   * @return licenses
   */
  public List<AnalyticsVirtualLicenseLicensesListItem> getLicenses() {
    return licenses;
  }

  /**
   * List of Analytics Licenses (required)
   *
   * @param licenses
   *        List of Analytics Licenses (required)
   */
  public void setLicenses(List<AnalyticsVirtualLicenseLicensesListItem> licenses) {
    this.licenses = licenses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsVirtualLicenseRequest analyticsVirtualLicenseRequest = (AnalyticsVirtualLicenseRequest) o;
    return Objects.equals(this.name, analyticsVirtualLicenseRequest.name) &&
        Objects.equals(this.timezone, analyticsVirtualLicenseRequest.timezone) &&
        Objects.equals(this.licenses, analyticsVirtualLicenseRequest.licenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timezone, licenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsVirtualLicenseRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    licenses: ").append(toIndentedString(licenses)).append("\n");
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


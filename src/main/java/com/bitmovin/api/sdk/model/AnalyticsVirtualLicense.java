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
 * AnalyticsVirtualLicense
 */

public class AnalyticsVirtualLicense {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("licenses")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsVirtualLicenseLicensesListItem> licenses = new ArrayList<AnalyticsVirtualLicenseLicensesListItem>();

  /**
   * Analytics Virtual License Key/Id
   * @return id
   */
  public String getId() {
    return id;
  }


  /**
   * Name of the Analytics Virtual License
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the Analytics Virtual License
   *
   * @param name
   *        Name of the Analytics Virtual License
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The timezone of the Analytics Virtual License
   * @return timezone
   */
  public String getTimezone() {
    return timezone;
  }

  /**
   * The timezone of the Analytics Virtual License
   *
   * @param timezone
   *        The timezone of the Analytics Virtual License
   */
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public AnalyticsVirtualLicense addLicensesItem(AnalyticsVirtualLicenseLicensesListItem licensesItem) {
    this.licenses.add(licensesItem);
    return this;
  }

  /**
   * List of Analytics Licenses
   * @return licenses
   */
  public List<AnalyticsVirtualLicenseLicensesListItem> getLicenses() {
    return licenses;
  }

  /**
   * List of Analytics Licenses
   *
   * @param licenses
   *        List of Analytics Licenses
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
    AnalyticsVirtualLicense analyticsVirtualLicense = (AnalyticsVirtualLicense) o;
    return Objects.equals(this.id, analyticsVirtualLicense.id) &&
        Objects.equals(this.name, analyticsVirtualLicense.name) &&
        Objects.equals(this.timezone, analyticsVirtualLicense.timezone) &&
        Objects.equals(this.licenses, analyticsVirtualLicense.licenses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, timezone, licenses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsVirtualLicense {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


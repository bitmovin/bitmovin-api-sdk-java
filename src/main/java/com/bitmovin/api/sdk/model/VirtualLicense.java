package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.VirtualLicenseLicensesListItem;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * VirtualLicense
 */

public class VirtualLicense extends BitmovinResponse {
  @JsonProperty("name")
  private String name;

  @JsonProperty("timezone")
  private String timezone;

  @JsonProperty("licenses")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<VirtualLicenseLicensesListItem> licenses = new ArrayList<VirtualLicenseLicensesListItem>();


  /**
   * Name of the Virtual License
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the Virtual License
   *
   * @param name
   *        Name of the Virtual License
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The timezone of the Virtual License
   * @return timezone
   */
  public String getTimezone() {
    return timezone;
  }

  /**
   * The timezone of the Virtual License
   *
   * @param timezone
   *        The timezone of the Virtual License
   */
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public VirtualLicense addLicensesItem(VirtualLicenseLicensesListItem licensesItem) {
    this.licenses.add(licensesItem);
    return this;
  }

  /**
   * List of Analytics Licenses
   * @return licenses
   */
  public List<VirtualLicenseLicensesListItem> getLicenses() {
    return licenses;
  }

  /**
   * List of Analytics Licenses
   *
   * @param licenses
   *        List of Analytics Licenses
   */
  public void setLicenses(List<VirtualLicenseLicensesListItem> licenses) {
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
    VirtualLicense virtualLicense = (VirtualLicense) o;
    return Objects.equals(this.name, virtualLicense.name) &&
        Objects.equals(this.timezone, virtualLicense.timezone) &&
        Objects.equals(this.licenses, virtualLicense.licenses) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timezone, licenses, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualLicense {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


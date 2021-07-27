package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AzureCloudRegion;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AzureAccountRegionSettings
 */

public class AzureAccountRegionSettings extends BitmovinResource {
  @JsonProperty("networkName")
  private String networkName;

  @JsonProperty("subnetName")
  private String subnetName;

  @JsonProperty("region")
  private AzureCloudRegion region;


  /**
   * Name of the virtual network (required)
   * @return networkName
   */
  public String getNetworkName() {
    return networkName;
  }

  /**
   * Name of the virtual network (required)
   *
   * @param networkName
   *        Name of the virtual network (required)
   */
  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  /**
   * Name of the subnet (required)
   * @return subnetName
   */
  public String getSubnetName() {
    return subnetName;
  }

  /**
   * Name of the subnet (required)
   *
   * @param subnetName
   *        Name of the subnet (required)
   */
  public void setSubnetName(String subnetName) {
    this.subnetName = subnetName;
  }

  /**
   * Get region
   * @return region
   */
  public AzureCloudRegion getRegion() {
    return region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccountRegionSettings azureAccountRegionSettings = (AzureAccountRegionSettings) o;
    return Objects.equals(this.networkName, azureAccountRegionSettings.networkName) &&
        Objects.equals(this.subnetName, azureAccountRegionSettings.subnetName) &&
        Objects.equals(this.region, azureAccountRegionSettings.region) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkName, subnetName, region, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccountRegionSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    subnetName: ").append(toIndentedString(subnetName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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


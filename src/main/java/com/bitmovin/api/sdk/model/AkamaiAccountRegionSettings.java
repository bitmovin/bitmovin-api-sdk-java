package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AkamaiCloudRegion;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AkamaiAccountRegionSettings
 */

public class AkamaiAccountRegionSettings extends BitmovinResource {
  @JsonProperty("subnetId")
  private Long subnetId;

  @JsonProperty("firewallId")
  private Long firewallId;

  @JsonProperty("region")
  private AkamaiCloudRegion region;


  /**
   * Id of the VPC subnet for encoding instances (required)
   * @return subnetId
   */
  public Long getSubnetId() {
    return subnetId;
  }

  /**
   * Id of the VPC subnet for encoding instances (required)
   *
   * @param subnetId
   *        Id of the VPC subnet for encoding instances (required)
   */
  public void setSubnetId(Long subnetId) {
    this.subnetId = subnetId;
  }


  /**
   * Id of the firewall for encoding instances (required)
   * @return firewallId
   */
  public Long getFirewallId() {
    return firewallId;
  }

  /**
   * Id of the firewall for encoding instances (required)
   *
   * @param firewallId
   *        Id of the firewall for encoding instances (required)
   */
  public void setFirewallId(Long firewallId) {
    this.firewallId = firewallId;
  }

  /**
   * Get region
   * @return region
   */
  public AkamaiCloudRegion getRegion() {
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
    AkamaiAccountRegionSettings akamaiAccountRegionSettings = (AkamaiAccountRegionSettings) o;
    return Objects.equals(this.subnetId, akamaiAccountRegionSettings.subnetId) &&
        Objects.equals(this.firewallId, akamaiAccountRegionSettings.firewallId) &&
        Objects.equals(this.region, akamaiAccountRegionSettings.region) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, firewallId, region, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AkamaiAccountRegionSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    firewallId: ").append(toIndentedString(firewallId)).append("\n");
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


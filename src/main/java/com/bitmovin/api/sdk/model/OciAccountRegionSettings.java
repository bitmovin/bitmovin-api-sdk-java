package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.OciCloudRegion;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * OciAccountRegionSettings
 */

public class OciAccountRegionSettings extends BitmovinResource {
  @JsonProperty("subnetId")
  private String subnetId;

  @JsonProperty("region")
  private OciCloudRegion region;


  /**
   * Id of the VPC subnet for encoding instances. (required)
   * @return subnetId
   */
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Id of the VPC subnet for encoding instances. (required)
   *
   * @param subnetId
   *        Id of the VPC subnet for encoding instances. (required)
   */
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }

  /**
   * Region for encoding instances.
   * @return region
   */
  public OciCloudRegion getRegion() {
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
    OciAccountRegionSettings ociAccountRegionSettings = (OciAccountRegionSettings) o;
    return Objects.equals(this.subnetId, ociAccountRegionSettings.subnetId) &&
        Objects.equals(this.region, ociAccountRegionSettings.region) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subnetId, region, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OciAccountRegionSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * GceAccountRegionSettings
 */

public class GceAccountRegionSettings extends BitmovinResource {
  @JsonProperty("network")
  private String network;

  @JsonProperty("subnetId")
  private String subnetId;


  /**
   * Id of the network for encoding instances (required)
   * @return network
   */
  public String getNetwork() {
    return network;
  }

  /**
   * Id of the network for encoding instances (required)
   *
   * @param network
   *        Id of the network for encoding instances (required)
   */
  public void setNetwork(String network) {
    this.network = network;
  }


  /**
   * Id of the subnet for encoding instances (required)
   * @return subnetId
   */
  public String getSubnetId() {
    return subnetId;
  }

  /**
   * Id of the subnet for encoding instances (required)
   *
   * @param subnetId
   *        Id of the subnet for encoding instances (required)
   */
  public void setSubnetId(String subnetId) {
    this.subnetId = subnetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GceAccountRegionSettings gceAccountRegionSettings = (GceAccountRegionSettings) o;
    return Objects.equals(this.network, gceAccountRegionSettings.network) &&
        Objects.equals(this.subnetId, gceAccountRegionSettings.subnetId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, subnetId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GceAccountRegionSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
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


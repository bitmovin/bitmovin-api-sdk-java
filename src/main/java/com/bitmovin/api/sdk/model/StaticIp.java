package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.CloudRegion;
import com.bitmovin.api.sdk.model.StaticIpStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StaticIp
 */

public class StaticIp extends BitmovinResponse {
  @JsonProperty("ipAddress")
  private String ipAddress;

  @JsonProperty("infrastructureId")
  private String infrastructureId;

  @JsonProperty("status")
  private StaticIpStatus status;

  @JsonProperty("region")
  private CloudRegion region;

  /**
   * The IPv4 address of the static ip
   * @return ipAddress
   */
  public String getIpAddress() {
    return ipAddress;
  }


  /**
   * Required if the static IP should be created for an AWS infrastructure account.
   * @return infrastructureId
   */
  public String getInfrastructureId() {
    return infrastructureId;
  }

  /**
   * Required if the static IP should be created for an AWS infrastructure account.
   *
   * @param infrastructureId
   *        Required if the static IP should be created for an AWS infrastructure account.
   */
  public void setInfrastructureId(String infrastructureId) {
    this.infrastructureId = infrastructureId;
  }

  /**
   * Status of the Static Ip
   * @return status
   */
  public StaticIpStatus getStatus() {
    return status;
  }


  /**
   * The region of the static Ip (required)
   * @return region
   */
  public CloudRegion getRegion() {
    return region;
  }

  /**
   * The region of the static Ip (required)
   *
   * @param region
   *        The region of the static Ip (required)
   */
  public void setRegion(CloudRegion region) {
    this.region = region;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticIp staticIp = (StaticIp) o;
    return Objects.equals(this.ipAddress, staticIp.ipAddress) &&
        Objects.equals(this.infrastructureId, staticIp.infrastructureId) &&
        Objects.equals(this.status, staticIp.status) &&
        Objects.equals(this.region, staticIp.region) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, infrastructureId, status, region, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticIp {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    infrastructureId: ").append(toIndentedString(infrastructureId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


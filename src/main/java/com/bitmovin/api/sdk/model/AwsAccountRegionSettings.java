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
 * AwsAccountRegionSettings
 */

public class AwsAccountRegionSettings extends BitmovinResource {
  @JsonProperty("limitParallelEncodings")
  private Long limitParallelEncodings;

  @JsonProperty("securityGroupId")
  private String securityGroupId;

  @JsonProperty("subnetId")
  private String subnetId;

  @JsonProperty("sshPort")
  private Integer sshPort;


  /**
   * Limit for the amount of running encodings at a time. Leave empty for no limit.
   * @return limitParallelEncodings
   */
  public Long getLimitParallelEncodings() {
    return limitParallelEncodings;
  }

  /**
   * Limit for the amount of running encodings at a time. Leave empty for no limit.
   *
   * @param limitParallelEncodings
   *        Limit for the amount of running encodings at a time. Leave empty for no limit.
   */
  public void setLimitParallelEncodings(Long limitParallelEncodings) {
    this.limitParallelEncodings = limitParallelEncodings;
  }


  /**
   * Id of the security group for encoding instances (required)
   * @return securityGroupId
   */
  public String getSecurityGroupId() {
    return securityGroupId;
  }

  /**
   * Id of the security group for encoding instances (required)
   *
   * @param securityGroupId
   *        Id of the security group for encoding instances (required)
   */
  public void setSecurityGroupId(String securityGroupId) {
    this.securityGroupId = securityGroupId;
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


  /**
   * Custom SSH port. Valid values: 1 - 65535. Leave empty if the default SSH port 22 is OK.
   * minimum: 1
   * maximum: 65535
   * @return sshPort
   */
  public Integer getSshPort() {
    return sshPort;
  }

  /**
   * Custom SSH port. Valid values: 1 - 65535. Leave empty if the default SSH port 22 is OK.
   * minimum: 1
   * maximum: 65535
   *
   * @param sshPort
   *        Custom SSH port. Valid values: 1 - 65535. Leave empty if the default SSH port 22 is OK.
   * minimum: 1
   * maximum: 65535
   */
  public void setSshPort(Integer sshPort) {
    this.sshPort = sshPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsAccountRegionSettings awsAccountRegionSettings = (AwsAccountRegionSettings) o;
    return Objects.equals(this.limitParallelEncodings, awsAccountRegionSettings.limitParallelEncodings) &&
        Objects.equals(this.securityGroupId, awsAccountRegionSettings.securityGroupId) &&
        Objects.equals(this.subnetId, awsAccountRegionSettings.subnetId) &&
        Objects.equals(this.sshPort, awsAccountRegionSettings.sshPort) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitParallelEncodings, securityGroupId, subnetId, sshPort, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAccountRegionSettings {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    limitParallelEncodings: ").append(toIndentedString(limitParallelEncodings)).append("\n");
    sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
    sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
    sb.append("    sshPort: ").append(toIndentedString(sshPort)).append("\n");
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


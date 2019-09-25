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
 * GceAccount
 */

public class GceAccount extends BitmovinResource {
  @JsonProperty("serviceAccountEmail")
  private String serviceAccountEmail;

  @JsonProperty("privateKey")
  private String privateKey;

  @JsonProperty("projectId")
  private String projectId;


  /**
   * Email address of the Google service account that will be used to spin up VMs (required)
   * @return serviceAccountEmail
   */
  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * Email address of the Google service account that will be used to spin up VMs (required)
   *
   * @param serviceAccountEmail
   *        Email address of the Google service account that will be used to spin up VMs (required)
   */
  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }


  /**
   * Google private key of the Google service account that will be used to spin up VMs (required)
   * @return privateKey
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * Google private key of the Google service account that will be used to spin up VMs (required)
   *
   * @param privateKey
   *        Google private key of the Google service account that will be used to spin up VMs (required)
   */
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  /**
   * ID of the GCP project in which the VMs are supposed to run. (required)
   * @return projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * ID of the GCP project in which the VMs are supposed to run. (required)
   *
   * @param projectId
   *        ID of the GCP project in which the VMs are supposed to run. (required)
   */
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GceAccount gceAccount = (GceAccount) o;
    return Objects.equals(this.serviceAccountEmail, gceAccount.serviceAccountEmail) &&
        Objects.equals(this.privateKey, gceAccount.privateKey) &&
        Objects.equals(this.projectId, gceAccount.projectId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountEmail, privateKey, projectId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GceAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceAccountEmail: ").append(toIndentedString(serviceAccountEmail)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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


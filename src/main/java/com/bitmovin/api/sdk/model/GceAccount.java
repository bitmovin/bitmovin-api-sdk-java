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
 * GCE Cloud Connect Account. Configure either by passing a single service account credentials JSON string or by passing the service account email, private key and project ID individually. 
 */

public class GceAccount extends BitmovinResource {
  @JsonProperty("serviceAccountCredentials")
  private String serviceAccountCredentials;

  @JsonProperty("serviceAccountEmail")
  private String serviceAccountEmail;

  @JsonProperty("privateKey")
  private String privateKey;

  @JsonProperty("projectId")
  private String projectId;


  /**
   * GCP service account credentials JSON
   * @return serviceAccountCredentials
   */
  public String getServiceAccountCredentials() {
    return serviceAccountCredentials;
  }

  /**
   * GCP service account credentials JSON
   *
   * @param serviceAccountCredentials
   *        GCP service account credentials JSON
   */
  public void setServiceAccountCredentials(String serviceAccountCredentials) {
    this.serviceAccountCredentials = serviceAccountCredentials;
  }


  /**
   * Email address of the Google service account that will be used to spin up VMs
   * @return serviceAccountEmail
   */
  public String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * Email address of the Google service account that will be used to spin up VMs
   *
   * @param serviceAccountEmail
   *        Email address of the Google service account that will be used to spin up VMs
   */
  public void setServiceAccountEmail(String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
  }


  /**
   * Google private key of the Google service account that will be used to spin up VMs
   * @return privateKey
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * Google private key of the Google service account that will be used to spin up VMs
   *
   * @param privateKey
   *        Google private key of the Google service account that will be used to spin up VMs
   */
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  /**
   * ID of the GCP project in which the VMs are supposed to run.
   * @return projectId
   */
  public String getProjectId() {
    return projectId;
  }

  /**
   * ID of the GCP project in which the VMs are supposed to run.
   *
   * @param projectId
   *        ID of the GCP project in which the VMs are supposed to run.
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
    return Objects.equals(this.serviceAccountCredentials, gceAccount.serviceAccountCredentials) &&
        Objects.equals(this.serviceAccountEmail, gceAccount.serviceAccountEmail) &&
        Objects.equals(this.privateKey, gceAccount.privateKey) &&
        Objects.equals(this.projectId, gceAccount.projectId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountCredentials, serviceAccountEmail, privateKey, projectId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GceAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceAccountCredentials: ").append(toIndentedString(serviceAccountCredentials)).append("\n");
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


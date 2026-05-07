package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Azure service principal credentials for Microsoft Entra ID authentication
 */

public class AzureServicePrincipal {
  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("clientId")
  private String clientId;

  @JsonProperty("clientSecret")
  private String clientSecret;

  @JsonProperty("clientCertificate")
  private String clientCertificate;


  /**
   * Tenant ID (Directory ID) of the Azure service principal (required)
   * @return tenantId
   */
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Tenant ID (Directory ID) of the Azure service principal (required)
   *
   * @param tenantId
   *        Tenant ID (Directory ID) of the Azure service principal (required)
   */
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  /**
   * Client ID of the Azure service principal (required)
   * @return clientId
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * Client ID of the Azure service principal (required)
   *
   * @param clientId
   *        Client ID of the Azure service principal (required)
   */
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * Client secret of the Azure service principal
   * @return clientSecret
   */
  public String getClientSecret() {
    return clientSecret;
  }

  /**
   * Client secret of the Azure service principal
   *
   * @param clientSecret
   *        Client secret of the Azure service principal
   */
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  /**
   * PEM-encoded client certificate and private key of the Azure service principal. Newline symbols must be preserved.
   * @return clientCertificate
   */
  public String getClientCertificate() {
    return clientCertificate;
  }

  /**
   * PEM-encoded client certificate and private key of the Azure service principal. Newline symbols must be preserved.
   *
   * @param clientCertificate
   *        PEM-encoded client certificate and private key of the Azure service principal. Newline symbols must be preserved.
   */
  public void setClientCertificate(String clientCertificate) {
    this.clientCertificate = clientCertificate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureServicePrincipal azureServicePrincipal = (AzureServicePrincipal) o;
    return Objects.equals(this.tenantId, azureServicePrincipal.tenantId) &&
        Objects.equals(this.clientId, azureServicePrincipal.clientId) &&
        Objects.equals(this.clientSecret, azureServicePrincipal.clientSecret) &&
        Objects.equals(this.clientCertificate, azureServicePrincipal.clientCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, clientId, clientSecret, clientCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureServicePrincipal {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    clientCertificate: ").append(toIndentedString(clientCertificate)).append("\n");
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


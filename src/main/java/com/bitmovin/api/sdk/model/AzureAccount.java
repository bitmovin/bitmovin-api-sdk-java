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
 * AzureAccount
 */

public class AzureAccount extends BitmovinResource {
  @JsonProperty("subscriptionId")
  private String subscriptionId;

  @JsonProperty("resourceGroupId")
  private String resourceGroupId;

  @JsonProperty("tenantId")
  private String tenantId;


  /**
   * Your Azure Subscription ID (The ID of your subscription where you intend to run the Encoding VMs) (required)
   * @return subscriptionId
   */
  public String getSubscriptionId() {
    return subscriptionId;
  }

  /**
   * Your Azure Subscription ID (The ID of your subscription where you intend to run the Encoding VMs) (required)
   *
   * @param subscriptionId
   *        Your Azure Subscription ID (The ID of your subscription where you intend to run the Encoding VMs) (required)
   */
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  /**
   * The name of the resource group where you intend to run the Encoding VMs (required)
   * @return resourceGroupId
   */
  public String getResourceGroupId() {
    return resourceGroupId;
  }

  /**
   * The name of the resource group where you intend to run the Encoding VMs (required)
   *
   * @param resourceGroupId
   *        The name of the resource group where you intend to run the Encoding VMs (required)
   */
  public void setResourceGroupId(String resourceGroupId) {
    this.resourceGroupId = resourceGroupId;
  }


  /**
   * The ID of your Active Directory where your subscription runs in (required)
   * @return tenantId
   */
  public String getTenantId() {
    return tenantId;
  }

  /**
   * The ID of your Active Directory where your subscription runs in (required)
   *
   * @param tenantId
   *        The ID of your Active Directory where your subscription runs in (required)
   */
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureAccount azureAccount = (AzureAccount) o;
    return Objects.equals(this.subscriptionId, azureAccount.subscriptionId) &&
        Objects.equals(this.resourceGroupId, azureAccount.resourceGroupId) &&
        Objects.equals(this.tenantId, azureAccount.tenantId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, resourceGroupId, tenantId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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


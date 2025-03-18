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
 * OciAccount
 */

public class OciAccount extends BitmovinResource {
  @JsonProperty("tenancyId")
  private String tenancyId;

  @JsonProperty("compartmentId")
  private String compartmentId;


  /**
   * The OCID of the tenancy where you intend to run encoding VMs. (required)
   * @return tenancyId
   */
  public String getTenancyId() {
    return tenancyId;
  }

  /**
   * The OCID of the tenancy where you intend to run encoding VMs. (required)
   *
   * @param tenancyId
   *        The OCID of the tenancy where you intend to run encoding VMs. (required)
   */
  public void setTenancyId(String tenancyId) {
    this.tenancyId = tenancyId;
  }


  /**
   * The OCID of the compartment within the tenancy where you intend to run encoding VMs. (required)
   * @return compartmentId
   */
  public String getCompartmentId() {
    return compartmentId;
  }

  /**
   * The OCID of the compartment within the tenancy where you intend to run encoding VMs. (required)
   *
   * @param compartmentId
   *        The OCID of the compartment within the tenancy where you intend to run encoding VMs. (required)
   */
  public void setCompartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OciAccount ociAccount = (OciAccount) o;
    return Objects.equals(this.tenancyId, ociAccount.tenancyId) &&
        Objects.equals(this.compartmentId, ociAccount.compartmentId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenancyId, compartmentId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OciAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tenancyId: ").append(toIndentedString(tenancyId)).append("\n");
    sb.append("    compartmentId: ").append(toIndentedString(compartmentId)).append("\n");
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


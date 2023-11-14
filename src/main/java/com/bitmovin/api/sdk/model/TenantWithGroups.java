package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InvitationStatus;
import com.bitmovin.api.sdk.model.TenantGroupDetail;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TenantWithGroups
 */

public class TenantWithGroups {
  @JsonProperty("id")
  private String id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("invitationStatus")
  private InvitationStatus invitationStatus;

  @JsonProperty("groups")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<TenantGroupDetail> groups = new ArrayList<TenantGroupDetail>();


  /**
   * Id of Tenant
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Id of Tenant
   *
   * @param id
   *        Id of Tenant
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Email of Tenant
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Email of Tenant
   *
   * @param email
   *        Email of Tenant
   */
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Get invitationStatus
   * @return invitationStatus
   */
  public InvitationStatus getInvitationStatus() {
    return invitationStatus;
  }

  /**
   * Set invitationStatus
   *
   * @param invitationStatus
   */
  public void setInvitationStatus(InvitationStatus invitationStatus) {
    this.invitationStatus = invitationStatus;
  }


  public TenantWithGroups addGroupsItem(TenantGroupDetail groupsItem) {
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * List of all groups of Tenant
   * @return groups
   */
  public List<TenantGroupDetail> getGroups() {
    return groups;
  }

  /**
   * List of all groups of Tenant
   *
   * @param groups
   *        List of all groups of Tenant
   */
  public void setGroups(List<TenantGroupDetail> groups) {
    this.groups = groups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantWithGroups tenantWithGroups = (TenantWithGroups) o;
    return Objects.equals(this.id, tenantWithGroups.id) &&
        Objects.equals(this.email, tenantWithGroups.email) &&
        Objects.equals(this.invitationStatus, tenantWithGroups.invitationStatus) &&
        Objects.equals(this.groups, tenantWithGroups.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, invitationStatus, groups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantWithGroups {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    invitationStatus: ").append(toIndentedString(invitationStatus)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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


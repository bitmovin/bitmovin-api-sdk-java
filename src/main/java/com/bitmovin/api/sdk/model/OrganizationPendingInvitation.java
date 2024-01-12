package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * OrganizationPendingInvitation
 */

public class OrganizationPendingInvitation {
  @JsonProperty("id")
  private String id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("groupName")
  private String groupName;


  /**
   * Id of Tenant (required)
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Id of Tenant (required)
   *
   * @param id
   *        Id of Tenant (required)
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Email of Tenant (required)
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Email of Tenant (required)
   *
   * @param email
   *        Email of Tenant (required)
   */
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * Id of group (required)
   * @return groupId
   */
  public String getGroupId() {
    return groupId;
  }

  /**
   * Id of group (required)
   *
   * @param groupId
   *        Id of group (required)
   */
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * Name of group (required)
   * @return groupName
   */
  public String getGroupName() {
    return groupName;
  }

  /**
   * Name of group (required)
   *
   * @param groupName
   *        Name of group (required)
   */
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPendingInvitation organizationPendingInvitation = (OrganizationPendingInvitation) o;
    return Objects.equals(this.id, organizationPendingInvitation.id) &&
        Objects.equals(this.email, organizationPendingInvitation.email) &&
        Objects.equals(this.groupId, organizationPendingInvitation.groupId) &&
        Objects.equals(this.groupName, organizationPendingInvitation.groupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, groupId, groupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPendingInvitation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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


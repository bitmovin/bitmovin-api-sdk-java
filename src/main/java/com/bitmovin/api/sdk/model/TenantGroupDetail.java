package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TenantGroupDetail
 */

public class TenantGroupDetail {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;


  /**
   * Id of Group
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Id of Group
   *
   * @param id
   *        Id of Group
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of Group
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of Group
   *
   * @param name
   *        Name of Group
   */
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantGroupDetail tenantGroupDetail = (TenantGroupDetail) o;
    return Objects.equals(this.id, tenantGroupDetail.id) &&
        Objects.equals(this.name, tenantGroupDetail.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantGroupDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


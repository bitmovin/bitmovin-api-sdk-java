package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.OrganizationType;
import com.bitmovin.api.sdk.model.ResourceLimitContainer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Organization
 */

public class Organization extends BitmovinResource {
  @JsonProperty("type")
  private OrganizationType type;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("labelColor")
  private String labelColor;

  @JsonProperty("limitsPerResource")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ResourceLimitContainer> limitsPerResource = new ArrayList<ResourceLimitContainer>();


  /**
   * Get type
   * @return type
   */
  public OrganizationType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(OrganizationType type) {
    this.type = type;
  }

  /**
   * ID of the parent organization
   * @return parentId
   */
  public String getParentId() {
    return parentId;
  }


  /**
   * Hexadecimal color
   * @return labelColor
   */
  public String getLabelColor() {
    return labelColor;
  }

  /**
   * Hexadecimal color
   *
   * @param labelColor
   *        Hexadecimal color
   */
  public void setLabelColor(String labelColor) {
    this.labelColor = labelColor;
  }


  public Organization addLimitsPerResourceItem(ResourceLimitContainer limitsPerResourceItem) {
    this.limitsPerResource.add(limitsPerResourceItem);
    return this;
  }

  /**
   * Get limitsPerResource
   * @return limitsPerResource
   */
  public List<ResourceLimitContainer> getLimitsPerResource() {
    return limitsPerResource;
  }

  /**
   * Set limitsPerResource
   *
   * @param limitsPerResource
   */
  public void setLimitsPerResource(List<ResourceLimitContainer> limitsPerResource) {
    this.limitsPerResource = limitsPerResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.type, organization.type) &&
        Objects.equals(this.parentId, organization.parentId) &&
        Objects.equals(this.labelColor, organization.labelColor) &&
        Objects.equals(this.limitsPerResource, organization.limitsPerResource) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, parentId, labelColor, limitsPerResource, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    labelColor: ").append(toIndentedString(labelColor)).append("\n");
    sb.append("    limitsPerResource: ").append(toIndentedString(limitsPerResource)).append("\n");
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


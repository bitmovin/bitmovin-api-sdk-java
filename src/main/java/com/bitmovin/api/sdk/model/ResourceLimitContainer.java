package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ResourceLimit;
import com.bitmovin.api.sdk.model.ResourceType;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ResourceLimitContainer
 */

public class ResourceLimitContainer {
  @JsonProperty("resource")
  private ResourceType resource;

  @JsonProperty("limits")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ResourceLimit> limits = new ArrayList<ResourceLimit>();


  /**
   * Get resource
   * @return resource
   */
  public ResourceType getResource() {
    return resource;
  }

  /**
   * Set resource
   *
   * @param resource
   */
  public void setResource(ResourceType resource) {
    this.resource = resource;
  }


  public ResourceLimitContainer addLimitsItem(ResourceLimit limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * Get limits
   * @return limits
   */
  public List<ResourceLimit> getLimits() {
    return limits;
  }

  /**
   * Set limits
   *
   * @param limits
   */
  public void setLimits(List<ResourceLimit> limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceLimitContainer resourceLimitContainer = (ResourceLimitContainer) o;
    return Objects.equals(this.resource, resourceLimitContainer.resource) &&
        Objects.equals(this.limits, resourceLimitContainer.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource, limits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLimitContainer {\n");
    
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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


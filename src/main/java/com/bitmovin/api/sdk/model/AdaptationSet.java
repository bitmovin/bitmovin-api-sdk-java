package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Accessibility;
import com.bitmovin.api.sdk.model.AdaptationSetRole;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.CustomAttribute;
import com.bitmovin.api.sdk.model.Label;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdaptationSet
 */

public class AdaptationSet extends BitmovinResponse {
  @JsonProperty("customAttributes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<CustomAttribute> customAttributes = new ArrayList<CustomAttribute>();

  @JsonProperty("roles")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AdaptationSetRole> roles = new ArrayList<AdaptationSetRole>();

  @JsonProperty("accessibilities")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Accessibility> accessibilities = new ArrayList<Accessibility>();

  @JsonProperty("labels")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Label> labels = new ArrayList<Label>();


  public AdaptationSet addCustomAttributesItem(CustomAttribute customAttributesItem) {
    this.customAttributes.add(customAttributesItem);
    return this;
  }

  /**
   * Custom adaptation set attributes
   * @return customAttributes
   */
  public List<CustomAttribute> getCustomAttributes() {
    return customAttributes;
  }

  /**
   * Custom adaptation set attributes
   *
   * @param customAttributes
   *        Custom adaptation set attributes
   */
  public void setCustomAttributes(List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
  }


  public AdaptationSet addRolesItem(AdaptationSetRole rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Roles of the adaptation set
   * @return roles
   */
  public List<AdaptationSetRole> getRoles() {
    return roles;
  }

  /**
   * Roles of the adaptation set
   *
   * @param roles
   *        Roles of the adaptation set
   */
  public void setRoles(List<AdaptationSetRole> roles) {
    this.roles = roles;
  }


  public AdaptationSet addAccessibilitiesItem(Accessibility accessibilitiesItem) {
    this.accessibilities.add(accessibilitiesItem);
    return this;
  }

  /**
   * Provide signaling of CEA 607 and CEA 708
   * @return accessibilities
   */
  public List<Accessibility> getAccessibilities() {
    return accessibilities;
  }

  /**
   * Provide signaling of CEA 607 and CEA 708
   *
   * @param accessibilities
   *        Provide signaling of CEA 607 and CEA 708
   */
  public void setAccessibilities(List<Accessibility> accessibilities) {
    this.accessibilities = accessibilities;
  }


  public AdaptationSet addLabelsItem(Label labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * List of labels
   * @return labels
   */
  public List<Label> getLabels() {
    return labels;
  }

  /**
   * List of labels
   *
   * @param labels
   *        List of labels
   */
  public void setLabels(List<Label> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptationSet adaptationSet = (AdaptationSet) o;
    return Objects.equals(this.customAttributes, adaptationSet.customAttributes) &&
        Objects.equals(this.roles, adaptationSet.roles) &&
        Objects.equals(this.accessibilities, adaptationSet.accessibilities) &&
        Objects.equals(this.labels, adaptationSet.labels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, roles, accessibilities, labels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptationSet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    accessibilities: ").append(toIndentedString(accessibilities)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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


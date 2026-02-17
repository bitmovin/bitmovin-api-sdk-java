package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DnsMappingRequest
 */

public class DnsMappingRequest {
  @JsonProperty("subdomain")
  private String subdomain;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;


  /**
   * Subdomain used for the DNS mapping. It can only contain lowercase letters, numbers and dashes (-). It can be at most 63 characters long (required)
   * @return subdomain
   */
  public String getSubdomain() {
    return subdomain;
  }

  /**
   * Subdomain used for the DNS mapping. It can only contain lowercase letters, numbers and dashes (-). It can be at most 63 characters long (required)
   *
   * @param subdomain
   *        Subdomain used for the DNS mapping. It can only contain lowercase letters, numbers and dashes (-). It can be at most 63 characters long (required)
   */
  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }


  /**
   * Optional name for the DNS mapping
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Optional name for the DNS mapping
   *
   * @param name
   *        Optional name for the DNS mapping
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Optional description for the DNS mapping
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Optional description for the DNS mapping
   *
   * @param description
   *        Optional description for the DNS mapping
   */
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsMappingRequest dnsMappingRequest = (DnsMappingRequest) o;
    return Objects.equals(this.subdomain, dnsMappingRequest.subdomain) &&
        Objects.equals(this.name, dnsMappingRequest.name) &&
        Objects.equals(this.description, dnsMappingRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subdomain, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsMappingRequest {\n");
    
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


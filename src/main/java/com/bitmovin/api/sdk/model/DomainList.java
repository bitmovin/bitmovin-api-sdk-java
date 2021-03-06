package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Domain;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DomainList
 */

public class DomainList {
  @JsonProperty("domains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Domain> domains = new ArrayList<Domain>();


  public DomainList addDomainsItem(Domain domainsItem) {
    this.domains.add(domainsItem);
    return this;
  }

  /**
   * Get domains
   * @return domains
   */
  public List<Domain> getDomains() {
    return domains;
  }

  /**
   * Set domains
   *
   * @param domains
   */
  public void setDomains(List<Domain> domains) {
    this.domains = domains;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainList domainList = (DomainList) o;
    return Objects.equals(this.domains, domainList.domains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainList {\n");
    
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
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


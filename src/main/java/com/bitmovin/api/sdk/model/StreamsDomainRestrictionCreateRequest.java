package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsDomainRestrictionCreateRequest
 */

public class StreamsDomainRestrictionCreateRequest {
  @JsonProperty("allowedDomains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> allowedDomains = new ArrayList<String>();

  @JsonProperty("allowNoReferer")
  private Boolean allowNoReferer;

  @JsonProperty("allowShare")
  private Boolean allowShare;


  public StreamsDomainRestrictionCreateRequest addAllowedDomainsItem(String allowedDomainsItem) {
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

  /**
   * The list of allowed domains (required)
   * @return allowedDomains
   */
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }

  /**
   * The list of allowed domains (required)
   *
   * @param allowedDomains
   *        The list of allowed domains (required)
   */
  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  /**
   * Controls if requests to domain restricted streams without referer header should be allowed or denied
   * @return allowNoReferer
   */
  public Boolean getAllowNoReferer() {
    return allowNoReferer;
  }

  /**
   * Controls if requests to domain restricted streams without referer header should be allowed or denied
   *
   * @param allowNoReferer
   *        Controls if requests to domain restricted streams without referer header should be allowed or denied
   */
  public void setAllowNoReferer(Boolean allowNoReferer) {
    this.allowNoReferer = allowNoReferer;
  }


  /**
   * Controls if Stream is accessible via sharing URL or not
   * @return allowShare
   */
  public Boolean getAllowShare() {
    return allowShare;
  }

  /**
   * Controls if Stream is accessible via sharing URL or not
   *
   * @param allowShare
   *        Controls if Stream is accessible via sharing URL or not
   */
  public void setAllowShare(Boolean allowShare) {
    this.allowShare = allowShare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsDomainRestrictionCreateRequest streamsDomainRestrictionCreateRequest = (StreamsDomainRestrictionCreateRequest) o;
    return Objects.equals(this.allowedDomains, streamsDomainRestrictionCreateRequest.allowedDomains) &&
        Objects.equals(this.allowNoReferer, streamsDomainRestrictionCreateRequest.allowNoReferer) &&
        Objects.equals(this.allowShare, streamsDomainRestrictionCreateRequest.allowShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedDomains, allowNoReferer, allowShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsDomainRestrictionCreateRequest {\n");
    
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowNoReferer: ").append(toIndentedString(allowNoReferer)).append("\n");
    sb.append("    allowShare: ").append(toIndentedString(allowShare)).append("\n");
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


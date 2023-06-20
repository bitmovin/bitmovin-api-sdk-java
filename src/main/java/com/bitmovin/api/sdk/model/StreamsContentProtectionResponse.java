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
 * StreamsContentProtectionResponse
 */

public class StreamsContentProtectionResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("allowedDomains")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> allowedDomains = new ArrayList<String>();

  @JsonProperty("allowNoReferer")
  private Boolean allowNoReferer;

  /**
   * The identifier of the streams content protection entity
   * @return id
   */
  public String getId() {
    return id;
  }


  public StreamsContentProtectionResponse addAllowedDomainsItem(String allowedDomainsItem) {
    this.allowedDomains.add(allowedDomainsItem);
    return this;
  }

  /**
   * The list of allowed domains
   * @return allowedDomains
   */
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }

  /**
   * The list of allowed domains
   *
   * @param allowedDomains
   *        The list of allowed domains
   */
  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }


  /**
   * Controls if requests to content protected streams without referer header should be allowed or denied
   * @return allowNoReferer
   */
  public Boolean getAllowNoReferer() {
    return allowNoReferer;
  }

  /**
   * Controls if requests to content protected streams without referer header should be allowed or denied
   *
   * @param allowNoReferer
   *        Controls if requests to content protected streams without referer header should be allowed or denied
   */
  public void setAllowNoReferer(Boolean allowNoReferer) {
    this.allowNoReferer = allowNoReferer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsContentProtectionResponse streamsContentProtectionResponse = (StreamsContentProtectionResponse) o;
    return Objects.equals(this.id, streamsContentProtectionResponse.id) &&
        Objects.equals(this.allowedDomains, streamsContentProtectionResponse.allowedDomains) &&
        Objects.equals(this.allowNoReferer, streamsContentProtectionResponse.allowNoReferer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, allowedDomains, allowNoReferer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsContentProtectionResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    allowNoReferer: ").append(toIndentedString(allowNoReferer)).append("\n");
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


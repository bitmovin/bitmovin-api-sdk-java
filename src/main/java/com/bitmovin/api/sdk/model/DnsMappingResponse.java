package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DnsMappingResponse
 */

public class DnsMappingResponse extends BitmovinResource {
  @JsonProperty("subdomain")
  private String subdomain;

  @JsonProperty("hostname")
  private String hostname;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("ip")
  private String ip;


  /**
   * Subdomain used for the DNS mapping
   * @return subdomain
   */
  public String getSubdomain() {
    return subdomain;
  }

  /**
   * Subdomain used for the DNS mapping
   *
   * @param subdomain
   *        Subdomain used for the DNS mapping
   */
  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  /**
   * Resolved hostname for the DNS mapping
   * @return hostname
   */
  public String getHostname() {
    return hostname;
  }

  /**
   * ID of the encoding this DNS mapping belongs to
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * IP address that the hostname resolves to
   * @return ip
   */
  public String getIp() {
    return ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DnsMappingResponse dnsMappingResponse = (DnsMappingResponse) o;
    return Objects.equals(this.subdomain, dnsMappingResponse.subdomain) &&
        Objects.equals(this.hostname, dnsMappingResponse.hostname) &&
        Objects.equals(this.encodingId, dnsMappingResponse.encodingId) &&
        Objects.equals(this.ip, dnsMappingResponse.ip) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subdomain, hostname, encodingId, ip, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DnsMappingResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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


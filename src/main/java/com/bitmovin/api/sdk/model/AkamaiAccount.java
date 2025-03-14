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
 * AkamaiAccount
 */

public class AkamaiAccount extends BitmovinResource {
  @JsonProperty("apiToken")
  private String apiToken;


  /**
   * Akamai/Linode API token (required)
   * @return apiToken
   */
  public String getApiToken() {
    return apiToken;
  }

  /**
   * Akamai/Linode API token (required)
   *
   * @param apiToken
   *        Akamai/Linode API token (required)
   */
  public void setApiToken(String apiToken) {
    this.apiToken = apiToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AkamaiAccount akamaiAccount = (AkamaiAccount) o;
    return Objects.equals(this.apiToken, akamaiAccount.apiToken) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiToken, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AkamaiAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
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


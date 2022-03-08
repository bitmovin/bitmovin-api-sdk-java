package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobCredentials;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobGcsServiceAccountCredentials
 */

public class SimpleEncodingLiveJobGcsServiceAccountCredentials extends SimpleEncodingLiveJobCredentials {
  @JsonProperty("serviceAccountCredentials")
  private String serviceAccountCredentials;


  /**
   * Service account credentials for Google (required)
   * @return serviceAccountCredentials
   */
  public String getServiceAccountCredentials() {
    return serviceAccountCredentials;
  }

  /**
   * Service account credentials for Google (required)
   *
   * @param serviceAccountCredentials
   *        Service account credentials for Google (required)
   */
  public void setServiceAccountCredentials(String serviceAccountCredentials) {
    this.serviceAccountCredentials = serviceAccountCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobGcsServiceAccountCredentials simpleEncodingLiveJobGcsServiceAccountCredentials = (SimpleEncodingLiveJobGcsServiceAccountCredentials) o;
    return Objects.equals(this.serviceAccountCredentials, simpleEncodingLiveJobGcsServiceAccountCredentials.serviceAccountCredentials) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountCredentials, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobGcsServiceAccountCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceAccountCredentials: ").append(toIndentedString(serviceAccountCredentials)).append("\n");
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


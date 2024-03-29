package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SimpleEncodingLiveJobCredentials;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingLiveJobAzureCredentials
 */

public class SimpleEncodingLiveJobAzureCredentials extends SimpleEncodingLiveJobCredentials {
  @JsonProperty("key")
  private String key;


  /**
   * Azure Account Key used for authentication (required)
   * @return key
   */
  public String getKey() {
    return key;
  }

  /**
   * Azure Account Key used for authentication (required)
   *
   * @param key
   *        Azure Account Key used for authentication (required)
   */
  public void setKey(String key) {
    this.key = key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingLiveJobAzureCredentials simpleEncodingLiveJobAzureCredentials = (SimpleEncodingLiveJobAzureCredentials) o;
    return Objects.equals(this.key, simpleEncodingLiveJobAzureCredentials.key) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingLiveJobAzureCredentials {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


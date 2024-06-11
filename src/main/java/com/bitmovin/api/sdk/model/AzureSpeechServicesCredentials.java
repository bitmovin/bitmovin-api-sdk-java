package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AzureSpeechServicesCredentials
 */

public class AzureSpeechServicesCredentials {
  @JsonProperty("subscriptionKey")
  private String subscriptionKey;


  /**
   * Azure Speech Services resource key (required)
   * @return subscriptionKey
   */
  public String getSubscriptionKey() {
    return subscriptionKey;
  }

  /**
   * Azure Speech Services resource key (required)
   *
   * @param subscriptionKey
   *        Azure Speech Services resource key (required)
   */
  public void setSubscriptionKey(String subscriptionKey) {
    this.subscriptionKey = subscriptionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureSpeechServicesCredentials azureSpeechServicesCredentials = (AzureSpeechServicesCredentials) o;
    return Objects.equals(this.subscriptionKey, azureSpeechServicesCredentials.subscriptionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureSpeechServicesCredentials {\n");
    
    sb.append("    subscriptionKey: ").append(toIndentedString(subscriptionKey)).append("\n");
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


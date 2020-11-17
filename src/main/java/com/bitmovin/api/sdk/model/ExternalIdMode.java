package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ExternalIdMode {
  
  /**
   * ExternalId can be provided by using the the &#x60;externalId&#x60; property. This way is not recommend by AWS (https://aws.amazon.com/blogs/security/how-to-use-external-id-when-granting-access-to-your-aws-resources/).
   */
  CUSTOM("CUSTOM"),
  
  /**
   * The response will include an externalId that&#39;s unique and consistent for your organization
   */
  GLOBAL("GLOBAL"),
  
  /**
   * The response will include a random externalId.
   */
  GENERATED("GENERATED");

  private String value;

  ExternalIdMode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ExternalIdMode fromValue(String text) {
    for (ExternalIdMode b : ExternalIdMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}


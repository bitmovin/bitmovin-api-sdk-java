package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.Output;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AzureOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AzureOutput.class)
public class AzureOutput extends Output {
  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("accountKey")
  private String accountKey;

  @JsonProperty("container")
  private String container;


  /**
   * Azure Account Name (required)
   * @return accountName
   */
  public String getAccountName() {
    return accountName;
  }

  /**
   * Azure Account Name (required)
   *
   * @param accountName
   *        Azure Account Name (required)
   */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  /**
   * Azure Account Key (required)
   * @return accountKey
   */
  public String getAccountKey() {
    return accountKey;
  }

  /**
   * Azure Account Key (required)
   *
   * @param accountKey
   *        Azure Account Key (required)
   */
  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }


  /**
   * Name of the bucket (required)
   * @return container
   */
  public String getContainer() {
    return container;
  }

  /**
   * Name of the bucket (required)
   *
   * @param container
   *        Name of the bucket (required)
   */
  public void setContainer(String container) {
    this.container = container;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureOutput azureOutput = (AzureOutput) o;
    return Objects.equals(this.accountName, azureOutput.accountName) &&
        Objects.equals(this.accountKey, azureOutput.accountKey) &&
        Objects.equals(this.container, azureOutput.container) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountKey, container, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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


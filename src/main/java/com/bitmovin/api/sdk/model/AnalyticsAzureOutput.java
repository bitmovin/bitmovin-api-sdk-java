package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.AnalyticsOutput;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAzureOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AnalyticsAzureOutput.class)
public class AnalyticsAzureOutput extends AnalyticsOutput {
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
   * Microsoft Azure Account Access Key with the &#x60;Contributor Role&#x60; (required)
   * @return accountKey
   */
  public String getAccountKey() {
    return accountKey;
  }

  /**
   * Microsoft Azure Account Access Key with the &#x60;Contributor Role&#x60; (required)
   *
   * @param accountKey
   *        Microsoft Azure Account Access Key with the &#x60;Contributor Role&#x60; (required)
   */
  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }


  /**
   * Microsoft Azure container name (required)
   * @return container
   */
  public String getContainer() {
    return container;
  }

  /**
   * Microsoft Azure container name (required)
   *
   * @param container
   *        Microsoft Azure container name (required)
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
    AnalyticsAzureOutput analyticsAzureOutput = (AnalyticsAzureOutput) o;
    return Objects.equals(this.accountName, analyticsAzureOutput.accountName) &&
        Objects.equals(this.accountKey, analyticsAzureOutput.accountKey) &&
        Objects.equals(this.container, analyticsAzureOutput.container) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountKey, container, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAzureOutput {\n");
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


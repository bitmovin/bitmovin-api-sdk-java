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
 * AwsAccount
 */

public class AwsAccount extends BitmovinResource {
  @JsonProperty("accessKey")
  private String accessKey;

  @JsonProperty("secretKey")
  private String secretKey;

  @JsonProperty("accountNumber")
  private String accountNumber;


  /**
   * Amazon access key
   * @return accessKey
   */
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Amazon access key
   *
   * @param accessKey
   * Amazon access key
   */
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * Amazon secret key
   * @return secretKey
   */
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Amazon secret key
   *
   * @param secretKey
   * Amazon secret key
   */
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  /**
   * Amazon account number (12 digits as per AWS spec)
   * @return accountNumber
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * Amazon account number (12 digits as per AWS spec)
   *
   * @param accountNumber
   * Amazon account number (12 digits as per AWS spec)
   */
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwsAccount awsAccount = (AwsAccount) o;
    return Objects.equals(this.accessKey, awsAccount.accessKey) &&
        Objects.equals(this.secretKey, awsAccount.secretKey) &&
        Objects.equals(this.accountNumber, awsAccount.accountNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, accountNumber, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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


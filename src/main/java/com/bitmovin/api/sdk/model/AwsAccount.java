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

  @JsonProperty("roleName")
  private String roleName;

  @JsonProperty("externalId")
  private String externalId;


  /**
   * Deprecated: Amazon access key for legacy support. Use &#x60;roleName&#x60; instead
   * @return accessKey
   */
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Deprecated: Amazon access key for legacy support. Use &#x60;roleName&#x60; instead
   *
   * @param accessKey
   *        Deprecated: Amazon access key for legacy support. Use &#x60;roleName&#x60; instead
   */
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * Deprecated: Amazon secret key for legacy support. Use &#x60;roleName&#x60; instead
   * @return secretKey
   */
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Deprecated: Amazon secret key for legacy support. Use &#x60;roleName&#x60; instead
   *
   * @param secretKey
   *        Deprecated: Amazon secret key for legacy support. Use &#x60;roleName&#x60; instead
   */
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  /**
   * Amazon account number (12 digits as per AWS spec) (required)
   * @return accountNumber
   */
  public String getAccountNumber() {
    return accountNumber;
  }

  /**
   * Amazon account number (12 digits as per AWS spec) (required)
   *
   * @param accountNumber
   *        Amazon account number (12 digits as per AWS spec) (required)
   */
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  /**
   * Role name including path for the AWS IAM role that will be used by Bitmovin to access the AWS account depicted by &#x60;accountNumber&#x60;. The role ARN is constructed based on &#x60;accountNumber&#x60; and &#x60;roleName&#x60;: &#x60;arn:aws:iam::{accountNumber}:role/{roleName}&#x60;.  For details on how to create the AWS IAM role in your account, please refer to the [AWS cloud connect setup guide](https://developer.bitmovin.com/encoding/docs/using-bitmovin-cloud-connect-with-aws). 
   * @return roleName
   */
  public String getRoleName() {
    return roleName;
  }

  /**
   * Role name including path for the AWS IAM role that will be used by Bitmovin to access the AWS account depicted by &#x60;accountNumber&#x60;. The role ARN is constructed based on &#x60;accountNumber&#x60; and &#x60;roleName&#x60;: &#x60;arn:aws:iam::{accountNumber}:role/{roleName}&#x60;.  For details on how to create the AWS IAM role in your account, please refer to the [AWS cloud connect setup guide](https://developer.bitmovin.com/encoding/docs/using-bitmovin-cloud-connect-with-aws). 
   *
   * @param roleName
   *        Role name including path for the AWS IAM role that will be used by Bitmovin to access the AWS account depicted by &#x60;accountNumber&#x60;. The role ARN is constructed based on &#x60;accountNumber&#x60; and &#x60;roleName&#x60;: &#x60;arn:aws:iam::{accountNumber}:role/{roleName}&#x60;.  For details on how to create the AWS IAM role in your account, please refer to the [AWS cloud connect setup guide](https://developer.bitmovin.com/encoding/docs/using-bitmovin-cloud-connect-with-aws). 
   */
  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  /**
   * External ID that needs to be set in the trust policy of the AWS IAM role (depicted by &#x60;roleName&#x60;) that allows Bitmovin access to the AWS account depicted by &#x60;accountNumber&#x60;
   * @return externalId
   */
  public String getExternalId() {
    return externalId;
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
        Objects.equals(this.roleName, awsAccount.roleName) &&
        Objects.equals(this.externalId, awsAccount.externalId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, accountNumber, roleName, externalId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsAccount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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


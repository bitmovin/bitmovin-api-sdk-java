package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AwsCloudRegion;
import com.bitmovin.api.sdk.model.ExternalIdMode;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * S3RoleBasedInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = S3RoleBasedInput.class)
public class S3RoleBasedInput extends Input {
  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("roleArn")
  private String roleArn;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("externalIdMode")
  private ExternalIdMode externalIdMode;

  @JsonProperty("cloudRegion")
  private AwsCloudRegion cloudRegion;


  /**
   * Amazon S3 bucket name (required)
   * @return bucketName
   */
  public String getBucketName() {
    return bucketName;
  }

  /**
   * Amazon S3 bucket name (required)
   *
   * @param bucketName
   *        Amazon S3 bucket name (required)
   */
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  /**
   * Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access.  This role has to be created by the owner of the account with the S3 bucket (i.e., you as a customer). For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot; is the Bitmovin user used for the access. The &#x60;Condition&#x60; is optional but we highly recommend it, see property &#x60;externalId&#x60; below for more information.  This setup allows Bitmovin assume the provided IAM role and to read data from your S3 bucket. Please note that the IAM role has to have read access on S3.  For more information about role creation please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html#roles-creatingrole-service-console (required)
   * @return roleArn
   */
  public String getRoleArn() {
    return roleArn;
  }

  /**
   * Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access.  This role has to be created by the owner of the account with the S3 bucket (i.e., you as a customer). For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot; is the Bitmovin user used for the access. The &#x60;Condition&#x60; is optional but we highly recommend it, see property &#x60;externalId&#x60; below for more information.  This setup allows Bitmovin assume the provided IAM role and to read data from your S3 bucket. Please note that the IAM role has to have read access on S3.  For more information about role creation please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html#roles-creatingrole-service-console (required)
   *
   * @param roleArn
   *        Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access.  This role has to be created by the owner of the account with the S3 bucket (i.e., you as a customer). For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot; is the Bitmovin user used for the access. The &#x60;Condition&#x60; is optional but we highly recommend it, see property &#x60;externalId&#x60; below for more information.  This setup allows Bitmovin assume the provided IAM role and to read data from your S3 bucket. Please note that the IAM role has to have read access on S3.  For more information about role creation please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html#roles-creatingrole-service-console (required)
   */
  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  /**
   * External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume S3 access.  This ID is provided by the API if &#x60;externalIdMode&#x60; is set to &#x60;GLOBAL&#x60; or &#x60;GENERATED&#x60;. If present, it has to be added to the trust policy of the IAM role &#x60;roleArn&#x60; configured above, otherwise the API won&#39;t be able to read from the S3 bucket. An appropriate trust policy would look like this:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;{{externalId}}\&quot; is the generated ID.  This property is optional but we recommend it as an additional security feature. We will use both the &#x60;roleArn&#x60; and the &#x60;externalId&#x60; to access your S3 data. If the Amazon IAM role has an external ID configured but it is not provided in the input configuration Bitmovin won&#39;t be able to read from the S3 bucket. Also if the external ID does not match the one configured for the IAM role on AWS side, Bitmovin won&#39;t be able to access the S3 bucket.  If you need to change the external ID that is used by your IAM role, you need to create a new input, and use the external ID provided by the API to update your IAM role.  For more information please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html 
   * @return externalId
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume S3 access.  This ID is provided by the API if &#x60;externalIdMode&#x60; is set to &#x60;GLOBAL&#x60; or &#x60;GENERATED&#x60;. If present, it has to be added to the trust policy of the IAM role &#x60;roleArn&#x60; configured above, otherwise the API won&#39;t be able to read from the S3 bucket. An appropriate trust policy would look like this:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;{{externalId}}\&quot; is the generated ID.  This property is optional but we recommend it as an additional security feature. We will use both the &#x60;roleArn&#x60; and the &#x60;externalId&#x60; to access your S3 data. If the Amazon IAM role has an external ID configured but it is not provided in the input configuration Bitmovin won&#39;t be able to read from the S3 bucket. Also if the external ID does not match the one configured for the IAM role on AWS side, Bitmovin won&#39;t be able to access the S3 bucket.  If you need to change the external ID that is used by your IAM role, you need to create a new input, and use the external ID provided by the API to update your IAM role.  For more information please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html 
   *
   * @param externalId
   *        External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume S3 access.  This ID is provided by the API if &#x60;externalIdMode&#x60; is set to &#x60;GLOBAL&#x60; or &#x60;GENERATED&#x60;. If present, it has to be added to the trust policy of the IAM role &#x60;roleArn&#x60; configured above, otherwise the API won&#39;t be able to read from the S3 bucket. An appropriate trust policy would look like this:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;{{externalId}}\&quot; is the generated ID.  This property is optional but we recommend it as an additional security feature. We will use both the &#x60;roleArn&#x60; and the &#x60;externalId&#x60; to access your S3 data. If the Amazon IAM role has an external ID configured but it is not provided in the input configuration Bitmovin won&#39;t be able to read from the S3 bucket. Also if the external ID does not match the one configured for the IAM role on AWS side, Bitmovin won&#39;t be able to access the S3 bucket.  If you need to change the external ID that is used by your IAM role, you need to create a new input, and use the external ID provided by the API to update your IAM role.  For more information please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html 
   */
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  /**
   * Get externalIdMode
   * @return externalIdMode
   */
  public ExternalIdMode getExternalIdMode() {
    return externalIdMode;
  }

  /**
   * Set externalIdMode
   *
   * @param externalIdMode
   */
  public void setExternalIdMode(ExternalIdMode externalIdMode) {
    this.externalIdMode = externalIdMode;
  }


  /**
   * Get cloudRegion
   * @return cloudRegion
   */
  public AwsCloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * Set cloudRegion
   *
   * @param cloudRegion
   */
  public void setCloudRegion(AwsCloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3RoleBasedInput s3RoleBasedInput = (S3RoleBasedInput) o;
    return Objects.equals(this.bucketName, s3RoleBasedInput.bucketName) &&
        Objects.equals(this.roleArn, s3RoleBasedInput.roleArn) &&
        Objects.equals(this.externalId, s3RoleBasedInput.externalId) &&
        Objects.equals(this.externalIdMode, s3RoleBasedInput.externalIdMode) &&
        Objects.equals(this.cloudRegion, s3RoleBasedInput.cloudRegion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, roleArn, externalId, externalIdMode, cloudRegion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3RoleBasedInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalIdMode: ").append(toIndentedString(externalIdMode)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
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


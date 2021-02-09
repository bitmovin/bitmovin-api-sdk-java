package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.AnalyticsOutput;
import com.bitmovin.api.sdk.model.AwsCloudRegion;
import com.bitmovin.api.sdk.model.ExternalIdMode;
import com.bitmovin.api.sdk.model.S3SignatureVersion;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsS3RoleBasedOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AnalyticsS3RoleBasedOutput.class)
public class AnalyticsS3RoleBasedOutput extends AnalyticsOutput {
  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("roleArn")
  private String roleArn;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("externalIdMode")
  private ExternalIdMode externalIdMode;

  @JsonProperty("md5MetaTag")
  private String md5MetaTag;

  @JsonProperty("cloudRegion")
  private AwsCloudRegion cloudRegion;

  @JsonProperty("signatureVersion")
  private S3SignatureVersion signatureVersion;


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
   * Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access.  This role has to be created by the owner of the account with the S3 bucket (i.e., you as a customer). For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot; is the Bitmovin user used for the access. The &#x60;Condition&#x60; is optional but we highly recommend it, see property &#x60;externalId&#x60; below for more information.  This setup allows Bitmovin assume the provided IAM role and to write data to your S3 bucket. Please note that the IAM role has to have write access to S3.  For more information about role creation please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html#roles-creatingrole-service-console (required)
   * @return roleArn
   */
  public String getRoleArn() {
    return roleArn;
  }

  /**
   * Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access.  This role has to be created by the owner of the account with the S3 bucket (i.e., you as a customer). For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot; is the Bitmovin user used for the access. The &#x60;Condition&#x60; is optional but we highly recommend it, see property &#x60;externalId&#x60; below for more information.  This setup allows Bitmovin assume the provided IAM role and to write data to your S3 bucket. Please note that the IAM role has to have write access to S3.  For more information about role creation please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html#roles-creatingrole-service-console (required)
   *
   * @param roleArn
   *        Amazon ARN of the IAM Role (Identity and Access Management Role) that will be assumed for S3 access.  This role has to be created by the owner of the account with the S3 bucket (i.e., you as a customer). For Bitmovin to be able to assume this role, the following has to be added to the trust policy of the role:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot; is the Bitmovin user used for the access. The &#x60;Condition&#x60; is optional but we highly recommend it, see property &#x60;externalId&#x60; below for more information.  This setup allows Bitmovin assume the provided IAM role and to write data to your S3 bucket. Please note that the IAM role has to have write access to S3.  For more information about role creation please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html#roles-creatingrole-service-console (required)
   */
  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  /**
   * External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume S3 access.  This ID is provided by the API if &#x60;externalIdMode&#x60; is set to &#x60;GLOBAL&#x60; or &#x60;GENERATED&#x60;. If present, it has to be added to the trust policy of the IAM role &#x60;roleArn&#x60; configured above, otherwise the API won&#39;t be able to write to the S3 bucket. An appropriate trust policy would look like this:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;{{externalId}}\&quot; is the generated ID.  This property is optional but we recommend it as an additional security feature. We will use both the &#x60;roleArn&#x60; and the &#x60;externalId&#x60; to access your S3 data. If the Amazon IAM role has an external ID configured but it is not provided in the output configuration Bitmovin won&#39;t be able to write to the S3 bucket. Also if the external ID does not match the one configured for the IAM role on AWS side, Bitmovin won&#39;t be able to access the S3 bucket.  If you need to change the external ID that is used by your IAM role, you need to create a new output, and use the external ID provided by the API to update your IAM role.  For more information please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html 
   * @return externalId
   */
  public String getExternalId() {
    return externalId;
  }

  /**
   * External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume S3 access.  This ID is provided by the API if &#x60;externalIdMode&#x60; is set to &#x60;GLOBAL&#x60; or &#x60;GENERATED&#x60;. If present, it has to be added to the trust policy of the IAM role &#x60;roleArn&#x60; configured above, otherwise the API won&#39;t be able to write to the S3 bucket. An appropriate trust policy would look like this:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;{{externalId}}\&quot; is the generated ID.  This property is optional but we recommend it as an additional security feature. We will use both the &#x60;roleArn&#x60; and the &#x60;externalId&#x60; to access your S3 data. If the Amazon IAM role has an external ID configured but it is not provided in the output configuration Bitmovin won&#39;t be able to write to the S3 bucket. Also if the external ID does not match the one configured for the IAM role on AWS side, Bitmovin won&#39;t be able to access the S3 bucket.  If you need to change the external ID that is used by your IAM role, you need to create a new output, and use the external ID provided by the API to update your IAM role.  For more information please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html 
   *
   * @param externalId
   *        External ID used together with the IAM role identified by &#x60;roleArn&#x60; to assume S3 access.  This ID is provided by the API if &#x60;externalIdMode&#x60; is set to &#x60;GLOBAL&#x60; or &#x60;GENERATED&#x60;. If present, it has to be added to the trust policy of the IAM role &#x60;roleArn&#x60; configured above, otherwise the API won&#39;t be able to write to the S3 bucket. An appropriate trust policy would look like this:  &#x60;&#x60;&#x60; {   \&quot;Effect\&quot;: \&quot;Allow\&quot;,   \&quot;Principal\&quot;: {     \&quot;AWS\&quot;: \&quot;arn:aws:iam::630681592166:user/bitmovinCustomerS3Access\&quot;   },   \&quot;Action\&quot;: \&quot;sts:AssumeRole\&quot;,   \&quot;Condition\&quot;: {     \&quot;StringEquals\&quot;: {       \&quot;sts:ExternalId\&quot;: \&quot;{{externalId}}\&quot;     }   } } &#x60;&#x60;&#x60;  where \&quot;{{externalId}}\&quot; is the generated ID.  This property is optional but we recommend it as an additional security feature. We will use both the &#x60;roleArn&#x60; and the &#x60;externalId&#x60; to access your S3 data. If the Amazon IAM role has an external ID configured but it is not provided in the output configuration Bitmovin won&#39;t be able to write to the S3 bucket. Also if the external ID does not match the one configured for the IAM role on AWS side, Bitmovin won&#39;t be able to access the S3 bucket.  If you need to change the external ID that is used by your IAM role, you need to create a new output, and use the external ID provided by the API to update your IAM role.  For more information please visit https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html 
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
   * If set a user defined tag (x-amz-meta-) with that key will be used to store the MD5 hash of the file.
   * @return md5MetaTag
   */
  public String getMd5MetaTag() {
    return md5MetaTag;
  }

  /**
   * If set a user defined tag (x-amz-meta-) with that key will be used to store the MD5 hash of the file.
   *
   * @param md5MetaTag
   *        If set a user defined tag (x-amz-meta-) with that key will be used to store the MD5 hash of the file.
   */
  public void setMd5MetaTag(String md5MetaTag) {
    this.md5MetaTag = md5MetaTag;
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


  /**
   * Specifies the method used for authentication
   * @return signatureVersion
   */
  public S3SignatureVersion getSignatureVersion() {
    return signatureVersion;
  }

  /**
   * Specifies the method used for authentication
   *
   * @param signatureVersion
   *        Specifies the method used for authentication
   */
  public void setSignatureVersion(S3SignatureVersion signatureVersion) {
    this.signatureVersion = signatureVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsS3RoleBasedOutput analyticsS3RoleBasedOutput = (AnalyticsS3RoleBasedOutput) o;
    return Objects.equals(this.bucketName, analyticsS3RoleBasedOutput.bucketName) &&
        Objects.equals(this.roleArn, analyticsS3RoleBasedOutput.roleArn) &&
        Objects.equals(this.externalId, analyticsS3RoleBasedOutput.externalId) &&
        Objects.equals(this.externalIdMode, analyticsS3RoleBasedOutput.externalIdMode) &&
        Objects.equals(this.md5MetaTag, analyticsS3RoleBasedOutput.md5MetaTag) &&
        Objects.equals(this.cloudRegion, analyticsS3RoleBasedOutput.cloudRegion) &&
        Objects.equals(this.signatureVersion, analyticsS3RoleBasedOutput.signatureVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, roleArn, externalId, externalIdMode, md5MetaTag, cloudRegion, signatureVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsS3RoleBasedOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalIdMode: ").append(toIndentedString(externalIdMode)).append("\n");
    sb.append("    md5MetaTag: ").append(toIndentedString(md5MetaTag)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    signatureVersion: ").append(toIndentedString(signatureVersion)).append("\n");
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


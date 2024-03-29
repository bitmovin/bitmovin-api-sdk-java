package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.AwsCloudRegion;
import com.bitmovin.api.sdk.model.Output;
import com.bitmovin.api.sdk.model.S3SignatureVersion;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * S3Output
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = S3Output.class)
public class S3Output extends Output {
  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("accessKey")
  private String accessKey;

  @JsonProperty("secretKey")
  private String secretKey;

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
   * Amazon S3 access key (required)
   * @return accessKey
   */
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * Amazon S3 access key (required)
   *
   * @param accessKey
   *        Amazon S3 access key (required)
   */
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * Amazon S3 secret key (required)
   * @return secretKey
   */
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * Amazon S3 secret key (required)
   *
   * @param secretKey
   *        Amazon S3 secret key (required)
   */
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
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
   * The cloud region in which the bucket is located. Is used to determine the ideal location for your encodings automatically.
   * @return cloudRegion
   */
  public AwsCloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * The cloud region in which the bucket is located. Is used to determine the ideal location for your encodings automatically.
   *
   * @param cloudRegion
   *        The cloud region in which the bucket is located. Is used to determine the ideal location for your encodings automatically.
   */
  public void setCloudRegion(AwsCloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  /**
   * Specifies the method used for authentication. Must be set to S3_V2 if the region supports both V2 and V4, but the bucket allows V2 only (see https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region)
   * @return signatureVersion
   */
  public S3SignatureVersion getSignatureVersion() {
    return signatureVersion;
  }

  /**
   * Specifies the method used for authentication. Must be set to S3_V2 if the region supports both V2 and V4, but the bucket allows V2 only (see https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region)
   *
   * @param signatureVersion
   *        Specifies the method used for authentication. Must be set to S3_V2 if the region supports both V2 and V4, but the bucket allows V2 only (see https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region)
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
    S3Output s3Output = (S3Output) o;
    return Objects.equals(this.bucketName, s3Output.bucketName) &&
        Objects.equals(this.accessKey, s3Output.accessKey) &&
        Objects.equals(this.secretKey, s3Output.secretKey) &&
        Objects.equals(this.md5MetaTag, s3Output.md5MetaTag) &&
        Objects.equals(this.cloudRegion, s3Output.cloudRegion) &&
        Objects.equals(this.signatureVersion, s3Output.signatureVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, accessKey, secretKey, md5MetaTag, cloudRegion, signatureVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Output {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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


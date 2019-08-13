package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.GoogleCloudRegion;
import com.bitmovin.api.sdk.model.Output;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * GcsOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = GcsOutput.class)
public class GcsOutput extends Output {
  @JsonProperty("accessKey")
  private String accessKey;

  @JsonProperty("secretKey")
  private String secretKey;

  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("cloudRegion")
  private GoogleCloudRegion cloudRegion;


  /**
   * GCS access key (required)
   * @return accessKey
   */
  public String getAccessKey() {
    return accessKey;
  }

  /**
   * GCS access key (required)
   *
   * @param accessKey
   *        GCS access key (required)
   */
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  /**
   * GCS secret key (required)
   * @return secretKey
   */
  public String getSecretKey() {
    return secretKey;
  }

  /**
   * GCS secret key (required)
   *
   * @param secretKey
   *        GCS secret key (required)
   */
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  /**
   * Name of the bucket (required)
   * @return bucketName
   */
  public String getBucketName() {
    return bucketName;
  }

  /**
   * Name of the bucket (required)
   *
   * @param bucketName
   *        Name of the bucket (required)
   */
  public void setBucketName(String bucketName) {
    this.bucketName = bucketName;
  }


  /**
   * Get cloudRegion
   * @return cloudRegion
   */
  public GoogleCloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * Set cloudRegion
   *
   * @param cloudRegion
   */
  public void setCloudRegion(GoogleCloudRegion cloudRegion) {
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
    GcsOutput gcsOutput = (GcsOutput) o;
    return Objects.equals(this.accessKey, gcsOutput.accessKey) &&
        Objects.equals(this.secretKey, gcsOutput.secretKey) &&
        Objects.equals(this.bucketName, gcsOutput.bucketName) &&
        Objects.equals(this.cloudRegion, gcsOutput.cloudRegion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, bucketName, cloudRegion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcsOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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


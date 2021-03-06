package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.GoogleCloudRegion;
import com.bitmovin.api.sdk.model.Input;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * GcsInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = GcsInput.class)
public class GcsInput extends Input {
  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("cloudRegion")
  private GoogleCloudRegion cloudRegion;

  @JsonProperty("accessKey")
  private String accessKey;

  @JsonProperty("secretKey")
  private String secretKey;


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
   * The cloud region in which the bucket is located. Is used to determine the ideal location for your encodings automatically.
   * @return cloudRegion
   */
  public GoogleCloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * The cloud region in which the bucket is located. Is used to determine the ideal location for your encodings automatically.
   *
   * @param cloudRegion
   *        The cloud region in which the bucket is located. Is used to determine the ideal location for your encodings automatically.
   */
  public void setCloudRegion(GoogleCloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GcsInput gcsInput = (GcsInput) o;
    return Objects.equals(this.bucketName, gcsInput.bucketName) &&
        Objects.equals(this.cloudRegion, gcsInput.cloudRegion) &&
        Objects.equals(this.accessKey, gcsInput.accessKey) &&
        Objects.equals(this.secretKey, gcsInput.secretKey) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketName, cloudRegion, accessKey, secretKey, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcsInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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


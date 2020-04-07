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
 * GcsServiceAccountInput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = GcsServiceAccountInput.class)
public class GcsServiceAccountInput extends Input {
  @JsonProperty("serviceAccountCredentials")
  private String serviceAccountCredentials;

  @JsonProperty("bucketName")
  private String bucketName;

  @JsonProperty("cloudRegion")
  private GoogleCloudRegion cloudRegion;


  /**
   * GCS projectId (required)
   * @return serviceAccountCredentials
   */
  public String getServiceAccountCredentials() {
    return serviceAccountCredentials;
  }

  /**
   * GCS projectId (required)
   *
   * @param serviceAccountCredentials
   *        GCS projectId (required)
   */
  public void setServiceAccountCredentials(String serviceAccountCredentials) {
    this.serviceAccountCredentials = serviceAccountCredentials;
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
    GcsServiceAccountInput gcsServiceAccountInput = (GcsServiceAccountInput) o;
    return Objects.equals(this.serviceAccountCredentials, gcsServiceAccountInput.serviceAccountCredentials) &&
        Objects.equals(this.bucketName, gcsServiceAccountInput.bucketName) &&
        Objects.equals(this.cloudRegion, gcsServiceAccountInput.cloudRegion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAccountCredentials, bucketName, cloudRegion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GcsServiceAccountInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serviceAccountCredentials: ").append(toIndentedString(serviceAccountCredentials)).append("\n");
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


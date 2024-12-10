package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.CloudRegion;
import com.bitmovin.api.sdk.model.PrewarmedEncoderDiskSize;
import com.bitmovin.api.sdk.model.PrewarmedEncoderPoolStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PrewarmedEncoderPool
 */

public class PrewarmedEncoderPool extends BitmovinResource {
  @JsonProperty("encoderVersion")
  private String encoderVersion;

  @JsonProperty("cloudRegion")
  private CloudRegion cloudRegion;

  @JsonProperty("infrastructureId")
  private String infrastructureId;

  @JsonProperty("diskSize")
  private PrewarmedEncoderDiskSize diskSize;

  @JsonProperty("targetPoolSize")
  private Integer targetPoolSize;

  @JsonProperty("dynamicPool")
  private Boolean dynamicPool;

  @JsonProperty("gpuEnabled")
  private Boolean gpuEnabled;

  @JsonProperty("status")
  private PrewarmedEncoderPoolStatus status;


  /**
   * The encoder version which the pool&#39;s instances will be running (required)
   * @return encoderVersion
   */
  public String getEncoderVersion() {
    return encoderVersion;
  }

  /**
   * The encoder version which the pool&#39;s instances will be running (required)
   *
   * @param encoderVersion
   *        The encoder version which the pool&#39;s instances will be running (required)
   */
  public void setEncoderVersion(String encoderVersion) {
    this.encoderVersion = encoderVersion;
  }


  /**
   * The cloud region in which the pool&#39;s instances will be running. Must be a specific region (e.g. not &#39;AUTO&#39;, &#39;GOOGLE&#39; or &#39;EUROPE&#39;) (required)
   * @return cloudRegion
   */
  public CloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * The cloud region in which the pool&#39;s instances will be running. Must be a specific region (e.g. not &#39;AUTO&#39;, &#39;GOOGLE&#39; or &#39;EUROPE&#39;) (required)
   *
   * @param cloudRegion
   *        The cloud region in which the pool&#39;s instances will be running. Must be a specific region (e.g. not &#39;AUTO&#39;, &#39;GOOGLE&#39; or &#39;EUROPE&#39;) (required)
   */
  public void setCloudRegion(CloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  /**
   * Define an external infrastructure to run the pool on.
   * @return infrastructureId
   */
  public String getInfrastructureId() {
    return infrastructureId;
  }

  /**
   * Define an external infrastructure to run the pool on.
   *
   * @param infrastructureId
   *        Define an external infrastructure to run the pool on.
   */
  public void setInfrastructureId(String infrastructureId) {
    this.infrastructureId = infrastructureId;
  }


  /**
   * Disk size of the prewarmed instances in GB. Needs to be chosen depending on input file sizes and encoding features used. (required)
   * @return diskSize
   */
  public PrewarmedEncoderDiskSize getDiskSize() {
    return diskSize;
  }

  /**
   * Disk size of the prewarmed instances in GB. Needs to be chosen depending on input file sizes and encoding features used. (required)
   *
   * @param diskSize
   *        Disk size of the prewarmed instances in GB. Needs to be chosen depending on input file sizes and encoding features used. (required)
   */
  public void setDiskSize(PrewarmedEncoderDiskSize diskSize) {
    this.diskSize = diskSize;
  }


  /**
   * Number of instances to keep prewarmed while the pool is running (required)
   * minimum: 1
   * @return targetPoolSize
   */
  public Integer getTargetPoolSize() {
    return targetPoolSize;
  }

  /**
   * Number of instances to keep prewarmed while the pool is running (required)
   * minimum: 1
   *
   * @param targetPoolSize
   *        Number of instances to keep prewarmed while the pool is running (required)
   *        minimum: 1
   */
  public void setTargetPoolSize(Integer targetPoolSize) {
    this.targetPoolSize = targetPoolSize;
  }


  /**
   * Activate dynamic pool behaviour. Pool will increase/decrease based on usage up until a size of 10 instances. Minimum pool size is set by targetPoolSize
   * @return dynamicPool
   */
  public Boolean getDynamicPool() {
    return dynamicPool;
  }

  /**
   * Activate dynamic pool behaviour. Pool will increase/decrease based on usage up until a size of 10 instances. Minimum pool size is set by targetPoolSize
   *
   * @param dynamicPool
   *        Activate dynamic pool behaviour. Pool will increase/decrease based on usage up until a size of 10 instances. Minimum pool size is set by targetPoolSize
   */
  public void setDynamicPool(Boolean dynamicPool) {
    this.dynamicPool = dynamicPool;
  }


  /**
   * Create pool with GPU instances for hardware encoding presets (e.g., VOD_HARDWARE_SHORTFORM).
   * @return gpuEnabled
   */
  public Boolean getGpuEnabled() {
    return gpuEnabled;
  }

  /**
   * Create pool with GPU instances for hardware encoding presets (e.g., VOD_HARDWARE_SHORTFORM).
   *
   * @param gpuEnabled
   *        Create pool with GPU instances for hardware encoding presets (e.g., VOD_HARDWARE_SHORTFORM).
   */
  public void setGpuEnabled(Boolean gpuEnabled) {
    this.gpuEnabled = gpuEnabled;
  }

  /**
   * Current status of the pool.
   * @return status
   */
  public PrewarmedEncoderPoolStatus getStatus() {
    return status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrewarmedEncoderPool prewarmedEncoderPool = (PrewarmedEncoderPool) o;
    return Objects.equals(this.encoderVersion, prewarmedEncoderPool.encoderVersion) &&
        Objects.equals(this.cloudRegion, prewarmedEncoderPool.cloudRegion) &&
        Objects.equals(this.infrastructureId, prewarmedEncoderPool.infrastructureId) &&
        Objects.equals(this.diskSize, prewarmedEncoderPool.diskSize) &&
        Objects.equals(this.targetPoolSize, prewarmedEncoderPool.targetPoolSize) &&
        Objects.equals(this.dynamicPool, prewarmedEncoderPool.dynamicPool) &&
        Objects.equals(this.gpuEnabled, prewarmedEncoderPool.gpuEnabled) &&
        Objects.equals(this.status, prewarmedEncoderPool.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoderVersion, cloudRegion, infrastructureId, diskSize, targetPoolSize, dynamicPool, gpuEnabled, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrewarmedEncoderPool {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encoderVersion: ").append(toIndentedString(encoderVersion)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    infrastructureId: ").append(toIndentedString(infrastructureId)).append("\n");
    sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
    sb.append("    targetPoolSize: ").append(toIndentedString(targetPoolSize)).append("\n");
    sb.append("    dynamicPool: ").append(toIndentedString(dynamicPool)).append("\n");
    sb.append("    gpuEnabled: ").append(toIndentedString(gpuEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


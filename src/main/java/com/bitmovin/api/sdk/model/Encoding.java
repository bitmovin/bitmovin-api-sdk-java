package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.CloudRegion;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.EncodingType;
import com.bitmovin.api.sdk.model.InfrastructureSettings;
import com.bitmovin.api.sdk.model.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Encoding
 */

public class Encoding extends BitmovinResource {
  @JsonProperty("type")
  private EncodingType type;

  @JsonProperty("startedAt")
  private Date startedAt;

  @JsonProperty("queuedAt")
  private Date queuedAt;

  @JsonProperty("runningAt")
  private Date runningAt;

  @JsonProperty("finishedAt")
  private Date finishedAt;

  @JsonProperty("errorAt")
  private Date errorAt;

  @JsonProperty("progress")
  private Integer progress;

  @JsonProperty("cloudRegion")
  private CloudRegion cloudRegion;

  @JsonProperty("fallbackCloudRegions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<CloudRegion> fallbackCloudRegions = new ArrayList<CloudRegion>();

  @JsonProperty("encoderVersion")
  private String encoderVersion;

  @JsonProperty("infrastructureId")
  private String infrastructureId;

  @JsonProperty("infrastructure")
  private InfrastructureSettings infrastructure;

  @JsonProperty("selectedEncoderVersion")
  private String selectedEncoderVersion;

  @JsonProperty("selectedEncodingMode")
  private EncodingMode selectedEncodingMode;

  @JsonProperty("selectedCloudRegion")
  private CloudRegion selectedCloudRegion;

  @JsonProperty("status")
  private Status status;

  @JsonProperty("labels")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> labels = new ArrayList<String>();

  /**
   * Type of the encoding
   * @return type
   */
  public EncodingType getType() {
    return type;
  }

  /**
   * Timestamp when the encoding was started, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return startedAt
   */
  public Date getStartedAt() {
    return startedAt;
  }

  /**
   * Timestamp when the encoding status changed to \&quot;QUEUED\&quot;, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return queuedAt
   */
  public Date getQueuedAt() {
    return queuedAt;
  }

  /**
   * Timestamp when the encoding status changed to to \&quot;RUNNING\&quot;, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return runningAt
   */
  public Date getRunningAt() {
    return runningAt;
  }

  /**
   * Timestamp when the encoding status changed to \&quot;FINISHED\&quot;, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return finishedAt
   */
  public Date getFinishedAt() {
    return finishedAt;
  }

  /**
   * Timestamp when the encoding status changed to \&quot;ERROR\&quot;, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return errorAt
   */
  public Date getErrorAt() {
    return errorAt;
  }

  /**
   * Progress of the encoding in percent
   * @return progress
   */
  public Integer getProgress() {
    return progress;
  }


  /**
   * Get cloudRegion
   * @return cloudRegion
   */
  public CloudRegion getCloudRegion() {
    return cloudRegion;
  }

  /**
   * Set cloudRegion
   *
   * @param cloudRegion
   */
  public void setCloudRegion(CloudRegion cloudRegion) {
    this.cloudRegion = cloudRegion;
  }


  public Encoding addFallbackCloudRegionsItem(CloudRegion fallbackCloudRegionsItem) {
    this.fallbackCloudRegions.add(fallbackCloudRegionsItem);
    return this;
  }

  /**
   * Specify a list of regions which are used in case the preferred region is down. Currently there are several restrictions. - The region has to be specific or AUTO - The region has to be for the same cloud provider as the default one - You can only configure at most 3 fallback regions 
   * @return fallbackCloudRegions
   */
  public List<CloudRegion> getFallbackCloudRegions() {
    return fallbackCloudRegions;
  }

  /**
   * Specify a list of regions which are used in case the preferred region is down. Currently there are several restrictions. - The region has to be specific or AUTO - The region has to be for the same cloud provider as the default one - You can only configure at most 3 fallback regions 
   *
   * @param fallbackCloudRegions
   *        Specify a list of regions which are used in case the preferred region is down. Currently there are several restrictions. - The region has to be specific or AUTO - The region has to be for the same cloud provider as the default one - You can only configure at most 3 fallback regions 
   */
  public void setFallbackCloudRegions(List<CloudRegion> fallbackCloudRegions) {
    this.fallbackCloudRegions = fallbackCloudRegions;
  }


  /**
   * Version of the encoder
   * @return encoderVersion
   */
  public String getEncoderVersion() {
    return encoderVersion;
  }

  /**
   * Version of the encoder
   *
   * @param encoderVersion
   *        Version of the encoder
   */
  public void setEncoderVersion(String encoderVersion) {
    this.encoderVersion = encoderVersion;
  }


  /**
   * Define an external infrastructure to run the encoding on. Note If you set this value, the &#x60;cloudRegion&#x60; must be &#39;EXTERNAL&#39;.
   * @return infrastructureId
   */
  public String getInfrastructureId() {
    return infrastructureId;
  }

  /**
   * Define an external infrastructure to run the encoding on. Note If you set this value, the &#x60;cloudRegion&#x60; must be &#39;EXTERNAL&#39;.
   *
   * @param infrastructureId
   *        Define an external infrastructure to run the encoding on. Note If you set this value, the &#x60;cloudRegion&#x60; must be &#39;EXTERNAL&#39;.
   */
  public void setInfrastructureId(String infrastructureId) {
    this.infrastructureId = infrastructureId;
  }


  /**
   * Get infrastructure
   * @return infrastructure
   */
  public InfrastructureSettings getInfrastructure() {
    return infrastructure;
  }

  /**
   * Set infrastructure
   *
   * @param infrastructure
   */
  public void setInfrastructure(InfrastructureSettings infrastructure) {
    this.infrastructure = infrastructure;
  }

  /**
   * Will be set to the encoder version that was actually used for the encoding. This is especially useful when starting an encoding with a version tag like STABLE or BETA.
   * @return selectedEncoderVersion
   */
  public String getSelectedEncoderVersion() {
    return selectedEncoderVersion;
  }

  /**
   * Will be set to the encoding mode that was actually used for the encoding. This is especially useful when starting an encoding with encoding mode STANDARD.
   * @return selectedEncodingMode
   */
  public EncodingMode getSelectedEncodingMode() {
    return selectedEncodingMode;
  }

  /**
   * Contains the region which was selected when cloudregion:AUTO was specified
   * @return selectedCloudRegion
   */
  public CloudRegion getSelectedCloudRegion() {
    return selectedCloudRegion;
  }

  /**
   * The current status of the encoding.
   * @return status
   */
  public Status getStatus() {
    return status;
  }


  public Encoding addLabelsItem(String labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * You may pass a list of groups associated with this encoding. This will enable you to group results in the statistics resource
   * @return labels
   */
  public List<String> getLabels() {
    return labels;
  }

  /**
   * You may pass a list of groups associated with this encoding. This will enable you to group results in the statistics resource
   *
   * @param labels
   *        You may pass a list of groups associated with this encoding. This will enable you to group results in the statistics resource
   */
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Encoding encoding = (Encoding) o;
    return Objects.equals(this.type, encoding.type) &&
        Objects.equals(this.startedAt, encoding.startedAt) &&
        Objects.equals(this.queuedAt, encoding.queuedAt) &&
        Objects.equals(this.runningAt, encoding.runningAt) &&
        Objects.equals(this.finishedAt, encoding.finishedAt) &&
        Objects.equals(this.errorAt, encoding.errorAt) &&
        Objects.equals(this.progress, encoding.progress) &&
        Objects.equals(this.cloudRegion, encoding.cloudRegion) &&
        Objects.equals(this.fallbackCloudRegions, encoding.fallbackCloudRegions) &&
        Objects.equals(this.encoderVersion, encoding.encoderVersion) &&
        Objects.equals(this.infrastructureId, encoding.infrastructureId) &&
        Objects.equals(this.infrastructure, encoding.infrastructure) &&
        Objects.equals(this.selectedEncoderVersion, encoding.selectedEncoderVersion) &&
        Objects.equals(this.selectedEncodingMode, encoding.selectedEncodingMode) &&
        Objects.equals(this.selectedCloudRegion, encoding.selectedCloudRegion) &&
        Objects.equals(this.status, encoding.status) &&
        Objects.equals(this.labels, encoding.labels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startedAt, queuedAt, runningAt, finishedAt, errorAt, progress, cloudRegion, fallbackCloudRegions, encoderVersion, infrastructureId, infrastructure, selectedEncoderVersion, selectedEncodingMode, selectedCloudRegion, status, labels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Encoding {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    queuedAt: ").append(toIndentedString(queuedAt)).append("\n");
    sb.append("    runningAt: ").append(toIndentedString(runningAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    errorAt: ").append(toIndentedString(errorAt)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    cloudRegion: ").append(toIndentedString(cloudRegion)).append("\n");
    sb.append("    fallbackCloudRegions: ").append(toIndentedString(fallbackCloudRegions)).append("\n");
    sb.append("    encoderVersion: ").append(toIndentedString(encoderVersion)).append("\n");
    sb.append("    infrastructureId: ").append(toIndentedString(infrastructureId)).append("\n");
    sb.append("    infrastructure: ").append(toIndentedString(infrastructure)).append("\n");
    sb.append("    selectedEncoderVersion: ").append(toIndentedString(selectedEncoderVersion)).append("\n");
    sb.append("    selectedEncodingMode: ").append(toIndentedString(selectedEncodingMode)).append("\n");
    sb.append("    selectedCloudRegion: ").append(toIndentedString(selectedCloudRegion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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


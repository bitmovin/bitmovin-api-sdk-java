package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InputType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Details about an individual ingestPoint within the live ingest.
 */

public class LiveEncodingHeartbeatIngestPoint {
  @JsonProperty("name")
  private String name;

  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputType")
  private InputType inputType;

  @JsonProperty("isActive")
  private Boolean isActive;

  @JsonProperty("isBackup")
  private Boolean isBackup;


  /**
   * The name of the ingestPoint of the original Input resource. 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * The name of the ingestPoint of the original Input resource. 
   *
   * @param name
   *        The name of the ingestPoint of the original Input resource. 
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Id of the original Input resource. Note that multiple input points (main and backup) can be part of a single Input resource. 
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Id of the original Input resource. Note that multiple input points (main and backup) can be part of a single Input resource. 
   *
   * @param inputId
   *        Id of the original Input resource. Note that multiple input points (main and backup) can be part of a single Input resource. 
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Get inputType
   * @return inputType
   */
  public InputType getInputType() {
    return inputType;
  }

  /**
   * Set inputType
   *
   * @param inputType
   */
  public void setInputType(InputType inputType) {
    this.inputType = inputType;
  }


  /**
   * Indicates whether this particular input is active.
   * @return isActive
   */
  public Boolean getIsActive() {
    return isActive;
  }

  /**
   * Indicates whether this particular input is active.
   *
   * @param isActive
   *        Indicates whether this particular input is active.
   */
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  /**
   * Indicates whether this particular input is a backup input.
   * @return isBackup
   */
  public Boolean getIsBackup() {
    return isBackup;
  }

  /**
   * Indicates whether this particular input is a backup input.
   *
   * @param isBackup
   *        Indicates whether this particular input is a backup input.
   */
  public void setIsBackup(Boolean isBackup) {
    this.isBackup = isBackup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatIngestPoint liveEncodingHeartbeatIngestPoint = (LiveEncodingHeartbeatIngestPoint) o;
    return Objects.equals(this.name, liveEncodingHeartbeatIngestPoint.name) &&
        Objects.equals(this.inputId, liveEncodingHeartbeatIngestPoint.inputId) &&
        Objects.equals(this.inputType, liveEncodingHeartbeatIngestPoint.inputType) &&
        Objects.equals(this.isActive, liveEncodingHeartbeatIngestPoint.isActive) &&
        Objects.equals(this.isBackup, liveEncodingHeartbeatIngestPoint.isBackup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, inputId, inputType, isActive, isBackup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatIngestPoint {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isBackup: ").append(toIndentedString(isBackup)).append("\n");
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


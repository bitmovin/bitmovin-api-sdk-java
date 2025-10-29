package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SubtaskMetadataData
 */

public class SubtaskMetadataData {
  @JsonProperty("avgFramesEncodedPerSecond")
  private Double avgFramesEncodedPerSecond;

  @JsonProperty("bytesEncoded")
  private Long bytesEncoded;

  @JsonProperty("framesAnalysed")
  private Long framesAnalysed;

  @JsonProperty("framesEncoded")
  private Long framesEncoded;

  @JsonProperty("realtimeFactor")
  private Double realtimeFactor;

  @JsonProperty("size")
  private Long size;


  /**
   * Get avgFramesEncodedPerSecond
   * @return avgFramesEncodedPerSecond
   */
  public Double getAvgFramesEncodedPerSecond() {
    return avgFramesEncodedPerSecond;
  }

  /**
   * Set avgFramesEncodedPerSecond
   *
   * @param avgFramesEncodedPerSecond
   */
  public void setAvgFramesEncodedPerSecond(Double avgFramesEncodedPerSecond) {
    this.avgFramesEncodedPerSecond = avgFramesEncodedPerSecond;
  }


  /**
   * Get bytesEncoded
   * @return bytesEncoded
   */
  public Long getBytesEncoded() {
    return bytesEncoded;
  }

  /**
   * Set bytesEncoded
   *
   * @param bytesEncoded
   */
  public void setBytesEncoded(Long bytesEncoded) {
    this.bytesEncoded = bytesEncoded;
  }


  /**
   * Get framesAnalysed
   * @return framesAnalysed
   */
  public Long getFramesAnalysed() {
    return framesAnalysed;
  }

  /**
   * Set framesAnalysed
   *
   * @param framesAnalysed
   */
  public void setFramesAnalysed(Long framesAnalysed) {
    this.framesAnalysed = framesAnalysed;
  }


  /**
   * Get framesEncoded
   * @return framesEncoded
   */
  public Long getFramesEncoded() {
    return framesEncoded;
  }

  /**
   * Set framesEncoded
   *
   * @param framesEncoded
   */
  public void setFramesEncoded(Long framesEncoded) {
    this.framesEncoded = framesEncoded;
  }


  /**
   * Get realtimeFactor
   * @return realtimeFactor
   */
  public Double getRealtimeFactor() {
    return realtimeFactor;
  }

  /**
   * Set realtimeFactor
   *
   * @param realtimeFactor
   */
  public void setRealtimeFactor(Double realtimeFactor) {
    this.realtimeFactor = realtimeFactor;
  }


  /**
   * Get size
   * @return size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Set size
   *
   * @param size
   */
  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtaskMetadataData subtaskMetadataData = (SubtaskMetadataData) o;
    return Objects.equals(this.avgFramesEncodedPerSecond, subtaskMetadataData.avgFramesEncodedPerSecond) &&
        Objects.equals(this.bytesEncoded, subtaskMetadataData.bytesEncoded) &&
        Objects.equals(this.framesAnalysed, subtaskMetadataData.framesAnalysed) &&
        Objects.equals(this.framesEncoded, subtaskMetadataData.framesEncoded) &&
        Objects.equals(this.realtimeFactor, subtaskMetadataData.realtimeFactor) &&
        Objects.equals(this.size, subtaskMetadataData.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgFramesEncodedPerSecond, bytesEncoded, framesAnalysed, framesEncoded, realtimeFactor, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtaskMetadataData {\n");
    
    sb.append("    avgFramesEncodedPerSecond: ").append(toIndentedString(avgFramesEncodedPerSecond)).append("\n");
    sb.append("    bytesEncoded: ").append(toIndentedString(bytesEncoded)).append("\n");
    sb.append("    framesAnalysed: ").append(toIndentedString(framesAnalysed)).append("\n");
    sb.append("    framesEncoded: ").append(toIndentedString(framesEncoded)).append("\n");
    sb.append("    realtimeFactor: ").append(toIndentedString(realtimeFactor)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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


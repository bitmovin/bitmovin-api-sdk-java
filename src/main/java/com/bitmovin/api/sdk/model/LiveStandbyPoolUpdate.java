package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolUpdate
 */

public class LiveStandbyPoolUpdate {
  @JsonProperty("targetPoolSize")
  private Integer targetPoolSize;

  @JsonProperty("encodingTemplate")
  private String encodingTemplate;


  /**
   * Number of instances to keep ready for streaming while the pool is running
   * minimum: 0
   * @return targetPoolSize
   */
  public Integer getTargetPoolSize() {
    return targetPoolSize;
  }

  /**
   * Number of instances to keep ready for streaming while the pool is running
   * minimum: 0
   *
   * @param targetPoolSize
   *        Number of instances to keep ready for streaming while the pool is running
   *        minimum: 0
   */
  public void setTargetPoolSize(Integer targetPoolSize) {
    this.targetPoolSize = targetPoolSize;
  }


  /**
   * Base64 encoded template used to start the encodings in the pool
   * @return encodingTemplate
   */
  public String getEncodingTemplate() {
    return encodingTemplate;
  }

  /**
   * Base64 encoded template used to start the encodings in the pool
   *
   * @param encodingTemplate
   *        Base64 encoded template used to start the encodings in the pool
   */
  public void setEncodingTemplate(String encodingTemplate) {
    this.encodingTemplate = encodingTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolUpdate liveStandbyPoolUpdate = (LiveStandbyPoolUpdate) o;
    return Objects.equals(this.targetPoolSize, liveStandbyPoolUpdate.targetPoolSize) &&
        Objects.equals(this.encodingTemplate, liveStandbyPoolUpdate.encodingTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPoolSize, encodingTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolUpdate {\n");
    
    sb.append("    targetPoolSize: ").append(toIndentedString(targetPoolSize)).append("\n");
    sb.append("    encodingTemplate: ").append(toIndentedString(encodingTemplate)).append("\n");
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


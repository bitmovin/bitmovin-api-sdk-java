package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Scheduling
 */

public class Scheduling {
  @JsonProperty("priority")
  private Integer priority;

  @JsonProperty("prewarmedEncoderPoolIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> prewarmedEncoderPoolIds = new ArrayList<String>();


  /**
   * Specify the priority of this encoding (0 - 100). Higher numbers mean higher priority. Default is 50.
   * minimum: 0
   * maximum: 100
   * @return priority
   */
  public Integer getPriority() {
    return priority;
  }

  /**
   * Specify the priority of this encoding (0 - 100). Higher numbers mean higher priority. Default is 50.
   * minimum: 0
   * maximum: 100
   *
   * @param priority
   *        Specify the priority of this encoding (0 - 100). Higher numbers mean higher priority. Default is 50.
   *        minimum: 0
   *        maximum: 100
   */
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Scheduling addPrewarmedEncoderPoolIdsItem(String prewarmedEncoderPoolIdsItem) {
    this.prewarmedEncoderPoolIds.add(prewarmedEncoderPoolIdsItem);
    return this;
  }

  /**
   * List of prewarmed encoder pools. If set, prewarmed encoders from pools with these IDs will be used for the encoding if available. The pool IDs will be tried in the order in which they are passed.
   * @return prewarmedEncoderPoolIds
   */
  public List<String> getPrewarmedEncoderPoolIds() {
    return prewarmedEncoderPoolIds;
  }

  /**
   * List of prewarmed encoder pools. If set, prewarmed encoders from pools with these IDs will be used for the encoding if available. The pool IDs will be tried in the order in which they are passed.
   *
   * @param prewarmedEncoderPoolIds
   *        List of prewarmed encoder pools. If set, prewarmed encoders from pools with these IDs will be used for the encoding if available. The pool IDs will be tried in the order in which they are passed.
   */
  public void setPrewarmedEncoderPoolIds(List<String> prewarmedEncoderPoolIds) {
    this.prewarmedEncoderPoolIds = prewarmedEncoderPoolIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scheduling scheduling = (Scheduling) o;
    return Objects.equals(this.priority, scheduling.priority) &&
        Objects.equals(this.prewarmedEncoderPoolIds, scheduling.prewarmedEncoderPoolIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, prewarmedEncoderPoolIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scheduling {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    prewarmedEncoderPoolIds: ").append(toIndentedString(prewarmedEncoderPoolIds)).append("\n");
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


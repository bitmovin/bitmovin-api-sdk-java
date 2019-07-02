package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.ObjectDetectionResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ObjectDetectionTimestampResult
 */

public class ObjectDetectionTimestampResult extends BitmovinResponse {
  @JsonProperty("timestamp")
  private Double timestamp;

  @JsonProperty("objects")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ObjectDetectionResult> objects = new ArrayList<ObjectDetectionResult>();


  /**
   * Time in seconds where the object was detected in the video
   * @return timestamp
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Time in seconds where the object was detected in the video
   *
   * @param timestamp
   *        Time in seconds where the object was detected in the video
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }


  public ObjectDetectionTimestampResult addObjectsItem(ObjectDetectionResult objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

  /**
   * Objects detected for the given timestamp
   * @return objects
   */
  public List<ObjectDetectionResult> getObjects() {
    return objects;
  }

  /**
   * Objects detected for the given timestamp
   *
   * @param objects
   *        Objects detected for the given timestamp
   */
  public void setObjects(List<ObjectDetectionResult> objects) {
    this.objects = objects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectDetectionTimestampResult objectDetectionTimestampResult = (ObjectDetectionTimestampResult) o;
    return Objects.equals(this.timestamp, objectDetectionTimestampResult.timestamp) &&
        Objects.equals(this.objects, objectDetectionTimestampResult.objects) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, objects, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDetectionTimestampResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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


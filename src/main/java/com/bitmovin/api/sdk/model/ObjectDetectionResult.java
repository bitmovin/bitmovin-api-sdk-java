package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.ObjectDetectionBoundingBox;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ObjectDetectionResult
 */

public class ObjectDetectionResult extends BitmovinResponse {
  @JsonProperty("detectedObject")
  private String detectedObject;

  @JsonProperty("timestamp")
  private Double timestamp;

  @JsonProperty("score")
  private Double score;

  @JsonProperty("boundingBox")
  private ObjectDetectionBoundingBox boundingBox;


  /**
   * Name of the object that has been detected (in English)
   * @return detectedObject
   */
  public String getDetectedObject() {
    return detectedObject;
  }

  /**
   * Name of the object that has been detected (in English)
   *
   * @param detectedObject
   * Name of the object that has been detected (in English)
   */
  public void setDetectedObject(String detectedObject) {
    this.detectedObject = detectedObject;
  }


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
   * Time in seconds where the object was detected in the video
   */
  public void setTimestamp(Double timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * A number between 0 and 1 indicating the confidence of the detection
   * @return score
   */
  public Double getScore() {
    return score;
  }

  /**
   * A number between 0 and 1 indicating the confidence of the detection
   *
   * @param score
   * A number between 0 and 1 indicating the confidence of the detection
   */
  public void setScore(Double score) {
    this.score = score;
  }


  /**
   * A box indicating the position and size of the detected object within the frame
   * @return boundingBox
   */
  public ObjectDetectionBoundingBox getBoundingBox() {
    return boundingBox;
  }

  /**
   * A box indicating the position and size of the detected object within the frame
   *
   * @param boundingBox
   * A box indicating the position and size of the detected object within the frame
   */
  public void setBoundingBox(ObjectDetectionBoundingBox boundingBox) {
    this.boundingBox = boundingBox;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectDetectionResult objectDetectionResult = (ObjectDetectionResult) o;
    return Objects.equals(this.detectedObject, objectDetectionResult.detectedObject) &&
        Objects.equals(this.timestamp, objectDetectionResult.timestamp) &&
        Objects.equals(this.score, objectDetectionResult.score) &&
        Objects.equals(this.boundingBox, objectDetectionResult.boundingBox) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detectedObject, timestamp, score, boundingBox, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDetectionResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    detectedObject: ").append(toIndentedString(detectedObject)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    boundingBox: ").append(toIndentedString(boundingBox)).append("\n");
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


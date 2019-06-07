package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ObjectDetectionBoundingBox
 */

public class ObjectDetectionBoundingBox {
  @JsonProperty("topLeftX")
  private Double topLeftX;

  @JsonProperty("topLeftY")
  private Double topLeftY;

  @JsonProperty("bottomRightX")
  private Double bottomRightX;

  @JsonProperty("bottomRightY")
  private Double bottomRightY;


  /**
   * Horizontal position of the top left corner, given as a fraction of the frame width
   * @return topLeftX
   */
  public Double getTopLeftX() {
    return topLeftX;
  }

  /**
   * Horizontal position of the top left corner, given as a fraction of the frame width
   *
   * @param topLeftX
   * Horizontal position of the top left corner, given as a fraction of the frame width
   */
  public void setTopLeftX(Double topLeftX) {
    this.topLeftX = topLeftX;
  }


  /**
   * Vertical position of the top left corner, given as a fraction of the frame height
   * @return topLeftY
   */
  public Double getTopLeftY() {
    return topLeftY;
  }

  /**
   * Vertical position of the top left corner, given as a fraction of the frame height
   *
   * @param topLeftY
   * Vertical position of the top left corner, given as a fraction of the frame height
   */
  public void setTopLeftY(Double topLeftY) {
    this.topLeftY = topLeftY;
  }


  /**
   * Horizontal position of the bottom right corner, given as a fraction of the frame width
   * @return bottomRightX
   */
  public Double getBottomRightX() {
    return bottomRightX;
  }

  /**
   * Horizontal position of the bottom right corner, given as a fraction of the frame width
   *
   * @param bottomRightX
   * Horizontal position of the bottom right corner, given as a fraction of the frame width
   */
  public void setBottomRightX(Double bottomRightX) {
    this.bottomRightX = bottomRightX;
  }


  /**
   * Vertical position of the bottom right corner, given as a fraction of the frame height
   * @return bottomRightY
   */
  public Double getBottomRightY() {
    return bottomRightY;
  }

  /**
   * Vertical position of the bottom right corner, given as a fraction of the frame height
   *
   * @param bottomRightY
   * Vertical position of the bottom right corner, given as a fraction of the frame height
   */
  public void setBottomRightY(Double bottomRightY) {
    this.bottomRightY = bottomRightY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectDetectionBoundingBox objectDetectionBoundingBox = (ObjectDetectionBoundingBox) o;
    return Objects.equals(this.topLeftX, objectDetectionBoundingBox.topLeftX) &&
        Objects.equals(this.topLeftY, objectDetectionBoundingBox.topLeftY) &&
        Objects.equals(this.bottomRightX, objectDetectionBoundingBox.bottomRightX) &&
        Objects.equals(this.bottomRightY, objectDetectionBoundingBox.bottomRightY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topLeftX, topLeftY, bottomRightX, bottomRightY);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectDetectionBoundingBox {\n");
    
    sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
    sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
    sb.append("    bottomRightX: ").append(toIndentedString(bottomRightX)).append("\n");
    sb.append("    bottomRightY: ").append(toIndentedString(bottomRightY)).append("\n");
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


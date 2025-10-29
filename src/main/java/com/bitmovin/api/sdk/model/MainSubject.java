package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents a main subject or object detected within a shot, including its classification, spatial position, and appearance timing
 */

public class MainSubject {
  @JsonProperty("classification")
  private String classification;

  @JsonProperty("description")
  private String description;

  @JsonProperty("appearanceTimeInSeconds")
  private BigDecimal appearanceTimeInSeconds;

  @JsonProperty("centerX")
  private BigDecimal centerX;

  @JsonProperty("centerY")
  private BigDecimal centerY;


  /**
   * The category or type of the detected subject based on the YOLOv8 OIv7 (Open Images V7) object detection model (e.g., &#39;person&#39;, &#39;vehicle&#39;, &#39;building&#39;) (required)
   * @return classification
   */
  public String getClassification() {
    return classification;
  }

  /**
   * The category or type of the detected subject based on the YOLOv8 OIv7 (Open Images V7) object detection model (e.g., &#39;person&#39;, &#39;vehicle&#39;, &#39;building&#39;) (required)
   *
   * @param classification
   *        The category or type of the detected subject based on the YOLOv8 OIv7 (Open Images V7) object detection model (e.g., &#39;person&#39;, &#39;vehicle&#39;, &#39;building&#39;) (required)
   */
  public void setClassification(String classification) {
    this.classification = classification;
  }


  /**
   * A detailed textual description of the subject&#39;s appearance and characteristics (required)
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * A detailed textual description of the subject&#39;s appearance and characteristics (required)
   *
   * @param description
   *        A detailed textual description of the subject&#39;s appearance and characteristics (required)
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The timestamp in seconds when this subject first appears or is most prominently visible in the shot (required)
   * @return appearanceTimeInSeconds
   */
  public BigDecimal getAppearanceTimeInSeconds() {
    return appearanceTimeInSeconds;
  }

  /**
   * The timestamp in seconds when this subject first appears or is most prominently visible in the shot (required)
   *
   * @param appearanceTimeInSeconds
   *        The timestamp in seconds when this subject first appears or is most prominently visible in the shot (required)
   */
  public void setAppearanceTimeInSeconds(BigDecimal appearanceTimeInSeconds) {
    this.appearanceTimeInSeconds = appearanceTimeInSeconds;
  }


  /**
   * The horizontal center position of the subject as a percentage from the left edge (0-100, where 0 is the left edge and 100 is the right edge) (required)
   * @return centerX
   */
  public BigDecimal getCenterX() {
    return centerX;
  }

  /**
   * The horizontal center position of the subject as a percentage from the left edge (0-100, where 0 is the left edge and 100 is the right edge) (required)
   *
   * @param centerX
   *        The horizontal center position of the subject as a percentage from the left edge (0-100, where 0 is the left edge and 100 is the right edge) (required)
   */
  public void setCenterX(BigDecimal centerX) {
    this.centerX = centerX;
  }


  /**
   * The vertical center position of the subject as a percentage from the top edge (0-100, where 0 is the top edge and 100 is the bottom edge) (required)
   * @return centerY
   */
  public BigDecimal getCenterY() {
    return centerY;
  }

  /**
   * The vertical center position of the subject as a percentage from the top edge (0-100, where 0 is the top edge and 100 is the bottom edge) (required)
   *
   * @param centerY
   *        The vertical center position of the subject as a percentage from the top edge (0-100, where 0 is the top edge and 100 is the bottom edge) (required)
   */
  public void setCenterY(BigDecimal centerY) {
    this.centerY = centerY;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainSubject mainSubject = (MainSubject) o;
    return Objects.equals(this.classification, mainSubject.classification) &&
        Objects.equals(this.description, mainSubject.description) &&
        Objects.equals(this.appearanceTimeInSeconds, mainSubject.appearanceTimeInSeconds) &&
        Objects.equals(this.centerX, mainSubject.centerX) &&
        Objects.equals(this.centerY, mainSubject.centerY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classification, description, appearanceTimeInSeconds, centerX, centerY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainSubject {\n");
    
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    appearanceTimeInSeconds: ").append(toIndentedString(appearanceTimeInSeconds)).append("\n");
    sb.append("    centerX: ").append(toIndentedString(centerX)).append("\n");
    sb.append("    centerY: ").append(toIndentedString(centerY)).append("\n");
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


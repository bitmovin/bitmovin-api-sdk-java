package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.ThumbnailAspectMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Either height or width is required. It is also possible to set both properties.
 */

public class Bif extends BitmovinResource {
  @JsonProperty("height")
  private Integer height;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("distance")
  private Double distance;

  @JsonProperty("filename")
  private String filename;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutput> outputs = new ArrayList<EncodingOutput>();

  @JsonProperty("aspectMode")
  private ThumbnailAspectMode aspectMode;


  /**
   * Height of one thumbnail
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * Height of one thumbnail
   *
   * @param height
   *        Height of one thumbnail
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Width of one thumbnail. Roku recommends a width of 240 for SD and 320 for HD.
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * Width of one thumbnail. Roku recommends a width of 240 for SD and 320 for HD.
   *
   * @param width
   *        Width of one thumbnail. Roku recommends a width of 240 for SD and 320 for HD.
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * Distance in seconds between a screenshot (required)
   * minimum: 0
   * @return distance
   */
  public Double getDistance() {
    return distance;
  }

  /**
   * Distance in seconds between a screenshot (required)
   * minimum: 0
   *
   * @param distance
   *        Distance in seconds between a screenshot (required)
   *        minimum: 0
   */
  public void setDistance(Double distance) {
    this.distance = distance;
  }


  /**
   * Filename of the Bif image. (required)
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Filename of the Bif image. (required)
   *
   * @param filename
   *        Filename of the Bif image. (required)
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  public Bif addOutputsItem(EncodingOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<EncodingOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<EncodingOutput> outputs) {
    this.outputs = outputs;
  }


  /**
   * Specifies the aspect mode that is used when both height and width are specified Only supported starting with encoder version &#x60;2.85.0&#x60;. 
   * @return aspectMode
   */
  public ThumbnailAspectMode getAspectMode() {
    return aspectMode;
  }

  /**
   * Specifies the aspect mode that is used when both height and width are specified Only supported starting with encoder version &#x60;2.85.0&#x60;. 
   *
   * @param aspectMode
   *        Specifies the aspect mode that is used when both height and width are specified Only supported starting with encoder version &#x60;2.85.0&#x60;. 
   */
  public void setAspectMode(ThumbnailAspectMode aspectMode) {
    this.aspectMode = aspectMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bif bif = (Bif) o;
    return Objects.equals(this.height, bif.height) &&
        Objects.equals(this.width, bif.width) &&
        Objects.equals(this.distance, bif.distance) &&
        Objects.equals(this.filename, bif.filename) &&
        Objects.equals(this.outputs, bif.outputs) &&
        Objects.equals(this.aspectMode, bif.aspectMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, width, distance, filename, outputs, aspectMode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bif {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    aspectMode: ").append(toIndentedString(aspectMode)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Filter;
import com.bitmovin.api.sdk.model.ScalingAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ScaleFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = ScaleFilter.class)
public class ScaleFilter extends Filter {
  @JsonProperty("width")
  private Integer width;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("scalingAlgorithm")
  private ScalingAlgorithm scalingAlgorithm;

  @JsonProperty("sampleAspectRatioNumerator")
  private Integer sampleAspectRatioNumerator;

  @JsonProperty("sampleAspectRatioDenominator")
  private Integer sampleAspectRatioDenominator;


  /**
   * The width of the output frame in pixel. If not set: codec configuration width will be used.
   * @return width
   */
  public Integer getWidth() {
    return width;
  }

  /**
   * The width of the output frame in pixel. If not set: codec configuration width will be used.
   *
   * @param width
   *        The width of the output frame in pixel. If not set: codec configuration width will be used.
   */
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * The height of the output frame in pixel. If not set: codec configuration height will be used.
   * @return height
   */
  public Integer getHeight() {
    return height;
  }

  /**
   * The height of the output frame in pixel. If not set: codec configuration height will be used.
   *
   * @param height
   *        The height of the output frame in pixel. If not set: codec configuration height will be used.
   */
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Get scalingAlgorithm
   * @return scalingAlgorithm
   */
  public ScalingAlgorithm getScalingAlgorithm() {
    return scalingAlgorithm;
  }

  /**
   * Set scalingAlgorithm
   *
   * @param scalingAlgorithm
   */
  public void setScalingAlgorithm(ScalingAlgorithm scalingAlgorithm) {
    this.scalingAlgorithm = scalingAlgorithm;
  }


  /**
   * The numerator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioDenominator is set.
   * @return sampleAspectRatioNumerator
   */
  public Integer getSampleAspectRatioNumerator() {
    return sampleAspectRatioNumerator;
  }

  /**
   * The numerator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioDenominator is set.
   *
   * @param sampleAspectRatioNumerator
   *        The numerator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioDenominator is set.
   */
  public void setSampleAspectRatioNumerator(Integer sampleAspectRatioNumerator) {
    this.sampleAspectRatioNumerator = sampleAspectRatioNumerator;
  }


  /**
   * The denominator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioNumerator is set.
   * @return sampleAspectRatioDenominator
   */
  public Integer getSampleAspectRatioDenominator() {
    return sampleAspectRatioDenominator;
  }

  /**
   * The denominator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioNumerator is set.
   *
   * @param sampleAspectRatioDenominator
   *        The denominator of the sample aspect ratio (also known as pixel aspect ratio). Must be set if sampleAspectRatioNumerator is set.
   */
  public void setSampleAspectRatioDenominator(Integer sampleAspectRatioDenominator) {
    this.sampleAspectRatioDenominator = sampleAspectRatioDenominator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleFilter scaleFilter = (ScaleFilter) o;
    return Objects.equals(this.width, scaleFilter.width) &&
        Objects.equals(this.height, scaleFilter.height) &&
        Objects.equals(this.scalingAlgorithm, scaleFilter.scalingAlgorithm) &&
        Objects.equals(this.sampleAspectRatioNumerator, scaleFilter.sampleAspectRatioNumerator) &&
        Objects.equals(this.sampleAspectRatioDenominator, scaleFilter.sampleAspectRatioDenominator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, scalingAlgorithm, sampleAspectRatioNumerator, sampleAspectRatioDenominator, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    scalingAlgorithm: ").append(toIndentedString(scalingAlgorithm)).append("\n");
    sb.append("    sampleAspectRatioNumerator: ").append(toIndentedString(sampleAspectRatioNumerator)).append("\n");
    sb.append("    sampleAspectRatioDenominator: ").append(toIndentedString(sampleAspectRatioDenominator)).append("\n");
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


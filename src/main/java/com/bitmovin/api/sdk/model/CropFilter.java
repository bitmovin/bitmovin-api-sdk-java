package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Filter;
import com.bitmovin.api.sdk.model.PositionUnit;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CropFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = CropFilter.class)
public class CropFilter extends Filter {
  @JsonProperty("left")
  private Integer left;

  @JsonProperty("right")
  private Integer right;

  @JsonProperty("top")
  private Integer top;

  @JsonProperty("bottom")
  private Integer bottom;

  @JsonProperty("unit")
  private PositionUnit unit;


  /**
   * Amount of pixels that will be cropped of the input video from the left side. Must be zero or a positive value.
   * @return left
   */
  public Integer getLeft() {
    return left;
  }

  /**
   * Amount of pixels that will be cropped of the input video from the left side. Must be zero or a positive value.
   *
   * @param left
   *        Amount of pixels that will be cropped of the input video from the left side. Must be zero or a positive value.
   */
  public void setLeft(Integer left) {
    this.left = left;
  }


  /**
   * Amount of pixels that will be cropped of the input video from the right side. Must be zero or a positive value.
   * @return right
   */
  public Integer getRight() {
    return right;
  }

  /**
   * Amount of pixels that will be cropped of the input video from the right side. Must be zero or a positive value.
   *
   * @param right
   *        Amount of pixels that will be cropped of the input video from the right side. Must be zero or a positive value.
   */
  public void setRight(Integer right) {
    this.right = right;
  }


  /**
   * Amount of pixels that will be cropped of the input video from the top. Must be zero or a positive value.
   * @return top
   */
  public Integer getTop() {
    return top;
  }

  /**
   * Amount of pixels that will be cropped of the input video from the top. Must be zero or a positive value.
   *
   * @param top
   *        Amount of pixels that will be cropped of the input video from the top. Must be zero or a positive value.
   */
  public void setTop(Integer top) {
    this.top = top;
  }


  /**
   * Amount of pixels that will be cropped of the input video from the bottom. Must be zero or a positive value.
   * @return bottom
   */
  public Integer getBottom() {
    return bottom;
  }

  /**
   * Amount of pixels that will be cropped of the input video from the bottom. Must be zero or a positive value.
   *
   * @param bottom
   *        Amount of pixels that will be cropped of the input video from the bottom. Must be zero or a positive value.
   */
  public void setBottom(Integer bottom) {
    this.bottom = bottom;
  }


  /**
   * Get unit
   * @return unit
   */
  public PositionUnit getUnit() {
    return unit;
  }

  /**
   * Set unit
   *
   * @param unit
   */
  public void setUnit(PositionUnit unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CropFilter cropFilter = (CropFilter) o;
    return Objects.equals(this.left, cropFilter.left) &&
        Objects.equals(this.right, cropFilter.right) &&
        Objects.equals(this.top, cropFilter.top) &&
        Objects.equals(this.bottom, cropFilter.bottom) &&
        Objects.equals(this.unit, cropFilter.unit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right, top, bottom, unit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CropFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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


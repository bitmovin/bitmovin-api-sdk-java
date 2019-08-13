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
 * WatermarkFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = WatermarkFilter.class)
public class WatermarkFilter extends Filter {
  @JsonProperty("image")
  private String image;

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
   * URL of the file to be used as watermark image. Supported image formats: PNG, JPEG, BMP, GIF (required)
   * @return image
   */
  public String getImage() {
    return image;
  }

  /**
   * URL of the file to be used as watermark image. Supported image formats: PNG, JPEG, BMP, GIF (required)
   *
   * @param image
   *        URL of the file to be used as watermark image. Supported image formats: PNG, JPEG, BMP, GIF (required)
   */
  public void setImage(String image) {
    this.image = image;
  }


  /**
   * Distance from the left edge of the input video to the left edge of the watermark image. May not be set if &#39;right&#39; is set.
   * @return left
   */
  public Integer getLeft() {
    return left;
  }

  /**
   * Distance from the left edge of the input video to the left edge of the watermark image. May not be set if &#39;right&#39; is set.
   *
   * @param left
   *        Distance from the left edge of the input video to the left edge of the watermark image. May not be set if &#39;right&#39; is set.
   */
  public void setLeft(Integer left) {
    this.left = left;
  }


  /**
   * Distance from the right edge of the input video to the right edge of the watermark image . May not be set if &#39;left&#39; is set.
   * @return right
   */
  public Integer getRight() {
    return right;
  }

  /**
   * Distance from the right edge of the input video to the right edge of the watermark image . May not be set if &#39;left&#39; is set.
   *
   * @param right
   *        Distance from the right edge of the input video to the right edge of the watermark image . May not be set if &#39;left&#39; is set.
   */
  public void setRight(Integer right) {
    this.right = right;
  }


  /**
   * Distance from the top edge of the input video to the top edge of the watermark image. May not be set if &#39;bottom&#39; is set.
   * @return top
   */
  public Integer getTop() {
    return top;
  }

  /**
   * Distance from the top edge of the input video to the top edge of the watermark image. May not be set if &#39;bottom&#39; is set.
   *
   * @param top
   *        Distance from the top edge of the input video to the top edge of the watermark image. May not be set if &#39;bottom&#39; is set.
   */
  public void setTop(Integer top) {
    this.top = top;
  }


  /**
   * Distance from the bottom edge of the input video to the bottom edge of the watermark image. May not be set if &#39;top&#39; is set.
   * @return bottom
   */
  public Integer getBottom() {
    return bottom;
  }

  /**
   * Distance from the bottom edge of the input video to the bottom edge of the watermark image. May not be set if &#39;top&#39; is set.
   *
   * @param bottom
   *        Distance from the bottom edge of the input video to the bottom edge of the watermark image. May not be set if &#39;top&#39; is set.
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
    WatermarkFilter watermarkFilter = (WatermarkFilter) o;
    return Objects.equals(this.image, watermarkFilter.image) &&
        Objects.equals(this.left, watermarkFilter.left) &&
        Objects.equals(this.right, watermarkFilter.right) &&
        Objects.equals(this.top, watermarkFilter.top) &&
        Objects.equals(this.bottom, watermarkFilter.bottom) &&
        Objects.equals(this.unit, watermarkFilter.unit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, left, right, top, bottom, unit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatermarkFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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


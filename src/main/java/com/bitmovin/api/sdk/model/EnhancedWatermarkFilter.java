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
 * EnhancedWatermarkFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = EnhancedWatermarkFilter.class)
public class EnhancedWatermarkFilter extends Filter {
  @JsonProperty("image")
  private String image;

  @JsonProperty("left")
  private Double left;

  @JsonProperty("right")
  private Double right;

  @JsonProperty("top")
  private Double top;

  @JsonProperty("bottom")
  private Double bottom;

  @JsonProperty("unit")
  private PositionUnit unit;

  @JsonProperty("opacity")
  private Double opacity;

  @JsonProperty("width")
  private Double width;

  @JsonProperty("height")
  private Double height;


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
  public Double getLeft() {
    return left;
  }

  /**
   * Distance from the left edge of the input video to the left edge of the watermark image. May not be set if &#39;right&#39; is set.
   *
   * @param left
   *        Distance from the left edge of the input video to the left edge of the watermark image. May not be set if &#39;right&#39; is set.
   */
  public void setLeft(Double left) {
    this.left = left;
  }


  /**
   * Distance from the right edge of the input video to the right edge of the watermark image . May not be set if &#39;left&#39; is set.
   * @return right
   */
  public Double getRight() {
    return right;
  }

  /**
   * Distance from the right edge of the input video to the right edge of the watermark image . May not be set if &#39;left&#39; is set.
   *
   * @param right
   *        Distance from the right edge of the input video to the right edge of the watermark image . May not be set if &#39;left&#39; is set.
   */
  public void setRight(Double right) {
    this.right = right;
  }


  /**
   * Distance from the top edge of the input video to the top edge of the watermark image. May not be set if &#39;bottom&#39; is set.
   * @return top
   */
  public Double getTop() {
    return top;
  }

  /**
   * Distance from the top edge of the input video to the top edge of the watermark image. May not be set if &#39;bottom&#39; is set.
   *
   * @param top
   *        Distance from the top edge of the input video to the top edge of the watermark image. May not be set if &#39;bottom&#39; is set.
   */
  public void setTop(Double top) {
    this.top = top;
  }


  /**
   * Distance from the bottom edge of the input video to the bottom edge of the watermark image. May not be set if &#39;top&#39; is set.
   * @return bottom
   */
  public Double getBottom() {
    return bottom;
  }

  /**
   * Distance from the bottom edge of the input video to the bottom edge of the watermark image. May not be set if &#39;top&#39; is set.
   *
   * @param bottom
   *        Distance from the bottom edge of the input video to the bottom edge of the watermark image. May not be set if &#39;top&#39; is set.
   */
  public void setBottom(Double bottom) {
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


  /**
   * Opacity to apply on the watermark image. Valid values are from 0.0 (completely transparent) to 1.0 (not transparent at all)
   * @return opacity
   */
  public Double getOpacity() {
    return opacity;
  }

  /**
   * Opacity to apply on the watermark image. Valid values are from 0.0 (completely transparent) to 1.0 (not transparent at all)
   *
   * @param opacity
   *        Opacity to apply on the watermark image. Valid values are from 0.0 (completely transparent) to 1.0 (not transparent at all)
   */
  public void setOpacity(Double opacity) {
    this.opacity = opacity;
  }


  /**
   * Desired width of the watermark image, the unit of the parameter is specified separately by the parameter &#39;unit&#39;. If both width and height are set the watermark size is fixed. If only one is set the aspect ratio of the image will be used to rescale it
   * @return width
   */
  public Double getWidth() {
    return width;
  }

  /**
   * Desired width of the watermark image, the unit of the parameter is specified separately by the parameter &#39;unit&#39;. If both width and height are set the watermark size is fixed. If only one is set the aspect ratio of the image will be used to rescale it
   *
   * @param width
   *        Desired width of the watermark image, the unit of the parameter is specified separately by the parameter &#39;unit&#39;. If both width and height are set the watermark size is fixed. If only one is set the aspect ratio of the image will be used to rescale it
   */
  public void setWidth(Double width) {
    this.width = width;
  }


  /**
   * Desired height of the watermark image, the unit of the parameter is specified separately by the parameter &#39;unit&#39;. If both width and height are set the watermark size is fixed. If only one is set the aspect ratio of the image will be used to rescale it
   * @return height
   */
  public Double getHeight() {
    return height;
  }

  /**
   * Desired height of the watermark image, the unit of the parameter is specified separately by the parameter &#39;unit&#39;. If both width and height are set the watermark size is fixed. If only one is set the aspect ratio of the image will be used to rescale it
   *
   * @param height
   *        Desired height of the watermark image, the unit of the parameter is specified separately by the parameter &#39;unit&#39;. If both width and height are set the watermark size is fixed. If only one is set the aspect ratio of the image will be used to rescale it
   */
  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnhancedWatermarkFilter enhancedWatermarkFilter = (EnhancedWatermarkFilter) o;
    return Objects.equals(this.image, enhancedWatermarkFilter.image) &&
        Objects.equals(this.left, enhancedWatermarkFilter.left) &&
        Objects.equals(this.right, enhancedWatermarkFilter.right) &&
        Objects.equals(this.top, enhancedWatermarkFilter.top) &&
        Objects.equals(this.bottom, enhancedWatermarkFilter.bottom) &&
        Objects.equals(this.unit, enhancedWatermarkFilter.unit) &&
        Objects.equals(this.opacity, enhancedWatermarkFilter.opacity) &&
        Objects.equals(this.width, enhancedWatermarkFilter.width) &&
        Objects.equals(this.height, enhancedWatermarkFilter.height) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, left, right, top, bottom, unit, opacity, width, height, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnhancedWatermarkFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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


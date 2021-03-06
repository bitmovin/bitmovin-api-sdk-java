package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Filter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * UnsharpFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = UnsharpFilter.class)
public class UnsharpFilter extends Filter {
  @JsonProperty("lumaMatrixHorizontalSize")
  private Integer lumaMatrixHorizontalSize;

  @JsonProperty("lumaMatrixVerticalSize")
  private Integer lumaMatrixVerticalSize;

  @JsonProperty("lumaEffectStrength")
  private Double lumaEffectStrength;

  @JsonProperty("chromaMatrixHorizontalSize")
  private Integer chromaMatrixHorizontalSize;

  @JsonProperty("chromaMatrixVerticalSize")
  private Integer chromaMatrixVerticalSize;

  @JsonProperty("chromaEffectStrength")
  private Double chromaEffectStrength;


  /**
   * Must be an odd integer between 3 and 23
   * @return lumaMatrixHorizontalSize
   */
  public Integer getLumaMatrixHorizontalSize() {
    return lumaMatrixHorizontalSize;
  }

  /**
   * Must be an odd integer between 3 and 23
   *
   * @param lumaMatrixHorizontalSize
   *        Must be an odd integer between 3 and 23
   */
  public void setLumaMatrixHorizontalSize(Integer lumaMatrixHorizontalSize) {
    this.lumaMatrixHorizontalSize = lumaMatrixHorizontalSize;
  }


  /**
   * Must be an odd integer between 3 and 23
   * @return lumaMatrixVerticalSize
   */
  public Integer getLumaMatrixVerticalSize() {
    return lumaMatrixVerticalSize;
  }

  /**
   * Must be an odd integer between 3 and 23
   *
   * @param lumaMatrixVerticalSize
   *        Must be an odd integer between 3 and 23
   */
  public void setLumaMatrixVerticalSize(Integer lumaMatrixVerticalSize) {
    this.lumaMatrixVerticalSize = lumaMatrixVerticalSize;
  }


  /**
   * Negative value: blur, positive value: sharpen, floating point number, valid value range: -1.5 - 1.5
   * @return lumaEffectStrength
   */
  public Double getLumaEffectStrength() {
    return lumaEffectStrength;
  }

  /**
   * Negative value: blur, positive value: sharpen, floating point number, valid value range: -1.5 - 1.5
   *
   * @param lumaEffectStrength
   *        Negative value: blur, positive value: sharpen, floating point number, valid value range: -1.5 - 1.5
   */
  public void setLumaEffectStrength(Double lumaEffectStrength) {
    this.lumaEffectStrength = lumaEffectStrength;
  }


  /**
   * Must be an odd integer between 3 and 23
   * @return chromaMatrixHorizontalSize
   */
  public Integer getChromaMatrixHorizontalSize() {
    return chromaMatrixHorizontalSize;
  }

  /**
   * Must be an odd integer between 3 and 23
   *
   * @param chromaMatrixHorizontalSize
   *        Must be an odd integer between 3 and 23
   */
  public void setChromaMatrixHorizontalSize(Integer chromaMatrixHorizontalSize) {
    this.chromaMatrixHorizontalSize = chromaMatrixHorizontalSize;
  }


  /**
   * Must be an odd integer between 3 and 23
   * @return chromaMatrixVerticalSize
   */
  public Integer getChromaMatrixVerticalSize() {
    return chromaMatrixVerticalSize;
  }

  /**
   * Must be an odd integer between 3 and 23
   *
   * @param chromaMatrixVerticalSize
   *        Must be an odd integer between 3 and 23
   */
  public void setChromaMatrixVerticalSize(Integer chromaMatrixVerticalSize) {
    this.chromaMatrixVerticalSize = chromaMatrixVerticalSize;
  }


  /**
   * Negative value: blur, positive value: sharpen, floating point number, valid value range: -1.5 - 1.5
   * @return chromaEffectStrength
   */
  public Double getChromaEffectStrength() {
    return chromaEffectStrength;
  }

  /**
   * Negative value: blur, positive value: sharpen, floating point number, valid value range: -1.5 - 1.5
   *
   * @param chromaEffectStrength
   *        Negative value: blur, positive value: sharpen, floating point number, valid value range: -1.5 - 1.5
   */
  public void setChromaEffectStrength(Double chromaEffectStrength) {
    this.chromaEffectStrength = chromaEffectStrength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnsharpFilter unsharpFilter = (UnsharpFilter) o;
    return Objects.equals(this.lumaMatrixHorizontalSize, unsharpFilter.lumaMatrixHorizontalSize) &&
        Objects.equals(this.lumaMatrixVerticalSize, unsharpFilter.lumaMatrixVerticalSize) &&
        Objects.equals(this.lumaEffectStrength, unsharpFilter.lumaEffectStrength) &&
        Objects.equals(this.chromaMatrixHorizontalSize, unsharpFilter.chromaMatrixHorizontalSize) &&
        Objects.equals(this.chromaMatrixVerticalSize, unsharpFilter.chromaMatrixVerticalSize) &&
        Objects.equals(this.chromaEffectStrength, unsharpFilter.chromaEffectStrength) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lumaMatrixHorizontalSize, lumaMatrixVerticalSize, lumaEffectStrength, chromaMatrixHorizontalSize, chromaMatrixVerticalSize, chromaEffectStrength, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnsharpFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lumaMatrixHorizontalSize: ").append(toIndentedString(lumaMatrixHorizontalSize)).append("\n");
    sb.append("    lumaMatrixVerticalSize: ").append(toIndentedString(lumaMatrixVerticalSize)).append("\n");
    sb.append("    lumaEffectStrength: ").append(toIndentedString(lumaEffectStrength)).append("\n");
    sb.append("    chromaMatrixHorizontalSize: ").append(toIndentedString(chromaMatrixHorizontalSize)).append("\n");
    sb.append("    chromaMatrixVerticalSize: ").append(toIndentedString(chromaMatrixVerticalSize)).append("\n");
    sb.append("    chromaEffectStrength: ").append(toIndentedString(chromaEffectStrength)).append("\n");
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


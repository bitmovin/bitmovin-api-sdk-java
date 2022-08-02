package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ChromaLocation;
import com.bitmovin.api.sdk.model.ColorPrimaries;
import com.bitmovin.api.sdk.model.ColorRange;
import com.bitmovin.api.sdk.model.ColorSpace;
import com.bitmovin.api.sdk.model.ColorTransfer;
import com.bitmovin.api.sdk.model.InputColorPrimaries;
import com.bitmovin.api.sdk.model.InputColorRange;
import com.bitmovin.api.sdk.model.InputColorSpace;
import com.bitmovin.api.sdk.model.InputColorTransfer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ColorConfig
 */

public class ColorConfig {
  @JsonProperty("copyChromaLocationFlag")
  private Boolean copyChromaLocationFlag;

  @JsonProperty("copyColorSpaceFlag")
  private Boolean copyColorSpaceFlag;

  @JsonProperty("copyColorPrimariesFlag")
  private Boolean copyColorPrimariesFlag;

  @JsonProperty("copyColorRangeFlag")
  private Boolean copyColorRangeFlag;

  @JsonProperty("copyColorTransferFlag")
  private Boolean copyColorTransferFlag;

  @JsonProperty("chromaLocation")
  private ChromaLocation chromaLocation;

  @JsonProperty("colorSpace")
  private ColorSpace colorSpace;

  @JsonProperty("colorPrimaries")
  private ColorPrimaries colorPrimaries;

  @JsonProperty("colorRange")
  private ColorRange colorRange;

  @JsonProperty("colorTransfer")
  private ColorTransfer colorTransfer;

  @JsonProperty("inputColorSpace")
  private InputColorSpace inputColorSpace;

  @JsonProperty("inputColorRange")
  private InputColorRange inputColorRange;

  @JsonProperty("inputColorPrimaries")
  private InputColorPrimaries inputColorPrimaries;

  @JsonProperty("inputColorTransfer")
  private InputColorTransfer inputColorTransfer;


  /**
   * Copy the chroma location setting from the input source
   * @return copyChromaLocationFlag
   */
  public Boolean getCopyChromaLocationFlag() {
    return copyChromaLocationFlag;
  }

  /**
   * Copy the chroma location setting from the input source
   *
   * @param copyChromaLocationFlag
   *        Copy the chroma location setting from the input source
   */
  public void setCopyChromaLocationFlag(Boolean copyChromaLocationFlag) {
    this.copyChromaLocationFlag = copyChromaLocationFlag;
  }


  /**
   * Copy the color space setting from the input source
   * @return copyColorSpaceFlag
   */
  public Boolean getCopyColorSpaceFlag() {
    return copyColorSpaceFlag;
  }

  /**
   * Copy the color space setting from the input source
   *
   * @param copyColorSpaceFlag
   *        Copy the color space setting from the input source
   */
  public void setCopyColorSpaceFlag(Boolean copyColorSpaceFlag) {
    this.copyColorSpaceFlag = copyColorSpaceFlag;
  }


  /**
   * Copy the color primaries setting from the input source
   * @return copyColorPrimariesFlag
   */
  public Boolean getCopyColorPrimariesFlag() {
    return copyColorPrimariesFlag;
  }

  /**
   * Copy the color primaries setting from the input source
   *
   * @param copyColorPrimariesFlag
   *        Copy the color primaries setting from the input source
   */
  public void setCopyColorPrimariesFlag(Boolean copyColorPrimariesFlag) {
    this.copyColorPrimariesFlag = copyColorPrimariesFlag;
  }


  /**
   * Copy the color range setting from the input source
   * @return copyColorRangeFlag
   */
  public Boolean getCopyColorRangeFlag() {
    return copyColorRangeFlag;
  }

  /**
   * Copy the color range setting from the input source
   *
   * @param copyColorRangeFlag
   *        Copy the color range setting from the input source
   */
  public void setCopyColorRangeFlag(Boolean copyColorRangeFlag) {
    this.copyColorRangeFlag = copyColorRangeFlag;
  }


  /**
   * Copy the color transfer setting from the input source
   * @return copyColorTransferFlag
   */
  public Boolean getCopyColorTransferFlag() {
    return copyColorTransferFlag;
  }

  /**
   * Copy the color transfer setting from the input source
   *
   * @param copyColorTransferFlag
   *        Copy the color transfer setting from the input source
   */
  public void setCopyColorTransferFlag(Boolean copyColorTransferFlag) {
    this.copyColorTransferFlag = copyColorTransferFlag;
  }


  /**
   * The chroma location to be applied
   * @return chromaLocation
   */
  public ChromaLocation getChromaLocation() {
    return chromaLocation;
  }

  /**
   * The chroma location to be applied
   *
   * @param chromaLocation
   *        The chroma location to be applied
   */
  public void setChromaLocation(ChromaLocation chromaLocation) {
    this.chromaLocation = chromaLocation;
  }


  /**
   * The color space to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   * @return colorSpace
   */
  public ColorSpace getColorSpace() {
    return colorSpace;
  }

  /**
   * The color space to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   *
   * @param colorSpace
   *        The color space to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   */
  public void setColorSpace(ColorSpace colorSpace) {
    this.colorSpace = colorSpace;
  }


  /**
   * The color primaries to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   * @return colorPrimaries
   */
  public ColorPrimaries getColorPrimaries() {
    return colorPrimaries;
  }

  /**
   * The color primaries to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   *
   * @param colorPrimaries
   *        The color primaries to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   */
  public void setColorPrimaries(ColorPrimaries colorPrimaries) {
    this.colorPrimaries = colorPrimaries;
  }


  /**
   * The color range to be applied. If used on a Dolby Vision stream, this value must be set to JPEG.
   * @return colorRange
   */
  public ColorRange getColorRange() {
    return colorRange;
  }

  /**
   * The color range to be applied. If used on a Dolby Vision stream, this value must be set to JPEG.
   *
   * @param colorRange
   *        The color range to be applied. If used on a Dolby Vision stream, this value must be set to JPEG.
   */
  public void setColorRange(ColorRange colorRange) {
    this.colorRange = colorRange;
  }


  /**
   * The color transfer to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   * @return colorTransfer
   */
  public ColorTransfer getColorTransfer() {
    return colorTransfer;
  }

  /**
   * The color transfer to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   *
   * @param colorTransfer
   *        The color transfer to be applied. If used on a Dolby Vision stream, this value must be set to UNSPECIFIED.
   */
  public void setColorTransfer(ColorTransfer colorTransfer) {
    this.colorTransfer = colorTransfer;
  }


  /**
   * Override the color space detected in the input file. If not set the input color space will be automatically detected if possible.
   * @return inputColorSpace
   */
  public InputColorSpace getInputColorSpace() {
    return inputColorSpace;
  }

  /**
   * Override the color space detected in the input file. If not set the input color space will be automatically detected if possible.
   *
   * @param inputColorSpace
   *        Override the color space detected in the input file. If not set the input color space will be automatically detected if possible.
   */
  public void setInputColorSpace(InputColorSpace inputColorSpace) {
    this.inputColorSpace = inputColorSpace;
  }


  /**
   * Override the color range detected in the input file. If not set the input color range will be automatically detected if possible.
   * @return inputColorRange
   */
  public InputColorRange getInputColorRange() {
    return inputColorRange;
  }

  /**
   * Override the color range detected in the input file. If not set the input color range will be automatically detected if possible.
   *
   * @param inputColorRange
   *        Override the color range detected in the input file. If not set the input color range will be automatically detected if possible.
   */
  public void setInputColorRange(InputColorRange inputColorRange) {
    this.inputColorRange = inputColorRange;
  }


  /**
   * Override the color primaries detected in the input file. If not set the input color primaries will be automatically detected if possible.
   * @return inputColorPrimaries
   */
  public InputColorPrimaries getInputColorPrimaries() {
    return inputColorPrimaries;
  }

  /**
   * Override the color primaries detected in the input file. If not set the input color primaries will be automatically detected if possible.
   *
   * @param inputColorPrimaries
   *        Override the color primaries detected in the input file. If not set the input color primaries will be automatically detected if possible.
   */
  public void setInputColorPrimaries(InputColorPrimaries inputColorPrimaries) {
    this.inputColorPrimaries = inputColorPrimaries;
  }


  /**
   * Override the color transfer detected in the input file. If not set the input color transfer will be automatically detected if possible.
   * @return inputColorTransfer
   */
  public InputColorTransfer getInputColorTransfer() {
    return inputColorTransfer;
  }

  /**
   * Override the color transfer detected in the input file. If not set the input color transfer will be automatically detected if possible.
   *
   * @param inputColorTransfer
   *        Override the color transfer detected in the input file. If not set the input color transfer will be automatically detected if possible.
   */
  public void setInputColorTransfer(InputColorTransfer inputColorTransfer) {
    this.inputColorTransfer = inputColorTransfer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ColorConfig colorConfig = (ColorConfig) o;
    return Objects.equals(this.copyChromaLocationFlag, colorConfig.copyChromaLocationFlag) &&
        Objects.equals(this.copyColorSpaceFlag, colorConfig.copyColorSpaceFlag) &&
        Objects.equals(this.copyColorPrimariesFlag, colorConfig.copyColorPrimariesFlag) &&
        Objects.equals(this.copyColorRangeFlag, colorConfig.copyColorRangeFlag) &&
        Objects.equals(this.copyColorTransferFlag, colorConfig.copyColorTransferFlag) &&
        Objects.equals(this.chromaLocation, colorConfig.chromaLocation) &&
        Objects.equals(this.colorSpace, colorConfig.colorSpace) &&
        Objects.equals(this.colorPrimaries, colorConfig.colorPrimaries) &&
        Objects.equals(this.colorRange, colorConfig.colorRange) &&
        Objects.equals(this.colorTransfer, colorConfig.colorTransfer) &&
        Objects.equals(this.inputColorSpace, colorConfig.inputColorSpace) &&
        Objects.equals(this.inputColorRange, colorConfig.inputColorRange) &&
        Objects.equals(this.inputColorPrimaries, colorConfig.inputColorPrimaries) &&
        Objects.equals(this.inputColorTransfer, colorConfig.inputColorTransfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(copyChromaLocationFlag, copyColorSpaceFlag, copyColorPrimariesFlag, copyColorRangeFlag, copyColorTransferFlag, chromaLocation, colorSpace, colorPrimaries, colorRange, colorTransfer, inputColorSpace, inputColorRange, inputColorPrimaries, inputColorTransfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColorConfig {\n");
    
    sb.append("    copyChromaLocationFlag: ").append(toIndentedString(copyChromaLocationFlag)).append("\n");
    sb.append("    copyColorSpaceFlag: ").append(toIndentedString(copyColorSpaceFlag)).append("\n");
    sb.append("    copyColorPrimariesFlag: ").append(toIndentedString(copyColorPrimariesFlag)).append("\n");
    sb.append("    copyColorRangeFlag: ").append(toIndentedString(copyColorRangeFlag)).append("\n");
    sb.append("    copyColorTransferFlag: ").append(toIndentedString(copyColorTransferFlag)).append("\n");
    sb.append("    chromaLocation: ").append(toIndentedString(chromaLocation)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    colorPrimaries: ").append(toIndentedString(colorPrimaries)).append("\n");
    sb.append("    colorRange: ").append(toIndentedString(colorRange)).append("\n");
    sb.append("    colorTransfer: ").append(toIndentedString(colorTransfer)).append("\n");
    sb.append("    inputColorSpace: ").append(toIndentedString(inputColorSpace)).append("\n");
    sb.append("    inputColorRange: ").append(toIndentedString(inputColorRange)).append("\n");
    sb.append("    inputColorPrimaries: ").append(toIndentedString(inputColorPrimaries)).append("\n");
    sb.append("    inputColorTransfer: ").append(toIndentedString(inputColorTransfer)).append("\n");
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


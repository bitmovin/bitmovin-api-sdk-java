package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AspectMode;
import com.bitmovin.api.sdk.model.PaddingSequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ConcatenationInputConfiguration
 */

public class ConcatenationInputConfiguration {
  @JsonProperty("inputStreamId")
  private String inputStreamId;

  @JsonProperty("isMain")
  private Boolean isMain;

  @JsonProperty("position")
  private Integer position;

  @JsonProperty("paddingBefore")
  private PaddingSequence paddingBefore;

  @JsonProperty("paddingAfter")
  private PaddingSequence paddingAfter;

  @JsonProperty("aspectMode")
  private AspectMode aspectMode;


  /**
   * The id of the input stream that should be used for concatenation. Can be either an ingest input stream, or the result of a trimming input stream
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  /**
   * The id of the input stream that should be used for concatenation. Can be either an ingest input stream, or the result of a trimming input stream
   *
   * @param inputStreamId
   *        The id of the input stream that should be used for concatenation. Can be either an ingest input stream, or the result of a trimming input stream
   */
  public void setInputStreamId(String inputStreamId) {
    this.inputStreamId = inputStreamId;
  }


  /**
   * Exactly one input stream of a concatenation must have this set to true, which will be used as reference for scaling, aspect ratio, FPS, sample rate, etc. 
   * @return isMain
   */
  public Boolean getIsMain() {
    return isMain;
  }

  /**
   * Exactly one input stream of a concatenation must have this set to true, which will be used as reference for scaling, aspect ratio, FPS, sample rate, etc. 
   *
   * @param isMain
   *        Exactly one input stream of a concatenation must have this set to true, which will be used as reference for scaling, aspect ratio, FPS, sample rate, etc. 
   */
  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }


  /**
   * Position of the stream
   * @return position
   */
  public Integer getPosition() {
    return position;
  }

  /**
   * Position of the stream
   *
   * @param position
   *        Position of the stream
   */
  public void setPosition(Integer position) {
    this.position = position;
  }


  /**
   * Inserts a padding sequence (black frames and/or silent audio) before the input stream. If this is set, all video output streams of the encoding need to use the same ConcatenationInputStream.
   * @return paddingBefore
   */
  public PaddingSequence getPaddingBefore() {
    return paddingBefore;
  }

  /**
   * Inserts a padding sequence (black frames and/or silent audio) before the input stream. If this is set, all video output streams of the encoding need to use the same ConcatenationInputStream.
   *
   * @param paddingBefore
   *        Inserts a padding sequence (black frames and/or silent audio) before the input stream. If this is set, all video output streams of the encoding need to use the same ConcatenationInputStream.
   */
  public void setPaddingBefore(PaddingSequence paddingBefore) {
    this.paddingBefore = paddingBefore;
  }


  /**
   * Inserts a padding sequence (black frames and/or silent audio) after the input stream. If this is set, all video output streams of the encoding need to use the same ConcatenationInputStream.
   * @return paddingAfter
   */
  public PaddingSequence getPaddingAfter() {
    return paddingAfter;
  }

  /**
   * Inserts a padding sequence (black frames and/or silent audio) after the input stream. If this is set, all video output streams of the encoding need to use the same ConcatenationInputStream.
   *
   * @param paddingAfter
   *        Inserts a padding sequence (black frames and/or silent audio) after the input stream. If this is set, all video output streams of the encoding need to use the same ConcatenationInputStream.
   */
  public void setPaddingAfter(PaddingSequence paddingAfter) {
    this.paddingAfter = paddingAfter;
  }


  /**
   * Specifies the aspect mode that is used when adapting to the main input stream&#39;s aspect ratio
   * @return aspectMode
   */
  public AspectMode getAspectMode() {
    return aspectMode;
  }

  /**
   * Specifies the aspect mode that is used when adapting to the main input stream&#39;s aspect ratio
   *
   * @param aspectMode
   *        Specifies the aspect mode that is used when adapting to the main input stream&#39;s aspect ratio
   */
  public void setAspectMode(AspectMode aspectMode) {
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
    ConcatenationInputConfiguration concatenationInputConfiguration = (ConcatenationInputConfiguration) o;
    return Objects.equals(this.inputStreamId, concatenationInputConfiguration.inputStreamId) &&
        Objects.equals(this.isMain, concatenationInputConfiguration.isMain) &&
        Objects.equals(this.position, concatenationInputConfiguration.position) &&
        Objects.equals(this.paddingBefore, concatenationInputConfiguration.paddingBefore) &&
        Objects.equals(this.paddingAfter, concatenationInputConfiguration.paddingAfter) &&
        Objects.equals(this.aspectMode, concatenationInputConfiguration.aspectMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreamId, isMain, position, paddingBefore, paddingAfter, aspectMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcatenationInputConfiguration {\n");
    
    sb.append("    inputStreamId: ").append(toIndentedString(inputStreamId)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    paddingBefore: ").append(toIndentedString(paddingBefore)).append("\n");
    sb.append("    paddingAfter: ").append(toIndentedString(paddingAfter)).append("\n");
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


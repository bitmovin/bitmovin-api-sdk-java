package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InputStream;
import com.bitmovin.api.sdk.model.StreamSelectionMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DvbTeletextInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = DvbTeletextInputStream.class)
public class DvbTeletextInputStream extends InputStream {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputPath")
  private String inputPath;

  @JsonProperty("selectionMode")
  private StreamSelectionMode selectionMode;

  @JsonProperty("position")
  private Integer position;

  @JsonProperty("page")
  private Integer page;


  /**
   * ID of an Input resource defining the input storage
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * ID of an Input resource defining the input storage
   *
   * @param inputId
   *        ID of an Input resource defining the input storage
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path to an input media file
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path to an input media file
   *
   * @param inputPath
   *        Path to an input media file
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  /**
   * Specifies the strategy for selecting a stream from the input file
   * @return selectionMode
   */
  public StreamSelectionMode getSelectionMode() {
    return selectionMode;
  }

  /**
   * Specifies the strategy for selecting a stream from the input file
   *
   * @param selectionMode
   *        Specifies the strategy for selecting a stream from the input file
   */
  public void setSelectionMode(StreamSelectionMode selectionMode) {
    this.selectionMode = selectionMode;
  }


  /**
   * Position of the stream to be selected from the input file (zero-based). Must not be set in combination with selectionMode &#39;AUTO&#39;, defaults to 0 for any other selectionMode.
   * minimum: 0
   * @return position
   */
  public Integer getPosition() {
    return position;
  }

  /**
   * Position of the stream to be selected from the input file (zero-based). Must not be set in combination with selectionMode &#39;AUTO&#39;, defaults to 0 for any other selectionMode.
   * minimum: 0
   *
   * @param position
   *        Position of the stream to be selected from the input file (zero-based). Must not be set in combination with selectionMode &#39;AUTO&#39;, defaults to 0 for any other selectionMode.
   *        minimum: 0
   */
  public void setPosition(Integer position) {
    this.position = position;
  }


  /**
   * Page number of the subtitles
   * @return page
   */
  public Integer getPage() {
    return page;
  }

  /**
   * Page number of the subtitles
   *
   * @param page
   *        Page number of the subtitles
   */
  public void setPage(Integer page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DvbTeletextInputStream dvbTeletextInputStream = (DvbTeletextInputStream) o;
    return Objects.equals(this.inputId, dvbTeletextInputStream.inputId) &&
        Objects.equals(this.inputPath, dvbTeletextInputStream.inputPath) &&
        Objects.equals(this.selectionMode, dvbTeletextInputStream.selectionMode) &&
        Objects.equals(this.position, dvbTeletextInputStream.position) &&
        Objects.equals(this.page, dvbTeletextInputStream.page) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputPath, selectionMode, position, page, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DvbTeletextInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
    sb.append("    selectionMode: ").append(toIndentedString(selectionMode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingStreamInputDetails;
import com.bitmovin.api.sdk.model.StreamSelectionMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamInput
 */

public class StreamInput {
  @JsonProperty("inputId")
  private String inputId;

  @JsonProperty("inputPath")
  private String inputPath;

  @JsonProperty("selectionMode")
  private StreamSelectionMode selectionMode;

  @JsonProperty("position")
  private Integer position;

  @JsonProperty("inputStreamId")
  private String inputStreamId;

  @JsonProperty("analysisDetails")
  private EncodingStreamInputDetails analysisDetails;


  /**
   * ID of an Input resource defining the input storage. Required if &#39;inputStreamId&#39; is not set.
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * ID of an Input resource defining the input storage. Required if &#39;inputStreamId&#39; is not set.
   *
   * @param inputId
   *        ID of an Input resource defining the input storage. Required if &#39;inputStreamId&#39; is not set.
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path to an input media file. Required if &#39;inputStreamId&#39; is not set.
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path to an input media file. Required if &#39;inputStreamId&#39; is not set.
   *
   * @param inputPath
   *        Path to an input media file. Required if &#39;inputStreamId&#39; is not set.
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  /**
   * Specifies the strategy for selecting a stream from the input file. Must not be set when &#39;inputStreamId&#39; is set.
   * @return selectionMode
   */
  public StreamSelectionMode getSelectionMode() {
    return selectionMode;
  }

  /**
   * Specifies the strategy for selecting a stream from the input file. Must not be set when &#39;inputStreamId&#39; is set.
   *
   * @param selectionMode
   *        Specifies the strategy for selecting a stream from the input file. Must not be set when &#39;inputStreamId&#39; is set.
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
   * Set this property instead of all others to reference an InputStream resource (e.g. an Ingest-, Trimming- or ConcatenationInputStream)
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  /**
   * Set this property instead of all others to reference an InputStream resource (e.g. an Ingest-, Trimming- or ConcatenationInputStream)
   *
   * @param inputStreamId
   *        Set this property instead of all others to reference an InputStream resource (e.g. an Ingest-, Trimming- or ConcatenationInputStream)
   */
  public void setInputStreamId(String inputStreamId) {
    this.inputStreamId = inputStreamId;
  }

  /**
   * Input analysis details  This property is populated after the encoding has finished 
   * @return analysisDetails
   */
  public EncodingStreamInputDetails getAnalysisDetails() {
    return analysisDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamInput streamInput = (StreamInput) o;
    return Objects.equals(this.inputId, streamInput.inputId) &&
        Objects.equals(this.inputPath, streamInput.inputPath) &&
        Objects.equals(this.selectionMode, streamInput.selectionMode) &&
        Objects.equals(this.position, streamInput.position) &&
        Objects.equals(this.inputStreamId, streamInput.inputStreamId) &&
        Objects.equals(this.analysisDetails, streamInput.analysisDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputId, inputPath, selectionMode, position, inputStreamId, analysisDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamInput {\n");
    
    sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
    sb.append("    inputPath: ").append(toIndentedString(inputPath)).append("\n");
    sb.append("    selectionMode: ").append(toIndentedString(selectionMode)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    inputStreamId: ").append(toIndentedString(inputStreamId)).append("\n");
    sb.append("    analysisDetails: ").append(toIndentedString(analysisDetails)).append("\n");
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


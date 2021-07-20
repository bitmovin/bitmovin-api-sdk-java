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
   * Id of input
   * @return inputId
   */
  public String getInputId() {
    return inputId;
  }

  /**
   * Id of input
   *
   * @param inputId
   *        Id of input
   */
  public void setInputId(String inputId) {
    this.inputId = inputId;
  }


  /**
   * Path to media file
   * @return inputPath
   */
  public String getInputPath() {
    return inputPath;
  }

  /**
   * Path to media file
   *
   * @param inputPath
   *        Path to media file
   */
  public void setInputPath(String inputPath) {
    this.inputPath = inputPath;
  }


  /**
   * Specifies the algorithm how the stream in the input file will be selected
   * @return selectionMode
   */
  public StreamSelectionMode getSelectionMode() {
    return selectionMode;
  }

  /**
   * Specifies the algorithm how the stream in the input file will be selected
   *
   * @param selectionMode
   *        Specifies the algorithm how the stream in the input file will be selected
   */
  public void setSelectionMode(StreamSelectionMode selectionMode) {
    this.selectionMode = selectionMode;
  }


  /**
   * Position of the stream, starting from 0.
   * minimum: 0
   * @return position
   */
  public Integer getPosition() {
    return position;
  }

  /**
   * Position of the stream, starting from 0.
   * minimum: 0
   *
   * @param position
   *        Position of the stream, starting from 0.
   *        minimum: 0
   */
  public void setPosition(Integer position) {
    this.position = position;
  }


  /**
   * Set this property instead of all others to reference an ingest, trimming or concatenation input stream
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  /**
   * Set this property instead of all others to reference an ingest, trimming or concatenation input stream
   *
   * @param inputStreamId
   *        Set this property instead of all others to reference an ingest, trimming or concatenation input stream
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


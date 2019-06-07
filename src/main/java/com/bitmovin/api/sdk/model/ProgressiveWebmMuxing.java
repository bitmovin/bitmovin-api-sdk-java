package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.InternalChunkLength;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ProgressiveWebmMuxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class ProgressiveWebmMuxing extends Muxing {
  @JsonProperty("filename")
  private String filename;

  @JsonProperty("internalChunkLength")
  private InternalChunkLength internalChunkLength;


  /**
   * Name of the new Video
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Name of the new Video
   *
   * @param filename
   * Name of the new Video
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   * Modifies the internal chunk length used for chunked encoding
   * @return internalChunkLength
   */
  public InternalChunkLength getInternalChunkLength() {
    return internalChunkLength;
  }

  /**
   * Modifies the internal chunk length used for chunked encoding
   *
   * @param internalChunkLength
   * Modifies the internal chunk length used for chunked encoding
   */
  public void setInternalChunkLength(InternalChunkLength internalChunkLength) {
    this.internalChunkLength = internalChunkLength;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgressiveWebmMuxing progressiveWebmMuxing = (ProgressiveWebmMuxing) o;
    return Objects.equals(this.filename, progressiveWebmMuxing.filename) &&
        Objects.equals(this.internalChunkLength, progressiveWebmMuxing.internalChunkLength) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, internalChunkLength, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgressiveWebmMuxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    internalChunkLength: ").append(toIndentedString(internalChunkLength)).append("\n");
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


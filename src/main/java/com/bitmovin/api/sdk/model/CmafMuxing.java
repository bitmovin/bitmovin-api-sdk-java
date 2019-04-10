package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Fmp4Muxing;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CmafMuxing
 */

public class CmafMuxing extends Fmp4Muxing {
  @JsonProperty("framesPerCmafChunk")
  private Object framesPerCmafChunk = null;


  /**
   * Number of media frames per CMAF chunk. Defaults to: Length of a segment in frames. Minimum: 1. Maximum: Length of a segment in frames.
   * @return framesPerCmafChunk
   */
  public Object getFramesPerCmafChunk() {
    return framesPerCmafChunk;
  }

  public void setFramesPerCmafChunk(Object framesPerCmafChunk) {
    this.framesPerCmafChunk = framesPerCmafChunk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CmafMuxing cmafMuxing = (CmafMuxing) o;
    return Objects.equals(this.framesPerCmafChunk, cmafMuxing.framesPerCmafChunk) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(framesPerCmafChunk, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CmafMuxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    framesPerCmafChunk: ").append(toIndentedString(framesPerCmafChunk)).append("\n");
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


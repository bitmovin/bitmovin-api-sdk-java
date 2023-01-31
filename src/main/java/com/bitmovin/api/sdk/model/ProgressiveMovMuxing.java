package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.Ignoring;
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
 * ProgressiveMovMuxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = ProgressiveMovMuxing.class)
public class ProgressiveMovMuxing extends Muxing {
  @JsonProperty("filename")
  private String filename;


  /**
   * Name of the output file
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Name of the output file
   *
   * @param filename
   *        Name of the output file
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgressiveMovMuxing progressiveMovMuxing = (ProgressiveMovMuxing) o;
    return Objects.equals(this.filename, progressiveMovMuxing.filename) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgressiveMovMuxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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


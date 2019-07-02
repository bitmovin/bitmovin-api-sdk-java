package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.SidecarErrorMode;
import com.bitmovin.api.sdk.model.SidecarFile;
import com.bitmovin.api.sdk.model.WebVttSidecarFileSegmentation;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An external WebVTT file that is added to an encoding. The size limit for a sidecar file is 10 MB
 */

public class WebVttSidecarFile extends SidecarFile {
  @JsonProperty("segmentation")
  private WebVttSidecarFileSegmentation segmentation;


  /**
   * Get segmentation
   * @return segmentation
   */
  public WebVttSidecarFileSegmentation getSegmentation() {
    return segmentation;
  }

  /**
   * Set segmentation
   *
   * @param segmentation
   */
  public void setSegmentation(WebVttSidecarFileSegmentation segmentation) {
    this.segmentation = segmentation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebVttSidecarFile webVttSidecarFile = (WebVttSidecarFile) o;
    return Objects.equals(this.segmentation, webVttSidecarFile.segmentation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentation, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebVttSidecarFile {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    segmentation: ").append(toIndentedString(segmentation)).append("\n");
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


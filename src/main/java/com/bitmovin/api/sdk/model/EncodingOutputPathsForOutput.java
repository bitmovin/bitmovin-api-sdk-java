package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutputPathsDashManifest;
import com.bitmovin.api.sdk.model.EncodingOutputPathsHlsManifest;
import com.bitmovin.api.sdk.model.EncodingOutputPathsSmoothManifest;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingOutputPathsForOutput
 */

public class EncodingOutputPathsForOutput {
  @JsonProperty("dashManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutputPathsDashManifest> dashManifests = new ArrayList<EncodingOutputPathsDashManifest>();

  @JsonProperty("hlsManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutputPathsHlsManifest> hlsManifests = new ArrayList<EncodingOutputPathsHlsManifest>();

  @JsonProperty("smoothManifests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EncodingOutputPathsSmoothManifest> smoothManifests = new ArrayList<EncodingOutputPathsSmoothManifest>();


  public EncodingOutputPathsForOutput addDashManifestsItem(EncodingOutputPathsDashManifest dashManifestsItem) {
    this.dashManifests.add(dashManifestsItem);
    return this;
  }

  /**
   * Output paths for Dash manifests
   * @return dashManifests
   */
  public List<EncodingOutputPathsDashManifest> getDashManifests() {
    return dashManifests;
  }

  /**
   * Output paths for Dash manifests
   *
   * @param dashManifests
   *        Output paths for Dash manifests
   */
  public void setDashManifests(List<EncodingOutputPathsDashManifest> dashManifests) {
    this.dashManifests = dashManifests;
  }


  public EncodingOutputPathsForOutput addHlsManifestsItem(EncodingOutputPathsHlsManifest hlsManifestsItem) {
    this.hlsManifests.add(hlsManifestsItem);
    return this;
  }

  /**
   * Output paths for HLS manifests
   * @return hlsManifests
   */
  public List<EncodingOutputPathsHlsManifest> getHlsManifests() {
    return hlsManifests;
  }

  /**
   * Output paths for HLS manifests
   *
   * @param hlsManifests
   *        Output paths for HLS manifests
   */
  public void setHlsManifests(List<EncodingOutputPathsHlsManifest> hlsManifests) {
    this.hlsManifests = hlsManifests;
  }


  public EncodingOutputPathsForOutput addSmoothManifestsItem(EncodingOutputPathsSmoothManifest smoothManifestsItem) {
    this.smoothManifests.add(smoothManifestsItem);
    return this;
  }

  /**
   * Output paths for Smooth manifests
   * @return smoothManifests
   */
  public List<EncodingOutputPathsSmoothManifest> getSmoothManifests() {
    return smoothManifests;
  }

  /**
   * Output paths for Smooth manifests
   *
   * @param smoothManifests
   *        Output paths for Smooth manifests
   */
  public void setSmoothManifests(List<EncodingOutputPathsSmoothManifest> smoothManifests) {
    this.smoothManifests = smoothManifests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingOutputPathsForOutput encodingOutputPathsForOutput = (EncodingOutputPathsForOutput) o;
    return Objects.equals(this.dashManifests, encodingOutputPathsForOutput.dashManifests) &&
        Objects.equals(this.hlsManifests, encodingOutputPathsForOutput.hlsManifests) &&
        Objects.equals(this.smoothManifests, encodingOutputPathsForOutput.smoothManifests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashManifests, hlsManifests, smoothManifests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingOutputPathsForOutput {\n");
    
    sb.append("    dashManifests: ").append(toIndentedString(dashManifests)).append("\n");
    sb.append("    hlsManifests: ").append(toIndentedString(hlsManifests)).append("\n");
    sb.append("    smoothManifests: ").append(toIndentedString(smoothManifests)).append("\n");
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


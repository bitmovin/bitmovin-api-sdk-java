package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Scte35Cue
 */

public class Scte35Cue extends BitmovinResponse {
  @JsonProperty("cueDuration")
  private Double cueDuration;

  @JsonProperty("manifestIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> manifestIds = new ArrayList<String>();


  /**
   * Cue out duration in seconds. (required)
   * @return cueDuration
   */
  public Double getCueDuration() {
    return cueDuration;
  }

  /**
   * Cue out duration in seconds. (required)
   *
   * @param cueDuration
   *        Cue out duration in seconds. (required)
   */
  public void setCueDuration(Double cueDuration) {
    this.cueDuration = cueDuration;
  }


  public Scte35Cue addManifestIdsItem(String manifestIdsItem) {
    this.manifestIds.add(manifestIdsItem);
    return this;
  }

  /**
   * The ids of the manifests to update. If this property is not set, all the manifests tied to the encoding are updated.
   * @return manifestIds
   */
  public List<String> getManifestIds() {
    return manifestIds;
  }

  /**
   * The ids of the manifests to update. If this property is not set, all the manifests tied to the encoding are updated.
   *
   * @param manifestIds
   *        The ids of the manifests to update. If this property is not set, all the manifests tied to the encoding are updated.
   */
  public void setManifestIds(List<String> manifestIds) {
    this.manifestIds = manifestIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scte35Cue scte35Cue = (Scte35Cue) o;
    return Objects.equals(this.cueDuration, scte35Cue.cueDuration) &&
        Objects.equals(this.manifestIds, scte35Cue.manifestIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cueDuration, manifestIds, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scte35Cue {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cueDuration: ").append(toIndentedString(cueDuration)).append("\n");
    sb.append("    manifestIds: ").append(toIndentedString(manifestIds)).append("\n");
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


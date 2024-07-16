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
 * ResetLiveManifestTimeShift
 */

public class ResetLiveManifestTimeShift extends BitmovinResponse {
  @JsonProperty("residualPeriodInSeconds")
  private Double residualPeriodInSeconds;

  @JsonProperty("manifestIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> manifestIds = new ArrayList<String>();

  @JsonProperty("shiftProgressiveMuxingStartPosition")
  private Boolean shiftProgressiveMuxingStartPosition;


  /**
   * Determines how many seconds will be left in the manifest after segments are removed. If this is not set, all but one segment will be removed. 
   * @return residualPeriodInSeconds
   */
  public Double getResidualPeriodInSeconds() {
    return residualPeriodInSeconds;
  }

  /**
   * Determines how many seconds will be left in the manifest after segments are removed. If this is not set, all but one segment will be removed. 
   *
   * @param residualPeriodInSeconds
   *        Determines how many seconds will be left in the manifest after segments are removed. If this is not set, all but one segment will be removed. 
   */
  public void setResidualPeriodInSeconds(Double residualPeriodInSeconds) {
    this.residualPeriodInSeconds = residualPeriodInSeconds;
  }


  public ResetLiveManifestTimeShift addManifestIdsItem(String manifestIdsItem) {
    this.manifestIds.add(manifestIdsItem);
    return this;
  }

  /**
   * The ids of the manifests to update. If this property is not set, all manifests tied to the encoding are updated.
   * @return manifestIds
   */
  public List<String> getManifestIds() {
    return manifestIds;
  }

  /**
   * The ids of the manifests to update. If this property is not set, all manifests tied to the encoding are updated.
   *
   * @param manifestIds
   *        The ids of the manifests to update. If this property is not set, all manifests tied to the encoding are updated.
   */
  public void setManifestIds(List<String> manifestIds) {
    this.manifestIds = manifestIds;
  }


  /**
   * If set to true, the Progressive muxing start position will be shifted to the start of the first remaining segment after the removal.  NOTE: This only works for Progressive MP4 muxings.
   * @return shiftProgressiveMuxingStartPosition
   */
  public Boolean getShiftProgressiveMuxingStartPosition() {
    return shiftProgressiveMuxingStartPosition;
  }

  /**
   * If set to true, the Progressive muxing start position will be shifted to the start of the first remaining segment after the removal.  NOTE: This only works for Progressive MP4 muxings.
   *
   * @param shiftProgressiveMuxingStartPosition
   *        If set to true, the Progressive muxing start position will be shifted to the start of the first remaining segment after the removal.  NOTE: This only works for Progressive MP4 muxings.
   */
  public void setShiftProgressiveMuxingStartPosition(Boolean shiftProgressiveMuxingStartPosition) {
    this.shiftProgressiveMuxingStartPosition = shiftProgressiveMuxingStartPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetLiveManifestTimeShift resetLiveManifestTimeShift = (ResetLiveManifestTimeShift) o;
    return Objects.equals(this.residualPeriodInSeconds, resetLiveManifestTimeShift.residualPeriodInSeconds) &&
        Objects.equals(this.manifestIds, resetLiveManifestTimeShift.manifestIds) &&
        Objects.equals(this.shiftProgressiveMuxingStartPosition, resetLiveManifestTimeShift.shiftProgressiveMuxingStartPosition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(residualPeriodInSeconds, manifestIds, shiftProgressiveMuxingStartPosition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetLiveManifestTimeShift {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    residualPeriodInSeconds: ").append(toIndentedString(residualPeriodInSeconds)).append("\n");
    sb.append("    manifestIds: ").append(toIndentedString(manifestIds)).append("\n");
    sb.append("    shiftProgressiveMuxingStartPosition: ").append(toIndentedString(shiftProgressiveMuxingStartPosition)).append("\n");
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


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

  @JsonProperty("offsetInSeconds")
  private Double offsetInSeconds;

  @JsonProperty("manifestIds")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> manifestIds = new ArrayList<String>();

  @JsonProperty("shiftProgressiveMuxingStartPosition")
  private Boolean shiftProgressiveMuxingStartPosition;


  /**
   * Specifies how many seconds of content remain in the manifest after older segments are removed. At least one segment is always retained. If neither &#x60;residualPeriodInSeconds&#x60; nor &#x60;offsetInSeconds&#x60; is set, all segments except the most recent are removed. For DASH manifests that use SegmentTemplate, the retained duration also includes the value configured for &#x60;liveEdgeOffset&#x60;. 
   * @return residualPeriodInSeconds
   */
  public Double getResidualPeriodInSeconds() {
    return residualPeriodInSeconds;
  }

  /**
   * Specifies how many seconds of content remain in the manifest after older segments are removed. At least one segment is always retained. If neither &#x60;residualPeriodInSeconds&#x60; nor &#x60;offsetInSeconds&#x60; is set, all segments except the most recent are removed. For DASH manifests that use SegmentTemplate, the retained duration also includes the value configured for &#x60;liveEdgeOffset&#x60;. 
   *
   * @param residualPeriodInSeconds
   *        Specifies how many seconds of content remain in the manifest after older segments are removed. At least one segment is always retained. If neither &#x60;residualPeriodInSeconds&#x60; nor &#x60;offsetInSeconds&#x60; is set, all segments except the most recent are removed. For DASH manifests that use SegmentTemplate, the retained duration also includes the value configured for &#x60;liveEdgeOffset&#x60;. 
   */
  public void setResidualPeriodInSeconds(Double residualPeriodInSeconds) {
    this.residualPeriodInSeconds = residualPeriodInSeconds;
  }


  /**
   * Specifies an offset, in seconds, from the start of the live event. All segments before this position are removed from the affected manifests. For example, assume a segment length of 2 seconds and a configured &#x60;timeshift&#x60; of 120 seconds (2 minutes). If the most recent segment is &#x60;segment_80.ts&#x60;, the manifest contains 60 segments, from &#x60;segment_21.ts&#x60; through &#x60;segment_80.ts&#x60;. Setting &#x60;offsetInSeconds&#x60; to &#x60;120&#x60; sets the target segment number to 60 (&#x60;targetSegmentNumber &#x3D; offsetInSeconds / segmentLength&#x60;). All segments before &#x60;segment_60.ts&#x60; are removed. Each affected manifest then contains &#x60;segment_60.ts&#x60; through &#x60;segment_80.ts&#x60;.  *Note:* Do not set both &#x60;offsetInSeconds&#x60; and &#x60;residualPeriodInSeconds&#x60;. 
   * @return offsetInSeconds
   */
  public Double getOffsetInSeconds() {
    return offsetInSeconds;
  }

  /**
   * Specifies an offset, in seconds, from the start of the live event. All segments before this position are removed from the affected manifests. For example, assume a segment length of 2 seconds and a configured &#x60;timeshift&#x60; of 120 seconds (2 minutes). If the most recent segment is &#x60;segment_80.ts&#x60;, the manifest contains 60 segments, from &#x60;segment_21.ts&#x60; through &#x60;segment_80.ts&#x60;. Setting &#x60;offsetInSeconds&#x60; to &#x60;120&#x60; sets the target segment number to 60 (&#x60;targetSegmentNumber &#x3D; offsetInSeconds / segmentLength&#x60;). All segments before &#x60;segment_60.ts&#x60; are removed. Each affected manifest then contains &#x60;segment_60.ts&#x60; through &#x60;segment_80.ts&#x60;.  *Note:* Do not set both &#x60;offsetInSeconds&#x60; and &#x60;residualPeriodInSeconds&#x60;. 
   *
   * @param offsetInSeconds
   *        Specifies an offset, in seconds, from the start of the live event. All segments before this position are removed from the affected manifests. For example, assume a segment length of 2 seconds and a configured &#x60;timeshift&#x60; of 120 seconds (2 minutes). If the most recent segment is &#x60;segment_80.ts&#x60;, the manifest contains 60 segments, from &#x60;segment_21.ts&#x60; through &#x60;segment_80.ts&#x60;. Setting &#x60;offsetInSeconds&#x60; to &#x60;120&#x60; sets the target segment number to 60 (&#x60;targetSegmentNumber &#x3D; offsetInSeconds / segmentLength&#x60;). All segments before &#x60;segment_60.ts&#x60; are removed. Each affected manifest then contains &#x60;segment_60.ts&#x60; through &#x60;segment_80.ts&#x60;.  *Note:* Do not set both &#x60;offsetInSeconds&#x60; and &#x60;residualPeriodInSeconds&#x60;. 
   */
  public void setOffsetInSeconds(Double offsetInSeconds) {
    this.offsetInSeconds = offsetInSeconds;
  }


  public ResetLiveManifestTimeShift addManifestIdsItem(String manifestIdsItem) {
    this.manifestIds.add(manifestIdsItem);
    return this;
  }

  /**
   * The IDs of the manifests to update. If omitted, all supported manifests associated with the encoding are updated. HLS live manifests are supported. DASH live manifests require encoder version 2.235.0 or later.
   * @return manifestIds
   */
  public List<String> getManifestIds() {
    return manifestIds;
  }

  /**
   * The IDs of the manifests to update. If omitted, all supported manifests associated with the encoding are updated. HLS live manifests are supported. DASH live manifests require encoder version 2.235.0 or later.
   *
   * @param manifestIds
   *        The IDs of the manifests to update. If omitted, all supported manifests associated with the encoding are updated. HLS live manifests are supported. DASH live manifests require encoder version 2.235.0 or later.
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
        Objects.equals(this.offsetInSeconds, resetLiveManifestTimeShift.offsetInSeconds) &&
        Objects.equals(this.manifestIds, resetLiveManifestTimeShift.manifestIds) &&
        Objects.equals(this.shiftProgressiveMuxingStartPosition, resetLiveManifestTimeShift.shiftProgressiveMuxingStartPosition) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(residualPeriodInSeconds, offsetInSeconds, manifestIds, shiftProgressiveMuxingStartPosition, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetLiveManifestTimeShift {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    residualPeriodInSeconds: ").append(toIndentedString(residualPeriodInSeconds)).append("\n");
    sb.append("    offsetInSeconds: ").append(toIndentedString(offsetInSeconds)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AvailabilityStartTimeMode;
import com.bitmovin.api.sdk.model.DashManifestAdMarkerSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveDashManifest
 */

public class LiveDashManifest {
  @JsonProperty("manifestId")
  private String manifestId;

  @JsonProperty("timeshift")
  private Double timeshift;

  @JsonProperty("liveEdgeOffset")
  private Double liveEdgeOffset;

  @JsonProperty("suggestedPresentationDelay")
  private Double suggestedPresentationDelay;

  @JsonProperty("minimumUpdatePeriod")
  private Double minimumUpdatePeriod;

  @JsonProperty("availabilityStartTimeMode")
  private AvailabilityStartTimeMode availabilityStartTimeMode;

  @JsonProperty("adMarkerSettings")
  private DashManifestAdMarkerSettings adMarkerSettings;


  /**
   * Dash manifest id (required)
   * @return manifestId
   */
  public String getManifestId() {
    return manifestId;
  }

  /**
   * Dash manifest id (required)
   *
   * @param manifestId
   *        Dash manifest id (required)
   */
  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }


  /**
   * Timeshift in seconds
   * @return timeshift
   */
  public Double getTimeshift() {
    return timeshift;
  }

  /**
   * Timeshift in seconds
   *
   * @param timeshift
   *        Timeshift in seconds
   */
  public void setTimeshift(Double timeshift) {
    this.timeshift = timeshift;
  }


  /**
   * Live edge offset in seconds. How it is applied depends on the type of the segmented representations in the manifest. For &#x60;TIMELINE&#x60; representations, new segments are held back for this duration (rounded up to whole segments) before they are added to the SegmentTimeline, and are always added in order. This adds the same amount of latency, but a segment that arrives late by up to this duration does not interrupt the manifest. A segment that arrives later than that stops the SegmentTimeline from updating until it arrives. If it does not arrive at all, a placeholder segment is added in its place once a few newer segments are available. If set to 0, segments are added as soon as they are available, still in order. For &#x60;TEMPLATE&#x60; representations, the &#x60;availabilityStartTime&#x60; is set this many seconds later, so players request each segment this much later. Late segments do not change the manifest; a player that requests a segment before it is uploaded gets an error. Segments are also kept in the manifest for this duration on top of the timeshift. We recommend a value of at least 2 segment durations. 
   * @return liveEdgeOffset
   */
  public Double getLiveEdgeOffset() {
    return liveEdgeOffset;
  }

  /**
   * Live edge offset in seconds. How it is applied depends on the type of the segmented representations in the manifest. For &#x60;TIMELINE&#x60; representations, new segments are held back for this duration (rounded up to whole segments) before they are added to the SegmentTimeline, and are always added in order. This adds the same amount of latency, but a segment that arrives late by up to this duration does not interrupt the manifest. A segment that arrives later than that stops the SegmentTimeline from updating until it arrives. If it does not arrive at all, a placeholder segment is added in its place once a few newer segments are available. If set to 0, segments are added as soon as they are available, still in order. For &#x60;TEMPLATE&#x60; representations, the &#x60;availabilityStartTime&#x60; is set this many seconds later, so players request each segment this much later. Late segments do not change the manifest; a player that requests a segment before it is uploaded gets an error. Segments are also kept in the manifest for this duration on top of the timeshift. We recommend a value of at least 2 segment durations. 
   *
   * @param liveEdgeOffset
   *        Live edge offset in seconds. How it is applied depends on the type of the segmented representations in the manifest. For &#x60;TIMELINE&#x60; representations, new segments are held back for this duration (rounded up to whole segments) before they are added to the SegmentTimeline, and are always added in order. This adds the same amount of latency, but a segment that arrives late by up to this duration does not interrupt the manifest. A segment that arrives later than that stops the SegmentTimeline from updating until it arrives. If it does not arrive at all, a placeholder segment is added in its place once a few newer segments are available. If set to 0, segments are added as soon as they are available, still in order. For &#x60;TEMPLATE&#x60; representations, the &#x60;availabilityStartTime&#x60; is set this many seconds later, so players request each segment this much later. Late segments do not change the manifest; a player that requests a segment before it is uploaded gets an error. Segments are also kept in the manifest for this duration on top of the timeshift. We recommend a value of at least 2 segment durations. 
   */
  public void setLiveEdgeOffset(Double liveEdgeOffset) {
    this.liveEdgeOffset = liveEdgeOffset;
  }


  /**
   * The suggestedPresentationDelay to be set in the DASH manifest. If nothing is set, no value will be set.
   * @return suggestedPresentationDelay
   */
  public Double getSuggestedPresentationDelay() {
    return suggestedPresentationDelay;
  }

  /**
   * The suggestedPresentationDelay to be set in the DASH manifest. If nothing is set, no value will be set.
   *
   * @param suggestedPresentationDelay
   *        The suggestedPresentationDelay to be set in the DASH manifest. If nothing is set, no value will be set.
   */
  public void setSuggestedPresentationDelay(Double suggestedPresentationDelay) {
    this.suggestedPresentationDelay = suggestedPresentationDelay;
  }


  /**
   * The minimumUpdatePeriod to be set in the DASH manifest. If nothing is set, the segment duration will be set.
   * @return minimumUpdatePeriod
   */
  public Double getMinimumUpdatePeriod() {
    return minimumUpdatePeriod;
  }

  /**
   * The minimumUpdatePeriod to be set in the DASH manifest. If nothing is set, the segment duration will be set.
   *
   * @param minimumUpdatePeriod
   *        The minimumUpdatePeriod to be set in the DASH manifest. If nothing is set, the segment duration will be set.
   */
  public void setMinimumUpdatePeriod(Double minimumUpdatePeriod) {
    this.minimumUpdatePeriod = minimumUpdatePeriod;
  }


  /**
   * The mode to trigger the availabilityStartTime initialization.
   * @return availabilityStartTimeMode
   */
  public AvailabilityStartTimeMode getAvailabilityStartTimeMode() {
    return availabilityStartTimeMode;
  }

  /**
   * The mode to trigger the availabilityStartTime initialization.
   *
   * @param availabilityStartTimeMode
   *        The mode to trigger the availabilityStartTime initialization.
   */
  public void setAvailabilityStartTimeMode(AvailabilityStartTimeMode availabilityStartTimeMode) {
    this.availabilityStartTimeMode = availabilityStartTimeMode;
  }


  /**
   * Get adMarkerSettings
   * @return adMarkerSettings
   */
  public DashManifestAdMarkerSettings getAdMarkerSettings() {
    return adMarkerSettings;
  }

  /**
   * Set adMarkerSettings
   *
   * @param adMarkerSettings
   */
  public void setAdMarkerSettings(DashManifestAdMarkerSettings adMarkerSettings) {
    this.adMarkerSettings = adMarkerSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveDashManifest liveDashManifest = (LiveDashManifest) o;
    return Objects.equals(this.manifestId, liveDashManifest.manifestId) &&
        Objects.equals(this.timeshift, liveDashManifest.timeshift) &&
        Objects.equals(this.liveEdgeOffset, liveDashManifest.liveEdgeOffset) &&
        Objects.equals(this.suggestedPresentationDelay, liveDashManifest.suggestedPresentationDelay) &&
        Objects.equals(this.minimumUpdatePeriod, liveDashManifest.minimumUpdatePeriod) &&
        Objects.equals(this.availabilityStartTimeMode, liveDashManifest.availabilityStartTimeMode) &&
        Objects.equals(this.adMarkerSettings, liveDashManifest.adMarkerSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestId, timeshift, liveEdgeOffset, suggestedPresentationDelay, minimumUpdatePeriod, availabilityStartTimeMode, adMarkerSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveDashManifest {\n");
    
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    timeshift: ").append(toIndentedString(timeshift)).append("\n");
    sb.append("    liveEdgeOffset: ").append(toIndentedString(liveEdgeOffset)).append("\n");
    sb.append("    suggestedPresentationDelay: ").append(toIndentedString(suggestedPresentationDelay)).append("\n");
    sb.append("    minimumUpdatePeriod: ").append(toIndentedString(minimumUpdatePeriod)).append("\n");
    sb.append("    availabilityStartTimeMode: ").append(toIndentedString(availabilityStartTimeMode)).append("\n");
    sb.append("    adMarkerSettings: ").append(toIndentedString(adMarkerSettings)).append("\n");
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


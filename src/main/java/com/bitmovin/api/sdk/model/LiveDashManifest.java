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
   * Live edge offset in seconds
   * @return liveEdgeOffset
   */
  public Double getLiveEdgeOffset() {
    return liveEdgeOffset;
  }

  /**
   * Live edge offset in seconds
   *
   * @param liveEdgeOffset
   *        Live edge offset in seconds
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


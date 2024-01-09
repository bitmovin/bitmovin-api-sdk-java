package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.HlsManifestAdMarkerSettings;
import com.bitmovin.api.sdk.model.ProgramDateTimeSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveHlsManifest
 */

public class LiveHlsManifest {
  @JsonProperty("manifestId")
  private String manifestId;

  @JsonProperty("timeshift")
  private Double timeshift;

  @JsonProperty("liveEdgeOffset")
  private Double liveEdgeOffset;

  @JsonProperty("insertProgramDateTime")
  private Boolean insertProgramDateTime;

  @JsonProperty("programDateTimeSettings")
  private ProgramDateTimeSettings programDateTimeSettings;

  @JsonProperty("adMarkerSettings")
  private HlsManifestAdMarkerSettings adMarkerSettings;


  /**
   * HLS manifest id (required)
   * @return manifestId
   */
  public String getManifestId() {
    return manifestId;
  }

  /**
   * HLS manifest id (required)
   *
   * @param manifestId
   *        HLS manifest id (required)
   */
  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }


  /**
   * Timeshift in seconds. We recommend to use a timeshift value not greater than 3 hours (10800.0 seconds). Longer values could negatively impact the manifest update frequency. 
   * @return timeshift
   */
  public Double getTimeshift() {
    return timeshift;
  }

  /**
   * Timeshift in seconds. We recommend to use a timeshift value not greater than 3 hours (10800.0 seconds). Longer values could negatively impact the manifest update frequency. 
   *
   * @param timeshift
   *        Timeshift in seconds. We recommend to use a timeshift value not greater than 3 hours (10800.0 seconds). Longer values could negatively impact the manifest update frequency. 
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
   * Specifies if the EXT-X-PROGRAM-DATETIME tag will be included
   * @return insertProgramDateTime
   */
  public Boolean getInsertProgramDateTime() {
    return insertProgramDateTime;
  }

  /**
   * Specifies if the EXT-X-PROGRAM-DATETIME tag will be included
   *
   * @param insertProgramDateTime
   *        Specifies if the EXT-X-PROGRAM-DATETIME tag will be included
   */
  public void setInsertProgramDateTime(Boolean insertProgramDateTime) {
    this.insertProgramDateTime = insertProgramDateTime;
  }


  /**
   * Configuration for the EXT-X-PROGRAM-DATETIME tag
   * @return programDateTimeSettings
   */
  public ProgramDateTimeSettings getProgramDateTimeSettings() {
    return programDateTimeSettings;
  }

  /**
   * Configuration for the EXT-X-PROGRAM-DATETIME tag
   *
   * @param programDateTimeSettings
   *        Configuration for the EXT-X-PROGRAM-DATETIME tag
   */
  public void setProgramDateTimeSettings(ProgramDateTimeSettings programDateTimeSettings) {
    this.programDateTimeSettings = programDateTimeSettings;
  }


  /**
   * Configuration for tags related to ad markers (e.g. Scte35)
   * @return adMarkerSettings
   */
  public HlsManifestAdMarkerSettings getAdMarkerSettings() {
    return adMarkerSettings;
  }

  /**
   * Configuration for tags related to ad markers (e.g. Scte35)
   *
   * @param adMarkerSettings
   *        Configuration for tags related to ad markers (e.g. Scte35)
   */
  public void setAdMarkerSettings(HlsManifestAdMarkerSettings adMarkerSettings) {
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
    LiveHlsManifest liveHlsManifest = (LiveHlsManifest) o;
    return Objects.equals(this.manifestId, liveHlsManifest.manifestId) &&
        Objects.equals(this.timeshift, liveHlsManifest.timeshift) &&
        Objects.equals(this.liveEdgeOffset, liveHlsManifest.liveEdgeOffset) &&
        Objects.equals(this.insertProgramDateTime, liveHlsManifest.insertProgramDateTime) &&
        Objects.equals(this.programDateTimeSettings, liveHlsManifest.programDateTimeSettings) &&
        Objects.equals(this.adMarkerSettings, liveHlsManifest.adMarkerSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestId, timeshift, liveEdgeOffset, insertProgramDateTime, programDateTimeSettings, adMarkerSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveHlsManifest {\n");
    
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    timeshift: ").append(toIndentedString(timeshift)).append("\n");
    sb.append("    liveEdgeOffset: ").append(toIndentedString(liveEdgeOffset)).append("\n");
    sb.append("    insertProgramDateTime: ").append(toIndentedString(insertProgramDateTime)).append("\n");
    sb.append("    programDateTimeSettings: ").append(toIndentedString(programDateTimeSettings)).append("\n");
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


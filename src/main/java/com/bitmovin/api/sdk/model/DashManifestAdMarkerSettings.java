package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashScte35EventStreamSignalling;
import com.bitmovin.api.sdk.model.DashScte35PeriodOption;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * An optional configuration object used to define SCTE-35 signaling for ad insertion or content segmentation.  This field enables precise control over signaling behavior at both the period and event stream levels,  making it suitable for dynamic ad insertion (DAI) and live streaming workflows. This follows the ANSI/SCTE 214-1 (2024) standard. 
 */

public class DashManifestAdMarkerSettings {
  @JsonProperty("periodOption")
  private DashScte35PeriodOption periodOption;

  @JsonProperty("eventStreamSignalling")
  private DashScte35EventStreamSignalling eventStreamSignalling;


  /**
   * Get periodOption
   * @return periodOption
   */
  public DashScte35PeriodOption getPeriodOption() {
    return periodOption;
  }

  /**
   * Set periodOption
   *
   * @param periodOption
   */
  public void setPeriodOption(DashScte35PeriodOption periodOption) {
    this.periodOption = periodOption;
  }


  /**
   * Get eventStreamSignalling
   * @return eventStreamSignalling
   */
  public DashScte35EventStreamSignalling getEventStreamSignalling() {
    return eventStreamSignalling;
  }

  /**
   * Set eventStreamSignalling
   *
   * @param eventStreamSignalling
   */
  public void setEventStreamSignalling(DashScte35EventStreamSignalling eventStreamSignalling) {
    this.eventStreamSignalling = eventStreamSignalling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashManifestAdMarkerSettings dashManifestAdMarkerSettings = (DashManifestAdMarkerSettings) o;
    return Objects.equals(this.periodOption, dashManifestAdMarkerSettings.periodOption) &&
        Objects.equals(this.eventStreamSignalling, dashManifestAdMarkerSettings.eventStreamSignalling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodOption, eventStreamSignalling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashManifestAdMarkerSettings {\n");
    
    sb.append("    periodOption: ").append(toIndentedString(periodOption)).append("\n");
    sb.append("    eventStreamSignalling: ").append(toIndentedString(eventStreamSignalling)).append("\n");
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


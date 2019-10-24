package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyVisionTrackSampleEntryName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyVisionMuxingConfiguration
 */

public class DolbyVisionMuxingConfiguration {
  @JsonProperty("trackSampleEntryName")
  private DolbyVisionTrackSampleEntryName trackSampleEntryName;


  /**
   * Get trackSampleEntryName
   * @return trackSampleEntryName
   */
  public DolbyVisionTrackSampleEntryName getTrackSampleEntryName() {
    return trackSampleEntryName;
  }

  /**
   * Set trackSampleEntryName
   *
   * @param trackSampleEntryName
   */
  public void setTrackSampleEntryName(DolbyVisionTrackSampleEntryName trackSampleEntryName) {
    this.trackSampleEntryName = trackSampleEntryName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyVisionMuxingConfiguration dolbyVisionMuxingConfiguration = (DolbyVisionMuxingConfiguration) o;
    return Objects.equals(this.trackSampleEntryName, dolbyVisionMuxingConfiguration.trackSampleEntryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackSampleEntryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyVisionMuxingConfiguration {\n");
    
    sb.append("    trackSampleEntryName: ").append(toIndentedString(trackSampleEntryName)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyVisionMuxingConfiguration;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.FragmentedMp4MuxingManifestType;
import com.bitmovin.api.sdk.model.Ignoring;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.MuxingStream;
import com.bitmovin.api.sdk.model.StreamConditionsMode;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Mp4Muxing
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Mp4Muxing.class)
public class Mp4Muxing extends Muxing {
  @JsonProperty("filename")
  private String filename;

  @JsonProperty("fragmentDuration")
  private Integer fragmentDuration;

  @JsonProperty("fragmentedMP4MuxingManifestType")
  private FragmentedMp4MuxingManifestType fragmentedMP4MuxingManifestType;

  @JsonProperty("dolbyVisionConfiguration")
  private DolbyVisionMuxingConfiguration dolbyVisionConfiguration;


  /**
   * Name of the output file (either &#x60;filename&#x60; or &#x60;name&#x60; is required, prefer &#x60;filename&#x60;)
   * @return filename
   */
  public String getFilename() {
    return filename;
  }

  /**
   * Name of the output file (either &#x60;filename&#x60; or &#x60;name&#x60; is required, prefer &#x60;filename&#x60;)
   *
   * @param filename
   *        Name of the output file (either &#x60;filename&#x60; or &#x60;name&#x60; is required, prefer &#x60;filename&#x60;)
   */
  public void setFilename(String filename) {
    this.filename = filename;
  }


  /**
   *  Duration of fragments in milliseconds. Required for Fragmented MP4 Muxing (for Smooth Streaming or DASH On-Demand). Not setting this will result in unfragmented mp4.
   * @return fragmentDuration
   */
  public Integer getFragmentDuration() {
    return fragmentDuration;
  }

  /**
   *  Duration of fragments in milliseconds. Required for Fragmented MP4 Muxing (for Smooth Streaming or DASH On-Demand). Not setting this will result in unfragmented mp4.
   *
   * @param fragmentDuration
   *         Duration of fragments in milliseconds. Required for Fragmented MP4 Muxing (for Smooth Streaming or DASH On-Demand). Not setting this will result in unfragmented mp4.
   */
  public void setFragmentDuration(Integer fragmentDuration) {
    this.fragmentDuration = fragmentDuration;
  }


  /**
   * Get fragmentedMP4MuxingManifestType
   * @return fragmentedMP4MuxingManifestType
   */
  public FragmentedMp4MuxingManifestType getFragmentedMP4MuxingManifestType() {
    return fragmentedMP4MuxingManifestType;
  }

  /**
   * Set fragmentedMP4MuxingManifestType
   *
   * @param fragmentedMP4MuxingManifestType
   */
  public void setFragmentedMP4MuxingManifestType(FragmentedMp4MuxingManifestType fragmentedMP4MuxingManifestType) {
    this.fragmentedMP4MuxingManifestType = fragmentedMP4MuxingManifestType;
  }


  /**
   * Dolby Vision specific configuration
   * @return dolbyVisionConfiguration
   */
  public DolbyVisionMuxingConfiguration getDolbyVisionConfiguration() {
    return dolbyVisionConfiguration;
  }

  /**
   * Dolby Vision specific configuration
   *
   * @param dolbyVisionConfiguration
   *        Dolby Vision specific configuration
   */
  public void setDolbyVisionConfiguration(DolbyVisionMuxingConfiguration dolbyVisionConfiguration) {
    this.dolbyVisionConfiguration = dolbyVisionConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mp4Muxing mp4Muxing = (Mp4Muxing) o;
    return Objects.equals(this.filename, mp4Muxing.filename) &&
        Objects.equals(this.fragmentDuration, mp4Muxing.fragmentDuration) &&
        Objects.equals(this.fragmentedMP4MuxingManifestType, mp4Muxing.fragmentedMP4MuxingManifestType) &&
        Objects.equals(this.dolbyVisionConfiguration, mp4Muxing.dolbyVisionConfiguration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, fragmentDuration, fragmentedMP4MuxingManifestType, dolbyVisionConfiguration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mp4Muxing {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    fragmentDuration: ").append(toIndentedString(fragmentDuration)).append("\n");
    sb.append("    fragmentedMP4MuxingManifestType: ").append(toIndentedString(fragmentedMP4MuxingManifestType)).append("\n");
    sb.append("    dolbyVisionConfiguration: ").append(toIndentedString(dolbyVisionConfiguration)).append("\n");
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


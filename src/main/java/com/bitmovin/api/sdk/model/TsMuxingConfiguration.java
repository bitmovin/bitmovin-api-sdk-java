package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.TsAudioStreamConfiguration;
import com.bitmovin.api.sdk.model.TsProgramClockReferenceConfiguration;
import com.bitmovin.api.sdk.model.TsProgramMapTableConfiguration;
import com.bitmovin.api.sdk.model.TsVideoStreamConfiguration;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TsMuxingConfiguration
 */

public class TsMuxingConfiguration {
  @JsonProperty("programNumber")
  private Integer programNumber;

  @JsonProperty("pmt")
  private TsProgramMapTableConfiguration pmt;

  @JsonProperty("pcr")
  private TsProgramClockReferenceConfiguration pcr;

  @JsonProperty("videoStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<TsVideoStreamConfiguration> videoStreams = new ArrayList<TsVideoStreamConfiguration>();

  @JsonProperty("audioStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<TsAudioStreamConfiguration> audioStreams = new ArrayList<TsAudioStreamConfiguration>();


  /**
   * An integer value. Value for program_number field in the MPEG Transport Stream Program Map Table (PMT). The value zero is reserved for the NIT PID entry in the PAT.
   * minimum: 1
   * maximum: 65535
   * @return programNumber
   */
  public Integer getProgramNumber() {
    return programNumber;
  }

  /**
   * An integer value. Value for program_number field in the MPEG Transport Stream Program Map Table (PMT). The value zero is reserved for the NIT PID entry in the PAT.
   * minimum: 1
   * maximum: 65535
   *
   * @param programNumber
   *        An integer value. Value for program_number field in the MPEG Transport Stream Program Map Table (PMT). The value zero is reserved for the NIT PID entry in the PAT.
   *        minimum: 1
   *        maximum: 65535
   */
  public void setProgramNumber(Integer programNumber) {
    this.programNumber = programNumber;
  }


  /**
   * Get pmt
   * @return pmt
   */
  public TsProgramMapTableConfiguration getPmt() {
    return pmt;
  }

  /**
   * Set pmt
   *
   * @param pmt
   */
  public void setPmt(TsProgramMapTableConfiguration pmt) {
    this.pmt = pmt;
  }


  /**
   * Get pcr
   * @return pcr
   */
  public TsProgramClockReferenceConfiguration getPcr() {
    return pcr;
  }

  /**
   * Set pcr
   *
   * @param pcr
   */
  public void setPcr(TsProgramClockReferenceConfiguration pcr) {
    this.pcr = pcr;
  }


  public TsMuxingConfiguration addVideoStreamsItem(TsVideoStreamConfiguration videoStreamsItem) {
    this.videoStreams.add(videoStreamsItem);
    return this;
  }

  /**
   * Get videoStreams
   * @return videoStreams
   */
  public List<TsVideoStreamConfiguration> getVideoStreams() {
    return videoStreams;
  }

  /**
   * Set videoStreams
   *
   * @param videoStreams
   */
  public void setVideoStreams(List<TsVideoStreamConfiguration> videoStreams) {
    this.videoStreams = videoStreams;
  }


  public TsMuxingConfiguration addAudioStreamsItem(TsAudioStreamConfiguration audioStreamsItem) {
    this.audioStreams.add(audioStreamsItem);
    return this;
  }

  /**
   * Get audioStreams
   * @return audioStreams
   */
  public List<TsAudioStreamConfiguration> getAudioStreams() {
    return audioStreams;
  }

  /**
   * Set audioStreams
   *
   * @param audioStreams
   */
  public void setAudioStreams(List<TsAudioStreamConfiguration> audioStreams) {
    this.audioStreams = audioStreams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TsMuxingConfiguration tsMuxingConfiguration = (TsMuxingConfiguration) o;
    return Objects.equals(this.programNumber, tsMuxingConfiguration.programNumber) &&
        Objects.equals(this.pmt, tsMuxingConfiguration.pmt) &&
        Objects.equals(this.pcr, tsMuxingConfiguration.pcr) &&
        Objects.equals(this.videoStreams, tsMuxingConfiguration.videoStreams) &&
        Objects.equals(this.audioStreams, tsMuxingConfiguration.audioStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programNumber, pmt, pcr, videoStreams, audioStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TsMuxingConfiguration {\n");
    
    sb.append("    programNumber: ").append(toIndentedString(programNumber)).append("\n");
    sb.append("    pmt: ").append(toIndentedString(pmt)).append("\n");
    sb.append("    pcr: ").append(toIndentedString(pcr)).append("\n");
    sb.append("    videoStreams: ").append(toIndentedString(videoStreams)).append("\n");
    sb.append("    audioStreams: ").append(toIndentedString(audioStreams)).append("\n");
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


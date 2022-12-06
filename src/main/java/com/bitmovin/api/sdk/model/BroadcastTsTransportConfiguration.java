package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BroadcastTsTransportConfiguration
 */

public class BroadcastTsTransportConfiguration {
  @JsonProperty("muxrate")
  private Double muxrate;

  @JsonProperty("stopOnError")
  private Boolean stopOnError;

  @JsonProperty("preventEmptyAdaptionFieldsInVideo")
  private Boolean preventEmptyAdaptionFieldsInVideo;

  @JsonProperty("patRepetitionRatePerSec")
  private Double patRepetitionRatePerSec;

  @JsonProperty("pmtRepetitionRatePerSec")
  private Double pmtRepetitionRatePerSec;

  @JsonProperty("variableMuxRate")
  private Boolean variableMuxRate;

  @JsonProperty("initialPresentationTimeStamp")
  private Double initialPresentationTimeStamp;

  @JsonProperty("initialProgramClockReference")
  private Double initialProgramClockReference;


  /**
   * Output rate in bps. The value zero implies to use minimal rate. The minimal rate leaves approximately 15kbps of null packets in the stream.
   * minimum: 0
   * maximum: 1000000000
   * @return muxrate
   */
  public Double getMuxrate() {
    return muxrate;
  }

  /**
   * Output rate in bps. The value zero implies to use minimal rate. The minimal rate leaves approximately 15kbps of null packets in the stream.
   * minimum: 0
   * maximum: 1000000000
   *
   * @param muxrate
   *        Output rate in bps. The value zero implies to use minimal rate. The minimal rate leaves approximately 15kbps of null packets in the stream.
   *        minimum: 0
   *        maximum: 1000000000
   */
  public void setMuxrate(Double muxrate) {
    this.muxrate = muxrate;
  }


  /**
   * Stop mux on errors. If true, implies halt multiplexing when any error is encountered. If false, errors are ignored and multiplexing continues. Note that the recovery from an error will usually result in an illegal transport stream and artifacts on a decoder.
   * @return stopOnError
   */
  public Boolean getStopOnError() {
    return stopOnError;
  }

  /**
   * Stop mux on errors. If true, implies halt multiplexing when any error is encountered. If false, errors are ignored and multiplexing continues. Note that the recovery from an error will usually result in an illegal transport stream and artifacts on a decoder.
   *
   * @param stopOnError
   *        Stop mux on errors. If true, implies halt multiplexing when any error is encountered. If false, errors are ignored and multiplexing continues. Note that the recovery from an error will usually result in an illegal transport stream and artifacts on a decoder.
   */
  public void setStopOnError(Boolean stopOnError) {
    this.stopOnError = stopOnError;
  }


  /**
   * If true, prevents adaptation fields with length field equal to zero in video, i.e., zero-length AF. Please note that this condition can only occur when pesAlign for the input stream is set to true.
   * @return preventEmptyAdaptionFieldsInVideo
   */
  public Boolean getPreventEmptyAdaptionFieldsInVideo() {
    return preventEmptyAdaptionFieldsInVideo;
  }

  /**
   * If true, prevents adaptation fields with length field equal to zero in video, i.e., zero-length AF. Please note that this condition can only occur when pesAlign for the input stream is set to true.
   *
   * @param preventEmptyAdaptionFieldsInVideo
   *        If true, prevents adaptation fields with length field equal to zero in video, i.e., zero-length AF. Please note that this condition can only occur when pesAlign for the input stream is set to true.
   */
  public void setPreventEmptyAdaptionFieldsInVideo(Boolean preventEmptyAdaptionFieldsInVideo) {
    this.preventEmptyAdaptionFieldsInVideo = preventEmptyAdaptionFieldsInVideo;
  }


  /**
   * Program Association Table (PAT) repetition rate per second. Number of PATs per second.
   * minimum: 0.001
   * maximum: 1000
   * @return patRepetitionRatePerSec
   */
  public Double getPatRepetitionRatePerSec() {
    return patRepetitionRatePerSec;
  }

  /**
   * Program Association Table (PAT) repetition rate per second. Number of PATs per second.
   * minimum: 0.001
   * maximum: 1000
   *
   * @param patRepetitionRatePerSec
   *        Program Association Table (PAT) repetition rate per second. Number of PATs per second.
   *        minimum: 0.001
   *        maximum: 1000
   */
  public void setPatRepetitionRatePerSec(Double patRepetitionRatePerSec) {
    this.patRepetitionRatePerSec = patRepetitionRatePerSec;
  }


  /**
   * Program Map Table (PMT) repetition rate per second. Number of PMTs for each program per second.
   * minimum: 0.001
   * maximum: 1000
   * @return pmtRepetitionRatePerSec
   */
  public Double getPmtRepetitionRatePerSec() {
    return pmtRepetitionRatePerSec;
  }

  /**
   * Program Map Table (PMT) repetition rate per second. Number of PMTs for each program per second.
   * minimum: 0.001
   * maximum: 1000
   *
   * @param pmtRepetitionRatePerSec
   *        Program Map Table (PMT) repetition rate per second. Number of PMTs for each program per second.
   *        minimum: 0.001
   *        maximum: 1000
   */
  public void setPmtRepetitionRatePerSec(Double pmtRepetitionRatePerSec) {
    this.pmtRepetitionRatePerSec = pmtRepetitionRatePerSec;
  }


  /**
   * When false, the output stream is created at a constant bit rate. When true, the output rate is allowed to vary from a maximum rate set by the muxrate parameter down to the minimum required to carry the stream.
   * @return variableMuxRate
   */
  public Boolean getVariableMuxRate() {
    return variableMuxRate;
  }

  /**
   * When false, the output stream is created at a constant bit rate. When true, the output rate is allowed to vary from a maximum rate set by the muxrate parameter down to the minimum required to carry the stream.
   *
   * @param variableMuxRate
   *        When false, the output stream is created at a constant bit rate. When true, the output rate is allowed to vary from a maximum rate set by the muxrate parameter down to the minimum required to carry the stream.
   */
  public void setVariableMuxRate(Boolean variableMuxRate) {
    this.variableMuxRate = variableMuxRate;
  }


  /**
   * Presentation time stamp value for the first video frame. The timestamp is specified in the timescale of 90000
   * minimum: 0
   * maximum: 5400000
   * @return initialPresentationTimeStamp
   */
  public Double getInitialPresentationTimeStamp() {
    return initialPresentationTimeStamp;
  }

  /**
   * Presentation time stamp value for the first video frame. The timestamp is specified in the timescale of 90000
   * minimum: 0
   * maximum: 5400000
   *
   * @param initialPresentationTimeStamp
   *        Presentation time stamp value for the first video frame. The timestamp is specified in the timescale of 90000
   *        minimum: 0
   *        maximum: 5400000
   */
  public void setInitialPresentationTimeStamp(Double initialPresentationTimeStamp) {
    this.initialPresentationTimeStamp = initialPresentationTimeStamp;
  }


  /**
   * Program Clock Reference value at the beginning of the first packet for the transport stream. The PCR is specified in the timescale of 90000
   * minimum: 0
   * maximum: 2576980377600
   * @return initialProgramClockReference
   */
  public Double getInitialProgramClockReference() {
    return initialProgramClockReference;
  }

  /**
   * Program Clock Reference value at the beginning of the first packet for the transport stream. The PCR is specified in the timescale of 90000
   * minimum: 0
   * maximum: 2576980377600
   *
   * @param initialProgramClockReference
   *        Program Clock Reference value at the beginning of the first packet for the transport stream. The PCR is specified in the timescale of 90000
   *        minimum: 0
   *        maximum: 2576980377600
   */
  public void setInitialProgramClockReference(Double initialProgramClockReference) {
    this.initialProgramClockReference = initialProgramClockReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTsTransportConfiguration broadcastTsTransportConfiguration = (BroadcastTsTransportConfiguration) o;
    return Objects.equals(this.muxrate, broadcastTsTransportConfiguration.muxrate) &&
        Objects.equals(this.stopOnError, broadcastTsTransportConfiguration.stopOnError) &&
        Objects.equals(this.preventEmptyAdaptionFieldsInVideo, broadcastTsTransportConfiguration.preventEmptyAdaptionFieldsInVideo) &&
        Objects.equals(this.patRepetitionRatePerSec, broadcastTsTransportConfiguration.patRepetitionRatePerSec) &&
        Objects.equals(this.pmtRepetitionRatePerSec, broadcastTsTransportConfiguration.pmtRepetitionRatePerSec) &&
        Objects.equals(this.variableMuxRate, broadcastTsTransportConfiguration.variableMuxRate) &&
        Objects.equals(this.initialPresentationTimeStamp, broadcastTsTransportConfiguration.initialPresentationTimeStamp) &&
        Objects.equals(this.initialProgramClockReference, broadcastTsTransportConfiguration.initialProgramClockReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(muxrate, stopOnError, preventEmptyAdaptionFieldsInVideo, patRepetitionRatePerSec, pmtRepetitionRatePerSec, variableMuxRate, initialPresentationTimeStamp, initialProgramClockReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTsTransportConfiguration {\n");
    
    sb.append("    muxrate: ").append(toIndentedString(muxrate)).append("\n");
    sb.append("    stopOnError: ").append(toIndentedString(stopOnError)).append("\n");
    sb.append("    preventEmptyAdaptionFieldsInVideo: ").append(toIndentedString(preventEmptyAdaptionFieldsInVideo)).append("\n");
    sb.append("    patRepetitionRatePerSec: ").append(toIndentedString(patRepetitionRatePerSec)).append("\n");
    sb.append("    pmtRepetitionRatePerSec: ").append(toIndentedString(pmtRepetitionRatePerSec)).append("\n");
    sb.append("    variableMuxRate: ").append(toIndentedString(variableMuxRate)).append("\n");
    sb.append("    initialPresentationTimeStamp: ").append(toIndentedString(initialPresentationTimeStamp)).append("\n");
    sb.append("    initialProgramClockReference: ").append(toIndentedString(initialProgramClockReference)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ConvertSccCaption;
import com.bitmovin.api.sdk.model.Encoding;
import com.bitmovin.api.sdk.model.HistoryMuxing;
import com.bitmovin.api.sdk.model.HistoryStream;
import com.bitmovin.api.sdk.model.Keyframe;
import com.bitmovin.api.sdk.model.LiveEncoding;
import com.bitmovin.api.sdk.model.SidecarFile;
import com.bitmovin.api.sdk.model.StartEncodingRequest;
import com.bitmovin.api.sdk.model.StartLiveEncodingRequest;
import com.bitmovin.api.sdk.model.StreamInput;
import com.bitmovin.api.sdk.model.Task;
import com.bitmovin.api.sdk.model.TransferRetry;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HistoryEncoding
 */

public class HistoryEncoding {
  @JsonProperty("encoding")
  private Encoding encoding;

  @JsonProperty("live")
  private LiveEncoding live;

  @JsonProperty("vodStartReqeust")
  private StartEncodingRequest vodStartReqeust;

  @JsonProperty("liveStartReqeust")
  private StartLiveEncodingRequest liveStartReqeust;

  @JsonProperty("status")
  private Task status;

  @JsonProperty("inputStreams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamInput> inputStreams = new ArrayList<StreamInput>();

  @JsonProperty("streams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<HistoryStream> streams = new ArrayList<HistoryStream>();

  @JsonProperty("muxings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<HistoryMuxing> muxings = new ArrayList<HistoryMuxing>();

  @JsonProperty("keyFrames")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Keyframe> keyFrames = new ArrayList<Keyframe>();

  @JsonProperty("sidecarFiles")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SidecarFile> sidecarFiles = new ArrayList<SidecarFile>();

  @JsonProperty("transferRetries")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<TransferRetry> transferRetries = new ArrayList<TransferRetry>();

  @JsonProperty("convertSccCaptions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<ConvertSccCaption> convertSccCaptions = new ArrayList<ConvertSccCaption>();


  /**
   * Encoding
   * @return encoding
   */
  public Encoding getEncoding() {
    return encoding;
  }

  /**
   * Encoding
   *
   * @param encoding
   *        Encoding
   */
  public void setEncoding(Encoding encoding) {
    this.encoding = encoding;
  }


  /**
   * Live Details
   * @return live
   */
  public LiveEncoding getLive() {
    return live;
  }

  /**
   * Live Details
   *
   * @param live
   *        Live Details
   */
  public void setLive(LiveEncoding live) {
    this.live = live;
  }


  /**
   * VOD Encoding Start Request
   * @return vodStartReqeust
   */
  public StartEncodingRequest getVodStartReqeust() {
    return vodStartReqeust;
  }

  /**
   * VOD Encoding Start Request
   *
   * @param vodStartReqeust
   *        VOD Encoding Start Request
   */
  public void setVodStartReqeust(StartEncodingRequest vodStartReqeust) {
    this.vodStartReqeust = vodStartReqeust;
  }


  /**
   * Live Encoding Start Request
   * @return liveStartReqeust
   */
  public StartLiveEncodingRequest getLiveStartReqeust() {
    return liveStartReqeust;
  }

  /**
   * Live Encoding Start Request
   *
   * @param liveStartReqeust
   *        Live Encoding Start Request
   */
  public void setLiveStartReqeust(StartLiveEncodingRequest liveStartReqeust) {
    this.liveStartReqeust = liveStartReqeust;
  }


  /**
   * Encoding Status
   * @return status
   */
  public Task getStatus() {
    return status;
  }

  /**
   * Encoding Status
   *
   * @param status
   *        Encoding Status
   */
  public void setStatus(Task status) {
    this.status = status;
  }


  public HistoryEncoding addInputStreamsItem(StreamInput inputStreamsItem) {
    this.inputStreams.add(inputStreamsItem);
    return this;
  }

  /**
   * Get inputStreams
   * @return inputStreams
   */
  public List<StreamInput> getInputStreams() {
    return inputStreams;
  }

  /**
   * Set inputStreams
   *
   * @param inputStreams
   */
  public void setInputStreams(List<StreamInput> inputStreams) {
    this.inputStreams = inputStreams;
  }


  public HistoryEncoding addStreamsItem(HistoryStream streamsItem) {
    this.streams.add(streamsItem);
    return this;
  }

  /**
   * Get streams
   * @return streams
   */
  public List<HistoryStream> getStreams() {
    return streams;
  }

  /**
   * Set streams
   *
   * @param streams
   */
  public void setStreams(List<HistoryStream> streams) {
    this.streams = streams;
  }


  public HistoryEncoding addMuxingsItem(HistoryMuxing muxingsItem) {
    this.muxings.add(muxingsItem);
    return this;
  }

  /**
   * Get muxings
   * @return muxings
   */
  public List<HistoryMuxing> getMuxings() {
    return muxings;
  }

  /**
   * Set muxings
   *
   * @param muxings
   */
  public void setMuxings(List<HistoryMuxing> muxings) {
    this.muxings = muxings;
  }


  public HistoryEncoding addKeyFramesItem(Keyframe keyFramesItem) {
    this.keyFrames.add(keyFramesItem);
    return this;
  }

  /**
   * Get keyFrames
   * @return keyFrames
   */
  public List<Keyframe> getKeyFrames() {
    return keyFrames;
  }

  /**
   * Set keyFrames
   *
   * @param keyFrames
   */
  public void setKeyFrames(List<Keyframe> keyFrames) {
    this.keyFrames = keyFrames;
  }


  public HistoryEncoding addSidecarFilesItem(SidecarFile sidecarFilesItem) {
    this.sidecarFiles.add(sidecarFilesItem);
    return this;
  }

  /**
   * Get sidecarFiles
   * @return sidecarFiles
   */
  public List<SidecarFile> getSidecarFiles() {
    return sidecarFiles;
  }

  /**
   * Set sidecarFiles
   *
   * @param sidecarFiles
   */
  public void setSidecarFiles(List<SidecarFile> sidecarFiles) {
    this.sidecarFiles = sidecarFiles;
  }


  public HistoryEncoding addTransferRetriesItem(TransferRetry transferRetriesItem) {
    this.transferRetries.add(transferRetriesItem);
    return this;
  }

  /**
   * Get transferRetries
   * @return transferRetries
   */
  public List<TransferRetry> getTransferRetries() {
    return transferRetries;
  }

  /**
   * Set transferRetries
   *
   * @param transferRetries
   */
  public void setTransferRetries(List<TransferRetry> transferRetries) {
    this.transferRetries = transferRetries;
  }


  public HistoryEncoding addConvertSccCaptionsItem(ConvertSccCaption convertSccCaptionsItem) {
    this.convertSccCaptions.add(convertSccCaptionsItem);
    return this;
  }

  /**
   * Get convertSccCaptions
   * @return convertSccCaptions
   */
  public List<ConvertSccCaption> getConvertSccCaptions() {
    return convertSccCaptions;
  }

  /**
   * Set convertSccCaptions
   *
   * @param convertSccCaptions
   */
  public void setConvertSccCaptions(List<ConvertSccCaption> convertSccCaptions) {
    this.convertSccCaptions = convertSccCaptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryEncoding historyEncoding = (HistoryEncoding) o;
    return Objects.equals(this.encoding, historyEncoding.encoding) &&
        Objects.equals(this.live, historyEncoding.live) &&
        Objects.equals(this.vodStartReqeust, historyEncoding.vodStartReqeust) &&
        Objects.equals(this.liveStartReqeust, historyEncoding.liveStartReqeust) &&
        Objects.equals(this.status, historyEncoding.status) &&
        Objects.equals(this.inputStreams, historyEncoding.inputStreams) &&
        Objects.equals(this.streams, historyEncoding.streams) &&
        Objects.equals(this.muxings, historyEncoding.muxings) &&
        Objects.equals(this.keyFrames, historyEncoding.keyFrames) &&
        Objects.equals(this.sidecarFiles, historyEncoding.sidecarFiles) &&
        Objects.equals(this.transferRetries, historyEncoding.transferRetries) &&
        Objects.equals(this.convertSccCaptions, historyEncoding.convertSccCaptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encoding, live, vodStartReqeust, liveStartReqeust, status, inputStreams, streams, muxings, keyFrames, sidecarFiles, transferRetries, convertSccCaptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryEncoding {\n");
    
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    vodStartReqeust: ").append(toIndentedString(vodStartReqeust)).append("\n");
    sb.append("    liveStartReqeust: ").append(toIndentedString(liveStartReqeust)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inputStreams: ").append(toIndentedString(inputStreams)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    muxings: ").append(toIndentedString(muxings)).append("\n");
    sb.append("    keyFrames: ").append(toIndentedString(keyFrames)).append("\n");
    sb.append("    sidecarFiles: ").append(toIndentedString(sidecarFiles)).append("\n");
    sb.append("    transferRetries: ").append(toIndentedString(transferRetries)).append("\n");
    sb.append("    convertSccCaptions: ").append(toIndentedString(convertSccCaptions)).append("\n");
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


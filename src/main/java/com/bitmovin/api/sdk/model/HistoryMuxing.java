package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BroadcastTsMuxingInformation;
import com.bitmovin.api.sdk.model.Drm;
import com.bitmovin.api.sdk.model.Fmp4MuxingInformation;
import com.bitmovin.api.sdk.model.Mp3MuxingInformation;
import com.bitmovin.api.sdk.model.Mp4MuxingInformation;
import com.bitmovin.api.sdk.model.Muxing;
import com.bitmovin.api.sdk.model.PackedAudioMuxingInformation;
import com.bitmovin.api.sdk.model.ProgressiveMovMuxingInformation;
import com.bitmovin.api.sdk.model.ProgressiveTsMuxingInformation;
import com.bitmovin.api.sdk.model.ProgressiveWebmMuxingInformation;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HistoryMuxing
 */

public class HistoryMuxing {
  @JsonProperty("muxing")
  private Muxing muxing;

  @JsonProperty("drms")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Drm> drms = new ArrayList<Drm>();

  @JsonProperty("broadcastTsMuxingInformation")
  private BroadcastTsMuxingInformation broadcastTsMuxingInformation;

  @JsonProperty("fmp4MuxingInformation")
  private Fmp4MuxingInformation fmp4MuxingInformation;

  @JsonProperty("mp3MuxingInformation")
  private Mp3MuxingInformation mp3MuxingInformation;

  @JsonProperty("mp4MuxingInformation")
  private Mp4MuxingInformation mp4MuxingInformation;

  @JsonProperty("packedAudioMuxingInformation")
  private PackedAudioMuxingInformation packedAudioMuxingInformation;

  @JsonProperty("progressiveMovMuxingInformation")
  private ProgressiveMovMuxingInformation progressiveMovMuxingInformation;

  @JsonProperty("progressiveTsMuxingInformation")
  private ProgressiveTsMuxingInformation progressiveTsMuxingInformation;

  @JsonProperty("progressiveWebmMuxingInformation")
  private ProgressiveWebmMuxingInformation progressiveWebmMuxingInformation;


  /**
   * Muxing
   * @return muxing
   */
  public Muxing getMuxing() {
    return muxing;
  }

  /**
   * Muxing
   *
   * @param muxing
   *        Muxing
   */
  public void setMuxing(Muxing muxing) {
    this.muxing = muxing;
  }


  public HistoryMuxing addDrmsItem(Drm drmsItem) {
    this.drms.add(drmsItem);
    return this;
  }

  /**
   * Get drms
   * @return drms
   */
  public List<Drm> getDrms() {
    return drms;
  }

  /**
   * Set drms
   *
   * @param drms
   */
  public void setDrms(List<Drm> drms) {
    this.drms = drms;
  }


  /**
   * Get broadcastTsMuxingInformation
   * @return broadcastTsMuxingInformation
   */
  public BroadcastTsMuxingInformation getBroadcastTsMuxingInformation() {
    return broadcastTsMuxingInformation;
  }

  /**
   * Set broadcastTsMuxingInformation
   *
   * @param broadcastTsMuxingInformation
   */
  public void setBroadcastTsMuxingInformation(BroadcastTsMuxingInformation broadcastTsMuxingInformation) {
    this.broadcastTsMuxingInformation = broadcastTsMuxingInformation;
  }


  /**
   * Get fmp4MuxingInformation
   * @return fmp4MuxingInformation
   */
  public Fmp4MuxingInformation getFmp4MuxingInformation() {
    return fmp4MuxingInformation;
  }

  /**
   * Set fmp4MuxingInformation
   *
   * @param fmp4MuxingInformation
   */
  public void setFmp4MuxingInformation(Fmp4MuxingInformation fmp4MuxingInformation) {
    this.fmp4MuxingInformation = fmp4MuxingInformation;
  }


  /**
   * Get mp3MuxingInformation
   * @return mp3MuxingInformation
   */
  public Mp3MuxingInformation getMp3MuxingInformation() {
    return mp3MuxingInformation;
  }

  /**
   * Set mp3MuxingInformation
   *
   * @param mp3MuxingInformation
   */
  public void setMp3MuxingInformation(Mp3MuxingInformation mp3MuxingInformation) {
    this.mp3MuxingInformation = mp3MuxingInformation;
  }


  /**
   * Get mp4MuxingInformation
   * @return mp4MuxingInformation
   */
  public Mp4MuxingInformation getMp4MuxingInformation() {
    return mp4MuxingInformation;
  }

  /**
   * Set mp4MuxingInformation
   *
   * @param mp4MuxingInformation
   */
  public void setMp4MuxingInformation(Mp4MuxingInformation mp4MuxingInformation) {
    this.mp4MuxingInformation = mp4MuxingInformation;
  }


  /**
   * Get packedAudioMuxingInformation
   * @return packedAudioMuxingInformation
   */
  public PackedAudioMuxingInformation getPackedAudioMuxingInformation() {
    return packedAudioMuxingInformation;
  }

  /**
   * Set packedAudioMuxingInformation
   *
   * @param packedAudioMuxingInformation
   */
  public void setPackedAudioMuxingInformation(PackedAudioMuxingInformation packedAudioMuxingInformation) {
    this.packedAudioMuxingInformation = packedAudioMuxingInformation;
  }


  /**
   * Get progressiveMovMuxingInformation
   * @return progressiveMovMuxingInformation
   */
  public ProgressiveMovMuxingInformation getProgressiveMovMuxingInformation() {
    return progressiveMovMuxingInformation;
  }

  /**
   * Set progressiveMovMuxingInformation
   *
   * @param progressiveMovMuxingInformation
   */
  public void setProgressiveMovMuxingInformation(ProgressiveMovMuxingInformation progressiveMovMuxingInformation) {
    this.progressiveMovMuxingInformation = progressiveMovMuxingInformation;
  }


  /**
   * Get progressiveTsMuxingInformation
   * @return progressiveTsMuxingInformation
   */
  public ProgressiveTsMuxingInformation getProgressiveTsMuxingInformation() {
    return progressiveTsMuxingInformation;
  }

  /**
   * Set progressiveTsMuxingInformation
   *
   * @param progressiveTsMuxingInformation
   */
  public void setProgressiveTsMuxingInformation(ProgressiveTsMuxingInformation progressiveTsMuxingInformation) {
    this.progressiveTsMuxingInformation = progressiveTsMuxingInformation;
  }


  /**
   * Get progressiveWebmMuxingInformation
   * @return progressiveWebmMuxingInformation
   */
  public ProgressiveWebmMuxingInformation getProgressiveWebmMuxingInformation() {
    return progressiveWebmMuxingInformation;
  }

  /**
   * Set progressiveWebmMuxingInformation
   *
   * @param progressiveWebmMuxingInformation
   */
  public void setProgressiveWebmMuxingInformation(ProgressiveWebmMuxingInformation progressiveWebmMuxingInformation) {
    this.progressiveWebmMuxingInformation = progressiveWebmMuxingInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryMuxing historyMuxing = (HistoryMuxing) o;
    return Objects.equals(this.muxing, historyMuxing.muxing) &&
        Objects.equals(this.drms, historyMuxing.drms) &&
        Objects.equals(this.broadcastTsMuxingInformation, historyMuxing.broadcastTsMuxingInformation) &&
        Objects.equals(this.fmp4MuxingInformation, historyMuxing.fmp4MuxingInformation) &&
        Objects.equals(this.mp3MuxingInformation, historyMuxing.mp3MuxingInformation) &&
        Objects.equals(this.mp4MuxingInformation, historyMuxing.mp4MuxingInformation) &&
        Objects.equals(this.packedAudioMuxingInformation, historyMuxing.packedAudioMuxingInformation) &&
        Objects.equals(this.progressiveMovMuxingInformation, historyMuxing.progressiveMovMuxingInformation) &&
        Objects.equals(this.progressiveTsMuxingInformation, historyMuxing.progressiveTsMuxingInformation) &&
        Objects.equals(this.progressiveWebmMuxingInformation, historyMuxing.progressiveWebmMuxingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(muxing, drms, broadcastTsMuxingInformation, fmp4MuxingInformation, mp3MuxingInformation, mp4MuxingInformation, packedAudioMuxingInformation, progressiveMovMuxingInformation, progressiveTsMuxingInformation, progressiveWebmMuxingInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMuxing {\n");
    
    sb.append("    muxing: ").append(toIndentedString(muxing)).append("\n");
    sb.append("    drms: ").append(toIndentedString(drms)).append("\n");
    sb.append("    broadcastTsMuxingInformation: ").append(toIndentedString(broadcastTsMuxingInformation)).append("\n");
    sb.append("    fmp4MuxingInformation: ").append(toIndentedString(fmp4MuxingInformation)).append("\n");
    sb.append("    mp3MuxingInformation: ").append(toIndentedString(mp3MuxingInformation)).append("\n");
    sb.append("    mp4MuxingInformation: ").append(toIndentedString(mp4MuxingInformation)).append("\n");
    sb.append("    packedAudioMuxingInformation: ").append(toIndentedString(packedAudioMuxingInformation)).append("\n");
    sb.append("    progressiveMovMuxingInformation: ").append(toIndentedString(progressiveMovMuxingInformation)).append("\n");
    sb.append("    progressiveTsMuxingInformation: ").append(toIndentedString(progressiveTsMuxingInformation)).append("\n");
    sb.append("    progressiveWebmMuxingInformation: ").append(toIndentedString(progressiveWebmMuxingInformation)).append("\n");
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


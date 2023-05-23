package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Bif;
import com.bitmovin.api.sdk.model.BurnInSubtitleDvbSub;
import com.bitmovin.api.sdk.model.BurnInSubtitleSrt;
import com.bitmovin.api.sdk.model.DolbyVisionMetadata;
import com.bitmovin.api.sdk.model.NexGuardFileMarker;
import com.bitmovin.api.sdk.model.PsnrQualityMetric;
import com.bitmovin.api.sdk.model.SccCaption;
import com.bitmovin.api.sdk.model.Sprite;
import com.bitmovin.api.sdk.model.Stream;
import com.bitmovin.api.sdk.model.StreamFilter;
import com.bitmovin.api.sdk.model.Thumbnail;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HistoryStream
 */

public class HistoryStream {
  @JsonProperty("stream")
  private Stream stream;

  @JsonProperty("filters")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamFilter> filters = new ArrayList<StreamFilter>();

  @JsonProperty("burnInSubtitleDvbSubs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BurnInSubtitleDvbSub> burnInSubtitleDvbSubs = new ArrayList<BurnInSubtitleDvbSub>();

  @JsonProperty("burnInSubtitleSrtSubs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BurnInSubtitleSrt> burnInSubtitleSrtSubs = new ArrayList<BurnInSubtitleSrt>();

  @JsonProperty("nexGuardFileMarker")
  private NexGuardFileMarker nexGuardFileMarker;

  @JsonProperty("sccCaptions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<SccCaption> sccCaptions = new ArrayList<SccCaption>();

  @JsonProperty("bifs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Bif> bifs = new ArrayList<Bif>();

  @JsonProperty("dolbyVisionMetadata")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<DolbyVisionMetadata> dolbyVisionMetadata = new ArrayList<DolbyVisionMetadata>();

  @JsonProperty("thumbnails")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Thumbnail> thumbnails = new ArrayList<Thumbnail>();

  @JsonProperty("sprites")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Sprite> sprites = new ArrayList<Sprite>();

  @JsonProperty("psnrMetrics")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<PsnrQualityMetric> psnrMetrics = new ArrayList<PsnrQualityMetric>();


  /**
   * Stream
   * @return stream
   */
  public Stream getStream() {
    return stream;
  }

  /**
   * Stream
   *
   * @param stream
   *        Stream
   */
  public void setStream(Stream stream) {
    this.stream = stream;
  }


  public HistoryStream addFiltersItem(StreamFilter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * List of stream filter configurations
   * @return filters
   */
  public List<StreamFilter> getFilters() {
    return filters;
  }

  /**
   * List of stream filter configurations
   *
   * @param filters
   *        List of stream filter configurations
   */
  public void setFilters(List<StreamFilter> filters) {
    this.filters = filters;
  }


  public HistoryStream addBurnInSubtitleDvbSubsItem(BurnInSubtitleDvbSub burnInSubtitleDvbSubsItem) {
    this.burnInSubtitleDvbSubs.add(burnInSubtitleDvbSubsItem);
    return this;
  }

  /**
   * List of Burn-In DVB-SUB subtitles
   * @return burnInSubtitleDvbSubs
   */
  public List<BurnInSubtitleDvbSub> getBurnInSubtitleDvbSubs() {
    return burnInSubtitleDvbSubs;
  }

  /**
   * List of Burn-In DVB-SUB subtitles
   *
   * @param burnInSubtitleDvbSubs
   *        List of Burn-In DVB-SUB subtitles
   */
  public void setBurnInSubtitleDvbSubs(List<BurnInSubtitleDvbSub> burnInSubtitleDvbSubs) {
    this.burnInSubtitleDvbSubs = burnInSubtitleDvbSubs;
  }


  public HistoryStream addBurnInSubtitleSrtSubsItem(BurnInSubtitleSrt burnInSubtitleSrtSubsItem) {
    this.burnInSubtitleSrtSubs.add(burnInSubtitleSrtSubsItem);
    return this;
  }

  /**
   * List of burn-in SRT configurations
   * @return burnInSubtitleSrtSubs
   */
  public List<BurnInSubtitleSrt> getBurnInSubtitleSrtSubs() {
    return burnInSubtitleSrtSubs;
  }

  /**
   * List of burn-in SRT configurations
   *
   * @param burnInSubtitleSrtSubs
   *        List of burn-in SRT configurations
   */
  public void setBurnInSubtitleSrtSubs(List<BurnInSubtitleSrt> burnInSubtitleSrtSubs) {
    this.burnInSubtitleSrtSubs = burnInSubtitleSrtSubs;
  }


  /**
   * Nexguard file marker watermarking configuration
   * @return nexGuardFileMarker
   */
  public NexGuardFileMarker getNexGuardFileMarker() {
    return nexGuardFileMarker;
  }

  /**
   * Nexguard file marker watermarking configuration
   *
   * @param nexGuardFileMarker
   *        Nexguard file marker watermarking configuration
   */
  public void setNexGuardFileMarker(NexGuardFileMarker nexGuardFileMarker) {
    this.nexGuardFileMarker = nexGuardFileMarker;
  }


  public HistoryStream addSccCaptionsItem(SccCaption sccCaptionsItem) {
    this.sccCaptions.add(sccCaptionsItem);
    return this;
  }

  /**
   * List of caption configurations
   * @return sccCaptions
   */
  public List<SccCaption> getSccCaptions() {
    return sccCaptions;
  }

  /**
   * List of caption configurations
   *
   * @param sccCaptions
   *        List of caption configurations
   */
  public void setSccCaptions(List<SccCaption> sccCaptions) {
    this.sccCaptions = sccCaptions;
  }


  public HistoryStream addBifsItem(Bif bifsItem) {
    this.bifs.add(bifsItem);
    return this;
  }

  /**
   * List of bif configurations
   * @return bifs
   */
  public List<Bif> getBifs() {
    return bifs;
  }

  /**
   * List of bif configurations
   *
   * @param bifs
   *        List of bif configurations
   */
  public void setBifs(List<Bif> bifs) {
    this.bifs = bifs;
  }


  public HistoryStream addDolbyVisionMetadataItem(DolbyVisionMetadata dolbyVisionMetadataItem) {
    this.dolbyVisionMetadata.add(dolbyVisionMetadataItem);
    return this;
  }

  /**
   * List of Dolby Vision Metadata configurations
   * @return dolbyVisionMetadata
   */
  public List<DolbyVisionMetadata> getDolbyVisionMetadata() {
    return dolbyVisionMetadata;
  }

  /**
   * List of Dolby Vision Metadata configurations
   *
   * @param dolbyVisionMetadata
   *        List of Dolby Vision Metadata configurations
   */
  public void setDolbyVisionMetadata(List<DolbyVisionMetadata> dolbyVisionMetadata) {
    this.dolbyVisionMetadata = dolbyVisionMetadata;
  }


  public HistoryStream addThumbnailsItem(Thumbnail thumbnailsItem) {
    this.thumbnails.add(thumbnailsItem);
    return this;
  }

  /**
   * List of Thumbnail configurations
   * @return thumbnails
   */
  public List<Thumbnail> getThumbnails() {
    return thumbnails;
  }

  /**
   * List of Thumbnail configurations
   *
   * @param thumbnails
   *        List of Thumbnail configurations
   */
  public void setThumbnails(List<Thumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }


  public HistoryStream addSpritesItem(Sprite spritesItem) {
    this.sprites.add(spritesItem);
    return this;
  }

  /**
   * List of Sprite configurations
   * @return sprites
   */
  public List<Sprite> getSprites() {
    return sprites;
  }

  /**
   * List of Sprite configurations
   *
   * @param sprites
   *        List of Sprite configurations
   */
  public void setSprites(List<Sprite> sprites) {
    this.sprites = sprites;
  }


  public HistoryStream addPsnrMetricsItem(PsnrQualityMetric psnrMetricsItem) {
    this.psnrMetrics.add(psnrMetricsItem);
    return this;
  }

  /**
   * List of PSNR quality metrics
   * @return psnrMetrics
   */
  public List<PsnrQualityMetric> getPsnrMetrics() {
    return psnrMetrics;
  }

  /**
   * List of PSNR quality metrics
   *
   * @param psnrMetrics
   *        List of PSNR quality metrics
   */
  public void setPsnrMetrics(List<PsnrQualityMetric> psnrMetrics) {
    this.psnrMetrics = psnrMetrics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoryStream historyStream = (HistoryStream) o;
    return Objects.equals(this.stream, historyStream.stream) &&
        Objects.equals(this.filters, historyStream.filters) &&
        Objects.equals(this.burnInSubtitleDvbSubs, historyStream.burnInSubtitleDvbSubs) &&
        Objects.equals(this.burnInSubtitleSrtSubs, historyStream.burnInSubtitleSrtSubs) &&
        Objects.equals(this.nexGuardFileMarker, historyStream.nexGuardFileMarker) &&
        Objects.equals(this.sccCaptions, historyStream.sccCaptions) &&
        Objects.equals(this.bifs, historyStream.bifs) &&
        Objects.equals(this.dolbyVisionMetadata, historyStream.dolbyVisionMetadata) &&
        Objects.equals(this.thumbnails, historyStream.thumbnails) &&
        Objects.equals(this.sprites, historyStream.sprites) &&
        Objects.equals(this.psnrMetrics, historyStream.psnrMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stream, filters, burnInSubtitleDvbSubs, burnInSubtitleSrtSubs, nexGuardFileMarker, sccCaptions, bifs, dolbyVisionMetadata, thumbnails, sprites, psnrMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryStream {\n");
    
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    burnInSubtitleDvbSubs: ").append(toIndentedString(burnInSubtitleDvbSubs)).append("\n");
    sb.append("    burnInSubtitleSrtSubs: ").append(toIndentedString(burnInSubtitleSrtSubs)).append("\n");
    sb.append("    nexGuardFileMarker: ").append(toIndentedString(nexGuardFileMarker)).append("\n");
    sb.append("    sccCaptions: ").append(toIndentedString(sccCaptions)).append("\n");
    sb.append("    bifs: ").append(toIndentedString(bifs)).append("\n");
    sb.append("    dolbyVisionMetadata: ").append(toIndentedString(dolbyVisionMetadata)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
    sb.append("    psnrMetrics: ").append(toIndentedString(psnrMetrics)).append("\n");
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


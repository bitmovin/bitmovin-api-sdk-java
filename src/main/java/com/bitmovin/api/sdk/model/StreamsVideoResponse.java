package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsAdConfigResponse;
import com.bitmovin.api.sdk.model.StreamsDomainRestrictionResponse;
import com.bitmovin.api.sdk.model.StreamsResponse;
import com.bitmovin.api.sdk.model.StreamsStyleConfigResponse;
import com.bitmovin.api.sdk.model.StreamsTrimmingStatus;
import com.bitmovin.api.sdk.model.StreamsType;
import com.bitmovin.api.sdk.model.StreamsVideoEncodingTask;
import com.bitmovin.api.sdk.model.StreamsVideoStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsVideoResponse
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = StreamsVideoResponse.class)
public class StreamsVideoResponse extends StreamsResponse {
  @JsonProperty("assetUrl")
  private String assetUrl;

  @JsonProperty("status")
  private StreamsVideoStatus status;

  @JsonProperty("styleConfig")
  private StreamsStyleConfigResponse styleConfig;

  @JsonProperty("encodingTasks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamsVideoEncodingTask> encodingTasks = new ArrayList<StreamsVideoEncodingTask>();

  @JsonProperty("posterUrl")
  private String posterUrl;

  @JsonProperty("adConfig")
  private StreamsAdConfigResponse adConfig;

  @JsonProperty("domainRestriction")
  private StreamsDomainRestrictionResponse domainRestriction;

  @JsonProperty("trimming")
  private StreamsTrimmingStatus trimming;

  @JsonProperty("downloadUrl")
  private String downloadUrl;

  @JsonProperty("signed")
  private Boolean signed;

  /**
   * The asset URL of the stream
   * @return assetUrl
   */
  public String getAssetUrl() {
    return assetUrl;
  }

  /**
   * The status of the stream
   * @return status
   */
  public StreamsVideoStatus getStatus() {
    return status;
  }


  /**
   * Get styleConfig
   * @return styleConfig
   */
  public StreamsStyleConfigResponse getStyleConfig() {
    return styleConfig;
  }

  /**
   * Set styleConfig
   *
   * @param styleConfig
   */
  public void setStyleConfig(StreamsStyleConfigResponse styleConfig) {
    this.styleConfig = styleConfig;
  }

  /**
   * List of encoding status information
   * @return encodingTasks
   */
  public List<StreamsVideoEncodingTask> getEncodingTasks() {
    return encodingTasks;
  }

  /**
   * Poster URL
   * @return posterUrl
   */
  public String getPosterUrl() {
    return posterUrl;
  }


  /**
   * Get adConfig
   * @return adConfig
   */
  public StreamsAdConfigResponse getAdConfig() {
    return adConfig;
  }

  /**
   * Set adConfig
   *
   * @param adConfig
   */
  public void setAdConfig(StreamsAdConfigResponse adConfig) {
    this.adConfig = adConfig;
  }


  /**
   * Get domainRestriction
   * @return domainRestriction
   */
  public StreamsDomainRestrictionResponse getDomainRestriction() {
    return domainRestriction;
  }

  /**
   * Set domainRestriction
   *
   * @param domainRestriction
   */
  public void setDomainRestriction(StreamsDomainRestrictionResponse domainRestriction) {
    this.domainRestriction = domainRestriction;
  }

  /**
   * Stream trimming information
   * @return trimming
   */
  public StreamsTrimmingStatus getTrimming() {
    return trimming;
  }

  /**
   * Single-file download URL of the unaltered video in the best available quality
   * @return downloadUrl
   */
  public String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * True if the stream is signature protected
   * @return signed
   */
  public Boolean getSigned() {
    return signed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsVideoResponse streamsVideoResponse = (StreamsVideoResponse) o;
    return Objects.equals(this.assetUrl, streamsVideoResponse.assetUrl) &&
        Objects.equals(this.status, streamsVideoResponse.status) &&
        Objects.equals(this.styleConfig, streamsVideoResponse.styleConfig) &&
        Objects.equals(this.encodingTasks, streamsVideoResponse.encodingTasks) &&
        Objects.equals(this.posterUrl, streamsVideoResponse.posterUrl) &&
        Objects.equals(this.adConfig, streamsVideoResponse.adConfig) &&
        Objects.equals(this.domainRestriction, streamsVideoResponse.domainRestriction) &&
        Objects.equals(this.trimming, streamsVideoResponse.trimming) &&
        Objects.equals(this.downloadUrl, streamsVideoResponse.downloadUrl) &&
        Objects.equals(this.signed, streamsVideoResponse.signed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, status, styleConfig, encodingTasks, posterUrl, adConfig, domainRestriction, trimming, downloadUrl, signed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsVideoResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    styleConfig: ").append(toIndentedString(styleConfig)).append("\n");
    sb.append("    encodingTasks: ").append(toIndentedString(encodingTasks)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    adConfig: ").append(toIndentedString(adConfig)).append("\n");
    sb.append("    domainRestriction: ").append(toIndentedString(domainRestriction)).append("\n");
    sb.append("    trimming: ").append(toIndentedString(trimming)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    signed: ").append(toIndentedString(signed)).append("\n");
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


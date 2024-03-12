package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsAdConfigResponse;
import com.bitmovin.api.sdk.model.StreamsDomainRestrictionResponse;
import com.bitmovin.api.sdk.model.StreamsLiveLifeCycle;
import com.bitmovin.api.sdk.model.StreamsResponse;
import com.bitmovin.api.sdk.model.StreamsStyleConfigResponse;
import com.bitmovin.api.sdk.model.StreamsTrimmingStatus;
import com.bitmovin.api.sdk.model.StreamsType;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsLiveResponse
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = StreamsLiveResponse.class)
public class StreamsLiveResponse extends StreamsResponse {
  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("lifeCycle")
  private StreamsLiveLifeCycle lifeCycle;

  @JsonProperty("styleConfig")
  private StreamsStyleConfigResponse styleConfig;

  @JsonProperty("posterUrl")
  private String posterUrl;

  @JsonProperty("adConfig")
  private StreamsAdConfigResponse adConfig;

  @JsonProperty("domainRestriction")
  private StreamsDomainRestrictionResponse domainRestriction;

  @JsonProperty("trimming")
  private StreamsTrimmingStatus trimming;

  /**
   * The streamKey of the stream
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }

  /**
   * The life cycle of the stream
   * @return lifeCycle
   */
  public StreamsLiveLifeCycle getLifeCycle() {
    return lifeCycle;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsLiveResponse streamsLiveResponse = (StreamsLiveResponse) o;
    return Objects.equals(this.streamKey, streamsLiveResponse.streamKey) &&
        Objects.equals(this.lifeCycle, streamsLiveResponse.lifeCycle) &&
        Objects.equals(this.styleConfig, streamsLiveResponse.styleConfig) &&
        Objects.equals(this.posterUrl, streamsLiveResponse.posterUrl) &&
        Objects.equals(this.adConfig, streamsLiveResponse.adConfig) &&
        Objects.equals(this.domainRestriction, streamsLiveResponse.domainRestriction) &&
        Objects.equals(this.trimming, streamsLiveResponse.trimming) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamKey, lifeCycle, styleConfig, posterUrl, adConfig, domainRestriction, trimming, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsLiveResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    styleConfig: ").append(toIndentedString(styleConfig)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    adConfig: ").append(toIndentedString(adConfig)).append("\n");
    sb.append("    domainRestriction: ").append(toIndentedString(domainRestriction)).append("\n");
    sb.append("    trimming: ").append(toIndentedString(trimming)).append("\n");
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


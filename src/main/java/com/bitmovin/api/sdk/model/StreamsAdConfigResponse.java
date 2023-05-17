package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsAdConfigAd;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsAdConfigResponse
 */

public class StreamsAdConfigResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("ads")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamsAdConfigAd> ads = new ArrayList<StreamsAdConfigAd>();

  /**
   * The identifier of the streams ad config
   * @return id
   */
  public String getId() {
    return id;
  }


  public StreamsAdConfigResponse addAdsItem(StreamsAdConfigAd adsItem) {
    this.ads.add(adsItem);
    return this;
  }

  /**
   * Get ads
   * @return ads
   */
  public List<StreamsAdConfigAd> getAds() {
    return ads;
  }

  /**
   * Set ads
   *
   * @param ads
   */
  public void setAds(List<StreamsAdConfigAd> ads) {
    this.ads = ads;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsAdConfigResponse streamsAdConfigResponse = (StreamsAdConfigResponse) o;
    return Objects.equals(this.id, streamsAdConfigResponse.id) &&
        Objects.equals(this.ads, streamsAdConfigResponse.ads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsAdConfigResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ads: ").append(toIndentedString(ads)).append("\n");
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


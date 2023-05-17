package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsAdConfigAd
 */

public class StreamsAdConfigAd {
  @JsonProperty("position")
  private String position;

  @JsonProperty("url")
  private String url;

  @JsonProperty("type")
  private String type;


  /**
   * Get position
   * @return position
   */
  public String getPosition() {
    return position;
  }

  /**
   * Set position
   *
   * @param position
   */
  public void setPosition(String position) {
    this.position = position;
  }


  /**
   * Get url
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Set url
   *
   * @param url
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Get type
   * @return type
   */
  public String getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsAdConfigAd streamsAdConfigAd = (StreamsAdConfigAd) o;
    return Objects.equals(this.position, streamsAdConfigAd.position) &&
        Objects.equals(this.url, streamsAdConfigAd.url) &&
        Objects.equals(this.type, streamsAdConfigAd.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, url, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsAdConfigAd {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


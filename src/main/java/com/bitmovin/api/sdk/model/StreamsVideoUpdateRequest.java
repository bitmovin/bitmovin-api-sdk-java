package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsVideoStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsVideoUpdateRequest
 */

public class StreamsVideoUpdateRequest {
  @JsonProperty("status")
  private StreamsVideoStatus status;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("configId")
  private String configId;

  @JsonProperty("posterUrl")
  private String posterUrl;

  @JsonProperty("adConfigId")
  private String adConfigId;


  /**
   * The new status of the stream
   * @return status
   */
  public StreamsVideoStatus getStatus() {
    return status;
  }

  /**
   * The new status of the stream
   *
   * @param status
   *        The new status of the stream
   */
  public void setStatus(StreamsVideoStatus status) {
    this.status = status;
  }


  /**
   * The new title of the stream
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * The new title of the stream
   *
   * @param title
   *        The new title of the stream
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The new description of the stream
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * The new description of the stream
   *
   * @param description
   *        The new description of the stream
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Id of the stream config to use
   * @return configId
   */
  public String getConfigId() {
    return configId;
  }

  /**
   * Id of the stream config to use
   *
   * @param configId
   *        Id of the stream config to use
   */
  public void setConfigId(String configId) {
    this.configId = configId;
  }


  /**
   * URL to hosted poster image
   * @return posterUrl
   */
  public String getPosterUrl() {
    return posterUrl;
  }

  /**
   * URL to hosted poster image
   *
   * @param posterUrl
   *        URL to hosted poster image
   */
  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }


  /**
   * Id of the advertisement config to use
   * @return adConfigId
   */
  public String getAdConfigId() {
    return adConfigId;
  }

  /**
   * Id of the advertisement config to use
   *
   * @param adConfigId
   *        Id of the advertisement config to use
   */
  public void setAdConfigId(String adConfigId) {
    this.adConfigId = adConfigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsVideoUpdateRequest streamsVideoUpdateRequest = (StreamsVideoUpdateRequest) o;
    return Objects.equals(this.status, streamsVideoUpdateRequest.status) &&
        Objects.equals(this.title, streamsVideoUpdateRequest.title) &&
        Objects.equals(this.description, streamsVideoUpdateRequest.description) &&
        Objects.equals(this.configId, streamsVideoUpdateRequest.configId) &&
        Objects.equals(this.posterUrl, streamsVideoUpdateRequest.posterUrl) &&
        Objects.equals(this.adConfigId, streamsVideoUpdateRequest.adConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, title, description, configId, posterUrl, adConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsVideoUpdateRequest {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    adConfigId: ").append(toIndentedString(adConfigId)).append("\n");
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


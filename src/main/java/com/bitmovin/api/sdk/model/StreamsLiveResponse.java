package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsConfigResponse;
import com.bitmovin.api.sdk.model.StreamsLiveLifeCycle;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsLiveResponse
 */

public class StreamsLiveResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("lifeCycle")
  private StreamsLiveLifeCycle lifeCycle;

  @JsonProperty("config")
  private StreamsConfigResponse config;

  @JsonProperty("posterUrl")
  private String posterUrl;

  /**
   * The identifier of the stream
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * The streamKey of the stream
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }

  /**
   * The title of the stream
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * The description of the stream
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * The life cycle of the stream
   * @return lifeCycle
   */
  public StreamsLiveLifeCycle getLifeCycle() {
    return lifeCycle;
  }


  /**
   * Get config
   * @return config
   */
  public StreamsConfigResponse getConfig() {
    return config;
  }

  /**
   * Set config
   *
   * @param config
   */
  public void setConfig(StreamsConfigResponse config) {
    this.config = config;
  }

  /**
   * Poster URL
   * @return posterUrl
   */
  public String getPosterUrl() {
    return posterUrl;
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
    return Objects.equals(this.id, streamsLiveResponse.id) &&
        Objects.equals(this.streamKey, streamsLiveResponse.streamKey) &&
        Objects.equals(this.title, streamsLiveResponse.title) &&
        Objects.equals(this.description, streamsLiveResponse.description) &&
        Objects.equals(this.createdAt, streamsLiveResponse.createdAt) &&
        Objects.equals(this.lifeCycle, streamsLiveResponse.lifeCycle) &&
        Objects.equals(this.config, streamsLiveResponse.config) &&
        Objects.equals(this.posterUrl, streamsLiveResponse.posterUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, streamKey, title, description, createdAt, lifeCycle, config, posterUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsLiveResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
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


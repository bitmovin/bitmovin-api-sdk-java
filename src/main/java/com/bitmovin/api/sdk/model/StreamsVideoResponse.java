package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
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

public class StreamsVideoResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("assetUrl")
  private String assetUrl;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("status")
  private StreamsVideoStatus status;

  @JsonProperty("encodingTasks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamsVideoEncodingTask> encodingTasks = new ArrayList<StreamsVideoEncodingTask>();

  /**
   * The identifier of the stream
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * The asset URL of the stream
   * @return assetUrl
   */
  public String getAssetUrl() {
    return assetUrl;
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
   * The status of the stream
   * @return status
   */
  public StreamsVideoStatus getStatus() {
    return status;
  }

  /**
   * List of encoding status information
   * @return encodingTasks
   */
  public List<StreamsVideoEncodingTask> getEncodingTasks() {
    return encodingTasks;
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
    return Objects.equals(this.id, streamsVideoResponse.id) &&
        Objects.equals(this.assetUrl, streamsVideoResponse.assetUrl) &&
        Objects.equals(this.title, streamsVideoResponse.title) &&
        Objects.equals(this.description, streamsVideoResponse.description) &&
        Objects.equals(this.createdAt, streamsVideoResponse.createdAt) &&
        Objects.equals(this.status, streamsVideoResponse.status) &&
        Objects.equals(this.encodingTasks, streamsVideoResponse.encodingTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assetUrl, title, description, createdAt, status, encodingTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsVideoResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    encodingTasks: ").append(toIndentedString(encodingTasks)).append("\n");
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

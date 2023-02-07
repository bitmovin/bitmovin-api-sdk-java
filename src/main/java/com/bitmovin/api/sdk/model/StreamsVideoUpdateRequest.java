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
        Objects.equals(this.description, streamsVideoUpdateRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsVideoUpdateRequest {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

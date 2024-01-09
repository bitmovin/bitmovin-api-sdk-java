package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsType;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsResponse
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = StreamsResponse.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = StreamsVideoResponse.class, name = "VIDEO"),
  @JsonSubTypes.Type(value = StreamsLiveResponse.class, name = "LIVE"),
})

public class StreamsResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("type")
  private StreamsType type;

  /**
   * The identifier of the stream
   * @return id
   */
  public String getId() {
    return id;
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
   * Type of the Stream contained in the StreamsResponse
   * @return type
   */
  public StreamsType getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsResponse streamsResponse = (StreamsResponse) o;
    return Objects.equals(this.id, streamsResponse.id) &&
        Objects.equals(this.title, streamsResponse.title) &&
        Objects.equals(this.description, streamsResponse.description) &&
        Objects.equals(this.createdAt, streamsResponse.createdAt) &&
        Objects.equals(this.type, streamsResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, createdAt, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


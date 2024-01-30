package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamKeyConfiguration;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StaticRtmpIngestPoint
 */

public class StaticRtmpIngestPoint {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("streamKeyConfiguration")
  private StreamKeyConfiguration streamKeyConfiguration;


  /**
   * The ID of the created static rtmp ingest point 
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * The ID of the created static rtmp ingest point 
   *
   * @param id
   *        The ID of the created static rtmp ingest point 
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Name of the ingest point. This can be helpful for easier identifying your ingest points 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the ingest point. This can be helpful for easier identifying your ingest points 
   *
   * @param name
   *        Name of the ingest point. This can be helpful for easier identifying your ingest points 
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get streamKeyConfiguration
   * @return streamKeyConfiguration
   */
  public StreamKeyConfiguration getStreamKeyConfiguration() {
    return streamKeyConfiguration;
  }

  /**
   * Set streamKeyConfiguration
   *
   * @param streamKeyConfiguration
   */
  public void setStreamKeyConfiguration(StreamKeyConfiguration streamKeyConfiguration) {
    this.streamKeyConfiguration = streamKeyConfiguration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticRtmpIngestPoint staticRtmpIngestPoint = (StaticRtmpIngestPoint) o;
    return Objects.equals(this.id, staticRtmpIngestPoint.id) &&
        Objects.equals(this.name, staticRtmpIngestPoint.name) &&
        Objects.equals(this.streamKeyConfiguration, staticRtmpIngestPoint.streamKeyConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, streamKeyConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticRtmpIngestPoint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streamKeyConfiguration: ").append(toIndentedString(streamKeyConfiguration)).append("\n");
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


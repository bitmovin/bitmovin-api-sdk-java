package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamInfosDetails;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamInfos
 */

public class StreamInfos {
  @JsonProperty("time")
  private Date time;

  @JsonProperty("streamInfos")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamInfosDetails> streamInfos = new ArrayList<StreamInfosDetails>();


  /**
   * Timestamp of the event, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   * @return time
   */
  public Date getTime() {
    return time;
  }

  /**
   * Timestamp of the event, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   *
   * @param time
   *        Timestamp of the event, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ (required)
   */
  public void setTime(Date time) {
    this.time = time;
  }


  public StreamInfos addStreamInfosItem(StreamInfosDetails streamInfosItem) {
    this.streamInfos.add(streamInfosItem);
    return this;
  }

  /**
   * Details about billable minutes for each resolution category
   * @return streamInfos
   */
  public List<StreamInfosDetails> getStreamInfos() {
    return streamInfos;
  }

  /**
   * Details about billable minutes for each resolution category
   *
   * @param streamInfos
   *        Details about billable minutes for each resolution category
   */
  public void setStreamInfos(List<StreamInfosDetails> streamInfos) {
    this.streamInfos = streamInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamInfos streamInfos = (StreamInfos) o;
    return Objects.equals(this.time, streamInfos.time) &&
        Objects.equals(this.streamInfos, streamInfos.streamInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, streamInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamInfos {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    streamInfos: ").append(toIndentedString(streamInfos)).append("\n");
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


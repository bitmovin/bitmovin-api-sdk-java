package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolEncodingIngestPoint
 */

public class LiveStandbyPoolEncodingIngestPoint {
  @JsonProperty("streamBaseUrl")
  private String streamBaseUrl;

  @JsonProperty("streamKey")
  private String streamKey;

  /**
   * URL to the RTMP/RTMPS endpoint for this live encoding
   * @return streamBaseUrl
   */
  public String getStreamBaseUrl() {
    return streamBaseUrl;
  }

  /**
   * Stream key value of this live encoding
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolEncodingIngestPoint liveStandbyPoolEncodingIngestPoint = (LiveStandbyPoolEncodingIngestPoint) o;
    return Objects.equals(this.streamBaseUrl, liveStandbyPoolEncodingIngestPoint.streamBaseUrl) &&
        Objects.equals(this.streamKey, liveStandbyPoolEncodingIngestPoint.streamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamBaseUrl, streamKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolEncodingIngestPoint {\n");
    
    sb.append("    streamBaseUrl: ").append(toIndentedString(streamBaseUrl)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
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


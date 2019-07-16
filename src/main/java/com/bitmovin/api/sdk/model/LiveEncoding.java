package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveEncoding
 */

public class LiveEncoding {
  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("encoderIp")
  private String encoderIp;

  @JsonProperty("application")
  private String application;

  /**
   * Stream key of the live encoder (required)
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }

  /**
   * IP address of the live encoder (required)
   * @return encoderIp
   */
  public String getEncoderIp() {
    return encoderIp;
  }

  /**
   * This will indicate the application &#39;live&#39;
   * @return application
   */
  public String getApplication() {
    return application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncoding liveEncoding = (LiveEncoding) o;
    return Objects.equals(this.streamKey, liveEncoding.streamKey) &&
        Objects.equals(this.encoderIp, liveEncoding.encoderIp) &&
        Objects.equals(this.application, liveEncoding.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamKey, encoderIp, application);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncoding {\n");
    
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    encoderIp: ").append(toIndentedString(encoderIp)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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


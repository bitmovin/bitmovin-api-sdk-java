package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamKeyConfigurationType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamKeyConfiguration
 */

public class StreamKeyConfiguration {
  @JsonProperty("type")
  private StreamKeyConfigurationType type;

  @JsonProperty("streamKeyId")
  private String streamKeyId;


  /**
   * Get type
   * @return type
   */
  public StreamKeyConfigurationType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(StreamKeyConfigurationType type) {
    this.type = type;
  }


  /**
   * Id of the previously generated stream key.  Only needed when the type is &#x60;ASSIGN&#x60;. 
   * @return streamKeyId
   */
  public String getStreamKeyId() {
    return streamKeyId;
  }

  /**
   * Id of the previously generated stream key.  Only needed when the type is &#x60;ASSIGN&#x60;. 
   *
   * @param streamKeyId
   *        Id of the previously generated stream key.  Only needed when the type is &#x60;ASSIGN&#x60;. 
   */
  public void setStreamKeyId(String streamKeyId) {
    this.streamKeyId = streamKeyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamKeyConfiguration streamKeyConfiguration = (StreamKeyConfiguration) o;
    return Objects.equals(this.type, streamKeyConfiguration.type) &&
        Objects.equals(this.streamKeyId, streamKeyConfiguration.streamKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, streamKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamKeyConfiguration {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    streamKeyId: ").append(toIndentedString(streamKeyId)).append("\n");
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


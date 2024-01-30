package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.StreamKeyStatus;
import com.bitmovin.api.sdk.model.StreamKeyType;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamKey
 */

public class StreamKey extends BitmovinResource {
  @JsonProperty("value")
  private String value;

  @JsonProperty("status")
  private StreamKeyStatus status;

  @JsonProperty("type")
  private StreamKeyType type;

  @JsonProperty("assignedEncodingId")
  private String assignedEncodingId;

  @JsonProperty("assignedIngestPointId")
  private String assignedIngestPointId;


  /**
   * Stream key used for live streaming. This stream key is reserved and can be re-used with different live encodings. If this value is not provided, a unique random stream key will be generated. **Important:** This value has to be globally unique. If it is set manually, be sure to use a secure value. If the stream key value is guessed by others your live encoding can be compromised. 
   * @return value
   */
  public String getValue() {
    return value;
  }

  /**
   * Stream key used for live streaming. This stream key is reserved and can be re-used with different live encodings. If this value is not provided, a unique random stream key will be generated. **Important:** This value has to be globally unique. If it is set manually, be sure to use a secure value. If the stream key value is guessed by others your live encoding can be compromised. 
   *
   * @param value
   *        Stream key used for live streaming. This stream key is reserved and can be re-used with different live encodings. If this value is not provided, a unique random stream key will be generated. **Important:** This value has to be globally unique. If it is set manually, be sure to use a secure value. If the stream key value is guessed by others your live encoding can be compromised. 
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Status of the stream key
   * @return status
   */
  public StreamKeyStatus getStatus() {
    return status;
  }

  /**
   * Type of the stream key
   * @return type
   */
  public StreamKeyType getType() {
    return type;
  }

  /**
   * ID of the encoding that is assigned to this stream key. Not set if status is UNASSIGNED
   * @return assignedEncodingId
   */
  public String getAssignedEncodingId() {
    return assignedEncodingId;
  }

  /**
   * ID of the ingest point that is assigned to this stream key. Not set if status is UNASSIGNED
   * @return assignedIngestPointId
   */
  public String getAssignedIngestPointId() {
    return assignedIngestPointId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamKey streamKey = (StreamKey) o;
    return Objects.equals(this.value, streamKey.value) &&
        Objects.equals(this.status, streamKey.status) &&
        Objects.equals(this.type, streamKey.type) &&
        Objects.equals(this.assignedEncodingId, streamKey.assignedEncodingId) &&
        Objects.equals(this.assignedIngestPointId, streamKey.assignedIngestPointId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, status, type, assignedEncodingId, assignedIngestPointId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamKey {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    assignedEncodingId: ").append(toIndentedString(assignedEncodingId)).append("\n");
    sb.append("    assignedIngestPointId: ").append(toIndentedString(assignedIngestPointId)).append("\n");
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


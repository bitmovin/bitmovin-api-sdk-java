package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SpriteRepresentation
 */

public class SpriteRepresentation extends BitmovinResponse {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("streamId")
  private String streamId;

  @JsonProperty("spriteId")
  private String spriteId;

  @JsonProperty("segmentPath")
  private String segmentPath;


  /**
   * UUID of an encoding (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * UUID of an encoding (required)
   *
   * @param encodingId
   *        UUID of an encoding (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * UUID of a stream (required)
   * @return streamId
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * UUID of a stream (required)
   *
   * @param streamId
   *        UUID of a stream (required)
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }


  /**
   * UUID of a Sprite (required)
   * @return spriteId
   */
  public String getSpriteId() {
    return spriteId;
  }

  /**
   * UUID of a Sprite (required)
   *
   * @param spriteId
   *        UUID of a Sprite (required)
   */
  public void setSpriteId(String spriteId) {
    this.spriteId = spriteId;
  }


  /**
   * Path to sprite segments. Will be used as the representation id in the manifest. (required)
   * @return segmentPath
   */
  public String getSegmentPath() {
    return segmentPath;
  }

  /**
   * Path to sprite segments. Will be used as the representation id in the manifest. (required)
   *
   * @param segmentPath
   *        Path to sprite segments. Will be used as the representation id in the manifest. (required)
   */
  public void setSegmentPath(String segmentPath) {
    this.segmentPath = segmentPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpriteRepresentation spriteRepresentation = (SpriteRepresentation) o;
    return Objects.equals(this.encodingId, spriteRepresentation.encodingId) &&
        Objects.equals(this.streamId, spriteRepresentation.streamId) &&
        Objects.equals(this.spriteId, spriteRepresentation.spriteId) &&
        Objects.equals(this.segmentPath, spriteRepresentation.segmentPath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, streamId, spriteId, segmentPath, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpriteRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    spriteId: ").append(toIndentedString(spriteId)).append("\n");
    sb.append("    segmentPath: ").append(toIndentedString(segmentPath)).append("\n");
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


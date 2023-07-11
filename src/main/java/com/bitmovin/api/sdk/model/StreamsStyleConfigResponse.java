package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsStyleConfigPlayerStyle;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsStyleConfigResponse
 */

public class StreamsStyleConfigResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("orgId")
  private String orgId;

  @JsonProperty("playerStyle")
  private StreamsStyleConfigPlayerStyle playerStyle;

  @JsonProperty("watermarkUrl")
  private String watermarkUrl;

  @JsonProperty("watermarkTargetLink")
  private String watermarkTargetLink;

  /**
   * The identifier of the style config
   * @return id
   */
  public String getId() {
    return id;
  }


  /**
   * UUID of the associated organization
   * @return orgId
   */
  public String getOrgId() {
    return orgId;
  }

  /**
   * UUID of the associated organization
   *
   * @param orgId
   *        UUID of the associated organization
   */
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  /**
   * Get playerStyle
   * @return playerStyle
   */
  public StreamsStyleConfigPlayerStyle getPlayerStyle() {
    return playerStyle;
  }

  /**
   * Set playerStyle
   *
   * @param playerStyle
   */
  public void setPlayerStyle(StreamsStyleConfigPlayerStyle playerStyle) {
    this.playerStyle = playerStyle;
  }


  /**
   * URL of the watermark image
   * @return watermarkUrl
   */
  public String getWatermarkUrl() {
    return watermarkUrl;
  }

  /**
   * URL of the watermark image
   *
   * @param watermarkUrl
   *        URL of the watermark image
   */
  public void setWatermarkUrl(String watermarkUrl) {
    this.watermarkUrl = watermarkUrl;
  }


  /**
   * Target link of the watermark image
   * @return watermarkTargetLink
   */
  public String getWatermarkTargetLink() {
    return watermarkTargetLink;
  }

  /**
   * Target link of the watermark image
   *
   * @param watermarkTargetLink
   *        Target link of the watermark image
   */
  public void setWatermarkTargetLink(String watermarkTargetLink) {
    this.watermarkTargetLink = watermarkTargetLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsStyleConfigResponse streamsStyleConfigResponse = (StreamsStyleConfigResponse) o;
    return Objects.equals(this.id, streamsStyleConfigResponse.id) &&
        Objects.equals(this.orgId, streamsStyleConfigResponse.orgId) &&
        Objects.equals(this.playerStyle, streamsStyleConfigResponse.playerStyle) &&
        Objects.equals(this.watermarkUrl, streamsStyleConfigResponse.watermarkUrl) &&
        Objects.equals(this.watermarkTargetLink, streamsStyleConfigResponse.watermarkTargetLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, playerStyle, watermarkUrl, watermarkTargetLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsStyleConfigResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    playerStyle: ").append(toIndentedString(playerStyle)).append("\n");
    sb.append("    watermarkUrl: ").append(toIndentedString(watermarkUrl)).append("\n");
    sb.append("    watermarkTargetLink: ").append(toIndentedString(watermarkTargetLink)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsConfigResponse
 */

public class StreamsConfigResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("orgId")
  private String orgId;

  @JsonProperty("playerStyle")
  private Object playerStyle;

  /**
   * The identifier of the stream config
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
   * Player style config
   * @return playerStyle
   */
  public Object getPlayerStyle() {
    return playerStyle;
  }

  /**
   * Player style config
   *
   * @param playerStyle
   *        Player style config
   */
  public void setPlayerStyle(Object playerStyle) {
    this.playerStyle = playerStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsConfigResponse streamsConfigResponse = (StreamsConfigResponse) o;
    return Objects.equals(this.id, streamsConfigResponse.id) &&
        Objects.equals(this.orgId, streamsConfigResponse.orgId) &&
        Objects.equals(this.playerStyle, streamsConfigResponse.playerStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orgId, playerStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsConfigResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    playerStyle: ").append(toIndentedString(playerStyle)).append("\n");
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


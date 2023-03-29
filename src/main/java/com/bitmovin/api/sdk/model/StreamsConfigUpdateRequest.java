package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsConfigUpdateRequest
 */

public class StreamsConfigUpdateRequest {
  @JsonProperty("playerStyle")
  private Object playerStyle;


  /**
   * Player style config (required)
   * @return playerStyle
   */
  public Object getPlayerStyle() {
    return playerStyle;
  }

  /**
   * Player style config (required)
   *
   * @param playerStyle
   *        Player style config (required)
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
    StreamsConfigUpdateRequest streamsConfigUpdateRequest = (StreamsConfigUpdateRequest) o;
    return Objects.equals(this.playerStyle, streamsConfigUpdateRequest.playerStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playerStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsConfigUpdateRequest {\n");
    
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


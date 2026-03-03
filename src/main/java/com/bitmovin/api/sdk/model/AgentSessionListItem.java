package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentSessionListItem
 */

public class AgentSessionListItem {
  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("lastUpdateTimeSeconds")
  private Double lastUpdateTimeSeconds;


  /**
   * Session ID (required)
   * @return sessionId
   */
  public String getSessionId() {
    return sessionId;
  }

  /**
   * Session ID (required)
   *
   * @param sessionId
   *        Session ID (required)
   */
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Session title
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Session title
   *
   * @param title
   *        Session title
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Last update time in seconds
   * @return lastUpdateTimeSeconds
   */
  public Double getLastUpdateTimeSeconds() {
    return lastUpdateTimeSeconds;
  }

  /**
   * Last update time in seconds
   *
   * @param lastUpdateTimeSeconds
   *        Last update time in seconds
   */
  public void setLastUpdateTimeSeconds(Double lastUpdateTimeSeconds) {
    this.lastUpdateTimeSeconds = lastUpdateTimeSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSessionListItem agentSessionListItem = (AgentSessionListItem) o;
    return Objects.equals(this.sessionId, agentSessionListItem.sessionId) &&
        Objects.equals(this.title, agentSessionListItem.title) &&
        Objects.equals(this.lastUpdateTimeSeconds, agentSessionListItem.lastUpdateTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, title, lastUpdateTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSessionListItem {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastUpdateTimeSeconds: ").append(toIndentedString(lastUpdateTimeSeconds)).append("\n");
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


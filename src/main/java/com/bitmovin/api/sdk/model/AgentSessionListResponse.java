package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgentSessionListItem;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentSessionListResponse
 */

public class AgentSessionListResponse {
  @JsonProperty("appName")
  private String appName;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("sessions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AgentSessionListItem> sessions = new ArrayList<AgentSessionListItem>();


  /**
   * Agent application name (required)
   * @return appName
   */
  public String getAppName() {
    return appName;
  }

  /**
   * Agent application name (required)
   *
   * @param appName
   *        Agent application name (required)
   */
  public void setAppName(String appName) {
    this.appName = appName;
  }


  /**
   * User ID (required)
   * @return userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * User ID (required)
   *
   * @param userId
   *        User ID (required)
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AgentSessionListResponse addSessionsItem(AgentSessionListItem sessionsItem) {
    this.sessions.add(sessionsItem);
    return this;
  }

  /**
   * Sessions for the user (required)
   * @return sessions
   */
  public List<AgentSessionListItem> getSessions() {
    return sessions;
  }

  /**
   * Sessions for the user (required)
   *
   * @param sessions
   *        Sessions for the user (required)
   */
  public void setSessions(List<AgentSessionListItem> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSessionListResponse agentSessionListResponse = (AgentSessionListResponse) o;
    return Objects.equals(this.appName, agentSessionListResponse.appName) &&
        Objects.equals(this.userId, agentSessionListResponse.userId) &&
        Objects.equals(this.sessions, agentSessionListResponse.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, userId, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSessionListResponse {\n");
    
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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


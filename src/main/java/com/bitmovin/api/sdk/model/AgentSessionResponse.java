package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentSessionResponse
 */

public class AgentSessionResponse {
  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("appName")
  private String appName;

  @JsonProperty("userId")
  private String userId;


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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSessionResponse agentSessionResponse = (AgentSessionResponse) o;
    return Objects.equals(this.sessionId, agentSessionResponse.sessionId) &&
        Objects.equals(this.appName, agentSessionResponse.appName) &&
        Objects.equals(this.userId, agentSessionResponse.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, appName, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSessionResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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


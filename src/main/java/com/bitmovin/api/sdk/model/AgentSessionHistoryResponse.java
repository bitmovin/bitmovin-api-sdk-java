package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgentChatMessage;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentSessionHistoryResponse
 */

public class AgentSessionHistoryResponse {
  @JsonProperty("sessionId")
  private String sessionId;

  @JsonProperty("appName")
  private String appName;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("messages")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AgentChatMessage> messages = new ArrayList<AgentChatMessage>();


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


  public AgentSessionHistoryResponse addMessagesItem(AgentChatMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Session message history (required)
   * @return messages
   */
  public List<AgentChatMessage> getMessages() {
    return messages;
  }

  /**
   * Session message history (required)
   *
   * @param messages
   *        Session message history (required)
   */
  public void setMessages(List<AgentChatMessage> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSessionHistoryResponse agentSessionHistoryResponse = (AgentSessionHistoryResponse) o;
    return Objects.equals(this.sessionId, agentSessionHistoryResponse.sessionId) &&
        Objects.equals(this.appName, agentSessionHistoryResponse.appName) &&
        Objects.equals(this.userId, agentSessionHistoryResponse.userId) &&
        Objects.equals(this.title, agentSessionHistoryResponse.title) &&
        Objects.equals(this.messages, agentSessionHistoryResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, appName, userId, title, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSessionHistoryResponse {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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


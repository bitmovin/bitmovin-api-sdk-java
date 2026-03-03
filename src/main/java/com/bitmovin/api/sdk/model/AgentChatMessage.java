package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgentChatMessagePart;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentChatMessage
 */

public class AgentChatMessage {
  @JsonProperty("id")
  private String id;

  @JsonProperty("role")
  private String role;

  @JsonProperty("parts")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AgentChatMessagePart> parts = new ArrayList<AgentChatMessagePart>();


  /**
   * Message ID (required)
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * Message ID (required)
   *
   * @param id
   *        Message ID (required)
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Message role (required)
   * @return role
   */
  public String getRole() {
    return role;
  }

  /**
   * Message role (required)
   *
   * @param role
   *        Message role (required)
   */
  public void setRole(String role) {
    this.role = role;
  }


  public AgentChatMessage addPartsItem(AgentChatMessagePart partsItem) {
    this.parts.add(partsItem);
    return this;
  }

  /**
   * Message parts (required)
   * @return parts
   */
  public List<AgentChatMessagePart> getParts() {
    return parts;
  }

  /**
   * Message parts (required)
   *
   * @param parts
   *        Message parts (required)
   */
  public void setParts(List<AgentChatMessagePart> parts) {
    this.parts = parts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChatMessage agentChatMessage = (AgentChatMessage) o;
    return Objects.equals(this.id, agentChatMessage.id) &&
        Objects.equals(this.role, agentChatMessage.role) &&
        Objects.equals(this.parts, agentChatMessage.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChatMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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


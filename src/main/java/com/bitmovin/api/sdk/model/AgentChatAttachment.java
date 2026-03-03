package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentChatAttachment
 */

public class AgentChatAttachment {
  @JsonProperty("kind")
  private String kind;

  @JsonProperty("toolCallId")
  private String toolCallId;

  @JsonProperty("attributes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private Map<String, Object> attributes = new HashMap<String, Object>();


  /**
   * Attachment kind (required)
   * @return kind
   */
  public String getKind() {
    return kind;
  }

  /**
   * Attachment kind (required)
   *
   * @param kind
   *        Attachment kind (required)
   */
  public void setKind(String kind) {
    this.kind = kind;
  }


  /**
   * Tool call identifier
   * @return toolCallId
   */
  public String getToolCallId() {
    return toolCallId;
  }

  /**
   * Tool call identifier
   *
   * @param toolCallId
   *        Tool call identifier
   */
  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }


  public AgentChatAttachment putAttributesItem(String key, Object attributesItem) {
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Attachment attributes map (required)
   * @return attributes
   */
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  /**
   * Attachment attributes map (required)
   *
   * @param attributes
   *        Attachment attributes map (required)
   */
  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChatAttachment agentChatAttachment = (AgentChatAttachment) o;
    return Objects.equals(this.kind, agentChatAttachment.kind) &&
        Objects.equals(this.toolCallId, agentChatAttachment.toolCallId) &&
        Objects.equals(this.attributes, agentChatAttachment.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, toolCallId, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChatAttachment {\n");
    
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgentChatAttachmentsData;
import com.bitmovin.api.sdk.model.AgentChatMessagePart;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentChatAttachmentsPart
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AgentChatAttachmentsPart.class)
public class AgentChatAttachmentsPart extends AgentChatMessagePart {
  @JsonProperty("data")
  private AgentChatAttachmentsData data;


  /**
   * Attachment payload (required)
   * @return data
   */
  public AgentChatAttachmentsData getData() {
    return data;
  }

  /**
   * Attachment payload (required)
   *
   * @param data
   *        Attachment payload (required)
   */
  public void setData(AgentChatAttachmentsData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChatAttachmentsPart agentChatAttachmentsPart = (AgentChatAttachmentsPart) o;
    return Objects.equals(this.data, agentChatAttachmentsPart.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChatAttachmentsPart {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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


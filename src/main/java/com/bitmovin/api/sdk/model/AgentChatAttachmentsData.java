package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgentChatAttachment;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentChatAttachmentsData
 */

public class AgentChatAttachmentsData {
  @JsonProperty("attachments")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AgentChatAttachment> attachments = new ArrayList<AgentChatAttachment>();


  public AgentChatAttachmentsData addAttachmentsItem(AgentChatAttachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Attachment list (required)
   * @return attachments
   */
  public List<AgentChatAttachment> getAttachments() {
    return attachments;
  }

  /**
   * Attachment list (required)
   *
   * @param attachments
   *        Attachment list (required)
   */
  public void setAttachments(List<AgentChatAttachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChatAttachmentsData agentChatAttachmentsData = (AgentChatAttachmentsData) o;
    return Objects.equals(this.attachments, agentChatAttachmentsData.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChatAttachmentsData {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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


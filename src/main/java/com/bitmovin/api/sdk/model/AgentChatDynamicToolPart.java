package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AgentChatDynamicToolState;
import com.bitmovin.api.sdk.model.AgentChatMessagePart;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AgentChatDynamicToolPart
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AgentChatDynamicToolPart.class)
public class AgentChatDynamicToolPart extends AgentChatMessagePart {
  @JsonProperty("toolName")
  private String toolName;

  @JsonProperty("toolCallId")
  private String toolCallId;

  @JsonProperty("state")
  private AgentChatDynamicToolState state;

  @JsonProperty("input")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private Map<String, Object> input = new HashMap<String, Object>();

  @JsonProperty("output")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private Map<String, Object> output = new HashMap<String, Object>();

  @JsonProperty("errorText")
  private String errorText;


  /**
   * Tool name (required)
   * @return toolName
   */
  public String getToolName() {
    return toolName;
  }

  /**
   * Tool name (required)
   *
   * @param toolName
   *        Tool name (required)
   */
  public void setToolName(String toolName) {
    this.toolName = toolName;
  }


  /**
   * Tool call identifier (required)
   * @return toolCallId
   */
  public String getToolCallId() {
    return toolCallId;
  }

  /**
   * Tool call identifier (required)
   *
   * @param toolCallId
   *        Tool call identifier (required)
   */
  public void setToolCallId(String toolCallId) {
    this.toolCallId = toolCallId;
  }


  /**
   * Tool invocation lifecycle state (required)
   * @return state
   */
  public AgentChatDynamicToolState getState() {
    return state;
  }

  /**
   * Tool invocation lifecycle state (required)
   *
   * @param state
   *        Tool invocation lifecycle state (required)
   */
  public void setState(AgentChatDynamicToolState state) {
    this.state = state;
  }


  public AgentChatDynamicToolPart putInputItem(String key, Object inputItem) {
    this.input.put(key, inputItem);
    return this;
  }

  /**
   * Tool input payload.
   * @return input
   */
  public Map<String, Object> getInput() {
    return input;
  }

  /**
   * Tool input payload.
   *
   * @param input
   *        Tool input payload.
   */
  public void setInput(Map<String, Object> input) {
    this.input = input;
  }


  public AgentChatDynamicToolPart putOutputItem(String key, Object outputItem) {
    this.output.put(key, outputItem);
    return this;
  }

  /**
   * Tool output payload.
   * @return output
   */
  public Map<String, Object> getOutput() {
    return output;
  }

  /**
   * Tool output payload.
   *
   * @param output
   *        Tool output payload.
   */
  public void setOutput(Map<String, Object> output) {
    this.output = output;
  }


  /**
   * Error text for failed tool completion.
   * @return errorText
   */
  public String getErrorText() {
    return errorText;
  }

  /**
   * Error text for failed tool completion.
   *
   * @param errorText
   *        Error text for failed tool completion.
   */
  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentChatDynamicToolPart agentChatDynamicToolPart = (AgentChatDynamicToolPart) o;
    return Objects.equals(this.toolName, agentChatDynamicToolPart.toolName) &&
        Objects.equals(this.toolCallId, agentChatDynamicToolPart.toolCallId) &&
        Objects.equals(this.state, agentChatDynamicToolPart.state) &&
        Objects.equals(this.input, agentChatDynamicToolPart.input) &&
        Objects.equals(this.output, agentChatDynamicToolPart.output) &&
        Objects.equals(this.errorText, agentChatDynamicToolPart.errorText) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolName, toolCallId, state, input, output, errorText, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentChatDynamicToolPart {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    toolName: ").append(toIndentedString(toolName)).append("\n");
    sb.append("    toolCallId: ").append(toIndentedString(toolCallId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
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


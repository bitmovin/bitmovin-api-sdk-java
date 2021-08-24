package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.WatchFolderInput;
import com.bitmovin.api.sdk.model.WatchFolderOutput;
import com.bitmovin.api.sdk.model.WatchFolderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WatchFolder
 */

public class WatchFolder extends BitmovinResource {
  @JsonProperty("input")
  private WatchFolderInput input;

  @JsonProperty("outputs")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<WatchFolderOutput> outputs = new ArrayList<WatchFolderOutput>();

  @JsonProperty("status")
  private WatchFolderStatus status;

  @JsonProperty("statusText")
  private String statusText;


  /**
   * Get input
   * @return input
   */
  public WatchFolderInput getInput() {
    return input;
  }

  /**
   * Set input
   *
   * @param input
   */
  public void setInput(WatchFolderInput input) {
    this.input = input;
  }


  public WatchFolder addOutputsItem(WatchFolderOutput outputsItem) {
    this.outputs.add(outputsItem);
    return this;
  }

  /**
   * Get outputs
   * @return outputs
   */
  public List<WatchFolderOutput> getOutputs() {
    return outputs;
  }

  /**
   * Set outputs
   *
   * @param outputs
   */
  public void setOutputs(List<WatchFolderOutput> outputs) {
    this.outputs = outputs;
  }

  /**
   * The current status of the Watch Folder. The default value is &#x60;STOPPED&#x60; (required)
   * @return status
   */
  public WatchFolderStatus getStatus() {
    return status;
  }

  /**
   * A description text of the current status (required)
   * @return statusText
   */
  public String getStatusText() {
    return statusText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchFolder watchFolder = (WatchFolder) o;
    return Objects.equals(this.input, watchFolder.input) &&
        Objects.equals(this.outputs, watchFolder.outputs) &&
        Objects.equals(this.status, watchFolder.status) &&
        Objects.equals(this.statusText, watchFolder.statusText) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, outputs, status, statusText, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchFolder {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
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


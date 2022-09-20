package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinStreamEncodingTask;
import com.bitmovin.api.sdk.model.BitmovinStreamQuality;
import com.bitmovin.api.sdk.model.BitmovinStreamStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BitmovinStreamResponse
 */

public class BitmovinStreamResponse {
  @JsonProperty("id")
  private String id;

  @JsonProperty("assetUrl")
  private String assetUrl;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("status")
  private BitmovinStreamStatus status;

  @JsonProperty("targetQuality")
  private BitmovinStreamQuality targetQuality;

  @JsonProperty("availableQualities")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BitmovinStreamQuality> availableQualities = new ArrayList<BitmovinStreamQuality>();

  @JsonProperty("encodingTasks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BitmovinStreamEncodingTask> encodingTasks = new ArrayList<BitmovinStreamEncodingTask>();

  /**
   * The identifier of the Stream
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * The asset URL of the Stream
   * @return assetUrl
   */
  public String getAssetUrl() {
    return assetUrl;
  }

  /**
   * The title of the Stream
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * The description of the Stream
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Creation timestamp, returned as UTC expressed in ISO 8601 format: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * The status of the Stream
   * @return status
   */
  public BitmovinStreamStatus getStatus() {
    return status;
  }

  /**
   * The target quality of the Stream (OBSOLETE!)
   * @return targetQuality
   */
  public BitmovinStreamQuality getTargetQuality() {
    return targetQuality;
  }

  /**
   * List of available stream qualities (OBSOLETE!)
   * @return availableQualities
   */
  public List<BitmovinStreamQuality> getAvailableQualities() {
    return availableQualities;
  }

  /**
   * List of encoding status information
   * @return encodingTasks
   */
  public List<BitmovinStreamEncodingTask> getEncodingTasks() {
    return encodingTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BitmovinStreamResponse bitmovinStreamResponse = (BitmovinStreamResponse) o;
    return Objects.equals(this.id, bitmovinStreamResponse.id) &&
        Objects.equals(this.assetUrl, bitmovinStreamResponse.assetUrl) &&
        Objects.equals(this.title, bitmovinStreamResponse.title) &&
        Objects.equals(this.description, bitmovinStreamResponse.description) &&
        Objects.equals(this.createdAt, bitmovinStreamResponse.createdAt) &&
        Objects.equals(this.status, bitmovinStreamResponse.status) &&
        Objects.equals(this.targetQuality, bitmovinStreamResponse.targetQuality) &&
        Objects.equals(this.availableQualities, bitmovinStreamResponse.availableQualities) &&
        Objects.equals(this.encodingTasks, bitmovinStreamResponse.encodingTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assetUrl, title, description, createdAt, status, targetQuality, availableQualities, encodingTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BitmovinStreamResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetQuality: ").append(toIndentedString(targetQuality)).append("\n");
    sb.append("    availableQualities: ").append(toIndentedString(availableQualities)).append("\n");
    sb.append("    encodingTasks: ").append(toIndentedString(encodingTasks)).append("\n");
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


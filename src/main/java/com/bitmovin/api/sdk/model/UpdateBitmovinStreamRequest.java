package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinStreamStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * UpdateBitmovinStreamRequest
 */

public class UpdateBitmovinStreamRequest {
  @JsonProperty("status")
  private BitmovinStreamStatus status;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;


  /**
   * The status of the Stream
   * @return status
   */
  public BitmovinStreamStatus getStatus() {
    return status;
  }

  /**
   * The status of the Stream
   *
   * @param status
   *        The status of the Stream
   */
  public void setStatus(BitmovinStreamStatus status) {
    this.status = status;
  }


  /**
   * Title of the Stream
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Title of the Stream
   *
   * @param title
   *        Title of the Stream
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Description of the Stream
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Description of the Stream
   *
   * @param description
   *        Description of the Stream
   */
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBitmovinStreamRequest updateBitmovinStreamRequest = (UpdateBitmovinStreamRequest) o;
    return Objects.equals(this.status, updateBitmovinStreamRequest.status) &&
        Objects.equals(this.title, updateBitmovinStreamRequest.title) &&
        Objects.equals(this.description, updateBitmovinStreamRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBitmovinStreamRequest {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


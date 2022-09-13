package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CreateBitmovinStreamRequest
 */

public class CreateBitmovinStreamRequest {
  @JsonProperty("assetUrl")
  private String assetUrl;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;


  /**
   * The Streams input asset URL
   * @return assetUrl
   */
  public String getAssetUrl() {
    return assetUrl;
  }

  /**
   * The Streams input asset URL
   *
   * @param assetUrl
   *        The Streams input asset URL
   */
  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
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
    CreateBitmovinStreamRequest createBitmovinStreamRequest = (CreateBitmovinStreamRequest) o;
    return Objects.equals(this.assetUrl, createBitmovinStreamRequest.assetUrl) &&
        Objects.equals(this.title, createBitmovinStreamRequest.title) &&
        Objects.equals(this.description, createBitmovinStreamRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, title, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBitmovinStreamRequest {\n");
    
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsLiveCreateRequest
 */

public class StreamsLiveCreateRequest {
  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("styleConfigId")
  private String styleConfigId;

  @JsonProperty("adConfigId")
  private String adConfigId;


  /**
   * Title of the stream
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * Title of the stream
   *
   * @param title
   *        Title of the stream
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Description of the stream
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Description of the stream
   *
   * @param description
   *        Description of the stream
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Id of the style config to use
   * @return styleConfigId
   */
  public String getStyleConfigId() {
    return styleConfigId;
  }

  /**
   * Id of the style config to use
   *
   * @param styleConfigId
   *        Id of the style config to use
   */
  public void setStyleConfigId(String styleConfigId) {
    this.styleConfigId = styleConfigId;
  }


  /**
   * Id of the advertisement config to use
   * @return adConfigId
   */
  public String getAdConfigId() {
    return adConfigId;
  }

  /**
   * Id of the advertisement config to use
   *
   * @param adConfigId
   *        Id of the advertisement config to use
   */
  public void setAdConfigId(String adConfigId) {
    this.adConfigId = adConfigId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsLiveCreateRequest streamsLiveCreateRequest = (StreamsLiveCreateRequest) o;
    return Objects.equals(this.title, streamsLiveCreateRequest.title) &&
        Objects.equals(this.description, streamsLiveCreateRequest.description) &&
        Objects.equals(this.styleConfigId, streamsLiveCreateRequest.styleConfigId) &&
        Objects.equals(this.adConfigId, streamsLiveCreateRequest.adConfigId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, styleConfigId, adConfigId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsLiveCreateRequest {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    styleConfigId: ").append(toIndentedString(styleConfigId)).append("\n");
    sb.append("    adConfigId: ").append(toIndentedString(adConfigId)).append("\n");
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


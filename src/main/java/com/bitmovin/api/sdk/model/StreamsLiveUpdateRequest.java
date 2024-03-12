package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsLiveUpdateRequest
 */

public class StreamsLiveUpdateRequest {
  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("posterUrl")
  private String posterUrl;

  @JsonProperty("domainRestrictionId")
  private String domainRestrictionId;


  /**
   * The new title of the stream
   * @return title
   */
  public String getTitle() {
    return title;
  }

  /**
   * The new title of the stream
   *
   * @param title
   *        The new title of the stream
   */
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The new description of the stream
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * The new description of the stream
   *
   * @param description
   *        The new description of the stream
   */
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * URL to hosted poster image
   * @return posterUrl
   */
  public String getPosterUrl() {
    return posterUrl;
  }

  /**
   * URL to hosted poster image
   *
   * @param posterUrl
   *        URL to hosted poster image
   */
  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }


  /**
   * Id of the domain restriction config to use
   * @return domainRestrictionId
   */
  public String getDomainRestrictionId() {
    return domainRestrictionId;
  }

  /**
   * Id of the domain restriction config to use
   *
   * @param domainRestrictionId
   *        Id of the domain restriction config to use
   */
  public void setDomainRestrictionId(String domainRestrictionId) {
    this.domainRestrictionId = domainRestrictionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsLiveUpdateRequest streamsLiveUpdateRequest = (StreamsLiveUpdateRequest) o;
    return Objects.equals(this.title, streamsLiveUpdateRequest.title) &&
        Objects.equals(this.description, streamsLiveUpdateRequest.description) &&
        Objects.equals(this.posterUrl, streamsLiveUpdateRequest.posterUrl) &&
        Objects.equals(this.domainRestrictionId, streamsLiveUpdateRequest.domainRestrictionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, posterUrl, domainRestrictionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsLiveUpdateRequest {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    domainRestrictionId: ").append(toIndentedString(domainRestrictionId)).append("\n");
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


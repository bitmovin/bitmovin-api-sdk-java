package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsEncodingProfile;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsVideoCreateRequest
 */

public class StreamsVideoCreateRequest {
  @JsonProperty("assetUrl")
  private String assetUrl;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("styleConfigId")
  private String styleConfigId;

  @JsonProperty("adConfigId")
  private String adConfigId;

  @JsonProperty("encodingProfile")
  private StreamsEncodingProfile encodingProfile;


  /**
   * The streams input asset URL
   * @return assetUrl
   */
  public String getAssetUrl() {
    return assetUrl;
  }

  /**
   * The streams input asset URL
   *
   * @param assetUrl
   *        The streams input asset URL
   */
  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


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


  /**
   * Profile to be used in encoding
   * @return encodingProfile
   */
  public StreamsEncodingProfile getEncodingProfile() {
    return encodingProfile;
  }

  /**
   * Profile to be used in encoding
   *
   * @param encodingProfile
   *        Profile to be used in encoding
   */
  public void setEncodingProfile(StreamsEncodingProfile encodingProfile) {
    this.encodingProfile = encodingProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsVideoCreateRequest streamsVideoCreateRequest = (StreamsVideoCreateRequest) o;
    return Objects.equals(this.assetUrl, streamsVideoCreateRequest.assetUrl) &&
        Objects.equals(this.title, streamsVideoCreateRequest.title) &&
        Objects.equals(this.description, streamsVideoCreateRequest.description) &&
        Objects.equals(this.styleConfigId, streamsVideoCreateRequest.styleConfigId) &&
        Objects.equals(this.adConfigId, streamsVideoCreateRequest.adConfigId) &&
        Objects.equals(this.encodingProfile, streamsVideoCreateRequest.encodingProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, title, description, styleConfigId, adConfigId, encodingProfile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsVideoCreateRequest {\n");
    
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    styleConfigId: ").append(toIndentedString(styleConfigId)).append("\n");
    sb.append("    adConfigId: ").append(toIndentedString(adConfigId)).append("\n");
    sb.append("    encodingProfile: ").append(toIndentedString(encodingProfile)).append("\n");
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


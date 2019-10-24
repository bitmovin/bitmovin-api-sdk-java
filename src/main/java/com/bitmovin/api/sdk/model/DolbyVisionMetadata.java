package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import com.bitmovin.api.sdk.model.DolbyVisionMetadataSource;
import com.bitmovin.api.sdk.model.DolbyVisionProfile;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyVisionMetadata
 */

public class DolbyVisionMetadata extends BitmovinResource {
  @JsonProperty("profile")
  private DolbyVisionProfile profile;

  @JsonProperty("metadataSource")
  private DolbyVisionMetadataSource metadataSource;

  @JsonProperty("metadataInputStreamId")
  private String metadataInputStreamId;


  /**
   * Dolby Vision Profile (required)
   * @return profile
   */
  public DolbyVisionProfile getProfile() {
    return profile;
  }

  /**
   * Dolby Vision Profile (required)
   *
   * @param profile
   *        Dolby Vision Profile (required)
   */
  public void setProfile(DolbyVisionProfile profile) {
    this.profile = profile;
  }


  /**
   * Dolby Vision Metadata Source (required)
   * @return metadataSource
   */
  public DolbyVisionMetadataSource getMetadataSource() {
    return metadataSource;
  }

  /**
   * Dolby Vision Metadata Source (required)
   *
   * @param metadataSource
   *        Dolby Vision Metadata Source (required)
   */
  public void setMetadataSource(DolbyVisionMetadataSource metadataSource) {
    this.metadataSource = metadataSource;
  }


  /**
   * ID of the Dolby Vision Metadata Ingest Input Stream which provides the XML Metadata file. Required if metadataSource is set to INPUT_STREAM.
   * @return metadataInputStreamId
   */
  public String getMetadataInputStreamId() {
    return metadataInputStreamId;
  }

  /**
   * ID of the Dolby Vision Metadata Ingest Input Stream which provides the XML Metadata file. Required if metadataSource is set to INPUT_STREAM.
   *
   * @param metadataInputStreamId
   *        ID of the Dolby Vision Metadata Ingest Input Stream which provides the XML Metadata file. Required if metadataSource is set to INPUT_STREAM.
   */
  public void setMetadataInputStreamId(String metadataInputStreamId) {
    this.metadataInputStreamId = metadataInputStreamId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyVisionMetadata dolbyVisionMetadata = (DolbyVisionMetadata) o;
    return Objects.equals(this.profile, dolbyVisionMetadata.profile) &&
        Objects.equals(this.metadataSource, dolbyVisionMetadata.metadataSource) &&
        Objects.equals(this.metadataInputStreamId, dolbyVisionMetadata.metadataInputStreamId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, metadataSource, metadataInputStreamId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyVisionMetadata {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    metadataSource: ").append(toIndentedString(metadataSource)).append("\n");
    sb.append("    metadataInputStreamId: ").append(toIndentedString(metadataInputStreamId)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashRepresentation
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeDiscriminator", visible = false, defaultImpl = DashRepresentation.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = DashFmp4DrmRepresentation.class, name = "DRM_FMP4"),
  @JsonSubTypes.Type(value = DashFmp4Representation.class, name = "FMP4"),
  @JsonSubTypes.Type(value = DashWebmRepresentation.class, name = "WEBM"),
  @JsonSubTypes.Type(value = DashCmafRepresentation.class, name = "CMAF"),
  @JsonSubTypes.Type(value = DashChunkedTextRepresentation.class, name = "CHUNKED_TEXT"),
  @JsonSubTypes.Type(value = DashMp4Representation.class, name = "MP4"),
  @JsonSubTypes.Type(value = DashMp4DrmRepresentation.class, name = "DRM_MP4"),
  @JsonSubTypes.Type(value = DashProgressiveWebmRepresentation.class, name = "PROGRESSIVE_WEBM"),
  @JsonSubTypes.Type(value = DashVttRepresentation.class, name = "VTT"),
  @JsonSubTypes.Type(value = SpriteRepresentation.class, name = "SPRITE"),
  @JsonSubTypes.Type(value = DashImscRepresentation.class, name = "IMSC"),
  @JsonSubTypes.Type(value = ContentProtection.class, name = "CONTENT_PROTECTION"),
})

public class DashRepresentation extends BitmovinResponse {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashRepresentation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


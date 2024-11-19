package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveStandbyPoolEncodingManifestType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveStandbyPoolEncodingManifest
 */

public class LiveStandbyPoolEncodingManifest {
  @JsonProperty("url")
  private String url;

  @JsonProperty("manifestId")
  private String manifestId;

  @JsonProperty("type")
  private LiveStandbyPoolEncodingManifestType type;

  /**
   * URL to the manifest
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * ID of the manifest that was created for the encoding
   * @return manifestId
   */
  public String getManifestId() {
    return manifestId;
  }

  /**
   * Get type
   * @return type
   */
  public LiveStandbyPoolEncodingManifestType getType() {
    return type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveStandbyPoolEncodingManifest liveStandbyPoolEncodingManifest = (LiveStandbyPoolEncodingManifest) o;
    return Objects.equals(this.url, liveStandbyPoolEncodingManifest.url) &&
        Objects.equals(this.manifestId, liveStandbyPoolEncodingManifest.manifestId) &&
        Objects.equals(this.type, liveStandbyPoolEncodingManifest.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, manifestId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveStandbyPoolEncodingManifest {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.ManifestType;
import com.bitmovin.api.sdk.model.SmoothManifestDefaultVersion;
import com.bitmovin.api.sdk.model.SmoothStreamingManifest;
import com.bitmovin.api.sdk.model.Status;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SmoothManifestDefault
 */

public class SmoothManifestDefault extends SmoothStreamingManifest {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("version")
  private SmoothManifestDefaultVersion version;


  /**
   * The id of the encoding to create a default manifest from. (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * The id of the encoding to create a default manifest from. (required)
   *
   * @param encodingId
   *        The id of the encoding to create a default manifest from. (required)
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   * @return version
   */
  public SmoothManifestDefaultVersion getVersion() {
    return version;
  }

  /**
   * Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   *
   * @param version
   *        Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   */
  public void setVersion(SmoothManifestDefaultVersion version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmoothManifestDefault smoothManifestDefault = (SmoothManifestDefault) o;
    return Objects.equals(this.encodingId, smoothManifestDefault.encodingId) &&
        Objects.equals(this.version, smoothManifestDefault.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, version, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmoothManifestDefault {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


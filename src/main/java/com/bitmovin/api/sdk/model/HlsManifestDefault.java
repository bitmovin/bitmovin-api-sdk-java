package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ChannelsAttributeForAudio;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.HlsManifest;
import com.bitmovin.api.sdk.model.HlsManifestDefaultVersion;
import com.bitmovin.api.sdk.model.HlsTargetDurationRoundingMode;
import com.bitmovin.api.sdk.model.HlsVersion;
import com.bitmovin.api.sdk.model.ManifestType;
import com.bitmovin.api.sdk.model.Status;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * HlsManifestDefault
 */

public class HlsManifestDefault extends HlsManifest {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("version")
  private HlsManifestDefaultVersion version;


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
  public HlsManifestDefaultVersion getVersion() {
    return version;
  }

  /**
   * Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   *
   * @param version
   *        Specifies the algorithm that determines which output of the given encoding is included into the manifest. Note that this is not related to the \&quot;manifestGenerator\&quot; version of the \&quot;Start\&quot; request.
   */
  public void setVersion(HlsManifestDefaultVersion version) {
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
    HlsManifestDefault hlsManifestDefault = (HlsManifestDefault) o;
    return Objects.equals(this.encodingId, hlsManifestDefault.encodingId) &&
        Objects.equals(this.version, hlsManifestDefault.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, version, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HlsManifestDefault {\n");
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


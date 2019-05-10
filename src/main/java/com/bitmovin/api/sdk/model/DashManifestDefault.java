package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DashManifest;
import com.bitmovin.api.sdk.model.DashManifestDefaultVersion;
import com.bitmovin.api.sdk.model.DashProfile;
import com.bitmovin.api.sdk.model.EncodingOutput;
import com.bitmovin.api.sdk.model.ManifestType;
import com.bitmovin.api.sdk.model.UtcTiming;
import com.bitmovin.api.sdk.model.XmlNamespace;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DashManifestDefault
 */

public class DashManifestDefault extends DashManifest {
  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("version")
  private DashManifestDefaultVersion version = null;


  /**
   * The id of the encoding to create a default manifest from
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * The version of the default manifest generator
   * @return version
   */
  public DashManifestDefaultVersion getVersion() {
    return version;
  }

  public void setVersion(DashManifestDefaultVersion version) {
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
    DashManifestDefault dashManifestDefault = (DashManifestDefault) o;
    return Objects.equals(this.encodingId, dashManifestDefault.encodingId) &&
        Objects.equals(this.version, dashManifestDefault.version) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingId, version, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashManifestDefault {\n");
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


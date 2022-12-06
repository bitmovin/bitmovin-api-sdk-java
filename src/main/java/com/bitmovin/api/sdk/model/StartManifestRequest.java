package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ManifestGenerator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StartManifestRequest
 */

public class StartManifestRequest {
  @JsonProperty("manifestGenerator")
  private ManifestGenerator manifestGenerator;


  /**
   * Version of the manifest generation engine to be used. The &#x60;V2&#x60; option is currently only supported for manifests including resources from a single encoding and is only valid in combination with encoder versions &gt;&#x3D;  &#x60;2.108.0&#x60;.
   * @return manifestGenerator
   */
  public ManifestGenerator getManifestGenerator() {
    return manifestGenerator;
  }

  /**
   * Version of the manifest generation engine to be used. The &#x60;V2&#x60; option is currently only supported for manifests including resources from a single encoding and is only valid in combination with encoder versions &gt;&#x3D;  &#x60;2.108.0&#x60;.
   *
   * @param manifestGenerator
   *        Version of the manifest generation engine to be used. The &#x60;V2&#x60; option is currently only supported for manifests including resources from a single encoding and is only valid in combination with encoder versions &gt;&#x3D;  &#x60;2.108.0&#x60;.
   */
  public void setManifestGenerator(ManifestGenerator manifestGenerator) {
    this.manifestGenerator = manifestGenerator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartManifestRequest startManifestRequest = (StartManifestRequest) o;
    return Objects.equals(this.manifestGenerator, startManifestRequest.manifestGenerator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manifestGenerator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartManifestRequest {\n");
    
    sb.append("    manifestGenerator: ").append(toIndentedString(manifestGenerator)).append("\n");
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


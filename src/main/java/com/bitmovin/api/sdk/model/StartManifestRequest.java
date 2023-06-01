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
   * Major version of the manifest generator to be used. &#x60;V2&#x60; is the recommended option and requires the following minimum encoder versions: 2.121.0 for DASH, 2.111.0 for HLS, 2.108.0 for SMOOTH. The default value depends on the sign-up date of your organization. 
   * @return manifestGenerator
   */
  public ManifestGenerator getManifestGenerator() {
    return manifestGenerator;
  }

  /**
   * Major version of the manifest generator to be used. &#x60;V2&#x60; is the recommended option and requires the following minimum encoder versions: 2.121.0 for DASH, 2.111.0 for HLS, 2.108.0 for SMOOTH. The default value depends on the sign-up date of your organization. 
   *
   * @param manifestGenerator
   *        Major version of the manifest generator to be used. &#x60;V2&#x60; is the recommended option and requires the following minimum encoder versions: 2.121.0 for DASH, 2.111.0 for HLS, 2.108.0 for SMOOTH. The default value depends on the sign-up date of your organization. 
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


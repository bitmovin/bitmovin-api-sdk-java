package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AutoRestartConfiguration;
import com.bitmovin.api.sdk.model.CacheControlSettings;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.EsamSettings;
import com.bitmovin.api.sdk.model.LiveAutoShutdownConfiguration;
import com.bitmovin.api.sdk.model.LiveDashManifest;
import com.bitmovin.api.sdk.model.LiveHlsManifest;
import com.bitmovin.api.sdk.model.ManifestGenerator;
import com.bitmovin.api.sdk.model.ReuploadSettings;
import com.bitmovin.api.sdk.model.StartLiveEncodingRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StartLiveChannelEncodingRequest
 */

public class StartLiveChannelEncodingRequest extends StartLiveEncodingRequest {

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
    sb.append("class StartLiveChannelEncodingRequest {\n");
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


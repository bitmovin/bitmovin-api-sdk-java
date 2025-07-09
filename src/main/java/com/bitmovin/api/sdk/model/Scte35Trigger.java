package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Scte35Trigger
 */

public class Scte35Trigger extends BitmovinResponse {
  @JsonProperty("base64EncodedMetadata")
  private String base64EncodedMetadata;


  /**
   * The base 64 encoded data for the SCTE trigger (required)
   * @return base64EncodedMetadata
   */
  public String getBase64EncodedMetadata() {
    return base64EncodedMetadata;
  }

  /**
   * The base 64 encoded data for the SCTE trigger (required)
   *
   * @param base64EncodedMetadata
   *        The base 64 encoded data for the SCTE trigger (required)
   */
  public void setBase64EncodedMetadata(String base64EncodedMetadata) {
    this.base64EncodedMetadata = base64EncodedMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scte35Trigger scte35Trigger = (Scte35Trigger) o;
    return Objects.equals(this.base64EncodedMetadata, scte35Trigger.base64EncodedMetadata) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64EncodedMetadata, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scte35Trigger {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    base64EncodedMetadata: ").append(toIndentedString(base64EncodedMetadata)).append("\n");
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


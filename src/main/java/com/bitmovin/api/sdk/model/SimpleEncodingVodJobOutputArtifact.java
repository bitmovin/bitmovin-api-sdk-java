package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SimpleEncodingVodJobOutputArtifact
 */

public class SimpleEncodingVodJobOutputArtifact {
  @JsonProperty("name")
  private String name;

  @JsonProperty("value")
  private String value;

  /**
   * Name of the artifact. Currently we provide the URL of the HLS manifest with name &#39;HLS_MANIFEST_URL&#39; and the URL of the DASH manifest with name &#39;DASH_MANIFEST_URL&#39; 
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * A string value described by the &#39;name&#39; property. Typically this is an absolute URL pointing to a file on the output you specified for the encoding job. The protocol depends on the type of output: \&quot;s3://\&quot; for AWS S3,\&quot;gcs://\&quot; for Google Cloud Storage, \&quot;https://\&quot; for Azure Blob Storage and Akamai NetStorage ) 
   * @return value
   */
  public String getValue() {
    return value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleEncodingVodJobOutputArtifact simpleEncodingVodJobOutputArtifact = (SimpleEncodingVodJobOutputArtifact) o;
    return Objects.equals(this.name, simpleEncodingVodJobOutputArtifact.name) &&
        Objects.equals(this.value, simpleEncodingVodJobOutputArtifact.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleEncodingVodJobOutputArtifact {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.StreamsPublicSigningKey;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsPublicSigningKeyResponse
 */

public class StreamsPublicSigningKeyResponse {
  @JsonProperty("publicKeys")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StreamsPublicSigningKey> publicKeys = new ArrayList<StreamsPublicSigningKey>();


  public StreamsPublicSigningKeyResponse addPublicKeysItem(StreamsPublicSigningKey publicKeysItem) {
    this.publicKeys.add(publicKeysItem);
    return this;
  }

  /**
   * Get publicKeys
   * @return publicKeys
   */
  public List<StreamsPublicSigningKey> getPublicKeys() {
    return publicKeys;
  }

  /**
   * Set publicKeys
   *
   * @param publicKeys
   */
  public void setPublicKeys(List<StreamsPublicSigningKey> publicKeys) {
    this.publicKeys = publicKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsPublicSigningKeyResponse streamsPublicSigningKeyResponse = (StreamsPublicSigningKeyResponse) o;
    return Objects.equals(this.publicKeys, streamsPublicSigningKeyResponse.publicKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsPublicSigningKeyResponse {\n");
    
    sb.append("    publicKeys: ").append(toIndentedString(publicKeys)).append("\n");
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


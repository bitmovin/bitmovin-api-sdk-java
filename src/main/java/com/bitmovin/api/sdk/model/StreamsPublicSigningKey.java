package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsPublicSigningKey
 */

public class StreamsPublicSigningKey {
  @JsonProperty("keyId")
  private String keyId;

  @JsonProperty("createdAt")
  private Date createdAt;


  /**
   * The unique identifier of the key
   * @return keyId
   */
  public String getKeyId() {
    return keyId;
  }

  /**
   * The unique identifier of the key
   *
   * @param keyId
   *        The unique identifier of the key
   */
  public void setKeyId(String keyId) {
    this.keyId = keyId;
  }


  /**
   * Get createdAt
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Set createdAt
   *
   * @param createdAt
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsPublicSigningKey streamsPublicSigningKey = (StreamsPublicSigningKey) o;
    return Objects.equals(this.keyId, streamsPublicSigningKey.keyId) &&
        Objects.equals(this.createdAt, streamsPublicSigningKey.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyId, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsPublicSigningKey {\n");
    
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * StreamsSigningKeyResponse
 */

public class StreamsSigningKeyResponse {
  @JsonProperty("privateKey")
  private String privateKey;

  @JsonProperty("keyId")
  private String keyId;

  @JsonProperty("message")
  private String message;


  /**
   * base64-encoded PEM file of the private key
   * @return privateKey
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * base64-encoded PEM file of the private key
   *
   * @param privateKey
   *        base64-encoded PEM file of the private key
   */
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


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
   * Get message
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Set message
   *
   * @param message
   */
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamsSigningKeyResponse streamsSigningKeyResponse = (StreamsSigningKeyResponse) o;
    return Objects.equals(this.privateKey, streamsSigningKeyResponse.privateKey) &&
        Objects.equals(this.keyId, streamsSigningKeyResponse.keyId) &&
        Objects.equals(this.message, streamsSigningKeyResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, keyId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamsSigningKeyResponse {\n");
    
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


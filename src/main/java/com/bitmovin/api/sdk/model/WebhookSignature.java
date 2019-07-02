package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SignatureType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WebhookSignature
 */

public class WebhookSignature {
  @JsonProperty("type")
  private SignatureType type;

  @JsonProperty("key")
  private String key;


  /**
   * The signature type used for the webhook.  Selects one of the supported signatures. The signature is attached to the list of headers with the key &#x60;Bitmovin-Signature&#x60;. In case of the &#x60;HMAC&#x60; type the SHA512 hashing algorithm is used to generate an authentication code from the webhook body. (required)
   * @return type
   */
  public SignatureType getType() {
    return type;
  }

  /**
   * The signature type used for the webhook.  Selects one of the supported signatures. The signature is attached to the list of headers with the key &#x60;Bitmovin-Signature&#x60;. In case of the &#x60;HMAC&#x60; type the SHA512 hashing algorithm is used to generate an authentication code from the webhook body. (required)
   *
   * @param type
   *        The signature type used for the webhook.  Selects one of the supported signatures. The signature is attached to the list of headers with the key &#x60;Bitmovin-Signature&#x60;. In case of the &#x60;HMAC&#x60; type the SHA512 hashing algorithm is used to generate an authentication code from the webhook body. (required)
   */
  public void setType(SignatureType type) {
    this.type = type;
  }

  /**
   * The key of the signature (required)
   * @return key
   */
  public String getKey() {
    return key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSignature webhookSignature = (WebhookSignature) o;
    return Objects.equals(this.type, webhookSignature.type) &&
        Objects.equals(this.key, webhookSignature.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSignature {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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


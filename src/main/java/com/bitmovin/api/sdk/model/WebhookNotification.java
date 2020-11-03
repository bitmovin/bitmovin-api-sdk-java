package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Notification;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WebhookNotification
 */

public class WebhookNotification extends Notification {
  @JsonProperty("url")
  private String url;


  /**
   * The destination URL where the webhook data is send to (required)
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * The destination URL where the webhook data is send to (required)
   *
   * @param url
   *        The destination URL where the webhook data is send to (required)
   */
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookNotification webhookNotification = (WebhookNotification) o;
    return Objects.equals(this.url, webhookNotification.url) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookNotification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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


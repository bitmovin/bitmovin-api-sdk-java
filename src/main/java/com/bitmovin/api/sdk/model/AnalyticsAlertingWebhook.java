package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.WebhookHttpMethod;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAlertingWebhook
 */

public class AnalyticsAlertingWebhook {
  @JsonProperty("url")
  private String url;

  @JsonProperty("method")
  private WebhookHttpMethod method;

  @JsonProperty("insecureSsl")
  private Boolean insecureSsl;


  /**
   * Webhook url (required)
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Webhook url (required)
   *
   * @param url
   *        Webhook url (required)
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * HTTP method used for the webhook (required)
   * @return method
   */
  public WebhookHttpMethod getMethod() {
    return method;
  }

  /**
   * HTTP method used for the webhook (required)
   *
   * @param method
   *        HTTP method used for the webhook (required)
   */
  public void setMethod(WebhookHttpMethod method) {
    this.method = method;
  }


  /**
   * Whether to skip SSL certification verification or not (required)
   * @return insecureSsl
   */
  public Boolean getInsecureSsl() {
    return insecureSsl;
  }

  /**
   * Whether to skip SSL certification verification or not (required)
   *
   * @param insecureSsl
   *        Whether to skip SSL certification verification or not (required)
   */
  public void setInsecureSsl(Boolean insecureSsl) {
    this.insecureSsl = insecureSsl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAlertingWebhook analyticsAlertingWebhook = (AnalyticsAlertingWebhook) o;
    return Objects.equals(this.url, analyticsAlertingWebhook.url) &&
        Objects.equals(this.method, analyticsAlertingWebhook.method) &&
        Objects.equals(this.insecureSsl, analyticsAlertingWebhook.insecureSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, method, insecureSsl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAlertingWebhook {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    insecureSsl: ").append(toIndentedString(insecureSsl)).append("\n");
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


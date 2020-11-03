package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsAlertingWebhook;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAlertingNotification
 */

public class AnalyticsAlertingNotification {
  @JsonProperty("emails")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> emails = new ArrayList<String>();

  @JsonProperty("webhooks")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsAlertingWebhook> webhooks = new ArrayList<AnalyticsAlertingWebhook>();


  public AnalyticsAlertingNotification addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * List of email addresses
   * @return emails
   */
  public List<String> getEmails() {
    return emails;
  }

  /**
   * List of email addresses
   *
   * @param emails
   *        List of email addresses
   */
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  public AnalyticsAlertingNotification addWebhooksItem(AnalyticsAlertingWebhook webhooksItem) {
    this.webhooks.add(webhooksItem);
    return this;
  }

  /**
   * Get webhooks
   * @return webhooks
   */
  public List<AnalyticsAlertingWebhook> getWebhooks() {
    return webhooks;
  }

  /**
   * Set webhooks
   *
   * @param webhooks
   */
  public void setWebhooks(List<AnalyticsAlertingWebhook> webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAlertingNotification analyticsAlertingNotification = (AnalyticsAlertingNotification) o;
    return Objects.equals(this.emails, analyticsAlertingNotification.emails) &&
        Objects.equals(this.webhooks, analyticsAlertingNotification.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails, webhooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAlertingNotification {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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


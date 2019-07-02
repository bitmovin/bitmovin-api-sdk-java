package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EmailNotificationWithStreamConditionsRequest
 */

public class EmailNotificationWithStreamConditionsRequest {
  @JsonProperty("resolve")
  private Boolean resolve;

  @JsonProperty("emails")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> emails = new ArrayList<String>();

  @JsonProperty("muted")
  private Boolean muted;

  @JsonProperty("conditions")
  private AbstractCondition conditions;


  /**
   * Notify when condition resolves after it was met
   * @return resolve
   */
  public Boolean getResolve() {
    return resolve;
  }

  /**
   * Notify when condition resolves after it was met
   *
   * @param resolve
   *        Notify when condition resolves after it was met
   */
  public void setResolve(Boolean resolve) {
    this.resolve = resolve;
  }


  public EmailNotificationWithStreamConditionsRequest addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * Get emails
   * @return emails
   */
  public List<String> getEmails() {
    return emails;
  }

  /**
   * Set emails
   *
   * @param emails
   */
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  /**
   * Get muted
   * @return muted
   */
  public Boolean getMuted() {
    return muted;
  }

  /**
   * Set muted
   *
   * @param muted
   */
  public void setMuted(Boolean muted) {
    this.muted = muted;
  }


  /**
   * Get conditions
   * @return conditions
   */
  public AbstractCondition getConditions() {
    return conditions;
  }

  /**
   * Set conditions
   *
   * @param conditions
   */
  public void setConditions(AbstractCondition conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailNotificationWithStreamConditionsRequest emailNotificationWithStreamConditionsRequest = (EmailNotificationWithStreamConditionsRequest) o;
    return Objects.equals(this.resolve, emailNotificationWithStreamConditionsRequest.resolve) &&
        Objects.equals(this.emails, emailNotificationWithStreamConditionsRequest.emails) &&
        Objects.equals(this.muted, emailNotificationWithStreamConditionsRequest.muted) &&
        Objects.equals(this.conditions, emailNotificationWithStreamConditionsRequest.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolve, emails, muted, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailNotificationWithStreamConditionsRequest {\n");
    
    sb.append("    resolve: ").append(toIndentedString(resolve)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    muted: ").append(toIndentedString(muted)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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


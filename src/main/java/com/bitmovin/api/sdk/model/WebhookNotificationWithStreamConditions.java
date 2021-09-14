package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AbstractCondition;
import com.bitmovin.api.sdk.model.WebhookNotification;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * WebhookNotificationWithStreamConditions
 */

public class WebhookNotificationWithStreamConditions extends WebhookNotification {
  @JsonProperty("conditions")
  private AbstractCondition conditions;


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
    WebhookNotificationWithStreamConditions webhookNotificationWithStreamConditions = (WebhookNotificationWithStreamConditions) o;
    return Objects.equals(this.conditions, webhookNotificationWithStreamConditions.conditions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookNotificationWithStreamConditions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


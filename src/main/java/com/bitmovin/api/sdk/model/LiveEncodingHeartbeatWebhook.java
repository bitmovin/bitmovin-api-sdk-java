package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Webhook;
import com.bitmovin.api.sdk.model.WebhookHttpMethod;
import com.bitmovin.api.sdk.model.WebhookSignature;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveEncodingHeartbeatWebhook
 */

public class LiveEncodingHeartbeatWebhook extends Webhook {
  @JsonProperty("interval")
  private Integer interval;


  /**
   * The interval of the heartbeat in seconds.
   * minimum: 1
   * @return interval
   */
  public Integer getInterval() {
    return interval;
  }

  /**
   * The interval of the heartbeat in seconds.
   * minimum: 1
   *
   * @param interval
   *        The interval of the heartbeat in seconds.
   *        minimum: 1
   */
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveEncodingHeartbeatWebhook liveEncodingHeartbeatWebhook = (LiveEncodingHeartbeatWebhook) o;
    return Objects.equals(this.interval, liveEncodingHeartbeatWebhook.interval) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveEncodingHeartbeatWebhook {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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


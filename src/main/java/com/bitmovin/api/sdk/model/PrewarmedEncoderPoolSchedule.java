package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResponse;
import com.bitmovin.api.sdk.model.PrewarmedEncoderPoolAction;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PrewarmedEncoderPoolSchedule
 */

public class PrewarmedEncoderPoolSchedule extends BitmovinResponse {
  @JsonProperty("action")
  private PrewarmedEncoderPoolAction action;

  @JsonProperty("triggerDate")
  private Date triggerDate;


  /**
   * The action to be triggered by the schedule (start or stop) (required)
   * @return action
   */
  public PrewarmedEncoderPoolAction getAction() {
    return action;
  }

  /**
   * The action to be triggered by the schedule (start or stop) (required)
   *
   * @param action
   *        The action to be triggered by the schedule (start or stop) (required)
   */
  public void setAction(PrewarmedEncoderPoolAction action) {
    this.action = action;
  }


  /**
   * An instant in the future when the specified action should be triggered. Given as UTC expressed in ISO 8601 format (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;). Seconds will be ignored. (required)
   * @return triggerDate
   */
  public Date getTriggerDate() {
    return triggerDate;
  }

  /**
   * An instant in the future when the specified action should be triggered. Given as UTC expressed in ISO 8601 format (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;). Seconds will be ignored. (required)
   *
   * @param triggerDate
   *        An instant in the future when the specified action should be triggered. Given as UTC expressed in ISO 8601 format (\&quot;YYYY-MM-DDThh:mm:ssZ\&quot;). Seconds will be ignored. (required)
   */
  public void setTriggerDate(Date triggerDate) {
    this.triggerDate = triggerDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrewarmedEncoderPoolSchedule prewarmedEncoderPoolSchedule = (PrewarmedEncoderPoolSchedule) o;
    return Objects.equals(this.action, prewarmedEncoderPoolSchedule.action) &&
        Objects.equals(this.triggerDate, prewarmedEncoderPoolSchedule.triggerDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, triggerDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrewarmedEncoderPoolSchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    triggerDate: ").append(toIndentedString(triggerDate)).append("\n");
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


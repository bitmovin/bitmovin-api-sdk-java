package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsErrorData
 */

public class AnalyticsErrorData {
  @JsonProperty("exceptionMessage")
  private String exceptionMessage;

  @JsonProperty("additionalData")
  private String additionalData;

  @JsonProperty("exceptionStacktrace")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> exceptionStacktrace = new ArrayList<String>();


  /**
   * Exception message
   * @return exceptionMessage
   */
  public String getExceptionMessage() {
    return exceptionMessage;
  }

  /**
   * Exception message
   *
   * @param exceptionMessage
   *        Exception message
   */
  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }


  /**
   * Additional error data
   * @return additionalData
   */
  public String getAdditionalData() {
    return additionalData;
  }

  /**
   * Additional error data
   *
   * @param additionalData
   *        Additional error data
   */
  public void setAdditionalData(String additionalData) {
    this.additionalData = additionalData;
  }


  public AnalyticsErrorData addExceptionStacktraceItem(String exceptionStacktraceItem) {
    this.exceptionStacktrace.add(exceptionStacktraceItem);
    return this;
  }

  /**
   * Get exceptionStacktrace
   * @return exceptionStacktrace
   */
  public List<String> getExceptionStacktrace() {
    return exceptionStacktrace;
  }

  /**
   * Set exceptionStacktrace
   *
   * @param exceptionStacktrace
   */
  public void setExceptionStacktrace(List<String> exceptionStacktrace) {
    this.exceptionStacktrace = exceptionStacktrace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsErrorData analyticsErrorData = (AnalyticsErrorData) o;
    return Objects.equals(this.exceptionMessage, analyticsErrorData.exceptionMessage) &&
        Objects.equals(this.additionalData, analyticsErrorData.additionalData) &&
        Objects.equals(this.exceptionStacktrace, analyticsErrorData.exceptionStacktrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptionMessage, additionalData, exceptionStacktrace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsErrorData {\n");
    
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    exceptionStacktrace: ").append(toIndentedString(exceptionStacktrace)).append("\n");
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


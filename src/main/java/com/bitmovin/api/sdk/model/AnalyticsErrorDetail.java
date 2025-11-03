package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsErrorData;
import com.bitmovin.api.sdk.model.AnalyticsHttpRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsErrorDetail
 */

public class AnalyticsErrorDetail {
  @JsonProperty("errorId")
  private Long errorId;

  @JsonProperty("time")
  private Date time;

  @JsonProperty("clientTime")
  private Date clientTime;

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("errorData")
  private AnalyticsErrorData errorData;

  @JsonProperty("severity")
  private String severity;

  @JsonProperty("httpRequests")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsHttpRequest> httpRequests = new ArrayList<AnalyticsHttpRequest>();


  /**
   * Error id
   * @return errorId
   */
  public Long getErrorId() {
    return errorId;
  }

  /**
   * Error id
   *
   * @param errorId
   *        Error id
   */
  public void setErrorId(Long errorId) {
    this.errorId = errorId;
  }


  /**
   * Server timestamp
   * @return time
   */
  public Date getTime() {
    return time;
  }

  /**
   * Server timestamp
   *
   * @param time
   *        Server timestamp
   */
  public void setTime(Date time) {
    this.time = time;
  }


  /**
   * Client timestamp
   * @return clientTime
   */
  public Date getClientTime() {
    return clientTime;
  }

  /**
   * Client timestamp
   *
   * @param clientTime
   *        Client timestamp
   */
  public void setClientTime(Date clientTime) {
    this.clientTime = clientTime;
  }


  /**
   * Error code
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  /**
   * Error code
   *
   * @param code
   *        Error code
   */
  public void setCode(Integer code) {
    this.code = code;
  }


  /**
   * Error message
   * @return message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Error message
   *
   * @param message
   *        Error message
   */
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Get errorData
   * @return errorData
   */
  public AnalyticsErrorData getErrorData() {
    return errorData;
  }

  /**
   * Set errorData
   *
   * @param errorData
   */
  public void setErrorData(AnalyticsErrorData errorData) {
    this.errorData = errorData;
  }


  /**
   * Severity of the error
   * @return severity
   */
  public String getSeverity() {
    return severity;
  }

  /**
   * Severity of the error
   *
   * @param severity
   *        Severity of the error
   */
  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public AnalyticsErrorDetail addHttpRequestsItem(AnalyticsHttpRequest httpRequestsItem) {
    this.httpRequests.add(httpRequestsItem);
    return this;
  }

  /**
   * Get httpRequests
   * @return httpRequests
   */
  public List<AnalyticsHttpRequest> getHttpRequests() {
    return httpRequests;
  }

  /**
   * Set httpRequests
   *
   * @param httpRequests
   */
  public void setHttpRequests(List<AnalyticsHttpRequest> httpRequests) {
    this.httpRequests = httpRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsErrorDetail analyticsErrorDetail = (AnalyticsErrorDetail) o;
    return Objects.equals(this.errorId, analyticsErrorDetail.errorId) &&
        Objects.equals(this.time, analyticsErrorDetail.time) &&
        Objects.equals(this.clientTime, analyticsErrorDetail.clientTime) &&
        Objects.equals(this.code, analyticsErrorDetail.code) &&
        Objects.equals(this.message, analyticsErrorDetail.message) &&
        Objects.equals(this.errorData, analyticsErrorDetail.errorData) &&
        Objects.equals(this.severity, analyticsErrorDetail.severity) &&
        Objects.equals(this.httpRequests, analyticsErrorDetail.httpRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorId, time, clientTime, code, message, errorData, severity, httpRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsErrorDetail {\n");
    
    sb.append("    errorId: ").append(toIndentedString(errorId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    clientTime: ").append(toIndentedString(clientTime)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errorData: ").append(toIndentedString(errorData)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    httpRequests: ").append(toIndentedString(httpRequests)).append("\n");
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


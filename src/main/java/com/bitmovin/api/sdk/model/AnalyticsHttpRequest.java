package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsHttpRequestType;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsHttpRequest
 */

public class AnalyticsHttpRequest {
  @JsonProperty("clientTime")
  private Date clientTime;

  @JsonProperty("type")
  private AnalyticsHttpRequestType type;

  @JsonProperty("url")
  private String url;

  @JsonProperty("lastRedirectLocation")
  private String lastRedirectLocation;

  @JsonProperty("httpStatus")
  private Integer httpStatus;

  @JsonProperty("downloadTime")
  private Long downloadTime;

  @JsonProperty("timeToFirstByte")
  private Long timeToFirstByte;

  @JsonProperty("size")
  private Long size;

  @JsonProperty("success")
  private Boolean success;


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
   * Get type
   * @return type
   */
  public AnalyticsHttpRequestType getType() {
    return type;
  }

  /**
   * Set type
   *
   * @param type
   */
  public void setType(AnalyticsHttpRequestType type) {
    this.type = type;
  }


  /**
   * Http request URL
   * @return url
   */
  public String getUrl() {
    return url;
  }

  /**
   * Http request URL
   *
   * @param url
   *        Http request URL
   */
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Last redirect location
   * @return lastRedirectLocation
   */
  public String getLastRedirectLocation() {
    return lastRedirectLocation;
  }

  /**
   * Last redirect location
   *
   * @param lastRedirectLocation
   *        Last redirect location
   */
  public void setLastRedirectLocation(String lastRedirectLocation) {
    this.lastRedirectLocation = lastRedirectLocation;
  }


  /**
   * Http request status
   * @return httpStatus
   */
  public Integer getHttpStatus() {
    return httpStatus;
  }

  /**
   * Http request status
   *
   * @param httpStatus
   *        Http request status
   */
  public void setHttpStatus(Integer httpStatus) {
    this.httpStatus = httpStatus;
  }


  /**
   * Download time
   * @return downloadTime
   */
  public Long getDownloadTime() {
    return downloadTime;
  }

  /**
   * Download time
   *
   * @param downloadTime
   *        Download time
   */
  public void setDownloadTime(Long downloadTime) {
    this.downloadTime = downloadTime;
  }


  /**
   * Time to first byte
   * @return timeToFirstByte
   */
  public Long getTimeToFirstByte() {
    return timeToFirstByte;
  }

  /**
   * Time to first byte
   *
   * @param timeToFirstByte
   *        Time to first byte
   */
  public void setTimeToFirstByte(Long timeToFirstByte) {
    this.timeToFirstByte = timeToFirstByte;
  }


  /**
   * Size
   * @return size
   */
  public Long getSize() {
    return size;
  }

  /**
   * Size
   *
   * @param size
   *        Size
   */
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Was http request successful
   * @return success
   */
  public Boolean getSuccess() {
    return success;
  }

  /**
   * Was http request successful
   *
   * @param success
   *        Was http request successful
   */
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsHttpRequest analyticsHttpRequest = (AnalyticsHttpRequest) o;
    return Objects.equals(this.clientTime, analyticsHttpRequest.clientTime) &&
        Objects.equals(this.type, analyticsHttpRequest.type) &&
        Objects.equals(this.url, analyticsHttpRequest.url) &&
        Objects.equals(this.lastRedirectLocation, analyticsHttpRequest.lastRedirectLocation) &&
        Objects.equals(this.httpStatus, analyticsHttpRequest.httpStatus) &&
        Objects.equals(this.downloadTime, analyticsHttpRequest.downloadTime) &&
        Objects.equals(this.timeToFirstByte, analyticsHttpRequest.timeToFirstByte) &&
        Objects.equals(this.size, analyticsHttpRequest.size) &&
        Objects.equals(this.success, analyticsHttpRequest.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientTime, type, url, lastRedirectLocation, httpStatus, downloadTime, timeToFirstByte, size, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsHttpRequest {\n");
    
    sb.append("    clientTime: ").append(toIndentedString(clientTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    lastRedirectLocation: ").append(toIndentedString(lastRedirectLocation)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    downloadTime: ").append(toIndentedString(downloadTime)).append("\n");
    sb.append("    timeToFirstByte: ").append(toIndentedString(timeToFirstByte)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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


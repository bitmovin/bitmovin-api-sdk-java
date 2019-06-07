package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.SrtStatisticLink;
import com.bitmovin.api.sdk.model.SrtStatisticRecv;
import com.bitmovin.api.sdk.model.SrtStatisticSend;
import com.bitmovin.api.sdk.model.SrtStatisticWindow;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SrtStatistics
 */

public class SrtStatistics {
  @JsonProperty("id")
  private String id;

  @JsonProperty("createdAt")
  private Date createdAt;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("srtInputId")
  private String srtInputId;

  @JsonProperty("srtInputSelected")
  private Boolean srtInputSelected;

  @JsonProperty("orgId")
  private String orgId;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("link")
  private SrtStatisticLink link;

  @JsonProperty("window")
  private SrtStatisticWindow window;

  @JsonProperty("recv")
  private SrtStatisticRecv recv;

  @JsonProperty("send")
  private SrtStatisticSend send;


  /**
   * UUID of the statistic event
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * UUID of the statistic event
   *
   * @param id
   * UUID of the statistic event
   */
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Timestamp when the srt statistics event was created, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   * @return createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Timestamp when the srt statistics event was created, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   *
   * @param createdAt
   * Timestamp when the srt statistics event was created, formatted in UTC: YYYY-MM-DDThh:mm:ssZ
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * UUID of an encoding
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * UUID of an encoding
   *
   * @param encodingId
   * UUID of an encoding
   */
  public void setEncodingId(String encodingId) {
    this.encodingId = encodingId;
  }


  /**
   * UUID of the SRT input used to capture this statistics
   * @return srtInputId
   */
  public String getSrtInputId() {
    return srtInputId;
  }

  /**
   * UUID of the SRT input used to capture this statistics
   *
   * @param srtInputId
   * UUID of the SRT input used to capture this statistics
   */
  public void setSrtInputId(String srtInputId) {
    this.srtInputId = srtInputId;
  }


  /**
   * Whether the SRT input that generated this statistics was selected (i.e. actively used) at the time or not
   * @return srtInputSelected
   */
  public Boolean getSrtInputSelected() {
    return srtInputSelected;
  }

  /**
   * Whether the SRT input that generated this statistics was selected (i.e. actively used) at the time or not
   *
   * @param srtInputSelected
   * Whether the SRT input that generated this statistics was selected (i.e. actively used) at the time or not
   */
  public void setSrtInputSelected(Boolean srtInputSelected) {
    this.srtInputSelected = srtInputSelected;
  }


  /**
   * UUID of the associated organization
   * @return orgId
   */
  public String getOrgId() {
    return orgId;
  }

  /**
   * UUID of the associated organization
   *
   * @param orgId
   * UUID of the associated organization
   */
  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  /**
   * UUID of the associated api-user
   * @return userId
   */
  public String getUserId() {
    return userId;
  }

  /**
   * UUID of the associated api-user
   *
   * @param userId
   * UUID of the associated api-user
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Get link
   * @return link
   */
  public SrtStatisticLink getLink() {
    return link;
  }

  /**
   * Set link
   *
   * @param link
   */
  public void setLink(SrtStatisticLink link) {
    this.link = link;
  }


  /**
   * Get window
   * @return window
   */
  public SrtStatisticWindow getWindow() {
    return window;
  }

  /**
   * Set window
   *
   * @param window
   */
  public void setWindow(SrtStatisticWindow window) {
    this.window = window;
  }


  /**
   * Get recv
   * @return recv
   */
  public SrtStatisticRecv getRecv() {
    return recv;
  }

  /**
   * Set recv
   *
   * @param recv
   */
  public void setRecv(SrtStatisticRecv recv) {
    this.recv = recv;
  }


  /**
   * Get send
   * @return send
   */
  public SrtStatisticSend getSend() {
    return send;
  }

  /**
   * Set send
   *
   * @param send
   */
  public void setSend(SrtStatisticSend send) {
    this.send = send;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SrtStatistics srtStatistics = (SrtStatistics) o;
    return Objects.equals(this.id, srtStatistics.id) &&
        Objects.equals(this.createdAt, srtStatistics.createdAt) &&
        Objects.equals(this.encodingId, srtStatistics.encodingId) &&
        Objects.equals(this.srtInputId, srtStatistics.srtInputId) &&
        Objects.equals(this.srtInputSelected, srtStatistics.srtInputSelected) &&
        Objects.equals(this.orgId, srtStatistics.orgId) &&
        Objects.equals(this.userId, srtStatistics.userId) &&
        Objects.equals(this.link, srtStatistics.link) &&
        Objects.equals(this.window, srtStatistics.window) &&
        Objects.equals(this.recv, srtStatistics.recv) &&
        Objects.equals(this.send, srtStatistics.send);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, encodingId, srtInputId, srtInputSelected, orgId, userId, link, window, recv, send);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SrtStatistics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    srtInputId: ").append(toIndentedString(srtInputId)).append("\n");
    sb.append("    srtInputSelected: ").append(toIndentedString(srtInputSelected)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
    sb.append("    recv: ").append(toIndentedString(recv)).append("\n");
    sb.append("    send: ").append(toIndentedString(send)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Details about user info from rtmp ingest.
 */

public class RtmpUserIngestInfo {
  @JsonProperty("address")
  private String address;

  @JsonProperty("app")
  private String app;

  @JsonProperty("streamKey")
  private String streamKey;

  @JsonProperty("flashVersion")
  private String flashVersion;

  @JsonProperty("clientId")
  private String clientId;

  @JsonProperty("eventType")
  private String eventType;


  /**
   * Client public IP address.
   * @return address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Client public IP address.
   *
   * @param address
   *        Client public IP address.
   */
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   * RTMP application name.
   * @return app
   */
  public String getApp() {
    return app;
  }

  /**
   * RTMP application name.
   *
   * @param app
   *        RTMP application name.
   */
  public void setApp(String app) {
    this.app = app;
  }


  /**
   * Client stream key.
   * @return streamKey
   */
  public String getStreamKey() {
    return streamKey;
  }

  /**
   * Client stream key.
   *
   * @param streamKey
   *        Client stream key.
   */
  public void setStreamKey(String streamKey) {
    this.streamKey = streamKey;
  }


  /**
   * Flash version string / encoder identity.
   * @return flashVersion
   */
  public String getFlashVersion() {
    return flashVersion;
  }

  /**
   * Flash version string / encoder identity.
   *
   * @param flashVersion
   *        Flash version string / encoder identity.
   */
  public void setFlashVersion(String flashVersion) {
    this.flashVersion = flashVersion;
  }


  /**
   * Session/client connection ID.
   * @return clientId
   */
  public String getClientId() {
    return clientId;
  }

  /**
   * Session/client connection ID.
   *
   * @param clientId
   *        Session/client connection ID.
   */
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * Server action.
   * @return eventType
   */
  public String getEventType() {
    return eventType;
  }

  /**
   * Server action.
   *
   * @param eventType
   *        Server action.
   */
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtmpUserIngestInfo rtmpUserIngestInfo = (RtmpUserIngestInfo) o;
    return Objects.equals(this.address, rtmpUserIngestInfo.address) &&
        Objects.equals(this.app, rtmpUserIngestInfo.app) &&
        Objects.equals(this.streamKey, rtmpUserIngestInfo.streamKey) &&
        Objects.equals(this.flashVersion, rtmpUserIngestInfo.flashVersion) &&
        Objects.equals(this.clientId, rtmpUserIngestInfo.clientId) &&
        Objects.equals(this.eventType, rtmpUserIngestInfo.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, app, streamKey, flashVersion, clientId, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtmpUserIngestInfo {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
    sb.append("    streamKey: ").append(toIndentedString(streamKey)).append("\n");
    sb.append("    flashVersion: ").append(toIndentedString(flashVersion)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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


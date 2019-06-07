package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AclEntry;
import com.bitmovin.api.sdk.model.AkamaiMslStreamFormat;
import com.bitmovin.api.sdk.model.AkamaiMslVersion;
import com.bitmovin.api.sdk.model.Output;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AkamaiMslOutput
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class AkamaiMslOutput extends Output {
  @JsonProperty("streamId")
  private Integer streamId;

  @JsonProperty("eventName")
  private String eventName;

  @JsonProperty("streamFormat")
  private AkamaiMslStreamFormat streamFormat;

  @JsonProperty("mslVersion")
  private AkamaiMslVersion mslVersion;


  /**
   * The Akamai stream ID
   * @return streamId
   */
  public Integer getStreamId() {
    return streamId;
  }

  /**
   * The Akamai stream ID
   *
   * @param streamId
   * The Akamai stream ID
   */
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }


  /**
   * The Akamai event name
   * @return eventName
   */
  public String getEventName() {
    return eventName;
  }

  /**
   * The Akamai event name
   *
   * @param eventName
   * The Akamai event name
   */
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * Get streamFormat
   * @return streamFormat
   */
  public AkamaiMslStreamFormat getStreamFormat() {
    return streamFormat;
  }

  /**
   * Set streamFormat
   *
   * @param streamFormat
   */
  public void setStreamFormat(AkamaiMslStreamFormat streamFormat) {
    this.streamFormat = streamFormat;
  }


  /**
   * Get mslVersion
   * @return mslVersion
   */
  public AkamaiMslVersion getMslVersion() {
    return mslVersion;
  }

  /**
   * Set mslVersion
   *
   * @param mslVersion
   */
  public void setMslVersion(AkamaiMslVersion mslVersion) {
    this.mslVersion = mslVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AkamaiMslOutput akamaiMslOutput = (AkamaiMslOutput) o;
    return Objects.equals(this.streamId, akamaiMslOutput.streamId) &&
        Objects.equals(this.eventName, akamaiMslOutput.eventName) &&
        Objects.equals(this.streamFormat, akamaiMslOutput.streamFormat) &&
        Objects.equals(this.mslVersion, akamaiMslOutput.mslVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streamId, eventName, streamFormat, mslVersion, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AkamaiMslOutput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    streamFormat: ").append(toIndentedString(streamFormat)).append("\n");
    sb.append("    mslVersion: ").append(toIndentedString(mslVersion)).append("\n");
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


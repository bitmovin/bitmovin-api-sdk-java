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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = AkamaiMslOutput.class)
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
   * The Akamai stream ID (required)
   * @return streamId
   */
  public Integer getStreamId() {
    return streamId;
  }

  /**
   * The Akamai stream ID (required)
   *
   * @param streamId
   *        The Akamai stream ID (required)
   */
  public void setStreamId(Integer streamId) {
    this.streamId = streamId;
  }


  /**
   * The Akamai event name (required)
   * @return eventName
   */
  public String getEventName() {
    return eventName;
  }

  /**
   * The Akamai event name (required)
   *
   * @param eventName
   *        The Akamai event name (required)
   */
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }


  /**
   * - DASH: configure the Encoding with fMP4 or CMAF muxings and a DASH manifest. - HLS: configure the Encoding with TS muxings and an HLS manifest. - CMAF: configure the Encoding with fMP4 or CMAF muxings with both DASH and HLS manifests. (required)
   * @return streamFormat
   */
  public AkamaiMslStreamFormat getStreamFormat() {
    return streamFormat;
  }

  /**
   * - DASH: configure the Encoding with fMP4 or CMAF muxings and a DASH manifest. - HLS: configure the Encoding with TS muxings and an HLS manifest. - CMAF: configure the Encoding with fMP4 or CMAF muxings with both DASH and HLS manifests. (required)
   *
   * @param streamFormat
   *        - DASH: configure the Encoding with fMP4 or CMAF muxings and a DASH manifest. - HLS: configure the Encoding with TS muxings and an HLS manifest. - CMAF: configure the Encoding with fMP4 or CMAF muxings with both DASH and HLS manifests. (required)
   */
  public void setStreamFormat(AkamaiMslStreamFormat streamFormat) {
    this.streamFormat = streamFormat;
  }


  /**
   * The Akamai MSL Version. Only MSL4 is supported at the moment. (required)
   * @return mslVersion
   */
  public AkamaiMslVersion getMslVersion() {
    return mslVersion;
  }

  /**
   * The Akamai MSL Version. Only MSL4 is supported at the moment. (required)
   *
   * @param mslVersion
   *        The Akamai MSL Version. Only MSL4 is supported at the moment. (required)
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


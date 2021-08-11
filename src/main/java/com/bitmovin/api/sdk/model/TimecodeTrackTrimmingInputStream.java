package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * TimecodeTrackTrimmingInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = TimecodeTrackTrimmingInputStream.class)
public class TimecodeTrackTrimmingInputStream extends InputStream {
  @JsonProperty("inputStreamId")
  private String inputStreamId;

  @JsonProperty("startTimeCode")
  private String startTimeCode;

  @JsonProperty("endTimeCode")
  private String endTimeCode;


  /**
   * The id of the ingest input stream that should be trimmed (required)
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  /**
   * The id of the ingest input stream that should be trimmed (required)
   *
   * @param inputStreamId
   *        The id of the ingest input stream that should be trimmed (required)
   */
  public void setInputStreamId(String inputStreamId) {
    this.inputStreamId = inputStreamId;
  }


  /**
   * Defines the timecode, in SMPTE-12M format, of the frame from which the encoding should start. The frame indicated by this value will be included in the encoding (required)
   * @return startTimeCode
   */
  public String getStartTimeCode() {
    return startTimeCode;
  }

  /**
   * Defines the timecode, in SMPTE-12M format, of the frame from which the encoding should start. The frame indicated by this value will be included in the encoding (required)
   *
   * @param startTimeCode
   *        Defines the timecode, in SMPTE-12M format, of the frame from which the encoding should start. The frame indicated by this value will be included in the encoding (required)
   */
  public void setStartTimeCode(String startTimeCode) {
    this.startTimeCode = startTimeCode;
  }


  /**
   * Defines the timecode, in SMPTE-12M format, of the frame at which the encoding should stop. The frame indicated by this value will be included in the encoding (required)
   * @return endTimeCode
   */
  public String getEndTimeCode() {
    return endTimeCode;
  }

  /**
   * Defines the timecode, in SMPTE-12M format, of the frame at which the encoding should stop. The frame indicated by this value will be included in the encoding (required)
   *
   * @param endTimeCode
   *        Defines the timecode, in SMPTE-12M format, of the frame at which the encoding should stop. The frame indicated by this value will be included in the encoding (required)
   */
  public void setEndTimeCode(String endTimeCode) {
    this.endTimeCode = endTimeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimecodeTrackTrimmingInputStream timecodeTrackTrimmingInputStream = (TimecodeTrackTrimmingInputStream) o;
    return Objects.equals(this.inputStreamId, timecodeTrackTrimmingInputStream.inputStreamId) &&
        Objects.equals(this.startTimeCode, timecodeTrackTrimmingInputStream.startTimeCode) &&
        Objects.equals(this.endTimeCode, timecodeTrackTrimmingInputStream.endTimeCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreamId, startTimeCode, endTimeCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimecodeTrackTrimmingInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputStreamId: ").append(toIndentedString(inputStreamId)).append("\n");
    sb.append("    startTimeCode: ").append(toIndentedString(startTimeCode)).append("\n");
    sb.append("    endTimeCode: ").append(toIndentedString(endTimeCode)).append("\n");
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


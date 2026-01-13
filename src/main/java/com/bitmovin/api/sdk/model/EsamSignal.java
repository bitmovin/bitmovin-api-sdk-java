package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ESAM signal following the SCTE-250 standard
 */

public class EsamSignal {
  @JsonProperty("offset")
  private String offset;

  @JsonProperty("binary")
  private String binary;

  @JsonProperty("interval")
  private String interval;

  @JsonProperty("end")
  private String end;


  /**
   * The offset from the matched signal in ISO 8601 duration format, accurate to milliseconds
   * @return offset
   */
  public String getOffset() {
    return offset;
  }

  /**
   * The offset from the matched signal in ISO 8601 duration format, accurate to milliseconds
   *
   * @param offset
   *        The offset from the matched signal in ISO 8601 duration format, accurate to milliseconds
   */
  public void setOffset(String offset) {
    this.offset = offset;
  }


  /**
   * Base64-encoded SCTE-35 binary data to be inserted into the stream (required)
   * @return binary
   */
  public String getBinary() {
    return binary;
  }

  /**
   * Base64-encoded SCTE-35 binary data to be inserted into the stream (required)
   *
   * @param binary
   *        Base64-encoded SCTE-35 binary data to be inserted into the stream (required)
   */
  public void setBinary(String binary) {
    this.binary = binary;
  }


  /**
   * Interval in ISO 8601 duration format for which the signal should be repeated.  A signal may be specified as repeating when the interval and end attributes are present.  In this case, the signal is executed at the time specified by offset and again at the time  specified by adding interval to offset. This should be continued until reaching the duration  of offset + end. 
   * @return interval
   */
  public String getInterval() {
    return interval;
  }

  /**
   * Interval in ISO 8601 duration format for which the signal should be repeated.  A signal may be specified as repeating when the interval and end attributes are present.  In this case, the signal is executed at the time specified by offset and again at the time  specified by adding interval to offset. This should be continued until reaching the duration  of offset + end. 
   *
   * @param interval
   *        Interval in ISO 8601 duration format for which the signal should be repeated.  A signal may be specified as repeating when the interval and end attributes are present.  In this case, the signal is executed at the time specified by offset and again at the time  specified by adding interval to offset. This should be continued until reaching the duration  of offset + end. 
   */
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * End duration in ISO 8601 duration format when a repeated signal should stop being repeated
   * @return end
   */
  public String getEnd() {
    return end;
  }

  /**
   * End duration in ISO 8601 duration format when a repeated signal should stop being repeated
   *
   * @param end
   *        End duration in ISO 8601 duration format when a repeated signal should stop being repeated
   */
  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsamSignal esamSignal = (EsamSignal) o;
    return Objects.equals(this.offset, esamSignal.offset) &&
        Objects.equals(this.binary, esamSignal.binary) &&
        Objects.equals(this.interval, esamSignal.interval) &&
        Objects.equals(this.end, esamSignal.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, binary, interval, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsamSignal {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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


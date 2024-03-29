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
 * TimeBasedTrimmingInputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = TimeBasedTrimmingInputStream.class)
public class TimeBasedTrimmingInputStream extends InputStream {
  @JsonProperty("inputStreamId")
  private String inputStreamId;

  @JsonProperty("offset")
  private Double offset;

  @JsonProperty("duration")
  private Double duration;


  /**
   * The id of the ingest input stream that should be trimmed
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  /**
   * The id of the ingest input stream that should be trimmed
   *
   * @param inputStreamId
   *        The id of the ingest input stream that should be trimmed
   */
  public void setInputStreamId(String inputStreamId) {
    this.inputStreamId = inputStreamId;
  }


  /**
   * Defines the offset in seconds at which the encoding should start, beginning at 0. The frame indicated by this value will be included in the encoding
   * minimum: 0
   * @return offset
   */
  public Double getOffset() {
    return offset;
  }

  /**
   * Defines the offset in seconds at which the encoding should start, beginning at 0. The frame indicated by this value will be included in the encoding
   * minimum: 0
   *
   * @param offset
   *        Defines the offset in seconds at which the encoding should start, beginning at 0. The frame indicated by this value will be included in the encoding
   *        minimum: 0
   */
  public void setOffset(Double offset) {
    this.offset = offset;
  }


  /**
   * Defines how many seconds of the input will be encoded. Not defining or setting it to null indicates that the remaining input (considering offset) will be encoded.
   * minimum: 0
   * @return duration
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * Defines how many seconds of the input will be encoded. Not defining or setting it to null indicates that the remaining input (considering offset) will be encoded.
   * minimum: 0
   *
   * @param duration
   *        Defines how many seconds of the input will be encoded. Not defining or setting it to null indicates that the remaining input (considering offset) will be encoded.
   *        minimum: 0
   */
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeBasedTrimmingInputStream timeBasedTrimmingInputStream = (TimeBasedTrimmingInputStream) o;
    return Objects.equals(this.inputStreamId, timeBasedTrimmingInputStream.inputStreamId) &&
        Objects.equals(this.offset, timeBasedTrimmingInputStream.offset) &&
        Objects.equals(this.duration, timeBasedTrimmingInputStream.duration) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreamId, offset, duration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeBasedTrimmingInputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputStreamId: ").append(toIndentedString(inputStreamId)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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


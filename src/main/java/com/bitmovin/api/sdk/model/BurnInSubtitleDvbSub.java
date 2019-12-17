package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BitmovinResource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BurnInSubtitleDvbSub
 */

public class BurnInSubtitleDvbSub extends BitmovinResource {
  @JsonProperty("inputStreamId")
  private String inputStreamId;


  /**
   * Id of an IngestInputStream which specifies the stream of the DVB-SUB subtitles (required)
   * @return inputStreamId
   */
  public String getInputStreamId() {
    return inputStreamId;
  }

  /**
   * Id of an IngestInputStream which specifies the stream of the DVB-SUB subtitles (required)
   *
   * @param inputStreamId
   *        Id of an IngestInputStream which specifies the stream of the DVB-SUB subtitles (required)
   */
  public void setInputStreamId(String inputStreamId) {
    this.inputStreamId = inputStreamId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BurnInSubtitleDvbSub burnInSubtitleDvbSub = (BurnInSubtitleDvbSub) o;
    return Objects.equals(this.inputStreamId, burnInSubtitleDvbSub.inputStreamId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputStreamId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BurnInSubtitleDvbSub {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inputStreamId: ").append(toIndentedString(inputStreamId)).append("\n");
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


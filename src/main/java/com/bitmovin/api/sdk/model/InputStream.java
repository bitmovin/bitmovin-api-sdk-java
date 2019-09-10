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
 * InputStream
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = InputStream.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = IngestInputStream.class, name = "INGEST"),
  @JsonSubTypes.Type(value = ConcatenationInputStream.class, name = "CONCATENATION"),
  @JsonSubTypes.Type(value = TimeBasedTrimmingInputStream.class, name = "TRIMMING_TIME_BASED"),
  @JsonSubTypes.Type(value = TimecodeTrackTrimmingInputStream.class, name = "TRIMMING_TIME_CODE_TRACK"),
  @JsonSubTypes.Type(value = H264PictureTimingTrimmingInputStream.class, name = "TRIMMING_H264_PICTURE_TIMING"),
  @JsonSubTypes.Type(value = AudioMixInputStream.class, name = "AUDIO_MIX"),
  @JsonSubTypes.Type(value = Cea608CaptionInputStream.class, name = "CAPTION_CEA608"),
  @JsonSubTypes.Type(value = Cea708CaptionInputStream.class, name = "CAPTION_CEA708"),
  @JsonSubTypes.Type(value = FileInputStream.class, name = "FILE"),
})

public class InputStream extends BitmovinResource {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputStream {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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


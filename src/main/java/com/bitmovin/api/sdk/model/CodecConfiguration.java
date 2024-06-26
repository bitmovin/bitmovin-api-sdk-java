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
 * CodecConfiguration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = CodecConfiguration.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AacAudioConfiguration.class, name = "AAC"),
  @JsonSubTypes.Type(value = PassthroughAudioConfiguration.class, name = "AUDIO_PASSTHROUGH"),
  @JsonSubTypes.Type(value = DtsPassthroughAudioConfiguration.class, name = "DTS_PASSTHROUGH"),
  @JsonSubTypes.Type(value = DtsAudioConfiguration.class, name = "DTS"),
  @JsonSubTypes.Type(value = DtsXAudioConfiguration.class, name = "DTSX"),
  @JsonSubTypes.Type(value = DvbSubtitleConfiguration.class, name = "DVB_SUBTITLE"),
  @JsonSubTypes.Type(value = HeAacV1AudioConfiguration.class, name = "HE_AAC_V1"),
  @JsonSubTypes.Type(value = HeAacV2AudioConfiguration.class, name = "HE_AAC_V2"),
  @JsonSubTypes.Type(value = H264VideoConfiguration.class, name = "H264"),
  @JsonSubTypes.Type(value = H265VideoConfiguration.class, name = "H265"),
  @JsonSubTypes.Type(value = Vp9VideoConfiguration.class, name = "VP9"),
  @JsonSubTypes.Type(value = Vp8VideoConfiguration.class, name = "VP8"),
  @JsonSubTypes.Type(value = Mp2AudioConfiguration.class, name = "MP2"),
  @JsonSubTypes.Type(value = Mp3AudioConfiguration.class, name = "MP3"),
  @JsonSubTypes.Type(value = Ac3AudioConfiguration.class, name = "AC3"),
  @JsonSubTypes.Type(value = DolbyDigitalAudioConfiguration.class, name = "DD"),
  @JsonSubTypes.Type(value = Eac3AudioConfiguration.class, name = "EAC3"),
  @JsonSubTypes.Type(value = DolbyDigitalPlusAudioConfiguration.class, name = "DDPLUS"),
  @JsonSubTypes.Type(value = OpusAudioConfiguration.class, name = "OPUS"),
  @JsonSubTypes.Type(value = VorbisAudioConfiguration.class, name = "VORBIS"),
  @JsonSubTypes.Type(value = MjpegVideoConfiguration.class, name = "MJPEG"),
  @JsonSubTypes.Type(value = Av1VideoConfiguration.class, name = "AV1"),
  @JsonSubTypes.Type(value = DolbyAtmosAudioConfiguration.class, name = "DOLBY_ATMOS"),
  @JsonSubTypes.Type(value = H262VideoConfiguration.class, name = "H262"),
  @JsonSubTypes.Type(value = PcmAudioConfiguration.class, name = "PCM"),
  @JsonSubTypes.Type(value = WebVttConfiguration.class, name = "WEBVTT"),
  @JsonSubTypes.Type(value = ImscConfiguration.class, name = "IMSC"),
})

public class CodecConfiguration extends BitmovinResource {

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
    sb.append("class CodecConfiguration {\n");
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


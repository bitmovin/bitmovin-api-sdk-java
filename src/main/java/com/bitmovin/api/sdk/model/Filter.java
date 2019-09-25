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
 * Filter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = false, defaultImpl = Filter.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CropFilter.class, name = "CROP"),
  @JsonSubTypes.Type(value = ConformFilter.class, name = "CONFORM"),
  @JsonSubTypes.Type(value = WatermarkFilter.class, name = "WATERMARK"),
  @JsonSubTypes.Type(value = EnhancedWatermarkFilter.class, name = "ENHANCED_WATERMARK"),
  @JsonSubTypes.Type(value = RotateFilter.class, name = "ROTATE"),
  @JsonSubTypes.Type(value = DeinterlaceFilter.class, name = "DEINTERLACE"),
  @JsonSubTypes.Type(value = AudioMixFilter.class, name = "AUDIO_MIX"),
  @JsonSubTypes.Type(value = DenoiseHqdn3dFilter.class, name = "DENOISE_HQDN3D"),
  @JsonSubTypes.Type(value = TextFilter.class, name = "TEXT"),
  @JsonSubTypes.Type(value = UnsharpFilter.class, name = "UNSHARP"),
  @JsonSubTypes.Type(value = ScaleFilter.class, name = "SCALE"),
  @JsonSubTypes.Type(value = InterlaceFilter.class, name = "INTERLACE"),
  @JsonSubTypes.Type(value = AudioVolumeFilter.class, name = "AUDIO_VOLUME"),
  @JsonSubTypes.Type(value = EbuR128SinglePassFilter.class, name = "EBU_R128_SINGLE_PASS"),
})

public class Filter extends BitmovinResource {

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
    sb.append("class Filter {\n");
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


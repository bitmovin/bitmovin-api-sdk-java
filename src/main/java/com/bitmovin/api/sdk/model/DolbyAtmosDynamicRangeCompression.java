package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyAtmosDynamicRangeCompressionMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyAtmosDynamicRangeCompression
 */

public class DolbyAtmosDynamicRangeCompression {
  @JsonProperty("lineMode")
  private DolbyAtmosDynamicRangeCompressionMode lineMode;

  @JsonProperty("rfMode")
  private DolbyAtmosDynamicRangeCompressionMode rfMode;


  /**
   * Line mode is intended for use in products providing line‐level or speaker‐level outputs, and is applicable to the widest range of products. Products such as set‐top boxes, DVD players, DTVs, A/V surround decoders, and outboard Dolby Atmos decoders typically use this mode.
   * @return lineMode
   */
  public DolbyAtmosDynamicRangeCompressionMode getLineMode() {
    return lineMode;
  }

  /**
   * Line mode is intended for use in products providing line‐level or speaker‐level outputs, and is applicable to the widest range of products. Products such as set‐top boxes, DVD players, DTVs, A/V surround decoders, and outboard Dolby Atmos decoders typically use this mode.
   *
   * @param lineMode
   *        Line mode is intended for use in products providing line‐level or speaker‐level outputs, and is applicable to the widest range of products. Products such as set‐top boxes, DVD players, DTVs, A/V surround decoders, and outboard Dolby Atmos decoders typically use this mode.
   */
  public void setLineMode(DolbyAtmosDynamicRangeCompressionMode lineMode) {
    this.lineMode = lineMode;
  }


  /**
   * RF mode is intended for products such as a low‐cost television receivers.
   * @return rfMode
   */
  public DolbyAtmosDynamicRangeCompressionMode getRfMode() {
    return rfMode;
  }

  /**
   * RF mode is intended for products such as a low‐cost television receivers.
   *
   * @param rfMode
   *        RF mode is intended for products such as a low‐cost television receivers.
   */
  public void setRfMode(DolbyAtmosDynamicRangeCompressionMode rfMode) {
    this.rfMode = rfMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DolbyAtmosDynamicRangeCompression dolbyAtmosDynamicRangeCompression = (DolbyAtmosDynamicRangeCompression) o;
    return Objects.equals(this.lineMode, dolbyAtmosDynamicRangeCompression.lineMode) &&
        Objects.equals(this.rfMode, dolbyAtmosDynamicRangeCompression.rfMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineMode, rfMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyAtmosDynamicRangeCompression {\n");
    
    sb.append("    lineMode: ").append(toIndentedString(lineMode)).append("\n");
    sb.append("    rfMode: ").append(toIndentedString(rfMode)).append("\n");
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


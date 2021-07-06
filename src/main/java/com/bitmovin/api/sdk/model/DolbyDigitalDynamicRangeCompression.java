package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.DolbyDigitalDynamicRangeCompressionMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DolbyDigitalDynamicRangeCompression
 */

public class DolbyDigitalDynamicRangeCompression {
  @JsonProperty("lineMode")
  private DolbyDigitalDynamicRangeCompressionMode lineMode;

  @JsonProperty("rfMode")
  private DolbyDigitalDynamicRangeCompressionMode rfMode;


  /**
   * Line mode is intended for use in products providing line‐level or speaker‐level outputs, and is applicable to the widest range of products. Products such as set‐top boxes, DVD players, DTVs, A/V surround decoders, and outboard Dolby Digital decoders typically use this mode.
   * @return lineMode
   */
  public DolbyDigitalDynamicRangeCompressionMode getLineMode() {
    return lineMode;
  }

  /**
   * Line mode is intended for use in products providing line‐level or speaker‐level outputs, and is applicable to the widest range of products. Products such as set‐top boxes, DVD players, DTVs, A/V surround decoders, and outboard Dolby Digital decoders typically use this mode.
   *
   * @param lineMode
   *        Line mode is intended for use in products providing line‐level or speaker‐level outputs, and is applicable to the widest range of products. Products such as set‐top boxes, DVD players, DTVs, A/V surround decoders, and outboard Dolby Digital decoders typically use this mode.
   */
  public void setLineMode(DolbyDigitalDynamicRangeCompressionMode lineMode) {
    this.lineMode = lineMode;
  }


  /**
   * RF mode is intended for products such as a low‐cost television receivers.
   * @return rfMode
   */
  public DolbyDigitalDynamicRangeCompressionMode getRfMode() {
    return rfMode;
  }

  /**
   * RF mode is intended for products such as a low‐cost television receivers.
   *
   * @param rfMode
   *        RF mode is intended for products such as a low‐cost television receivers.
   */
  public void setRfMode(DolbyDigitalDynamicRangeCompressionMode rfMode) {
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
    DolbyDigitalDynamicRangeCompression dolbyDigitalDynamicRangeCompression = (DolbyDigitalDynamicRangeCompression) o;
    return Objects.equals(this.lineMode, dolbyDigitalDynamicRangeCompression.lineMode) &&
        Objects.equals(this.rfMode, dolbyDigitalDynamicRangeCompression.rfMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineMode, rfMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DolbyDigitalDynamicRangeCompression {\n");
    
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BillableEncodingMinutesDetails;
import com.bitmovin.api.sdk.model.CodecConfigType;
import com.bitmovin.api.sdk.model.EncodingMode;
import com.bitmovin.api.sdk.model.PsnrPerStreamMode;
import com.bitmovin.api.sdk.model.StatisticsPerTitleStream;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BillableEncodingMinutes
 */

public class BillableEncodingMinutes {
  @JsonProperty("encodingMode")
  private EncodingMode encodingMode;

  @JsonProperty("codec")
  private CodecConfigType codec;

  @JsonProperty("perTitleResultStream")
  private StatisticsPerTitleStream perTitleResultStream;

  @JsonProperty("psnrMode")
  private PsnrPerStreamMode psnrMode;

  @JsonProperty("preset")
  private String preset;

  @JsonProperty("live")
  private Boolean live;

  @JsonProperty("enhancedDeinterlace")
  private Boolean enhancedDeinterlace;

  @JsonProperty("billableMinutes")
  private BillableEncodingMinutesDetails billableMinutes;


  /**
   * Get encodingMode
   * @return encodingMode
   */
  public EncodingMode getEncodingMode() {
    return encodingMode;
  }

  /**
   * Set encodingMode
   *
   * @param encodingMode
   */
  public void setEncodingMode(EncodingMode encodingMode) {
    this.encodingMode = encodingMode;
  }


  /**
   * Get codec
   * @return codec
   */
  public CodecConfigType getCodec() {
    return codec;
  }

  /**
   * Set codec
   *
   * @param codec
   */
  public void setCodec(CodecConfigType codec) {
    this.codec = codec;
  }


  /**
   * Get perTitleResultStream
   * @return perTitleResultStream
   */
  public StatisticsPerTitleStream getPerTitleResultStream() {
    return perTitleResultStream;
  }

  /**
   * Set perTitleResultStream
   *
   * @param perTitleResultStream
   */
  public void setPerTitleResultStream(StatisticsPerTitleStream perTitleResultStream) {
    this.perTitleResultStream = perTitleResultStream;
  }


  /**
   * Get psnrMode
   * @return psnrMode
   */
  public PsnrPerStreamMode getPsnrMode() {
    return psnrMode;
  }

  /**
   * Set psnrMode
   *
   * @param psnrMode
   */
  public void setPsnrMode(PsnrPerStreamMode psnrMode) {
    this.psnrMode = psnrMode;
  }

  /**
   * Name of the preset configuration used for the codec configuration or \&quot;CUSTOM\&quot; if any preset values were overridden
   * @return preset
   */
  public String getPreset() {
    return preset;
  }

  /**
   * Indicates if the stream was part of a live encoding.
   * @return live
   */
  public Boolean getLive() {
    return live;
  }

  /**
   * Indicates if an enhanced interlace filter was used.
   * @return enhancedDeinterlace
   */
  public Boolean getEnhancedDeinterlace() {
    return enhancedDeinterlace;
  }


  /**
   * Get billableMinutes
   * @return billableMinutes
   */
  public BillableEncodingMinutesDetails getBillableMinutes() {
    return billableMinutes;
  }

  /**
   * Set billableMinutes
   *
   * @param billableMinutes
   */
  public void setBillableMinutes(BillableEncodingMinutesDetails billableMinutes) {
    this.billableMinutes = billableMinutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableEncodingMinutes billableEncodingMinutes = (BillableEncodingMinutes) o;
    return Objects.equals(this.encodingMode, billableEncodingMinutes.encodingMode) &&
        Objects.equals(this.codec, billableEncodingMinutes.codec) &&
        Objects.equals(this.perTitleResultStream, billableEncodingMinutes.perTitleResultStream) &&
        Objects.equals(this.psnrMode, billableEncodingMinutes.psnrMode) &&
        Objects.equals(this.preset, billableEncodingMinutes.preset) &&
        Objects.equals(this.live, billableEncodingMinutes.live) &&
        Objects.equals(this.enhancedDeinterlace, billableEncodingMinutes.enhancedDeinterlace) &&
        Objects.equals(this.billableMinutes, billableEncodingMinutes.billableMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodingMode, codec, perTitleResultStream, psnrMode, preset, live, enhancedDeinterlace, billableMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableEncodingMinutes {\n");
    
    sb.append("    encodingMode: ").append(toIndentedString(encodingMode)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    perTitleResultStream: ").append(toIndentedString(perTitleResultStream)).append("\n");
    sb.append("    psnrMode: ").append(toIndentedString(psnrMode)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    enhancedDeinterlace: ").append(toIndentedString(enhancedDeinterlace)).append("\n");
    sb.append("    billableMinutes: ").append(toIndentedString(billableMinutes)).append("\n");
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


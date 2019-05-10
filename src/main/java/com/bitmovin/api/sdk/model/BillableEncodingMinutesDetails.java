package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * BillableEncodingMinutesDetails
 */

public class BillableEncodingMinutesDetails {
  @JsonProperty("UNKNOWN")
  private Double UNKNOWN;

  @JsonProperty("AUDIO")
  private Double AUDIO;

  @JsonProperty("SD")
  private Double SD;

  @JsonProperty("HD")
  private Double HD;

  @JsonProperty("UHD")
  private Double UHD;


  /**
   * Only set if resolution information is not present.
   * @return UNKNOWN
   */
  public Double getUNKNOWN() {
    return UNKNOWN;
  }

  public void setUNKNOWN(Double UNKNOWN) {
    this.UNKNOWN = UNKNOWN;
  }


  /**
   * Billable minutes for audio. Available if stream is an audio stream.
   * @return AUDIO
   */
  public Double getAUDIO() {
    return AUDIO;
  }

  public void setAUDIO(Double AUDIO) {
    this.AUDIO = AUDIO;
  }


  /**
   * Billable minutes for SD resolutions.
   * @return SD
   */
  public Double getSD() {
    return SD;
  }

  public void setSD(Double SD) {
    this.SD = SD;
  }


  /**
   * Billable minutes for HD resolutions.
   * @return HD
   */
  public Double getHD() {
    return HD;
  }

  public void setHD(Double HD) {
    this.HD = HD;
  }


  /**
   * Billable minutes for UHD resolutions.
   * @return UHD
   */
  public Double getUHD() {
    return UHD;
  }

  public void setUHD(Double UHD) {
    this.UHD = UHD;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillableEncodingMinutesDetails billableEncodingMinutesDetails = (BillableEncodingMinutesDetails) o;
    return Objects.equals(this.UNKNOWN, billableEncodingMinutesDetails.UNKNOWN) &&
        Objects.equals(this.AUDIO, billableEncodingMinutesDetails.AUDIO) &&
        Objects.equals(this.SD, billableEncodingMinutesDetails.SD) &&
        Objects.equals(this.HD, billableEncodingMinutesDetails.HD) &&
        Objects.equals(this.UHD, billableEncodingMinutesDetails.UHD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UNKNOWN, AUDIO, SD, HD, UHD);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableEncodingMinutesDetails {\n");
    
    sb.append("    UNKNOWN: ").append(toIndentedString(UNKNOWN)).append("\n");
    sb.append("    AUDIO: ").append(toIndentedString(AUDIO)).append("\n");
    sb.append("    SD: ").append(toIndentedString(SD)).append("\n");
    sb.append("    HD: ").append(toIndentedString(HD)).append("\n");
    sb.append("    UHD: ").append(toIndentedString(UHD)).append("\n");
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


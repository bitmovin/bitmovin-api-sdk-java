package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * PccReportView
 */

public class PccReportView {
  @JsonProperty("device")
  private String device;

  @JsonProperty("codec")
  private String codec;

  @JsonProperty("hdrOnly")
  private Boolean hdrOnly;

  @JsonProperty("reportedOnly")
  private Boolean reportedOnly;

  @JsonProperty("includePrerelease")
  private Boolean includePrerelease;


  /**
   * Effective trimmed lowercase substring matched against the published device name and qualifier. Empty means all devices. (required)
   * @return device
   */
  public String getDevice() {
    return device;
  }

  /**
   * Effective trimmed lowercase substring matched against the published device name and qualifier. Empty means all devices. (required)
   *
   * @param device
   *        Effective trimmed lowercase substring matched against the published device name and qualifier. Empty means all devices. (required)
   */
  public void setDevice(String device) {
    this.device = device;
  }


  /**
   * Effective trimmed lowercase substring matched against codec identifiers. Empty means all codecs. (required)
   * @return codec
   */
  public String getCodec() {
    return codec;
  }

  /**
   * Effective trimmed lowercase substring matched against codec identifiers. Empty means all codecs. (required)
   *
   * @param codec
   *        Effective trimmed lowercase substring matched against codec identifiers. Empty means all codecs. (required)
   */
  public void setCodec(String codec) {
    this.codec = codec;
  }


  /**
   * Whether only HDR columns are selected. (required)
   * @return hdrOnly
   */
  public Boolean getHdrOnly() {
    return hdrOnly;
  }

  /**
   * Whether only HDR columns are selected. (required)
   *
   * @param hdrOnly
   *        Whether only HDR columns are selected. (required)
   */
  public void setHdrOnly(Boolean hdrOnly) {
    this.hdrOnly = hdrOnly;
  }


  /**
   * Whether pools need at least one selected cell answering about the device. (required)
   * @return reportedOnly
   */
  public Boolean getReportedOnly() {
    return reportedOnly;
  }

  /**
   * Whether pools need at least one selected cell answering about the device. (required)
   *
   * @param reportedOnly
   *        Whether pools need at least one selected cell answering about the device. (required)
   */
  public void setReportedOnly(Boolean reportedOnly) {
    this.reportedOnly = reportedOnly;
  }


  /**
   * Whether pools with only prerelease browser evidence are included. (required)
   * @return includePrerelease
   */
  public Boolean getIncludePrerelease() {
    return includePrerelease;
  }

  /**
   * Whether pools with only prerelease browser evidence are included. (required)
   *
   * @param includePrerelease
   *        Whether pools with only prerelease browser evidence are included. (required)
   */
  public void setIncludePrerelease(Boolean includePrerelease) {
    this.includePrerelease = includePrerelease;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PccReportView pccReportView = (PccReportView) o;
    return Objects.equals(this.device, pccReportView.device) &&
        Objects.equals(this.codec, pccReportView.codec) &&
        Objects.equals(this.hdrOnly, pccReportView.hdrOnly) &&
        Objects.equals(this.reportedOnly, pccReportView.reportedOnly) &&
        Objects.equals(this.includePrerelease, pccReportView.includePrerelease);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, codec, hdrOnly, reportedOnly, includePrerelease);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PccReportView {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    hdrOnly: ").append(toIndentedString(hdrOnly)).append("\n");
    sb.append("    reportedOnly: ").append(toIndentedString(reportedOnly)).append("\n");
    sb.append("    includePrerelease: ").append(toIndentedString(includePrerelease)).append("\n");
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


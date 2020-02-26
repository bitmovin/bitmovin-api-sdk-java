package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BillableEncodingFeatureMinutes;
import com.bitmovin.api.sdk.model.BillableEncodingMinutes;
import com.bitmovin.api.sdk.model.EgressInformation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * DailyStatistics
 */

public class DailyStatistics {
  @JsonProperty("date")
  @com.fasterxml.jackson.annotation.JsonFormat
        (shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date date;

  @JsonProperty("bytesEncoded")
  private Long bytesEncoded;

  @JsonProperty("timeEncoded")
  private Long timeEncoded;

  @JsonProperty("billableMinutes")
  private Double billableMinutes;

  @JsonProperty("label")
  private String label;

  @JsonProperty("billableEncodingMinutes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BillableEncodingMinutes> billableEncodingMinutes = new ArrayList<BillableEncodingMinutes>();

  @JsonProperty("billableTransmuxingMinutes")
  private Double billableTransmuxingMinutes;

  @JsonProperty("billableFeatureMinutes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BillableEncodingFeatureMinutes> billableFeatureMinutes = new ArrayList<BillableEncodingFeatureMinutes>();

  @JsonProperty("billableEgressBytes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EgressInformation> billableEgressBytes = new ArrayList<EgressInformation>();


  /**
   * Date for the shown data. Format: yyyy-MM-dd (required)
   * @return date
   */
  public Date getDate() {
    return date;
  }

  /**
   * Date for the shown data. Format: yyyy-MM-dd (required)
   *
   * @param date
   *        Date for the shown data. Format: yyyy-MM-dd (required)
   */
  public void setDate(Date date) {
    this.date = date;
  }


  /**
   * Bytes encoded. (required)
   * @return bytesEncoded
   */
  public Long getBytesEncoded() {
    return bytesEncoded;
  }

  /**
   * Bytes encoded. (required)
   *
   * @param bytesEncoded
   *        Bytes encoded. (required)
   */
  public void setBytesEncoded(Long bytesEncoded) {
    this.bytesEncoded = bytesEncoded;
  }


  /**
   * Time in seconds encoded for this day. (required)
   * @return timeEncoded
   */
  public Long getTimeEncoded() {
    return timeEncoded;
  }

  /**
   * Time in seconds encoded for this day. (required)
   *
   * @param timeEncoded
   *        Time in seconds encoded for this day. (required)
   */
  public void setTimeEncoded(Long timeEncoded) {
    this.timeEncoded = timeEncoded;
  }


  /**
   * The billable minutes.
   * @return billableMinutes
   */
  public Double getBillableMinutes() {
    return billableMinutes;
  }

  /**
   * The billable minutes.
   *
   * @param billableMinutes
   *        The billable minutes.
   */
  public void setBillableMinutes(Double billableMinutes) {
    this.billableMinutes = billableMinutes;
  }


  /**
   * Label identifier.
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Label identifier.
   *
   * @param label
   *        Label identifier.
   */
  public void setLabel(String label) {
    this.label = label;
  }

  /**
   * Billable minutes for each encoding configuration.
   * @return billableEncodingMinutes
   */
  public List<BillableEncodingMinutes> getBillableEncodingMinutes() {
    return billableEncodingMinutes;
  }


  /**
   * Billable minutes for muxings.
   * @return billableTransmuxingMinutes
   */
  public Double getBillableTransmuxingMinutes() {
    return billableTransmuxingMinutes;
  }

  /**
   * Billable minutes for muxings.
   *
   * @param billableTransmuxingMinutes
   *        Billable minutes for muxings.
   */
  public void setBillableTransmuxingMinutes(Double billableTransmuxingMinutes) {
    this.billableTransmuxingMinutes = billableTransmuxingMinutes;
  }

  /**
   * Billable minutes for features
   * @return billableFeatureMinutes
   */
  public List<BillableEncodingFeatureMinutes> getBillableFeatureMinutes() {
    return billableFeatureMinutes;
  }

  /**
   * Get billableEgressBytes
   * @return billableEgressBytes
   */
  public List<EgressInformation> getBillableEgressBytes() {
    return billableEgressBytes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyStatistics dailyStatistics = (DailyStatistics) o;
    return Objects.equals(this.date, dailyStatistics.date) &&
        Objects.equals(this.bytesEncoded, dailyStatistics.bytesEncoded) &&
        Objects.equals(this.timeEncoded, dailyStatistics.timeEncoded) &&
        Objects.equals(this.billableMinutes, dailyStatistics.billableMinutes) &&
        Objects.equals(this.label, dailyStatistics.label) &&
        Objects.equals(this.billableEncodingMinutes, dailyStatistics.billableEncodingMinutes) &&
        Objects.equals(this.billableTransmuxingMinutes, dailyStatistics.billableTransmuxingMinutes) &&
        Objects.equals(this.billableFeatureMinutes, dailyStatistics.billableFeatureMinutes) &&
        Objects.equals(this.billableEgressBytes, dailyStatistics.billableEgressBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, bytesEncoded, timeEncoded, billableMinutes, label, billableEncodingMinutes, billableTransmuxingMinutes, billableFeatureMinutes, billableEgressBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyStatistics {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    bytesEncoded: ").append(toIndentedString(bytesEncoded)).append("\n");
    sb.append("    timeEncoded: ").append(toIndentedString(timeEncoded)).append("\n");
    sb.append("    billableMinutes: ").append(toIndentedString(billableMinutes)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    billableEncodingMinutes: ").append(toIndentedString(billableEncodingMinutes)).append("\n");
    sb.append("    billableTransmuxingMinutes: ").append(toIndentedString(billableTransmuxingMinutes)).append("\n");
    sb.append("    billableFeatureMinutes: ").append(toIndentedString(billableFeatureMinutes)).append("\n");
    sb.append("    billableEgressBytes: ").append(toIndentedString(billableEgressBytes)).append("\n");
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


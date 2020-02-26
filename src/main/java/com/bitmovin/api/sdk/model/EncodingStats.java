package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.BillableEncodingFeatureMinutes;
import com.bitmovin.api.sdk.model.BillableEncodingMinutes;
import com.bitmovin.api.sdk.model.EgressInformation;
import com.bitmovin.api.sdk.model.StatisticsPerMuxing;
import com.bitmovin.api.sdk.model.StatisticsPerStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * EncodingStats
 */

public class EncodingStats {
  @JsonProperty("date")
  @com.fasterxml.jackson.annotation.JsonFormat
        (shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date date;

  @JsonProperty("encodingId")
  private String encodingId;

  @JsonProperty("bytesEncoded")
  private Long bytesEncoded;

  @JsonProperty("timeEncoded")
  private Long timeEncoded;

  @JsonProperty("downloadedSize")
  private Long downloadedSize;

  @JsonProperty("billableMinutes")
  private Double billableMinutes;

  @JsonProperty("billableEgressBytes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<EgressInformation> billableEgressBytes = new ArrayList<EgressInformation>();

  @JsonProperty("billableEncodingMinutes")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BillableEncodingMinutes> billableEncodingMinutes = new ArrayList<BillableEncodingMinutes>();

  @JsonProperty("billableTransmuxingMinutes")
  private Double billableTransmuxingMinutes;

  @JsonProperty("billableFeatureMinutes")
  private Double billableFeatureMinutes;

  @JsonProperty("streams")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StatisticsPerStream> streams = new ArrayList<StatisticsPerStream>();

  @JsonProperty("muxings")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<StatisticsPerMuxing> muxings = new ArrayList<StatisticsPerMuxing>();

  @JsonProperty("features")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<BillableEncodingFeatureMinutes> features = new ArrayList<BillableEncodingFeatureMinutes>();

  /**
   * Date, format. yyyy-MM-dd
   * @return date
   */
  public Date getDate() {
    return date;
  }

  /**
   * The id of the encoding (required)
   * @return encodingId
   */
  public String getEncodingId() {
    return encodingId;
  }

  /**
   * Total bytes encoded
   * @return bytesEncoded
   */
  public Long getBytesEncoded() {
    return bytesEncoded;
  }

  /**
   * Total time encoded
   * @return timeEncoded
   */
  public Long getTimeEncoded() {
    return timeEncoded;
  }

  /**
   * Downloaded size of the input file
   * @return downloadedSize
   */
  public Long getDownloadedSize() {
    return downloadedSize;
  }

  /**
   * Billable minutes
   * @return billableMinutes
   */
  public Double getBillableMinutes() {
    return billableMinutes;
  }

  /**
   * Billable egress output
   * @return billableEgressBytes
   */
  public List<EgressInformation> getBillableEgressBytes() {
    return billableEgressBytes;
  }

  /**
   * Detailed statistics per stream
   * @return billableEncodingMinutes
   */
  public List<BillableEncodingMinutes> getBillableEncodingMinutes() {
    return billableEncodingMinutes;
  }

  /**
   * Billable transmuxing minutes (required)
   * @return billableTransmuxingMinutes
   */
  public Double getBillableTransmuxingMinutes() {
    return billableTransmuxingMinutes;
  }

  /**
   * Billable feature minutes
   * @return billableFeatureMinutes
   */
  public Double getBillableFeatureMinutes() {
    return billableFeatureMinutes;
  }

  /**
   * Detailed statistics per stream (required)
   * @return streams
   */
  public List<StatisticsPerStream> getStreams() {
    return streams;
  }

  /**
   * Detailed statistics per muxing (required)
   * @return muxings
   */
  public List<StatisticsPerMuxing> getMuxings() {
    return muxings;
  }

  /**
   * Detailed statistics per feature
   * @return features
   */
  public List<BillableEncodingFeatureMinutes> getFeatures() {
    return features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncodingStats encodingStats = (EncodingStats) o;
    return Objects.equals(this.date, encodingStats.date) &&
        Objects.equals(this.encodingId, encodingStats.encodingId) &&
        Objects.equals(this.bytesEncoded, encodingStats.bytesEncoded) &&
        Objects.equals(this.timeEncoded, encodingStats.timeEncoded) &&
        Objects.equals(this.downloadedSize, encodingStats.downloadedSize) &&
        Objects.equals(this.billableMinutes, encodingStats.billableMinutes) &&
        Objects.equals(this.billableEgressBytes, encodingStats.billableEgressBytes) &&
        Objects.equals(this.billableEncodingMinutes, encodingStats.billableEncodingMinutes) &&
        Objects.equals(this.billableTransmuxingMinutes, encodingStats.billableTransmuxingMinutes) &&
        Objects.equals(this.billableFeatureMinutes, encodingStats.billableFeatureMinutes) &&
        Objects.equals(this.streams, encodingStats.streams) &&
        Objects.equals(this.muxings, encodingStats.muxings) &&
        Objects.equals(this.features, encodingStats.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, encodingId, bytesEncoded, timeEncoded, downloadedSize, billableMinutes, billableEgressBytes, billableEncodingMinutes, billableTransmuxingMinutes, billableFeatureMinutes, streams, muxings, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncodingStats {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    encodingId: ").append(toIndentedString(encodingId)).append("\n");
    sb.append("    bytesEncoded: ").append(toIndentedString(bytesEncoded)).append("\n");
    sb.append("    timeEncoded: ").append(toIndentedString(timeEncoded)).append("\n");
    sb.append("    downloadedSize: ").append(toIndentedString(downloadedSize)).append("\n");
    sb.append("    billableMinutes: ").append(toIndentedString(billableMinutes)).append("\n");
    sb.append("    billableEgressBytes: ").append(toIndentedString(billableEgressBytes)).append("\n");
    sb.append("    billableEncodingMinutes: ").append(toIndentedString(billableEncodingMinutes)).append("\n");
    sb.append("    billableTransmuxingMinutes: ").append(toIndentedString(billableTransmuxingMinutes)).append("\n");
    sb.append("    billableFeatureMinutes: ").append(toIndentedString(billableFeatureMinutes)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    muxings: ").append(toIndentedString(muxings)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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


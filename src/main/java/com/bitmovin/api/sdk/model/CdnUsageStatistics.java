package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.CdnUsage;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CdnUsageStatistics
 */

public class CdnUsageStatistics {
  @JsonProperty("from")
  private Date from;

  @JsonProperty("to")
  private Date to;

  @JsonProperty("storageUsageTotal")
  private Double storageUsageTotal;

  @JsonProperty("transferUsageTotal")
  private Double transferUsageTotal;

  @JsonProperty("usage")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<CdnUsage> usage = new ArrayList<CdnUsage>();

  /**
   * UTC timestamp which marks the beginning of the time period for which the usage statistics are retrieved.
   * @return from
   */
  public Date getFrom() {
    return from;
  }

  /**
   * UTC timestamp which marks the end of the time period for which the usage statistics are retrieved. The end date is exclusive. For example, if end is 2019-03-28T13:05:00Z, the cost and usage data are retrieved from the start date up to, but not including, 2019-03-28T13:05:00Z.
   * @return to
   */
  public Date getTo() {
    return to;
  }

  /**
   * Total storage usage in GB per month.
   * @return storageUsageTotal
   */
  public Double getStorageUsageTotal() {
    return storageUsageTotal;
  }

  /**
   * Total transfer usage in GB.
   * @return transferUsageTotal
   */
  public Double getTransferUsageTotal() {
    return transferUsageTotal;
  }


  public CdnUsageStatistics addUsageItem(CdnUsage usageItem) {
    this.usage.add(usageItem);
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  public List<CdnUsage> getUsage() {
    return usage;
  }

  /**
   * Set usage
   *
   * @param usage
   */
  public void setUsage(List<CdnUsage> usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdnUsageStatistics cdnUsageStatistics = (CdnUsageStatistics) o;
    return Objects.equals(this.from, cdnUsageStatistics.from) &&
        Objects.equals(this.to, cdnUsageStatistics.to) &&
        Objects.equals(this.storageUsageTotal, cdnUsageStatistics.storageUsageTotal) &&
        Objects.equals(this.transferUsageTotal, cdnUsageStatistics.transferUsageTotal) &&
        Objects.equals(this.usage, cdnUsageStatistics.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, storageUsageTotal, transferUsageTotal, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdnUsageStatistics {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    storageUsageTotal: ").append(toIndentedString(storageUsageTotal)).append("\n");
    sb.append("    transferUsageTotal: ").append(toIndentedString(transferUsageTotal)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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


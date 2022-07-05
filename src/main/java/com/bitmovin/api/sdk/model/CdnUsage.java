package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * CdnUsage
 */

public class CdnUsage {
  @JsonProperty("from")
  private Date from;

  @JsonProperty("to")
  private Date to;

  @JsonProperty("storageUsage")
  private Double storageUsage;

  @JsonProperty("transferUsage")
  private Double transferUsage;

  /**
   * UTC timestamp which marks the beginning of the time period for which the usage statistics are retrieved.
   * @return from
   */
  public Date getFrom() {
    return from;
  }

  /**
   * UTC timestamp which marks the end of the time period for which the usage statistics are retrieved. The end date is exclusive. For example, if end is 2019-03-29T13:05:00Z, the cost and usage data are retrieved from the start date up to, but not including, 2019-03-29T13:05:00Z.
   * @return to
   */
  public Date getTo() {
    return to;
  }

  /**
   * Storage usage in GB per month.
   * @return storageUsage
   */
  public Double getStorageUsage() {
    return storageUsage;
  }

  /**
   * Transfer usage in GB.
   * @return transferUsage
   */
  public Double getTransferUsage() {
    return transferUsage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdnUsage cdnUsage = (CdnUsage) o;
    return Objects.equals(this.from, cdnUsage.from) &&
        Objects.equals(this.to, cdnUsage.to) &&
        Objects.equals(this.storageUsage, cdnUsage.storageUsage) &&
        Objects.equals(this.transferUsage, cdnUsage.transferUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, storageUsage, transferUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdnUsage {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    storageUsage: ").append(toIndentedString(storageUsage)).append("\n");
    sb.append("    transferUsage: ").append(toIndentedString(transferUsage)).append("\n");
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


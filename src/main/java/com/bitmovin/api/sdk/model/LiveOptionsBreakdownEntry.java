package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveOptionsEntry;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveOptionsBreakdownEntry
 */

public class LiveOptionsBreakdownEntry {
  @JsonProperty("date")
  @com.fasterxml.jackson.annotation.JsonFormat
        (shape = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private Date date;

  @JsonProperty("hd")
  private LiveOptionsEntry hd;

  /**
   * Date, format: yyyy-MM-dd (required)
   * @return date
   */
  public Date getDate() {
    return date;
  }


  /**
   * Get hd
   * @return hd
   */
  public LiveOptionsEntry getHd() {
    return hd;
  }

  /**
   * Set hd
   *
   * @param hd
   */
  public void setHd(LiveOptionsEntry hd) {
    this.hd = hd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveOptionsBreakdownEntry liveOptionsBreakdownEntry = (LiveOptionsBreakdownEntry) o;
    return Objects.equals(this.date, liveOptionsBreakdownEntry.date) &&
        Objects.equals(this.hd, liveOptionsBreakdownEntry.hd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveOptionsBreakdownEntry {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    hd: ").append(toIndentedString(hd)).append("\n");
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


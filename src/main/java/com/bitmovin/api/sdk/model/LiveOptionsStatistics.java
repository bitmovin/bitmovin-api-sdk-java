package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveOptionsBreakdownEntry;
import com.bitmovin.api.sdk.model.LiveOptionsSummary;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveOptionsStatistics
 */

public class LiveOptionsStatistics {
  @JsonProperty("summary")
  private LiveOptionsSummary summary;

  @JsonProperty("breakdown")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<LiveOptionsBreakdownEntry> breakdown = new ArrayList<LiveOptionsBreakdownEntry>();


  /**
   * Get summary
   * @return summary
   */
  public LiveOptionsSummary getSummary() {
    return summary;
  }

  /**
   * Set summary
   *
   * @param summary
   */
  public void setSummary(LiveOptionsSummary summary) {
    this.summary = summary;
  }


  public LiveOptionsStatistics addBreakdownItem(LiveOptionsBreakdownEntry breakdownItem) {
    this.breakdown.add(breakdownItem);
    return this;
  }

  /**
   * Live options statistics aggregated per day (required)
   * @return breakdown
   */
  public List<LiveOptionsBreakdownEntry> getBreakdown() {
    return breakdown;
  }

  /**
   * Live options statistics aggregated per day (required)
   *
   * @param breakdown
   *        Live options statistics aggregated per day (required)
   */
  public void setBreakdown(List<LiveOptionsBreakdownEntry> breakdown) {
    this.breakdown = breakdown;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveOptionsStatistics liveOptionsStatistics = (LiveOptionsStatistics) o;
    return Objects.equals(this.summary, liveOptionsStatistics.summary) &&
        Objects.equals(this.breakdown, liveOptionsStatistics.breakdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, breakdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveOptionsStatistics {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
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


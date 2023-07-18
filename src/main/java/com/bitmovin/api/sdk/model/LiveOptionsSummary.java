package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.LiveOptionsEntry;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveOptionsSummary
 */

public class LiveOptionsSummary {
  @JsonProperty("hd")
  private LiveOptionsEntry hd;


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
    LiveOptionsSummary liveOptionsSummary = (LiveOptionsSummary) o;
    return Objects.equals(this.hd, liveOptionsSummary.hd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveOptionsSummary {\n");
    
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


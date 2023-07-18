package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * LiveOptionsEntry
 */

public class LiveOptionsEntry {
  @JsonProperty("unitsUsed")
  private Long unitsUsed;

  /**
   * Live option units used (required)
   * @return unitsUsed
   */
  public Long getUnitsUsed() {
    return unitsUsed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveOptionsEntry liveOptionsEntry = (LiveOptionsEntry) o;
    return Objects.equals(this.unitsUsed, liveOptionsEntry.unitsUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitsUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveOptionsEntry {\n");
    
    sb.append("    unitsUsed: ").append(toIndentedString(unitsUsed)).append("\n");
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


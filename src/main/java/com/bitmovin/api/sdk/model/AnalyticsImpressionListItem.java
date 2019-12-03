package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsImpressionListItem
 */

public class AnalyticsImpressionListItem {
  @JsonProperty("impressionId")
  private String impressionId;


  /**
   * Impression ID (required)
   * @return impressionId
   */
  public String getImpressionId() {
    return impressionId;
  }

  /**
   * Impression ID (required)
   *
   * @param impressionId
   *        Impression ID (required)
   */
  public void setImpressionId(String impressionId) {
    this.impressionId = impressionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsImpressionListItem analyticsImpressionListItem = (AnalyticsImpressionListItem) o;
    return Objects.equals(this.impressionId, analyticsImpressionListItem.impressionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impressionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsImpressionListItem {\n");
    
    sb.append("    impressionId: ").append(toIndentedString(impressionId)).append("\n");
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


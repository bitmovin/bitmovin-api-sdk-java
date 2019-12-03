package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsImpressionListItem;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsImpressionsResponse
 */

public class AnalyticsImpressionsResponse {
  @JsonProperty("impressions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsImpressionListItem> impressions = new ArrayList<AnalyticsImpressionListItem>();


  public AnalyticsImpressionsResponse addImpressionsItem(AnalyticsImpressionListItem impressionsItem) {
    this.impressions.add(impressionsItem);
    return this;
  }

  /**
   * Get impressions
   * @return impressions
   */
  public List<AnalyticsImpressionListItem> getImpressions() {
    return impressions;
  }

  /**
   * Set impressions
   *
   * @param impressions
   */
  public void setImpressions(List<AnalyticsImpressionListItem> impressions) {
    this.impressions = impressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsImpressionsResponse analyticsImpressionsResponse = (AnalyticsImpressionsResponse) o;
    return Objects.equals(this.impressions, analyticsImpressionsResponse.impressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(impressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsImpressionsResponse {\n");
    
    sb.append("    impressions: ").append(toIndentedString(impressions)).append("\n");
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


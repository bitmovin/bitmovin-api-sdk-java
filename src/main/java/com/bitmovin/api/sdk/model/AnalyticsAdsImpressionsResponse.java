package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsAdsImpressionSample;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAdsImpressionsResponse
 */

public class AnalyticsAdsImpressionsResponse {
  @JsonProperty("adsImpressions")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsAdsImpressionSample> adsImpressions = new ArrayList<AnalyticsAdsImpressionSample>();


  public AnalyticsAdsImpressionsResponse addAdsImpressionsItem(AnalyticsAdsImpressionSample adsImpressionsItem) {
    this.adsImpressions.add(adsImpressionsItem);
    return this;
  }

  /**
   * Get adsImpressions
   * @return adsImpressions
   */
  public List<AnalyticsAdsImpressionSample> getAdsImpressions() {
    return adsImpressions;
  }

  /**
   * Set adsImpressions
   *
   * @param adsImpressions
   */
  public void setAdsImpressions(List<AnalyticsAdsImpressionSample> adsImpressions) {
    this.adsImpressions = adsImpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAdsImpressionsResponse analyticsAdsImpressionsResponse = (AnalyticsAdsImpressionsResponse) o;
    return Objects.equals(this.adsImpressions, analyticsAdsImpressionsResponse.adsImpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adsImpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAdsImpressionsResponse {\n");
    
    sb.append("    adsImpressions: ").append(toIndentedString(adsImpressions)).append("\n");
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


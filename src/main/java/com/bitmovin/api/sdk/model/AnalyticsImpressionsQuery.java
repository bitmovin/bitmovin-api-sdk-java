package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsAbstractFilter;
import com.bitmovin.api.sdk.model.AnalyticsQueryTimeframe;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsImpressionsQuery
 */

public class AnalyticsImpressionsQuery extends AnalyticsQueryTimeframe {
  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("filters")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsAbstractFilter> filters = new ArrayList<AnalyticsAbstractFilter>();

  @JsonProperty("limit")
  private Integer limit;


  /**
   * Analytics license key (required)
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * Analytics license key (required)
   *
   * @param licenseKey
   *        Analytics license key (required)
   */
  public void setLicenseKey(String licenseKey) {
    this.licenseKey = licenseKey;
  }


  public AnalyticsImpressionsQuery addFiltersItem(AnalyticsAbstractFilter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Analytics Query Filters  Each filter requires 3 properties: name, operator and value.  Valid operators are [IN, EQ, NE, LT, LTE, GT, GTE, CONTAINS, NOTCONTAINS] 
   * @return filters
   */
  public List<AnalyticsAbstractFilter> getFilters() {
    return filters;
  }

  /**
   * Analytics Query Filters  Each filter requires 3 properties: name, operator and value.  Valid operators are [IN, EQ, NE, LT, LTE, GT, GTE, CONTAINS, NOTCONTAINS] 
   *
   * @param filters
   *        Analytics Query Filters  Each filter requires 3 properties: name, operator and value.  Valid operators are [IN, EQ, NE, LT, LTE, GT, GTE, CONTAINS, NOTCONTAINS] 
   */
  public void setFilters(List<AnalyticsAbstractFilter> filters) {
    this.filters = filters;
  }


  /**
   * Number of returned impressions
   * @return limit
   */
  public Integer getLimit() {
    return limit;
  }

  /**
   * Number of returned impressions
   *
   * @param limit
   *        Number of returned impressions
   */
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsImpressionsQuery analyticsImpressionsQuery = (AnalyticsImpressionsQuery) o;
    return Objects.equals(this.licenseKey, analyticsImpressionsQuery.licenseKey) &&
        Objects.equals(this.filters, analyticsImpressionsQuery.filters) &&
        Objects.equals(this.limit, analyticsImpressionsQuery.limit) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseKey, filters, limit, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsImpressionsQuery {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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


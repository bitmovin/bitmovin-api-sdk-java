package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsFilter;
import com.bitmovin.api.sdk.model.AnalyticsInterval;
import com.bitmovin.api.sdk.model.AnalyticsOrderByEntry;
import com.bitmovin.api.sdk.model.AnalyticsQueryTimeframe;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsQueryRequest
 */

public class AnalyticsQueryRequest extends AnalyticsQueryTimeframe {
  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("filters")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsFilter> filters = new ArrayList<AnalyticsFilter>();

  @JsonProperty("orderBy")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsOrderByEntry> orderBy = new ArrayList<AnalyticsOrderByEntry>();

  @JsonProperty("dimension")
  private String dimension;

  @JsonProperty("interval")
  private AnalyticsInterval interval;

  @JsonProperty("groupBy")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<String> groupBy = new ArrayList<String>();

  @JsonProperty("limit")
  private Long limit;

  @JsonProperty("offset")
  private Long offset;


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


  public AnalyticsQueryRequest addFiltersItem(AnalyticsFilter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  public List<AnalyticsFilter> getFilters() {
    return filters;
  }

  /**
   * Set filters
   *
   * @param filters
   */
  public void setFilters(List<AnalyticsFilter> filters) {
    this.filters = filters;
  }


  public AnalyticsQueryRequest addOrderByItem(AnalyticsOrderByEntry orderByItem) {
    this.orderBy.add(orderByItem);
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
   */
  public List<AnalyticsOrderByEntry> getOrderBy() {
    return orderBy;
  }

  /**
   * Set orderBy
   *
   * @param orderBy
   */
  public void setOrderBy(List<AnalyticsOrderByEntry> orderBy) {
    this.orderBy = orderBy;
  }


  /**
   * Get dimension
   * @return dimension
   */
  public String getDimension() {
    return dimension;
  }

  /**
   * Set dimension
   *
   * @param dimension
   */
  public void setDimension(String dimension) {
    this.dimension = dimension;
  }


  /**
   * Get interval
   * @return interval
   */
  public AnalyticsInterval getInterval() {
    return interval;
  }

  /**
   * Set interval
   *
   * @param interval
   */
  public void setInterval(AnalyticsInterval interval) {
    this.interval = interval;
  }


  public AnalyticsQueryRequest addGroupByItem(String groupByItem) {
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Get groupBy
   * @return groupBy
   */
  public List<String> getGroupBy() {
    return groupBy;
  }

  /**
   * Set groupBy
   *
   * @param groupBy
   */
  public void setGroupBy(List<String> groupBy) {
    this.groupBy = groupBy;
  }


  /**
   * Maximum number of rows returned (max. 200)
   * @return limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Maximum number of rows returned (max. 200)
   *
   * @param limit
   *        Maximum number of rows returned (max. 200)
   */
  public void setLimit(Long limit) {
    this.limit = limit;
  }


  /**
   * Offset of data
   * @return offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Offset of data
   *
   * @param offset
   *        Offset of data
   */
  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryRequest analyticsQueryRequest = (AnalyticsQueryRequest) o;
    return Objects.equals(this.licenseKey, analyticsQueryRequest.licenseKey) &&
        Objects.equals(this.filters, analyticsQueryRequest.filters) &&
        Objects.equals(this.orderBy, analyticsQueryRequest.orderBy) &&
        Objects.equals(this.dimension, analyticsQueryRequest.dimension) &&
        Objects.equals(this.interval, analyticsQueryRequest.interval) &&
        Objects.equals(this.groupBy, analyticsQueryRequest.groupBy) &&
        Objects.equals(this.limit, analyticsQueryRequest.limit) &&
        Objects.equals(this.offset, analyticsQueryRequest.offset) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseKey, filters, orderBy, dimension, interval, groupBy, limit, offset, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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


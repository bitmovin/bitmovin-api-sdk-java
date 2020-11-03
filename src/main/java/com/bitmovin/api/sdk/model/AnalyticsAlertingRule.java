package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsAbstractFilter;
import com.bitmovin.api.sdk.model.AnalyticsAlertingNotification;
import com.bitmovin.api.sdk.model.AnalyticsRuleMetric;
import com.bitmovin.api.sdk.model.AnalyticsThresholdRuleOptions;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAlertingRule
 */

public class AnalyticsAlertingRule {
  @JsonProperty("id")
  private String id;

  @JsonProperty("licenseKey")
  private String licenseKey;

  @JsonProperty("type")
  private String type;

  @JsonProperty("name")
  private String name;

  @JsonProperty("metric")
  private AnalyticsRuleMetric metric;

  @JsonProperty("filters")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<AnalyticsAbstractFilter> filters = new ArrayList<AnalyticsAbstractFilter>();

  @JsonProperty("options")
  private AnalyticsThresholdRuleOptions options;

  @JsonProperty("notification")
  private AnalyticsAlertingNotification notification;

  /**
   * The id of the alerting rule
   * @return id
   */
  public String getId() {
    return id;
  }

  /**
   * License key of the alerting rule
   * @return licenseKey
   */
  public String getLicenseKey() {
    return licenseKey;
  }

  /**
   * Type of alerting rule
   * @return type
   */
  public String getType() {
    return type;
  }


  /**
   * Alerting rule name (required)
   * @return name
   */
  public String getName() {
    return name;
  }

  /**
   * Alerting rule name (required)
   *
   * @param name
   *        Alerting rule name (required)
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Get metric
   * @return metric
   */
  public AnalyticsRuleMetric getMetric() {
    return metric;
  }

  /**
   * Set metric
   *
   * @param metric
   */
  public void setMetric(AnalyticsRuleMetric metric) {
    this.metric = metric;
  }


  public AnalyticsAlertingRule addFiltersItem(AnalyticsAbstractFilter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Get filters
   * @return filters
   */
  public List<AnalyticsAbstractFilter> getFilters() {
    return filters;
  }

  /**
   * Set filters
   *
   * @param filters
   */
  public void setFilters(List<AnalyticsAbstractFilter> filters) {
    this.filters = filters;
  }


  /**
   * Get options
   * @return options
   */
  public AnalyticsThresholdRuleOptions getOptions() {
    return options;
  }

  /**
   * Set options
   *
   * @param options
   */
  public void setOptions(AnalyticsThresholdRuleOptions options) {
    this.options = options;
  }


  /**
   * Get notification
   * @return notification
   */
  public AnalyticsAlertingNotification getNotification() {
    return notification;
  }

  /**
   * Set notification
   *
   * @param notification
   */
  public void setNotification(AnalyticsAlertingNotification notification) {
    this.notification = notification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAlertingRule analyticsAlertingRule = (AnalyticsAlertingRule) o;
    return Objects.equals(this.id, analyticsAlertingRule.id) &&
        Objects.equals(this.licenseKey, analyticsAlertingRule.licenseKey) &&
        Objects.equals(this.type, analyticsAlertingRule.type) &&
        Objects.equals(this.name, analyticsAlertingRule.name) &&
        Objects.equals(this.metric, analyticsAlertingRule.metric) &&
        Objects.equals(this.filters, analyticsAlertingRule.filters) &&
        Objects.equals(this.options, analyticsAlertingRule.options) &&
        Objects.equals(this.notification, analyticsAlertingRule.notification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, licenseKey, type, name, metric, filters, options, notification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAlertingRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    licenseKey: ").append(toIndentedString(licenseKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
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


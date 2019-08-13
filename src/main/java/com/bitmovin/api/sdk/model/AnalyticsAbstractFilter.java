package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AnalyticsAttribute;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsAbstractFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operator", visible = false)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AnalyticsInFilter.class, name = "IN"),
  @JsonSubTypes.Type(value = AnalyticsEqualFilter.class, name = "EQ"),
  @JsonSubTypes.Type(value = AnalyticsNotEqualFilter.class, name = "NE"),
  @JsonSubTypes.Type(value = AnalyticsLessThanFilter.class, name = "LT"),
  @JsonSubTypes.Type(value = AnalyticsLessThanOrEqualFilter.class, name = "LTE"),
  @JsonSubTypes.Type(value = AnalyticsGreaterThanFilter.class, name = "GT"),
  @JsonSubTypes.Type(value = AnalyticsGreaterThanOrEqualFilter.class, name = "GTE"),
  @JsonSubTypes.Type(value = AnalyticsContainsFilter.class, name = "CONTAINS"),
  @JsonSubTypes.Type(value = AnalyticsNotContainsFilter.class, name = "NOTCONTAINS"),
})

public class AnalyticsAbstractFilter {
  @JsonProperty("name")
  private AnalyticsAttribute name;


  /**
   * Get name
   * @return name
   */
  public AnalyticsAttribute getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(AnalyticsAttribute name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAbstractFilter analyticsAbstractFilter = (AnalyticsAbstractFilter) o;
    return Objects.equals(this.name, analyticsAbstractFilter.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsAbstractFilter {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


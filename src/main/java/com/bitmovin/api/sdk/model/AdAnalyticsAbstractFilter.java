package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdAnalyticsAttribute;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdAnalyticsAbstractFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operator", visible = false, defaultImpl = AdAnalyticsAbstractFilter.class)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AdAnalyticsInFilter.class, name = "IN"),
  @JsonSubTypes.Type(value = AdAnalyticsEqualFilter.class, name = "EQ"),
  @JsonSubTypes.Type(value = AdAnalyticsNotEqualFilter.class, name = "NE"),
  @JsonSubTypes.Type(value = AdAnalyticsLessThanFilter.class, name = "LT"),
  @JsonSubTypes.Type(value = AdAnalyticsLessThanOrEqualFilter.class, name = "LTE"),
  @JsonSubTypes.Type(value = AdAnalyticsGreaterThanFilter.class, name = "GT"),
  @JsonSubTypes.Type(value = AdAnalyticsGreaterThanOrEqualFilter.class, name = "GTE"),
  @JsonSubTypes.Type(value = AdAnalyticsContainsFilter.class, name = "CONTAINS"),
  @JsonSubTypes.Type(value = AdAnalyticsNotContainsFilter.class, name = "NOTCONTAINS"),
})

public class AdAnalyticsAbstractFilter {
  @JsonProperty("name")
  private AdAnalyticsAttribute name;


  /**
   * Get name
   * @return name
   */
  public AdAnalyticsAttribute getName() {
    return name;
  }

  /**
   * Set name
   *
   * @param name
   */
  public void setName(AdAnalyticsAttribute name) {
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
    AdAnalyticsAbstractFilter adAnalyticsAbstractFilter = (AdAnalyticsAbstractFilter) o;
    return Objects.equals(this.name, adAnalyticsAbstractFilter.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAnalyticsAbstractFilter {\n");
    
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


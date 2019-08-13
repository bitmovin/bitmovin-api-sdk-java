package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.AdAnalyticsAbstractFilter;
import com.bitmovin.api.sdk.model.AdAnalyticsAttribute;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AdAnalyticsInFilter
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operator", visible = false, defaultImpl = AdAnalyticsInFilter.class)
public class AdAnalyticsInFilter extends AdAnalyticsAbstractFilter {
  @JsonProperty("value")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<Object> value = new ArrayList<Object>();


  public AdAnalyticsInFilter addValueItem(Object valueItem) {
    this.value.add(valueItem);
    return this;
  }

  /**
   * Get value
   * @return value
   */
  public List<Object> getValue() {
    return value;
  }

  /**
   * Set value
   *
   * @param value
   */
  public void setValue(List<Object> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAnalyticsInFilter adAnalyticsInFilter = (AdAnalyticsInFilter) o;
    return Objects.equals(this.value, adAnalyticsInFilter.value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAnalyticsInFilter {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


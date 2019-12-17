package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AnalyticsContextDescription
 */

public class AnalyticsContextDescription {
  @JsonProperty("label")
  private String label;

  @JsonProperty("description")
  private String description;


  /**
   * Get label
   * @return label
   */
  public String getLabel() {
    return label;
  }

  /**
   * Set label
   *
   * @param label
   */
  public void setLabel(String label) {
    this.label = label;
  }


  /**
   * Get description
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Set description
   *
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsContextDescription analyticsContextDescription = (AnalyticsContextDescription) o;
    return Objects.equals(this.label, analyticsContextDescription.label) &&
        Objects.equals(this.description, analyticsContextDescription.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsContextDescription {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


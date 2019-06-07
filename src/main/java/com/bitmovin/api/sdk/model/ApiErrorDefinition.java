package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ApiErrorDefinition
 */

public class ApiErrorDefinition {
  @JsonProperty("code")
  private Long code;

  @JsonProperty("category")
  private String category;

  @JsonProperty("description")
  private String description;


  /**
   * The error code.
   * @return code
   */
  public Long getCode() {
    return code;
  }

  /**
   * The error code.
   *
   * @param code
   * The error code.
   */
  public void setCode(Long code) {
    this.code = code;
  }


  /**
   * The error category.
   * @return category
   */
  public String getCategory() {
    return category;
  }

  /**
   * The error category.
   *
   * @param category
   * The error category.
   */
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * The returned error description.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  /**
   * The returned error description.
   *
   * @param description
   * The returned error description.
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
    ApiErrorDefinition apiErrorDefinition = (ApiErrorDefinition) o;
    return Objects.equals(this.code, apiErrorDefinition.code) &&
        Objects.equals(this.category, apiErrorDefinition.category) &&
        Objects.equals(this.description, apiErrorDefinition.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, category, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiErrorDefinition {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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


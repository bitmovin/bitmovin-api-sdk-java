package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * SceneObject
 */

public class SceneObject {
  @JsonProperty("description")
  private String description;

  @JsonProperty("category")
  private String category;


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


  /**
   * Get category
   * @return category
   */
  public String getCategory() {
    return category;
  }

  /**
   * Set category
   *
   * @param category
   */
  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SceneObject sceneObject = (SceneObject) o;
    return Objects.equals(this.description, sceneObject.description) &&
        Objects.equals(this.category, sceneObject.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SceneObject {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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


package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Rating
 */

public class Rating {
  @JsonProperty("region")
  private String region;

  @JsonProperty("system")
  private String system;

  @JsonProperty("rating")
  private String rating;


  /**
   * Get region
   * @return region
   */
  public String getRegion() {
    return region;
  }

  /**
   * Set region
   *
   * @param region
   */
  public void setRegion(String region) {
    this.region = region;
  }


  /**
   * Get system
   * @return system
   */
  public String getSystem() {
    return system;
  }

  /**
   * Set system
   *
   * @param system
   */
  public void setSystem(String system) {
    this.system = system;
  }


  /**
   * Get rating
   * @return rating
   */
  public String getRating() {
    return rating;
  }

  /**
   * Set rating
   *
   * @param rating
   */
  public void setRating(String rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rating rating = (Rating) o;
    return Objects.equals(this.region, rating.region) &&
        Objects.equals(this.system, rating.system) &&
        Objects.equals(this.rating, rating.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, system, rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rating {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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


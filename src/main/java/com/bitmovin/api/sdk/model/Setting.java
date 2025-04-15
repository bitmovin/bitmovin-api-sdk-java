package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.Atmosphere;
import com.bitmovin.api.sdk.model.Location;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Setting
 */

public class Setting {
  @JsonProperty("location")
  private Location location;

  @JsonProperty("timeOfDay")
  private String timeOfDay;

  @JsonProperty("atmosphere")
  private Atmosphere atmosphere;


  /**
   * Get location
   * @return location
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Set location
   *
   * @param location
   */
  public void setLocation(Location location) {
    this.location = location;
  }


  /**
   * Get timeOfDay
   * @return timeOfDay
   */
  public String getTimeOfDay() {
    return timeOfDay;
  }

  /**
   * Set timeOfDay
   *
   * @param timeOfDay
   */
  public void setTimeOfDay(String timeOfDay) {
    this.timeOfDay = timeOfDay;
  }


  /**
   * Get atmosphere
   * @return atmosphere
   */
  public Atmosphere getAtmosphere() {
    return atmosphere;
  }

  /**
   * Set atmosphere
   *
   * @param atmosphere
   */
  public void setAtmosphere(Atmosphere atmosphere) {
    this.atmosphere = atmosphere;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Setting setting = (Setting) o;
    return Objects.equals(this.location, setting.location) &&
        Objects.equals(this.timeOfDay, setting.timeOfDay) &&
        Objects.equals(this.atmosphere, setting.atmosphere);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, timeOfDay, atmosphere);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Setting {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    atmosphere: ").append(toIndentedString(atmosphere)).append("\n");
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


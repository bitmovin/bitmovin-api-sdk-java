package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * AutomaticAdPlacementPosition
 */

public class AutomaticAdPlacementPosition {
  @JsonProperty("position")
  private Double position;

  @JsonProperty("maxDeviation")
  private Double maxDeviation;

  @JsonProperty("duration")
  private Double duration;


  /**
   * Position of the ad placement in seconds. (required)
   * @return position
   */
  public Double getPosition() {
    return position;
  }

  /**
   * Position of the ad placement in seconds. (required)
   *
   * @param position
   *        Position of the ad placement in seconds. (required)
   */
  public void setPosition(Double position) {
    this.position = position;
  }


  /**
   * Maximum deviation in seconds to the ad placement position. (required)
   * @return maxDeviation
   */
  public Double getMaxDeviation() {
    return maxDeviation;
  }

  /**
   * Maximum deviation in seconds to the ad placement position. (required)
   *
   * @param maxDeviation
   *        Maximum deviation in seconds to the ad placement position. (required)
   */
  public void setMaxDeviation(Double maxDeviation) {
    this.maxDeviation = maxDeviation;
  }


  /**
   * The desired duration in seconds of the ad to be inserted.
   * minimum: 0
   * @return duration
   */
  public Double getDuration() {
    return duration;
  }

  /**
   * The desired duration in seconds of the ad to be inserted.
   * minimum: 0
   *
   * @param duration
   *        The desired duration in seconds of the ad to be inserted.
   *        minimum: 0
   */
  public void setDuration(Double duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomaticAdPlacementPosition automaticAdPlacementPosition = (AutomaticAdPlacementPosition) o;
    return Objects.equals(this.position, automaticAdPlacementPosition.position) &&
        Objects.equals(this.maxDeviation, automaticAdPlacementPosition.maxDeviation) &&
        Objects.equals(this.duration, automaticAdPlacementPosition.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(position, maxDeviation, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomaticAdPlacementPosition {\n");
    
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    maxDeviation: ").append(toIndentedString(maxDeviation)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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


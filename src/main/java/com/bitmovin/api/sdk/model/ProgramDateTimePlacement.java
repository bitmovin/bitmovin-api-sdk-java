package com.bitmovin.api.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.bitmovin.api.sdk.model.ProgramDateTimePlacementMode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * ProgramDateTimePlacement
 */

public class ProgramDateTimePlacement {
  @JsonProperty("programDateTimePlacementMode")
  private ProgramDateTimePlacementMode programDateTimePlacementMode;

  @JsonProperty("interval")
  private Integer interval;


  /**
   * Get programDateTimePlacementMode
   * @return programDateTimePlacementMode
   */
  public ProgramDateTimePlacementMode getProgramDateTimePlacementMode() {
    return programDateTimePlacementMode;
  }

  /**
   * Set programDateTimePlacementMode
   *
   * @param programDateTimePlacementMode
   */
  public void setProgramDateTimePlacementMode(ProgramDateTimePlacementMode programDateTimePlacementMode) {
    this.programDateTimePlacementMode = programDateTimePlacementMode;
  }


  /**
   * Interval for placing ProgramDateTime. Only required for SEGMENTS_INTERVAL or SECONDS_INTERVAL.
   * @return interval
   */
  public Integer getInterval() {
    return interval;
  }

  /**
   * Interval for placing ProgramDateTime. Only required for SEGMENTS_INTERVAL or SECONDS_INTERVAL.
   *
   * @param interval
   *        Interval for placing ProgramDateTime. Only required for SEGMENTS_INTERVAL or SECONDS_INTERVAL.
   */
  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramDateTimePlacement programDateTimePlacement = (ProgramDateTimePlacement) o;
    return Objects.equals(this.programDateTimePlacementMode, programDateTimePlacement.programDateTimePlacementMode) &&
        Objects.equals(this.interval, programDateTimePlacement.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programDateTimePlacementMode, interval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramDateTimePlacement {\n");
    
    sb.append("    programDateTimePlacementMode: ").append(toIndentedString(programDateTimePlacementMode)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

